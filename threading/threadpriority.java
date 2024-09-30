class mythreadpriority1 extends Thread{

    public mythreadpriority1(String name){
        super(name);
    }
    
    @Override
   public void  run(){
    int i=0;
    while(i<5){
        // System.out.println("my theread 1 is running");
        System.out.println("thread   1"+this.getName());
        i++;
    }

   }

}



// class mythreadpriority2 extends Thread{

    
//     public mythreadpriority2(String name){
//         super(name);
//     }
    
//     @Override
//    public void  run(){
//     int i=0;
//     while(i<40000){
//         // System.out.println("my theread 1 is running");
//         System.out.println("thread 2");
//         i++;
//     }

//    }

// }






public class threadpriority {
    public static void main(String[] args) {
        mythreadpriority1 t1=new mythreadpriority1("yusuf");
        mythreadpriority1 t2=new mythreadpriority1("----------dati");


        mythreadpriority1 t3=new mythreadpriority1("asish");
        mythreadpriority1 t4=new mythreadpriority1("janat");


        mythreadpriority1 t5=new mythreadpriority1("sanjau");
        mythreadpriority1 t6=new mythreadpriority1(">>>>>>>>>>srk");

        mythreadpriority1 t7=new mythreadpriority1("yusuf(max priority)");
        // mythreadpriority1 t2=new mythreadpriority1("dati");

            t7.setPriority(Thread.MAX_PRIORITY);
            t2.setPriority(Thread.NORM_PRIORITY);
            t6.setPriority(Thread.MIN_PRIORITY);
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
        t6.start();
        t7.start();
    }
    
}
