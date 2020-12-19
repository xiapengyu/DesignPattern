package create.Factory.SimpleFactory;

public class CarFactory {

    public static Car getCar(String brand) {
        if (brand.equals("benz")) {
            return new Benz();
        } else if (brand.equals("audi")) {
            return new Audi();
        } else if (brand.equals("toyota")) {
            return new Toyota();
        }
        return null;
    }

}
