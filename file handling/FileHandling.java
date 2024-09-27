
import java.util.*;
package fileread;


// Import the File class
import java.io.File;

// Import the IOException class to handle errors
import java.io.IOException;

 class fileread{
	public static void main(String[] args)
	{

		try {
			File Obj = new File("fread.txt");
			if (Obj.createNewFile()) {
				System.out.println("File created: "
								+ Obj.getName());
			}
			else {
				System.out.println("File already exists.");
			}

                     Scanner Reader = new Scanner(Obj);
            while (Reader.hasNextLine()) {
                String data = Reader.nextLine();
                System.out.println(data);
            }
            Reader.close();

		}
		catch (IOException e) {
			System.out.println("An error has occurred.");
			e.printStackTrace();
		}
	}
}
