
// import java.util.*;
// import java.lang.*;
class mythreadex extends Thread{
    
    @Override
   public void  run(){
    int i=0;

    
    while(i<5){
        System.out.println("my theread is running");

        try {
            Thread.sleep(1000);
            
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("error="+e);
        }
        
        
        if(i==4){
            System.out.println("thank you");
        }
        i++;
    }



   }

}







class mythreadex1 extends Thread{
    
    @Override
   public void  run(){
    int i=0;

    
    while(i<5){
        System.out.println("my theread 1 is running");


        
    
        if(i==4){
            System.out.println("thank you");
        }
        i++;
    }



   }

}



class threadmethods{

    public static void main(String[] args) {
        // mythread t1=new mythread();
        mythreadex t2=new mythreadex();
        mythreadex1 t3=new mythreadex1();


        t2.start();
       
            try {
                t2.join();
                
            } catch (Exception e) {
                // TODO: handle exception
                System.out.println("error="+e);
            }
        
        t3.start();
    }



}