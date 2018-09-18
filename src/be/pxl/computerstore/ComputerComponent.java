package be.pxl.computerstore;

public class ComputerComponent {

    private String vendor;
    private String name;
    private double price;
    private String articleNumber;
    private static int counter = 0;

    {
        counter++;
    }

    public ComputerComponent(String vendor, String name, double price) {
        setVendor(vendor);
        setName(name);
        setPrice(price);
        if (vendor.length() < 3) {
            setArticleNumber(String.format("%-3s-%0d", vendor.toUpperCase(), counter).replace(' ', 'X'));
        } else {
            setArticleNumber(String.format("%-3s-%0d", vendor.substring(0,3).toUpperCase(), counter).replace(' ', 'X'));
        }
    }

    public String getVendor() {
        return vendor;
    }

    public void setVendor(String vendor) {
        this.vendor = vendor;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getArticleNumber() {
        return articleNumber;
    }

    public void setArticleNumber(String articleNumber) {
        this.articleNumber = articleNumber;
    }

    public String toString() {
        return name + " " + "(" + articleNumber + ")";
    }

    public String getFullDescription() {
        return String.format("Articlenumber = %s%n" +
                             "Vendor = %s%n" +
                             "Price = %s%n", getArticleNumber(), getVendor(), getPrice());

    }
}
