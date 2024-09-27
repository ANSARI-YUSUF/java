package base;
public class Basep{
    int a=50;
    int b=10;
    int[] m = new int[3];

    public void print_data(){
       System.out.println(a);
       System.out.println(b);
    }

    public void array_store(int[] marks)
    {
        m = marks;
        for(int i=0;i<3;i++)
        {
            System.out.println(marks[i]);
        }
    }


      public static void main(String[] args){
        System.out.println("hello");
        
    }
}