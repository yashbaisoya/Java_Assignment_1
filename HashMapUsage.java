import java.util.HashMap;

public class HashMapUsage {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("John", 85);
        map.put("Alice", 90);
        map.put("Bob", 78);
        
        String query = "Alice";
        System.out.println("Marks for " + query + ": " + map.get(query));
    }
}