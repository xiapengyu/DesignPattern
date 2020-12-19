package create.Singleton;

/**
 * 饿汉
 */
public class DBConnect {

    private static DBConnect instance = new DBConnect();

    private DBConnect(){}

    /*public static DBConnect instance = null;

    static {
        instance = new DBConnect();
    }*/

    public static DBConnect getInstance(){
        return instance;
    }

}
