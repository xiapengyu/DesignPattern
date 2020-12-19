package structure.adapter;

/**
 * 类适配器模式：使用多重继承方式实现，使原本不关联的类和接口可以一起工作
 */
public class ClassAdapter {

    public static void main(String[] args) {
        Target target = new TargetAdapter();
        target.request();
    }

    /**
     * 目标接口
     */
    interface Target {
        void request();
    }

    /**
     * 适配者
     */
    static class Adapter {
        public void specificRequest() {
            System.out.println("适配者中的业务代码被调用！");
        }
    }

    /**
     * 适配器类
     */
    static class TargetAdapter extends Adapter implements Target{
        @Override
        public void request() {
            specificRequest();
        }
    }

}
