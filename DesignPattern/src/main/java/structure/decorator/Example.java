package structure.decorator;

/**
 * 装饰器模式：指在不改变现有对象结构的情况下，动态地给该对象增加一些职责（即增加其额外功能）
 * 使用组合关系来创建一个装饰对象，来包裹真实对象，并在保持真实对象的类结构不变的前提下，
 * 为其提供额外的功能，这就是装饰模式的目标。
 */
public class Example {

    public static void main(String[] args) {
        Component p = new ConcreteComponent();
        p.operation();
        System.out.println("------------------------");
        Component d = new ConcreteDecorator(p);
        d.operation();
    }

    interface Component {
        void operation();
    }

    static class ConcreteComponent implements Component {

        public ConcreteComponent() {
            System.out.println("创建具体构件对象");
        }

        @Override
        public void operation() {
            System.out.println("调用具体构件的方法");
        }
    }

    static class Decorator implements Component {
        private Component component;

        public Decorator(Component component) {
            this.component = component;
        }

        @Override
        public void operation() {
            component.operation();
        }
    }

    static class ConcreteDecorator extends Decorator {
        public ConcreteDecorator(Component component) {
            super(component);
        }

        @Override
        public void operation() {
            super.operation();
            addFunction();
        }

        public void addFunction() {
            System.out.println("为具体构件角色增加额外的功能addFunction");
        }
    }

}
