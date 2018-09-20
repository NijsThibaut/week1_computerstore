package be.pxl.computerstore.data;

import be.pxl.computerstore.ComputerComponent;
import be.pxl.computerstore.util.Dimension;

public class ComputerCase extends ComputerComponent {

    private Dimension dimension;
    private double weight;

    public ComputerCase(String vendor, String name, double price) {
        super(vendor,name,price);

    }

    @Override
    public String getFullDescription() {
        return String.format(super.getFullDescription() +
                            "Width = %dmm%n" +
                            "Height = %dmm%n" +
                            "Depth = %dmm%n" +
                            "Weight = %fkg", dimension.getWidth(), dimension.getHeight(), dimension.getDepth(), this.weight);
    }

    public Dimension getDimension() {
        return dimension;
    }

    public void setDimension(Dimension dimension) {
        this.dimension = dimension;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}
