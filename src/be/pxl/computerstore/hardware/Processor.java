package be.pxl.computerstore.hardware;

import be.pxl.computerstore.ComputerComponent;

public class Processor extends ComputerComponent {
    private double clockspeed;
    private final double MIN_CLOCKSPEED = 0.7;
    public Processor(String vendor, String name, double price, double clockspeed) {
        super(vendor,name,price);
        this.clockspeed = clockspeed;
    }

    @Override
    public String getFullDescription() {
        return String.format(super.getFullDescription());
    }
}
