import java.util.HashMap;
import java.util.Map;

class Hashmap{
    
public static void main(String[] args){
HashMap<String, Integer> map = new HashMap<>();
// print(map);
map.put("sanjay", 82);
map.put("yusuf", 61);
map.put("ashish", 92);

System.out.println("Size of map is" + map.size());

print(map);
if (map.containsKey("yusuf"))
{
Integer a = map.get("yusuf");
System.out.println("value for key \"yusuf\" is:- " + a);
}

// map.clear();
//  print(map);
}


public static void print(Map<String, Integer> map){
    if (map.isEmpty()){
    System.out.println("map is empty");
    }
    else{
    System.out.println(map);

Integer valueToFind = 82;

        boolean found = false;
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue().equals(valueToFind)) {
                System.out.println("Key for value " + valueToFind + " is: " + entry.getKey());
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Value " + valueToFind + " not found.");
        }
    }
}
}