import java.util.ArrayList;
import java.util.Collections;

public class Reverse {

    public static void main(String[] args) {
        // Create an ArrayList of integers
        ArrayList<Integer> numbers = new ArrayList<>();

        // Add elements to the ArrayList
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);

        // Print the original ArrayList
        System.out.println("Original ArrayList: " + numbers);

        // Reverse the ArrayList
        Collections.reverse(numbers);

        // Print the ArrayList in reverse order
        System.out.println("ArrayList in Reverse Order: " + numbers);
    }
}
