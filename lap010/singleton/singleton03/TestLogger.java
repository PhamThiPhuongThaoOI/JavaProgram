package lap010.singleton.singleton03;

public class TestLogger {
    public static void main(String[] args) {
        // Get instance of Logger
        Logger logger1 = Logger.getInstance();
        Logger logger2 = Logger.getInstance();

        // Log messages using the same instance
        logger1.log("This is a log message.");
        logger2.log("Another log message.");

        // Check if both logger instances are the same
        if (logger1 == logger2) {
            System.out.println("Both logger instances are the same.");
        } else {
            System.out.println("Logger instances are different.");
        }
    }
}
