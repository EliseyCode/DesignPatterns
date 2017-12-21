package creational.abstract_factory.model;

import creational.abstract_factory.interfaces.Button;

public class WinButton implements Button {
    @Override
    public void printName() {
        System.out.println("Windows button");
    }
}
