package structure.proxy.Static;

/**
 * 静态代理：由程序员创建代理类或特定工具自动生成源代码再对其编译，在程序运行前代理类的 .class 文件就已经存在了。
 */
public class Client {

    public static void main(String[] args) {
        RealSubject realSubject = new RealSubject();
        Subject subject = new ProxySubject(realSubject);
        subject.request();
    }

    interface Subject {
        void request();
    }

    static class RealSubject implements Subject {
        @Override
        public void request() {
            System.out.println("委托类发送");
        }
    }

    static class ProxySubject implements Subject {

        RealSubject realSubject;

        public ProxySubject(RealSubject realSubject) {
            this.realSubject = realSubject;
        }

        @Override
        public void request() {
            System.out.println("建立网络连接");
            realSubject.request();
            System.out.println("断开网络连接");
        }
    }

}
