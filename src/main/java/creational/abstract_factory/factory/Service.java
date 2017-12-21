package creational.abstract_factory.factory;

import creational.abstract_factory.interfaces.Button;
import creational.abstract_factory.interfaces.GUIFactory;
import creational.abstract_factory.interfaces.Menu;
import creational.abstract_factory.interfaces.Window;

public class Service {
    private final Button btn;
    private final Window window;
    private final Menu menu;

    public Service(GUIFactory factory) {
        this.btn = factory.createButton();
        this.window = factory.createWindow();
        this.menu = factory.createMenu();
    }

    public void pressButton() {
        btn.printName();
    }

    public void openWindow() {
        window.printName();
    }

    public void showMenu() {
        menu.printName();
    }
}
