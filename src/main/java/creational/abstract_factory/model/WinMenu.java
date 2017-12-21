package creational.abstract_factory.model;

import creational.abstract_factory.interfaces.Menu;

public class WinMenu implements Menu {
    @Override
    public void printName() {
        System.out.println("Windows menu");
    }
}
