package be.pxl.computerstore.hardware;

import be.pxl.computerstore.ComputerComponent;

public class HardDisk extends ComputerComponent {
    private int capacity;

    public HardDisk(String vendor, String name, double price, int capacity) {
        super(vendor, name, price);
        this.capacity = capacity;
    }
}
