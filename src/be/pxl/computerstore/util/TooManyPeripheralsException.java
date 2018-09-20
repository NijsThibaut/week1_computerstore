package be.pxl.computerstore.util;

public class TooManyPeripheralsException extends Throwable {
    private String message;

    public TooManyPeripheralsException(String message) {
        this.message = message;
    }
}
