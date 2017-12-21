package creational.abstract_factory;

import creational.abstract_factory.factory.OSXGUIFactory;
import creational.abstract_factory.factory.Service;
import creational.abstract_factory.factory.WinGUIFactory;

public class Main {
    public static void main(String[] args) {
        Service serviceWin = new Service(new WinGUIFactory());

        serviceWin.openWindow();
        serviceWin.pressButton();
        serviceWin.showMenu();

        Service serviceOSX = new Service(new OSXGUIFactory());

        serviceOSX.openWindow();
        serviceOSX.pressButton();
        serviceOSX.showMenu();
    }
}
