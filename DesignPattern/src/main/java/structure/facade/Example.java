package structure.facade;

/**
 * 外观（Facade）模式又叫作门面模式，是一种通过为多个复杂的子系统提供一个一致的接口，而使这些子系统更加容易被访问的模式。该模式对外有一个统一接口，
 * 外部应用程序不用关心内部子系统的具体细节，这样会大大降低应用程序的复杂度，提高了程序的可维护性
 */
public class Example {

    public static void main(String[] args) {
        Facade facade = new Facade();
        facade.method();
    }

    static class Facade {
        private Service1 service1 = new Service1();
        private Service2 service2 = new Service2();
        private Service3 service3 = new Service3();

        public void method() {
            service1.method();
            service2.method();
            service3.method();
        }
    }

    static class Service1 {
        public void method() {
            System.out.println("Service1 method invoke.");
        }
    }

    static class Service2 {
        public void method() {
            System.out.println("Service2 method invoke.");
        }
    }

    static class Service3 {
        public void method() {
            System.out.println("Service3 method invoke.");
        }
    }

}
