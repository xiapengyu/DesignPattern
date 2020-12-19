package behavior.TemplateMethod;

/**
 * 模板方法模式：不变部分的算法封装到父类中实现，而把可变部分算法由子类继承实现，便于子类继续扩展
 */
public class Client {

    public static void main(String[] args) {
        AbstractClass tm = new ConcreteClass();
        tm.templateMethod();
    }

    static abstract class AbstractClass{

        public void templateMethod(){
            method1();
            method2();
            method3();
        }

        void method1(){
            System.out.println("具体方法调用");
        }

        abstract void method2();

        abstract void method3();

    }

    //具体子类
    static class ConcreteClass extends AbstractClass {
        public void method2() {
            System.out.println("抽象方法2的实现被调用...");
        }
        public void method3() {
            System.out.println("抽象方法3的实现被调用...");
        }
    }
}
