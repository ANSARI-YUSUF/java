// A functional interface
@FunctionalInterface
interface Square {
    int calculate(int x);
}


public class oneparameter {

    public static void main(String[] args) {
        // Lambda expression with one parameter
        Square square = x -> x * x;

        // Calling the method
        int result = square.calculate(5);
        System.out.println("The square of 5 is: " + result);
    }
    
}





