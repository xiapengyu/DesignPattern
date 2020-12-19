package structure.adapter;

/**
 * 对象适配器模式：使用组合/聚合关联的方式实现，将现有组件库中已经实现的组件引入适配器类中，适配器类同时实现当前系统的业务接口
 */
public class ObjectAdapter {

    public static void main(String[] args) {
        Target target = new TargetAdapter(new Adapter1(), new Adapter2());
        target.Network();
    }

    /**
     * 目标借口
     */
    interface Target{
        void Network();
    }

    /**
     * 适配器类
     */
    static class TargetAdapter implements Target{
        private Adapter1 adapter1;
        private Adapter2 adapter2;

        public TargetAdapter(Adapter1 adapter1, Adapter2 adapter2) {
            this.adapter1 = adapter1;
            this.adapter2 = adapter2;
        }

        public Adapter1 getAdapter1() {
            return adapter1;
        }

        public void setAdapter1(Adapter1 adapter1) {
            this.adapter1 = adapter1;
        }

        public Adapter2 getAdapter2() {
            return adapter2;
        }

        public void setAdapter2(Adapter2 adapter2) {
            this.adapter2 = adapter2;
        }

        public void Network(){
            adapter1.connect();
            adapter2.request();
            adapter1.close();
        }
    }

    /**
     * 适配者
     */
    static class Adapter1{
        void connect(){
            System.out.println("建立网络连接");
        }

        void close(){
            System.out.println("断开网络连接");
        }
    }

    /**
     * 适配者
     */
    static class Adapter2{
        void request(){
            System.out.println("发送网络请求");
        }
    }
}
