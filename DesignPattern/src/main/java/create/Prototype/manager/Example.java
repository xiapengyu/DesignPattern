package create.Prototype.manager;

/**
 * 带管理器的原型模式
 */
public class Example {
    public static void main(String[] args) {
        Manager manager = new Manager();
        Shape round = manager.getShape("Round");
        Shape circle = manager.getShape("Circle");
        round.area();
        circle.area();
    }
}
