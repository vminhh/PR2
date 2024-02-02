package tut2;

public class TransposeMatrix {
    public static void main(String[] args) {
        int[][] M = {
                    {1,2,3},
                    {4,5,6},
                    {7,8,9},
                    };
        System.out.println("Original Matrix: ");
        TransposeMatrix.print(M);

        System.out.println("\nTranspose Matrix: ");
        TransposeMatrix.print(transpose(M));
    }

    static int[][] transpose(int[][] M){
        int R = M.length;
        int C = M[0].length;

        int[][] T = new int[C][R];

        for (int i=0; i<C; i++){
            for (int j=0; j<R; j++){
                T[i][j] = M[j][i];
            }
        }
        return T;
    }

    static void print (int[][] M){
        for (int[] r : M){
            for (int value : r){
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }
}
