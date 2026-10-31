import java.util.Vector;

public class VectorUsage {
    public static void main(String[] args) {
        Vector<Integer> vector = new Vector<>();
        vector.add(10);
        vector.add(20);
        vector.add(30);
        vector.add(40);
        vector.add(50);
        
        // Remove element at index 2 (which is 30)
        vector.remove(2);
        
        System.out.println("Updated Vector: " + vector);
    }
}