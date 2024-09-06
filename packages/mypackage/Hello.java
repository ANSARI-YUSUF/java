

/* import 'MyClass' class from 'names' myPackage */
import mypackage.Hi;


public class Hello
{
   public static void main(String args[]) 
   {       
      // Initializing the String variable 
      // with a value 
      String name = "yusuf";
      
      // Creating an instance of class MyClass in 
      // the package.
      Hi obj = new Hi();
      
      obj.getNames(name);
   }
}
