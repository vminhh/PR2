package tut1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class act5 {
    public static void main(String[] args) {
        try{
           BufferedReader reader = new BufferedReader(new FileReader("C:\\LANGUAGE PROGRAMING\\PR2\\tut1\\input.txt")); 
            String[] lines = reader.readLine().split(" ");
            int N = Integer.parseInt(lines[0]);
            int M = Integer.parseInt(lines[1]);

            int[] prices = new int[N];
            int[] quantities = new int[M];

            for(int i=0; i<M; i++){
                String[] line = reader.readLine().split(" ");
                prices[i] = Integer.parseInt(line[0]);
                quantities[i] = Integer.parseInt(line[1]);
            }

            for (int i=M; i<N; i++){
                prices[i] = Integer.parseInt(reader.readLine());
            }

            int totalAmount = 0;
            for (int i=0; i<M; i++){
                totalAmount += prices[i] * quantities[i];
            }

            System.out.printf("Total: %d Dong", totalAmount);
            reader.close();
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
