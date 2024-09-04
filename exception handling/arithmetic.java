import java.util.*;
import java.util.Scanner;
import java.lang.ArithmeticException;
class arithmetic{
    int x;
    int y;

    int divide(int x,int y){

        int result=x/y;

        System.out.println("dive x with y:"+result);

        return result;

    }

    public static void main(String[] args){

       try{
       
        Scanner s=new Scanner(System.in);

        arithmetic am=new arithmetic();

         System.out.println("enter number x:");
        am.x=s.nextInt();
        s.nextLine();

         System.out.println("enter number y:");
        am.y=s.nextInt();
        s.nextLine();

          System.out.println(" x:"+am.x);
          System.out.println(" y:"+am.y);

          int x=am.divide(am.x,am.y);
        //   ArithmeticException ae;
          

       }
       catch(ArithmeticException ae){

           
           System.out.println(ae);
             System.out.println("Caught error : "+ae.getMessage());
              System.out.println("divide by zero not run.");  
           System.out.println("rest of the code...");  

       }
    }
}