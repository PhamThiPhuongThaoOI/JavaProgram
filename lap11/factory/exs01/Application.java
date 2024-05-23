package lap11.factory.exs01;

public class Application {
    private GUIFactory factory;
    private Button button;

    public Application( GUIFactory factory) {
        this.factory= factory;
    }
    public void createUI() {
        this.button = factory.creatButton();
    }
    public void paint() {
        button.paint();
    }
}
