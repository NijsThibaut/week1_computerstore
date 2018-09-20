package be.pxl.computerstore;

import be.pxl.computerstore.Peripherals.Peripheral;
import be.pxl.computerstore.data.ComputerCase;
import be.pxl.computerstore.hardware.HardDisk;
import be.pxl.computerstore.hardware.Processor;
import be.pxl.computerstore.util.Computable;
import be.pxl.computerstore.util.TooManyPeripheralsException;

public class ComputerSystem implements Computable {

    private ComputerCase computerCase;
    private HardDisk hardDisk;
    private Processor processor;
    public static final int MAX_PERIPHERAL = 3;
    private Peripheral[] peripherals = new Peripheral[3];

    public ComputerSystem() {

    }

    public void addPeripheral(Peripheral peripheral) throws TooManyPeripheralsException {

        for(int i = 0; i < peripherals.length; i++) {
            if(!(peripherals[0].equals(null) && peripherals[1].equals(null) && peripherals[2].equals(null))) {
                throw new TooManyPeripheralsException("Er zijn te veel Peripheral objecten");
            }
            if(peripherals[i] != null) {
                peripherals[i] = peripheral;
                break;
            }

        }
    }

    public void removePeripheral(String articleNumber) {
        for (int i = 0; i < peripherals.length; i++) {
            if(peripherals[i].getArticleNumber().equals(articleNumber)) {
                peripherals[i] = null;
            }
        }
    }

    public int getNumberOfPeripherals() {
        int count = 0;
        for (Peripheral obj : peripherals) {
            if (obj != null) {
                count++;
            }
        }
        return count;
    }

    public Peripheral[] getPeripherals() {
        return peripherals;
    }

    public ComputerCase getComputerCase() {

        return computerCase;
    }

    public void setComputerCase(ComputerCase computerCase) {
        this.computerCase = computerCase;
    }

    public HardDisk getHardDisk() {
        return hardDisk;
    }

    public void setHardDisk(HardDisk hardDisk) {
        this.hardDisk = hardDisk;
    }

    public Processor getProcessor() {
        return processor;
    }

    public void setProcessor(Processor processor) {
        this.processor = processor;
    }

    @Override
    public double totalPriceExcl() {

        return 0;
    }

    @Override
    public double totalPriceIncl() {
        return 0;
    }
}
