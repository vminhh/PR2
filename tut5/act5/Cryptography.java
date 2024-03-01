package tut5.act5;

public class Cryptography {
    protected String plainText;
    protected String cipherText;

    public Cryptography(String plainText) {
        this.plainText = plainText;
    }

    public String getPlainText() {
        return plainText;
    }

    public void setPlainText(String plainText) {
        this.plainText = plainText;
    }

    public String getCipherText() {
        return cipherText;
    }

    public void setCipherText(String cipherText) {
        this.cipherText = cipherText;
    }

    public void encrypt() {
    }

    public void decrypt() {
    }
}
