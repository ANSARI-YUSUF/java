
/**
 * animal
 */
 interface animal {

     void eats() ;

     default void kills(){
        System.out.println("animal can kill");
     }

    
}

interface pet {
    int age=20;

    void play() ;

   
}
class lion implements animal,pet{

    public void eats(){
        System.out.println("lion is eating");
    }
   public void play(){
        System.out.println("lion plays with me");
    }
}

public class learninterface{
   // @SuppressWarnings("static-access")
    public static void main(String[] args) {
        lion l=new lion();
        l.eats();
        l.play();
        l.kills();
        System.out.println(pet.age);
        
    }
    
}