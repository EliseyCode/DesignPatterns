package creational.abstract_factory.model;

import creational.abstract_factory.interfaces.Window;

public class WinWindow implements Window {
    @Override
    public void printName() {
        System.out.println("Windows window");
    }
}
