import java.util.HashMap;
import java.util.Map;

// Driver Class
class HashMap1 {
    // main function
    public static void main(String[] args) {
        
        // Create a HashMap
        HashMap<String, Integer> hashMap = new HashMap<>();
        
        // Add elements to the HashMap
        hashMap.put("yusuf", 25);
        hashMap.put("dati", 30);
        hashMap.put("jannat", 35);
        hashMap.put("sanjay", 37);
        System.out.println(hashMap.get("sanjay"));
             hashMap.put("sanjay", 371);
        
        // Access elements in the HashMap
        System.out.println(hashMap.get("jannat")); // Output: null (since "John" is not in the map)
        System.out.println(hashMap.get("sanjay")); // Output: 30
        
        // Remove an element from the HashMap
        hashMap.remove("yusuf");
        
        // Check if an element is present in the HashMap
        System.out.println(hashMap.containsKey("sanjay")); // Output: false
        
        // Get the size of the HashMap
        System.out.println(hashMap.size()); // Output: 4 (since nothing is removed)
    }
}
