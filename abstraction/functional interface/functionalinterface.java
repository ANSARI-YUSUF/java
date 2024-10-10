interface Hi{
    void printhi();

}

class hello implements Hi{
    public void printhi(){
        System.out.println("hi my name is yusuf");
    }
    

}
public  class functionalinterface 


{
    public static void main(String[] args) {
        Hi h=new hello();

        h.printhi();
    }
   

}