package creational.abstract_factory.factory;

import creational.abstract_factory.interfaces.Button;
import creational.abstract_factory.interfaces.GUIFactory;
import creational.abstract_factory.interfaces.Menu;
import creational.abstract_factory.interfaces.Window;
import creational.abstract_factory.model.OSXButton;
import creational.abstract_factory.model.OSXMenu;
import creational.abstract_factory.model.OSXWindow;

public class OSXGUIFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new OSXButton();
    }

    @Override
    public Window createWindow() {
        return new OSXWindow();
    }

    @Override
    public Menu createMenu() {
        return new OSXMenu();
    }
}
