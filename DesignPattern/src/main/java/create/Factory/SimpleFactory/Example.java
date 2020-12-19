package create.Factory.SimpleFactory;

public class Example {

    public static void main(String[] args) {
        Car c1 = CarFactory.getCar("benz");
        Car c2 = CarFactory.getCar("audi");
        Car c3 = CarFactory.getCar("toyota");
        c1.run();
        c2.run();
        c3.run();
    }
}
