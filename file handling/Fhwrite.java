// Import the FileWriter class
import java.io.FileWriter; 
import java.util.*;

// Import the IOException class for handling errors
import java.io.IOException; 

public class Fhwrite{
	public static void main(String[] args)
	{
		try {
			FileWriter Writer
				= new FileWriter("fhreaddata.txt",true);

                Scanner s =new Scanner(System.in);

                System.out.println("enter data in file=");
                String data=s.nextLine();


			Writer.write(data);
			Writer.close();
			System.out.println("Successfully written.");
		}
		catch (IOException e) {
			System.out.println("An error has occurred.");
			e.printStackTrace();
		}
	}
}
