

 abstract class Yusuf{

    abstract void name();
    abstract int age(int i);
    void profession(){
        System.out.println("he is a developer");
    }

}


class Yusufson extends Yusuf{

    void name(){
        System.out.println("my name is yusuf");

    }
    
    int age (int i){

        i=i+20;
        return i;
        
    }
    void profession(){

        System.out.println("overrided developer");
    }
}

public class learnabstract {
    public static void main(String[] args) {

        //@SuppressWarnings("unused")
        // Yusuf  y1=new Yusuf();

        Yusufson ys=new Yusufson();
        ys.name();
        int ageofson=ys.age(20);

        System.out.println(ageofson);

        ys.profession();
        
    }
    
}