package tut3;

import java.io.*;

public class TaskAssignment {
    public static void main(String[] args) {
        try {
            BufferedReader rd = new BufferedReader(new FileReader("tut3\\test.txt"));
            int n = Integer.parseInt(rd.readLine());

            int[][] times = new int[n][2];

            for (int i = 0; i < n; i++) {
                String[] line = rd.readLine().trim().split(" ");
                times[i][0] = Integer.parseInt(line[0]);
                times[i][1] = Integer.parseInt(line[1]);
            }

            rd.close();
            System.out.println(findMinTime(n, times));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    static int findMinTime(int n, int[][] times) {
        int result = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i != j) {
                    result = Math.min(result, Math.max(times[i][0], times[j][1]));
                }
            }
        }
        return result;
    }
}