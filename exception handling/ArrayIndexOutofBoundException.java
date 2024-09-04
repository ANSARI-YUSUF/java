 class indexerror {
    public static void main(String[] args) {
        int[] numbers = {10, 200, -3};

        try {
            System.out.println("at 6 index:");
            System.out.println(numbers[6]); // Trying to access the fourth element which does not exist
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught an ArrayIndexOutOfBoundsException: " + e.getMessage());
        }
        
         try {
                 System.out.println("at -1 index:");
            System.out.println(numbers[-1]); // Trying to access the fourth element which does not exist
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught an ArrayIndexOutOfBoundsException: " + e.getMessage());
        }
           
         try {
                 System.out.println("at 2 index:");
            System.out.println(numbers[2]); // Trying to access the fourth element which does not exist
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught an ArrayIndexOutOfBoundsException: " + e.getMessage());
        }
    }
}
