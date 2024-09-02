import java.util.Scanner; 

import java.io.IOException;
// Importing File Class
import java.io.File;
import java.io.FileWriter; 
 
// class File{
//     public static void main(String[] args)
//     {
 
//         // File name specified
//         File obj1 = new File("myfile.txt");
//           System.out.println("File Created!");
//     }
// }

// Import the File class
// import java.io.File;

// Import the IOException class to handle errors

class Filecreation{
	public static void main(String[] args)
	{

		try {
			File Obj = new File("myfile2.txt");
			if (Obj.createNewFile()) {
				System.out.println("File created: "
								+ Obj.getName());

                Scanner Reader = new Scanner(Obj);
                while (Reader.hasNextLine()) {
                    String data = Reader.nextLine();
                    System.out.println(data);
                }
                Reader.close();
			}
			else {
				System.out.println("File already exists.");
			}

            	
		
		}
		catch (IOException e) {
			System.out.println("An error has occurred.");
			e.printStackTrace();
		}
	}
}




class Filereading{
	public static void main(String[] args)
	{

		try {


			  File file = new File("myfile.txt");
            if (file.exists()) {
             
					Scanner reader = new Scanner(file);
                    while (reader.hasNextLine()) {
                        String data = reader.nextLine();
                        System.out.println(data);
                    }
                
            } else {
                System.out.println("File does not exist.");
            }
		
			}
			catch (IOException e) {
				System.out.println("An error has occurred.");
				e.printStackTrace();
			}


			
            	
		
		
	}
}






class Filewriting{
	public static void main(String[] args)
	{

		try {

			FileWriter Writer= new FileWriter("myfile.txt");

			   Writer.write(
                "hello my name is chat gpt!!");
            Writer.close();
            System.out.println("Successfully written.");

            }


				catch (IOException e) {
			System.out.println("An error has occurred.");
			e.printStackTrace();
		}
		
			}


			
            	
		
		
	
	}










