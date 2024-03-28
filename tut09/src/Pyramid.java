package tut09.src;

public class Pyramid {
    public static void main(String[] args) {
        int row = 6;
        System.out.println("Half-Right Pyramid");
        haffRightPyramid(row);
        System.out.println("\nHalf-Left Pyramid");
        halfLeftPyramid(row);
    }

    private static void haffRightPyramid(int row) throws NumberFormatException {
        try {
            for (int i = 1; i <= row; i++) {
                for (int j = row; j > 0; j--) {
                    if (i < j)
                        System.out.print(" ");
                    else
                        System.out.print(j);
                }
                System.out.println();
            }
        } catch (NumberFormatException e) {
            throw new NumberFormatException("Must be positive integer...");
        }
    }

    private static void halfLeftPyramid(int row) {
        try {
            for (int i = 1; i <= row; i++) {
                for (int j = 1; j <= i; j++) {
                    System.out.print(j + " ");
                }
                System.out.println();
            }
        } catch (Exception e) {
            throw new NumberFormatException();
        }
    }
}
