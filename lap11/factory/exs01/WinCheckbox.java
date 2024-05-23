package lap11.factory.exs01;

public class WinCheckbox implements Checkbox{
    @Override
    public void paint() {
        System.out.println(" Rendering a checkbox in Windows style.");
    }
}
