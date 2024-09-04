 
//  import java.util.*;
// import java.util.Scanner;
// import java.lang.*;
// import  java.lang.Throwable;
//  class storeerror {
//     public static void main(String[] args) {
//         try {
//             // Create an array of Strings
//             String[] arr = new String[3];

//             // Attempt to store an Integer in the String array
//             arr[0] = "yusuf";
//             arr[1] = "sanjay"; 

//             Scanner s=new Scanner(System.in);
//               System.out.println("enter string value");

//             arr[2] = s.nextLine(); 
//             // throw string; // This line will throw ArrayStoreException
//         } catch (ArrayStoreException e) {
//             System.out.println("Caught ArrayStoreException: " + e);
//         }
//     }
// }


import java.util.Scanner;

 class storearray {
    public static void main(String[] args) {
        try {
            // Create an array of Strings
            int[] arr = new int[3];

            // Store valid String elements
            arr[0] = 61;
            arr[1] = 82; 

            Scanner s = new Scanner(System.in);
            System.out.println("Enter int value:");
            arr[2] = s.nextInt();
            s.nextLine();
                //    arr[2] ="yusuf";

            // // To illustrate ArrayStoreException, use an Object array
            // Object[] objArray = new String[3]; // This is a String[] referenced as Object[]
            // objArray[0] = "valid string";
            // objArray[1] = "another valid string";
            // objArray[2] = 100; // This will throw ArrayStoreException

        } catch (ArrayStoreException e) {
            System.out.println("Caught ArrayStoreException: " + e);
        }
    }
}
