package lap010.singleton.singleton01;

import lap010.singleton.singleton02.Database;

public class Application {
    public static void main(String[] args) {
        Database foo = Database.getInstance();
        foo.query("SELECT . . . ");

        // The variable ‘bar‘ will contain the same object as the variable ‘foo‘.
        Database bar = Database.getInstance();
        bar.query("SELECT . . . ");
    }
}
