package tut2;

import java.util.*;

public class LowestCommon{
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        long a = inp.nextLong();
        long b = inp.nextLong();

        int result = lowestCommon(a, b);
        
        System.out.println(result != -1 ?"The first common set bit is at position: " + result :"There is no common set bit.");
        inp.close();
    }
    
    static int lowestCommon(long a, long b) {
        long xorResult = a ^ b;

        int position = 0;
        while ((xorResult & 1) == 0) {
            xorResult >>= 1;
            position++;
        }
        return (xorResult == 0) ? -1 : position;
    }
}
