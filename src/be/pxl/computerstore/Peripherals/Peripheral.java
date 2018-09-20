package be.pxl.computerstore.Peripherals;

import be.pxl.computerstore.ComputerComponent;

public abstract class Peripheral extends ComputerComponent {
    public Peripheral(String vendor, String name, double price) {
        super(vendor, name, price);
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + " " + getName() + " (" + getArticleNumber() + ")";
    }
}
