package Step4;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class ReadFour
{
    /**
     * Yes, you can look at the other 
     * examples in this lab to build your solution here.
     */
        public static void main(String[] args) {

            try {

//                System.out.println("Creating a file output.txt");
//
//                PrintWriter fileWritter = new PrintWriter("output.txt");
//
//                fileWritter.println( "Text inside created file");
//
//                System.out.println("File is created ");
//
//                fileWritter.close();
//
                   Scanner fileScanner = new Scanner(new File("/Users/dima/Projects/FileIOJava/Step4/input.txt"));
//
//                System.out.println("Scanning the file");

                int sumOfNumbersInsideInput = 0 ;

                while (fileScanner.hasNext()) {

                    //String lineIn = fileScanner.nextLine();
                    int lineIn = fileScanner.nextInt();

                    sumOfNumbersInsideInput += lineIn;
                    System.out.println("Running total = " + sumOfNumbersInsideInput);
                }
                System.out.println("Reading from file done");

            } catch (IOException e) {
                System.out.println("File not find");
            }
        }
}