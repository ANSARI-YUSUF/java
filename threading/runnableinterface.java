class mythreadrunnabl1 implements Runnable{
    public void run()

    {
        System.out.println("mythread 1");
        System.out.println("mythread 1");
        System.out.println("mythread 1");
        System.out.println("mythread 1");
        System.out.println("mythread 1");
        System.out.println("mythread 1");
        System.out.println("mythread 1");
        System.out.println("mythread 1");
        System.out.println("mythread 1");
        System.out.println("mythread 1");
        System.out.println("mythread 1");
        System.out.println("mythread 1");
        System.out.println("mythread 1");
        System.out.println("mythread 1");
        System.out.println("mythread 1");
        System.out.println("mythread 1");
        System.out.println("mythread 1");
        System.out.println("mythread 1");
        System.out.println("mythread 1");
        System.out.println("mythread 1");
        System.out.println("mythread 1");
        System.out.println("mythread 1");
        System.out.println("mythread 1");
        System.out.println("mythread 1");
        System.out.println("mythread 1");
        System.out.println("mythread 1");
        System.out.println("mythread 1");
        System.out.println("mythread 1");
        System.out.println("mythread 1");
        System.out.println("mythread 1");
        System.out.println("mythread 1");
        System.out.println("mythread 1");
        System.out.println("mythread 1");
        System.out.println("mythread 1");
        System.out.println("mythread 1");
        System.out.println("mythread 1");
        System.out.println("mythread 1");
        System.out.println("mythread 1");
        System.out.println("mythread 1");
        System.out.println("mythread 1");
        System.out.println("mythread 1");
        System.out.println("mythread 1");
        System.out.println("mythread 1");
        System.out.println("mythread 1");
        System.out.println("mythread 1");
        System.out.println("mythread 1");
        System.out.println("mythread 1");
        System.out.println("mythread 1");
        System.out.println("mythread 1");
        System.out.println("mythread 1");
        System.out.println("mythread 1");
        System.out.println("mythread 1");
        System.out.println("mythread 1");
        System.out.println("mythread 1");
        System.out.println("mythread 1");
        System.out.println("mythread 1");
        System.out.println("mythread 1");

        
    }
}


class mythreadrunnabl2 implements Runnable{
    public void run()

    {
        System.out.println("mythread   2");
        System.out.println("mythread   2");
        System.out.println("mythread   2");
        System.out.println("mythread   2");
        System.out.println("mythread   2");
        System.out.println("mythread   2");
        System.out.println("mythread   2");
        System.out.println("mythread   2");
        System.out.println("mythread   2");
        System.out.println("mythread   2");
        System.out.println("mythread   2");
        System.out.println("mythread   2");
        System.out.println("mythread   2");
        System.out.println("mythread   2");
        System.out.println("mythread   2");
        System.out.println("mythread   2");
        System.out.println("mythread   2");
        System.out.println("mythread   2");
        System.out.println("mythread   2");
        System.out.println("mythread   2");
        System.out.println("mythread   2");
        System.out.println("mythread   2");
        System.out.println("mythread   2");
        System.out.println("mythread   2");
        System.out.println("mythread   2");
        System.out.println("mythread   2");
        System.out.println("mythread   2");
        System.out.println("mythread   2");
        System.out.println("mythread   2");
        System.out.println("mythread   2");
        System.out.println("mythread   2");
        System.out.println("mythread   2");
        System.out.println("mythread   2");
        System.out.println("mythread   2");
        System.out.println("mythread   2");
        System.out.println("mythread   2");
        System.out.println("mythread   2");
        System.out.println("mythread   2");
        System.out.println("mythread   2");
        System.out.println("mythread   2");
        System.out.println("mythread   2");
        System.out.println("mythread   2");
        System.out.println("mythread   2");
        System.out.println("mythread   2");
        System.out.println("mythread   2");
    }
}

class mythreadrunn{


    public static void main(String[] args) {
        mythreadrunnabl1 rt1=new mythreadrunnabl1();
        Thread t1=new Thread(rt1);
        mythreadrunnabl2 rt2=new mythreadrunnabl2();
        Thread t2=new Thread(rt2);

        t1.start();
        t2.start();


    }
}