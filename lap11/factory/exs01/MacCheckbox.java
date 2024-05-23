package lap11.factory.exs01;

public class MacCheckbox implements Checkbox{
    @Override
    public void paint() {
        System.out.println("Rendering a checkbox in macOS style.");
    }
}
