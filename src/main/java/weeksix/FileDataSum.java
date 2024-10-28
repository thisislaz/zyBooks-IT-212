package weeksix;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

public class FileDataSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter fileWriter = null;
        int numValues;
        int numValuesRead = 0;
        int valueSum = 0;

        try (Scanner fileScnr = new Scanner(new FileInputStream("input.txt"))) {
            fileWriter = new PrintWriter(new FileOutputStream("output.txt"));

            numValues = fileScnr.nextInt();

            for (numValuesRead = 0; numValuesRead < numValues; numValuesRead++) {
                valueSum += fileScnr.nextInt();
            }
        } catch (FileNotFoundException exception) {
            System.out.println("File not found");
        } finally {
            if (fileWriter != null) {
                fileWriter.println(valueSum);
                fileWriter.close();
            }
        }
    }
}
