package lap010.singleton.singleton03;

public class Logger {
    private static Logger instance;

    // Private constructor to prevent instantiation from outside
    private Logger() {
        // Optional: Initialization code
    }

    // Public static method to get the single instance of Logger
    public static synchronized Logger getInstance() {
        if (instance == null) {
            instance = new Logger();
        }
        return instance;
    }

    // Method to log messages
    public void log(String message) {
        System.out.println("[LOG] " + message);
    }
}
