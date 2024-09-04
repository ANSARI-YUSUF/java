 class nullptr{
    public static void main(String[] args) {
        String str = null;
         String str2 = "hello";

        try {
            // Attempt to access length of a null String
            int length = str.length(); // This will throw NullPointerException
        } catch (NullPointerException e) {
            System.out.println("Caught NullPointerException: " + e.getMessage());
        }
        
        try {
            // Attempt to access length of a null String
            int length = str2.length();
                    System.out.println("string="+str2);  // This will throw NullPointerException
        } catch (NullPointerException e) {
            System.out.println("Caught NullPointerException: " + e.getMessage());
        }

        // Safe usage after null check
        if (str != null) {
            int length = str.length(); // Safe if str is not null
        } 
        else if (str2 != null) {
                 int length = str.length();
                 System.out.println("string="+str2); // Safe if str is not null
        } 


        else {
            System.out.println("String is null, cannot perform operation");
        }
    }
}
