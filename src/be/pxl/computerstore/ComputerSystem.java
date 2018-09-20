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
    public int count;

    public ComputerSystem() {

    }

    public void addPeripheral(Peripheral peripheral) throws TooManyPeripheralsException {
       if(peripherals[0] != null && peripherals[1] != null && peripherals[2] != null) {
            throw new TooManyPeripheralsException("Er zijn te veel Peripheral objecten");
        } else {
            for(int i = 0; i < peripherals.length; i++) {
                if(peripherals[i] == null) {
                    peripherals[i] = peripheral;
                    count++;
                    break;
                }

            }
        }

    }

    public void removePeripheral(String articleNumber) {
        for (int i = 0; i < MAX_PERIPHERAL; i++) {
            if(peripherals[i] != null && peripherals[i].getArticleNumber().equals(articleNumber)) {
                peripherals[i] = null;
                count--;
                break;
            }
        }
    }

    public int getNumberOfPeripherals() {
        count = 0;
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
        double total = 0;
        for (int i=0; i < peripherals.length; i++){
            if (peripherals[i] != null) {
                total += peripherals[i].getPrice();
            }
        }
        total += getProcessor().getPrice() + getComputerCase().getPrice();
        return total;
    }



}
