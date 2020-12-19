package create.Prototype.manager;

public interface Shape extends Cloneable {

    public Object clone();    //拷贝

    public void area();    //计算面积
}
