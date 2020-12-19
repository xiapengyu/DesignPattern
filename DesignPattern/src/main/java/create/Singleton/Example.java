package create.Singleton;

/**
 * 单例模式：创建一个实例对象供全局使用
 */
public class Example {

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            /*DBConnection connection = DBConnection.getInstance();
            System.out.println(connection.hashCode());*/

            DBConnect connect = DBConnect.getInstance();
            System.out.println(connect.hashCode());
        }
    }
}
