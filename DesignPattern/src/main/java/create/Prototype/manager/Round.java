package create.Prototype.manager;

public class Round implements Shape {
    @Override
    public Round clone() {
        try {
            return (Round) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public void area() {
        System.out.println("计算圆形面积完毕");
    }
}
