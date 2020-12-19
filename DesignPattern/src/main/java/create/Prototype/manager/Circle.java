package create.Prototype.manager;

public class Circle implements Shape {
    @Override
    public Circle clone() {
        try {
            return (Circle) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public void area() {
        System.out.println("计算三角形面积完毕");
    }
}
