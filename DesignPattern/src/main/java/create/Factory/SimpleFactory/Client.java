package create.Factory.SimpleFactory;

/**
 * 抽象产品
 * 具体产品
 * 工厂类
 */
public class Client {

    public static void main(String[] args) {
        Product p0 = Factory.getProduct(0);
        Product p1 = Factory.getProduct(1);
        p0.show();
        p1.show();
    }

    public interface Product {
        void show();
    }

    static class ConcreteProduct1 implements Product {
        @Override
        public void show() {
            System.out.println("ConcreteProduct1 show");
        }
    }

    static class ConcreteProduct2 implements Product {
        @Override
        public void show() {
            System.out.println("ConcreteProduct2 show");
        }
    }

    static class Factory {
        public static Product getProduct(int type) {
            if (type == 0) {
                return new ConcreteProduct1();
            } else if (type == 1) {
                return new ConcreteProduct2();
            }
            return null;
        }
    }
}
