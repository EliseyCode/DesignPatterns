package creational.abstract_factory.model;

import creational.abstract_factory.interfaces.Menu;

public class OSXMenu implements Menu {
    @Override
    public void printName() {
        System.out.println("OSX menu");
    }
}
