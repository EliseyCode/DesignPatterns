package creational.abstract_factory.model;

import creational.abstract_factory.interfaces.Button;

public class OSXButton implements Button {
    @Override
    public void printName() {
        System.out.println("OSX button");
    }
}
