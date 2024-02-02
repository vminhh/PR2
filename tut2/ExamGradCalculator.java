package tut2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
// import java.util.Scanner;
// import java.io.File;


public class ExamGradCalculator {
    public static void main(String[] args) {
        try(BufferedReader reader = new BufferedReader(new FileReader("C:\\LANGUAGE PROGRAMING\\PR2\\tut2\\testdata.txt"))){
            String name = reader.readLine();

            double grade = 0.0;
            for (int i=0; i<3; i++){
                grade += Integer.parseInt(reader.readLine());
            }

            System.out.println("Name student: " + name);
            System.out.println("Average grade: " + grade/3);
            reader.close();
        }catch(IOException e){
            System.err.println("Erroe: " + e.getMessage());
        }
    }
}

// public class ExamGradCalculator{
//     public static void main(String[] args) {
//         try {
//             Scanner sc = new Scanner(new File("C:\\LANGUAGE PROGRAMING\\PR2\\tut2\\testdata.txt"));

//             String name = sc.nextLine();

//             double grade = 0.0;
//             for (int i=0; i<3; i++){
//                 grade += sc.nextInt();
//             }

//             System.out.println("Name: " + name);
//             System.out.println("Average grade: " + grade/3);
//             sc.close();

//         } catch (Exception e) {
//             System.err.println("File not found.");
//         }
//     }
// }