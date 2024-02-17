package tut4;

import java.math.BigInteger;

public class LargeNumber {
    private String number;

    public LargeNumber() {
        this.number = null;
    }

    public LargeNumber(String number) {
        if (isLargeNumber(number))
            this.number = number;
        else
            throw new IllegalArgumentException("Invalid number format....");
    }

    public String getNumber() {
        return this.number;
    }

    public void setNumber(String number) {
        if (isLargeNumber(number))
            this.number = number;
        else
            throw new IllegalArgumentException("Invalid number format....");
    }

    public boolean isLargeNumber(String number) {
        return number.matches("-?\\d{15,}");
    }

    public String add(LargeNumber n) {
        BigInteger a = new BigInteger(this.number);
        BigInteger b = new BigInteger(n.getNumber());
        return a.add(b).toString();
    }

    public String sub(LargeNumber n) {
        BigInteger a = new BigInteger(this.number);
        BigInteger b = new BigInteger(n.getNumber());
        return a.subtract(b).abs().toString();
    }

    public String times(LargeNumber n) {
        BigInteger a = new BigInteger(this.number);
        BigInteger b = new BigInteger(n.getNumber());
        return a.multiply(b).toString();
    }

    public String div(LargeNumber n) {
        BigInteger a = new BigInteger(this.number);
        BigInteger b = new BigInteger(n.getNumber());
        return a.divide(b).toString();
    }
}
