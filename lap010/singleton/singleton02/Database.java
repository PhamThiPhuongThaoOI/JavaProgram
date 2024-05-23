package lap010.singleton.singleton02;

public class Database {
    private static Database instance;

    private Database() {
        // Some initialization code, such as the actual connection to a database server.
        // . . .
    }

    public static synchronized Database getInstance() {
        if (instance == null) {
            // Ensure that the instance hasn’t yet been initialized by another
            // thread while this one has been waiting for the lock’s release.
            synchronized (Database.class) {
                if (instance == null) {
                    instance = new Database();
                }
            }
        }
        return instance;
    }

    public void query(String sql) {
        // For instance, all database queries of an app go through this method.
        // Therefore, you can place throttling or caching logic here.
        // . . .
        System.out.println("Executing query: " + sql);
    }
}
