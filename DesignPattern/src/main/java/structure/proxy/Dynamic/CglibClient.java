package structure.proxy.Dynamic;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * 在程序运行时，运用反射机制动态创建而成
 * 基于cglib实现，代理类继承委托类，实现代理
 */
public class CglibClient {

    public static void main(String[] args) {
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(RealSubject.class);
        enhancer.setCallback(new MyInterceptor());
        /*enhancer.setCallback(new MethodInterceptor() {
            @Override
            public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
                System.out.println("代理类建立网络连接");
                Object invoke = methodProxy.invokeSuper(o, objects);
                System.out.println("代理类断开网络连接");
                return invoke;
            }
        });*/

        RealSubject realSubject = (RealSubject) enhancer.create();
        realSubject.request();
    }

    static class RealSubject {
        void request() {
            System.out.println("委托类发送请求");
        }
    }

    static class MyInterceptor implements MethodInterceptor {
        @Override
        public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
            System.out.println("代理类建立网络连接");
            Object invoke = methodProxy.invokeSuper(o, objects);
            System.out.println("代理类断开网络连接");
            return invoke;
        }
    }

}
