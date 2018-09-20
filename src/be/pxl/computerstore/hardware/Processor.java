package be.pxl.computerstore.hardware;

import be.pxl.computerstore.ComputerComponent;

public class Processor extends ComputerComponent {
    private double clockspeed;
    private final double MIN_CLOCKSPEED = 0.7;
    public Processor(String vendor, String name, double price, double clockspeed) {
        super(vendor,name,price);
        setClockspeed(clockspeed);
    }


    public double getClockspeed() {
        return clockspeed;
    }

    public void setClockspeed(double clockspeed) {
        if(clockspeed < MIN_CLOCKSPEED) {
            this.clockspeed = MIN_CLOCKSPEED;
        } else {
            this.clockspeed = clockspeed;
        }
    }

    @Override
    public String getFullDescription() {
        return String.format(super.getFullDescription() + "Clock speed = " + this.clockspeed + "GHz");
    }
}
