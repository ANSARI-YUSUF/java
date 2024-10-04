//  9) Write a java program to calculate Simple Interest using Command Line Arguments. (Hint use
// Wrapper classes)
 
 
 class simpleint {

    public static void main(String[] args) {
        if (args.length != 3) {
            System.out.println("Please provide exactly three arguments: Principal, Rate, and Time.");
            return;
        }

        try {
            // Parse command-line arguments
            double principal = Double.parseDouble(args[0]); // Principal amount
            double rate = Double.parseDouble(args[1]); // Rate of interest
            double time = Double.parseDouble(args[2]); // Time period

            // Calculate Simple Interest
            double simpleInterest = (principal * rate * time) / 100;

            // Display the result
            System.out.printf("Simple Interest: %.2f\n", simpleInterest);
        } catch (NumberFormatException e) {
            System.out.println("Please provide valid numeric values for Principal, Rate, and Time.");
        }
    }
}
