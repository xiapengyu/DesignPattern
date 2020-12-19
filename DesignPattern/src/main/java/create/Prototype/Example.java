package create.Prototype;

/**
 * 原型模式：通过Cloneable接口与clone()方法实现原型模式，创建新的同类型的对象，基于内存二进制流的复制，在性能上比直接 new 一个对象更加优良
 */
public class Example {

    public static void main(String[] args) {
        SunWuKong s = new SunWuKong();
        SunWuKong s1 = s.clone();
        //创建了不同的对象
        System.out.println(s == s1);
    }
}
