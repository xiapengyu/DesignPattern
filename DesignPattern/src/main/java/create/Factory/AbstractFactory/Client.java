package create.Factory.AbstractFactory;

/**
 * 抽象工厂
 * 具体工厂
 * 抽象产品
 * 具体产品
 * 所有产品都是不同类型，实现不同接口，当产品族中需要增加一个新的产品时，所有的工厂类都需要进行修改。增加了系统的抽象性和理解难度
 * 扩展新产品时，新增抽象与具体产品类，修改抽象与具体工厂类
 */
public class Client {

    public static void main(String[] args) {
        AbstractFactory af = new Factory();
        af.createProduct1().show();
        af.createProduct2().sell();
    }

    interface Product1 {
        void show();
    }

    static class ConcreteProduct1 implements Product1 {

        public ConcreteProduct1() {
            System.out.println("创建1类产品");
        }

        @Override
        public void show() {
            System.out.println("ConcreteProduct1 show");
        }
    }

    interface Product2 {
        void sell();
    }

    static class ConcreteProduct2 implements Product2 {

        public ConcreteProduct2() {
            System.out.println("创建2类产品");
        }

        @Override
        public void sell() {
            System.out.println("ConcreteProduct2 sell");
        }
    }

    interface AbstractFactory {
        Product1 createProduct1();

        Product2 createProduct2();
    }

    static class Factory implements AbstractFactory {
        @Override
        public Product1 createProduct1() {
            return new ConcreteProduct1();
        }

        @Override
        public Product2 createProduct2() {
            return new ConcreteProduct2();
        }
    }

}
