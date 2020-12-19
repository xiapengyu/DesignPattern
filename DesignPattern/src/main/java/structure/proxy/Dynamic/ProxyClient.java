package structure.proxy.Dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * 在程序运行时，运用反射机制动态创建而成
 * 基于jdk proxy实现，代理类实现委托类的接口并与委托类对象组合关联，实现代理
 */
public class ProxyClient {

    public static void main(String[] args) {
        /*RealSubject realSubject = new RealSubject();
        Subject proxyInstance = (Subject)Proxy.newProxyInstance(realSubject.getClass().getClassLoader(), realSubject.getClass().getInterfaces(), new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                System.out.println("建立网络链接");
                Object invoke = method.invoke(realSubject, args);
                System.out.println("断开网络连接");
                return invoke;
            }
        });
        proxyInstance.request();*/

        RealSubject realSubject = new RealSubject();
        ProxySubject proxySubject = new ProxySubject(realSubject);
        Subject proxyInstance = (Subject) Proxy.newProxyInstance(realSubject.getClass().getClassLoader(), realSubject.getClass().getInterfaces(), proxySubject);
        proxyInstance.request();
    }

    interface Subject {
        void request();
    }

    static class RealSubject implements Subject {
        @Override
        public void request() {
            System.out.println("委托类发送请求");
        }
    }

    static class ProxySubject implements InvocationHandler {

        private RealSubject realSubject;

        public ProxySubject(RealSubject realSubject) {
            this.realSubject = realSubject;
        }

        @Override
        public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
            System.out.println("建立网络链接");
            Object invoke = method.invoke(realSubject, args);
            System.out.println("断开网络连接");
            return invoke;
        }
    }


}
