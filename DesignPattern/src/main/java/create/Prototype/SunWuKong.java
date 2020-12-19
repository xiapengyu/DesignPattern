package create.Prototype;

public class SunWuKong implements Cloneable {

    @Override
    protected SunWuKong clone() {
        SunWuKong wuKong = null;
        try {
            wuKong = (SunWuKong) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return wuKong;
    }

}
