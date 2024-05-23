package lap11.factory.exs01;

public class WinButton implements Button{
    @Override
    public void paint() {
        System.out.println(" Rendering a button in Windows style.");
    }
}
