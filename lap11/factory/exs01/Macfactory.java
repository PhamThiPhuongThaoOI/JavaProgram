package lap11.factory.exs01;

import java.awt.*;

public class Macfactory implements GUIFactory{
    @Override
    public Button creatButton() {
        return new MacButton();
    }
    @Override
    public Checkbox creatCheckbox() {
        return new MacCheckbox();
    }
}
