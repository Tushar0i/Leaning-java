import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class l48 {
    public static void main(String[] args) {
        System.out.println("In this we are goinh to learn about how to read files in java!!");

        //How to read a file using Java(3 Popular option)

        // BufferReader + FilesReader: best for reading text files line - by - line

        //FileInputStream : Best for binary files(images ,audio files)
        // RandomAccessFiles: Best for read//write a specific portion of file 


        String filePath = "I:\\Leaning-java\\day13\\l48\\test.txt";
       


        try( BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
            
        } catch (FileNotFoundException e) {
            // TODO: handle exception

            System.out.println("Could not locate file!");
            
        }
        catch(IOException e){
            System.out.println("Somthing went wrong!");
        }

    }
}
