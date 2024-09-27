import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
// Package fileread;

public class Fhread {
    public static void main(String[] args) {
        File file = new File("fhreaddata.txt");
        
        try  {

            Scanner reader = new Scanner(file);
            while (reader.hasNextLine()) {
                String data = reader.nextLine();
                System.out.println(data);
            }
        } catch (FileNotFoundException e) {
            System.out.println("An error has occurred: File not found.");
            e.printStackTrace();
        }
    }
}
