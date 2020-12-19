package create.Singleton;

/**
 * 懒汉
 */
public class DBConnection {

    private static volatile DBConnection instance = null;

    private DBConnection() {
    }

    public static DBConnection getInstance() {
        if (instance == null) {
            synchronized (DBConnection.class) {
                if (instance == null) {
                    instance = new DBConnection();
                }
            }
        }
        return instance;
    }

}
