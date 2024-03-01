package tut5.act5;

public class CeaserCipher extends Cryptography {
    private int shift;

    public CeaserCipher(String plainText, int shift) {
        super(plainText);
        this.shift = shift;
    }

    @Override
    public void encrypt() {
        StringBuilder bd = new StringBuilder();
        for (int i = 0; i < plainText.length(); i++) {
            char c = plainText.charAt(i);
            if (Character.isLetter(c)) {
                char encryptChar = (char) ((c - 'a' + shift) % 26 + 'a');
                bd.append(encryptChar);
            } else {
                bd.append(c);
            }
        }
        cipherText = bd.toString();
    }

    @Override
    public void decrypt() {
        StringBuilder bd = new StringBuilder();
        for (int i = 0; i < plainText.length(); i++) {
            char c = plainText.charAt(i);
            if (Character.isLetter(c)) {
                char decryptChar = (char) ((c - 'a' - shift + 26) % 26 + 'a');
                bd.append(decryptChar);
            } else {
                bd.append(c);
            }
        }
        plainText = bd.toString();
    }
}
