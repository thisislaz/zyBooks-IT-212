package weeksix;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class CountingWords {
    public static void main(String[] args) throws IOException {
        Scanner scnr = new Scanner(System.in);
        FileInputStream fileByteStream = null;
        Scanner inFS = null;
        String userWord;
        String currWord;
        int wordFrequency = 0;

        System.out.println("Opening file myFile.txt");
        fileByteStream = new FileInputStream("C:\\Users\\cuban\\OneDrive\\Desktop\\IntelliJ_Java_Projects\\zyBooksFoundationInAppDevelopment\\src\\main\\java\\weeksix\\myFile.txt");
        inFS = new Scanner(fileByteStream);

        System.out.print("Enter word: ");
        userWord = scnr.next();

        while (inFS.hasNext()) {
            currWord = inFS.next();
            if(currWord.equals(userWord)) {
                wordFrequency++;
            }
        }

        System.out.println(userWord + " appears in the file " + wordFrequency + " times");
        fileByteStream.close();

    }
}
