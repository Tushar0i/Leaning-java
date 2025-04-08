import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class l47 {
    public static void main(String[] args) {
        System.out.println("In this we are going to learn about write a file using Java!!");

        // 4 popular options ---->
        // FileWriter good for small or medium-sized text files
        // BufferedWriter better performance for large amount of text
        // PrintWriter best for structured data . like reports or logs
        // FileOutputStream best for binary files(image audio files )

        Scanner scanner = new Scanner(System.in);
        String userText;
        String fileName = "";
        System.out.print("Enter file name: ");
        fileName = scanner.nextLine();
        String filePath = "";
        System.out.print("Enter file path with double backslash (\\): ");
        filePath = scanner.nextLine();
        

        try (FileWriter writer = new FileWriter(filePath+fileName+".txt");) {
            // we can also add absolute file path but we have to use \\ java interpret
            // single \ as an escape sequence.

            System.out.print("Enter you text that you want to write under few words: ");

            userText = scanner.nextLine();

            writer.write(userText);

            System.out.println("File has been Written");

        } catch (FileNotFoundException e) {
            System.out.println("Could no locate file location!");
        } catch (IOException e) {

            System.out.println("Could not write a file!");
        }

        scanner.close();
    }
}