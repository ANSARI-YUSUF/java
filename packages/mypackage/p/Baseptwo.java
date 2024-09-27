import java.util.Scanner;
import base.Basep;
class Baseptwo{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        Basep b = new Basep();
        b.print_data();
        int[] array = new int[3];
        for(int i=0;i<3;i++)
        {
            array[i] = s.nextInt();
           
        }
         b.array_store(array);
    }
}