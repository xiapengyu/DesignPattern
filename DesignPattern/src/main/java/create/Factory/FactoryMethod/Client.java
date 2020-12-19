package create.Factory.FactoryMethod;

/**
 * 抽象工厂
 * 具体工厂
 * 抽象产品
 * 具体产品
 * 所有具体产品实现同一个接口，都是一类产品，扩展需要新增具体产品与具体工厂
 */
public class Client {

    public static void main(String[] args) {
        AbstractFactory af1 = new ConcreteFactory1();
        af1.createProduct().show();
        AbstractFactory af2 = new ConcreteFactory2();
        af2.createProduct().show();
    }

    /**
     * 抽象产品
     */
    public interface Product{
        void show();
    }

    /**
     * 具体产品
     */
    static class ConcreteProduct1 implements Product{
        @Override
        public void show() {
            System.out.println("ConcreteProduct1 show");
        }
    }

    /**
     * 具体产品
     */
    static class ConcreteProduct2 implements Product{
        @Override
        public void show() {
            System.out.println("ConcreteProduct2 show");
        }
    }

    interface AbstractFactory{
        Product createProduct();
    }

    static class ConcreteFactory1 implements AbstractFactory{
        @Override
        public Product createProduct() {
            return new ConcreteProduct1();
        }
    }

    static class ConcreteFactory2 implements AbstractFactory{
        @Override
        public Product createProduct() {
            return new ConcreteProduct2();
        }
    }

}
