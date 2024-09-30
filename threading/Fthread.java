
// import java.util.*;
class mythread extends Thread{
    
    @Override
   public void  run(){
    while(true){
        System.out.println("my theread is running");
    }

   }

}



class mythread2 extends Thread{
    
    @Override
   public void  run(){
    int i=0;
    while(i<40000){
        System.out.println("my theread 1 is running");
        System.out.println("thread 2");
        i++;
    }

   }

}


class mythread3 extends Thread{
    
    @Override
   public void  run(){
    int i=0;
    while(i<40000){
        System.out.println("my theread 2 is running");
        System.out.println("thread 3");
        i++;
    }

   }

}

class Fthread{

    public static void main(String[] args) {
        // mythread t1=new mythread();
        mythread2 t2=new mythread2();
        mythread3 t3=new mythread3();


        t2.start();
        t3.start();
    }



}