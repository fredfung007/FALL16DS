import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Random;
import java.util.Scanner;

public class HiClass {

    public static void main(String[] args) throws FileNotFoundException {
        String[] greet = {"Hello", "Hi", "Yo", "Ni Hao"};
        Random rg = new Random();
        File inputFile = new File("src/students.txt");
        File outputFile = new File("src/hiStudents.txt");
        Scanner scanner = new Scanner(inputFile);
        PrintWriter printWriter = new PrintWriter(outputFile);
        // For every student, randomly great them and write to a file.
        while (scanner.hasNextLine()) {
            printWriter.printf("  %s, %s! \n", greet[rg.nextInt(greet.length)], scanner.nextLine());
        }
        printWriter.close();
        scanner.close();
    }
}
