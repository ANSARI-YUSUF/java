
// A functional interface
@FunctionalInterface
interface Greeting {
    void greet();
}


public class zerolamda{

    
    public static void main(String[] args) {
        // Lambda expression with zero parameters
        Greeting greeting = () -> System.out.println("Hello, World!");

        // Calling the method
        greeting.greet();
    }
    
}




