package be.pxl.computerstore.data;

import be.pxl.computerstore.ComputerComponent;
import be.pxl.computerstore.util.Dimension;

import java.util.Random;

public class ComputerCase extends ComputerComponent {

    private Dimension dimension;
    private double weight;

    public ComputerCase(String vendor, String name, double price) {
        super(vendor,name,price);

    }


}
