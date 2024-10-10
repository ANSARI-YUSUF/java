//Collection example
import java.util.*;


public class javacollection {
    public static void main(String[] args) {
        ArrayList a=new ArrayList<>();
        LinkedList l=new LinkedList<>();



        Date start;
        Date end;
        long differenceof1, differenceof2;
        long differenceof3, differenceof4;


        start= new Date();
        populate(a);

        end   = new Date();
        differenceof1 = end.getTime() - start.getTime();


        
         start = new Date();
         print(a);
         end   = new Date();
         differenceof3 = end.getTime() - start.getTime();


               
         System.out.println("Time in Populating ArrayList elements  :: " + differenceof1);
         System.out.println("Time in Printing   ArrayList elements  :: " + differenceof3);





        
    }

    public static void populate(List a)
        {
            for(int i=0; i < 5000; i++)
            {
                a.add("Element #" + Integer.toString(i+1));
            }
        }  


        public static void print(List a)
            {
                for(int i=0; i < a.size(); i++)
                {
                    System.out.println(a.get(i));
                }
            }
    
    
}









class CollectionExample
{    
//     public static void main(String[] args)
//     {
//         ArrayList  a = new ArrayList();
//         LinkedList l = new LinkedList();
       
//         Date start;
//         Date end;
//         long difference1, difference2;
//         long difference3, difference4;
       
       
//         start = new Date();
//         populate(a);
//         end   = new Date();
//         difference1 = end.getTime() - start.getTime();
       
       
//         start = new Date();
//         populate(l);
//         end   = new Date();
//         difference2 = end.getTime() - start.getTime();
       
       
       
//         start = new Date();
//         print(a);
//         end   = new Date();
//         difference3 = end.getTime() - start.getTime();
       
//         start = new Date();
//         print(l);
//         end   = new Date();
//         difference4 = end.getTime() - start.getTime();
       
//         System.out.println("Time in Populating ArrayList elements  :: " + difference1);
//         System.out.println("Time in Printing   ArrayList elements  :: " + difference3);
       
//         System.out.println("Time in Populating LinkedList elements :: " + difference2);
//         System.out.println("Time in Printing   LinkedList elements :: " + difference4);
       
//     }
   
//     public static void populate(List a)
//     {
//         for(int i=0; i < 50; i++)
//         {
//             a.add("Element #" + Integer.toString(i+1));
//         }
//     }    
   
//     public static void print(List a)
//     {
//         for(int i=0; i < a.size(); i++)
//         {
//             System.out.println(a.get(i));
//         }
//     }
}