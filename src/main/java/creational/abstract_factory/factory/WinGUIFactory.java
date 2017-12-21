package creational.abstract_factory.factory;

import creational.abstract_factory.interfaces.Button;
import creational.abstract_factory.interfaces.GUIFactory;
import creational.abstract_factory.interfaces.Menu;
import creational.abstract_factory.interfaces.Window;
import creational.abstract_factory.model.WinButton;
import creational.abstract_factory.model.WinMenu;
import creational.abstract_factory.model.WinWindow;

public class WinGUIFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new WinButton();
    }

    @Override
    public Window createWindow() {
        return new WinWindow();
    }

    @Override
    public Menu createMenu() {
        return new WinMenu();
    }
}
