package creational.abstract_factory.interfaces;

public interface GUIFactory {
    Button createButton();

    Window createWindow();

    Menu createMenu();
}
