// 7) Use While loop to generate random numbers and maintain a running sum of these values.
// Terminate when the sum exceeds 20. (Note: use Math. random() method to obtain numbers.)

import java.util.*;


class randomnumber{

public static void main(String [] args){

    int i=0;
    int b;
    int sum=0;
    Random r= new Random();
    


   do{
        // int a=r.nextInt();
        b=(int)(Math.random() * 2);
        sum=sum+b;
        // if()
        i++;

    }while(sum <= 20);

     System.out .println("sum="+sum);
     
     System.out .println("time loop iterate="+i);
}

}