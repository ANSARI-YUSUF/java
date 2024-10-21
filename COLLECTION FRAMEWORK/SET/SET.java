// 4. Consider the four core interfaces, Set, List, Queue, and Map. For each of the following four
// assignments, specify which of the four core interfaces is best-suited, and explain how to use it
// to implement the assignment.
//         1. Whimsical Toys Inc (WTI) needs to record the names of all its employees. Every
//         month, an employee will be chosen at random from these records to receive a free
//         toy.
//         2. WTI has decided that each new product will be named after an employee but only first
//         names will be used, and each name will be used only once. Prepare a list of unique
//         first names.
//         3. WTI decides that it only wants to use the most popular names for its toys. Count up
//         the number of employees who have each first name.
//         4. WTI acquires season tickets for the local lacrosse team, to be shared by employees.
//         Create a waiting list for this popular sport.




// q1
// 1. Whimsical Toys Inc (WTI) needs to record the names of all its employees. Every
//         month, an employee will be chosen at random from these records to receive a free
//         toy.


import java.util.HashSet;
import java.util.Set;

 class emp {
    public static void main(String[] args) {
        
        // Create a HashSet
        Set<String> set = new HashSet<>();
        
        // Add elements to the set
        set.add("yusuf");
        set.add("sanjay");
        set.add("dati");
        set.add("jannat"); // Duplicate element, will not be added
        
        // Display the elements in the set
        System.out.println("Set: " + set); // Output order is not guaranteed
        // f
        // Check if an element is in the set
        System.out.println("Contains yusu: " + set.contains("yusuf")); // Output: true
        System.out.println("Contains Orange: " + set.contains("Orange")); // Output: false
        
        // Remove an element from the set
        // set.remove("Banana");
        // System.out.println("Set after removal: " + set);
        
        // Get the size of the set
        System.out.println("Set size: " + set.size());
        
        // Iterate through the set
        for (String element : set) {
            System.out.println("Element: " + element);
        }
    }


}

