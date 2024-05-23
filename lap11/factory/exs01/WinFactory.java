package lap11.factory.exs01;

import java.awt.*;

public class WinFactory implements GUIFactory{
    @Override
    public Button creatButton() {
        return new WinButton();
    }

    @Override
    public Checkbox creatCheckbox() {
        return new WinCheckbox();
    }
}
