package Collections.ArrayList;
// WAP to return object of duplicate ?
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DuplicateFind {
    public static List<Integer> findDuplicates(List<Integer> inputList) {
        // To store the result of duplicates
        List<Integer> duplicates = new ArrayList<>();

        // To track the already seen elements
        Set<Integer> seen = new HashSet<>();

        for (Integer element : inputList) {
            // If the element is already seen, it's a duplicate
            if (seen.contains(element)) {
                // Add to the duplicates list if not already present
                if (!duplicates.contains(element)) {
                    duplicates.add(element);
                }
            } else {
                // If it's not seen, add to the seen set
                seen.add(element);
            }
        }

        return duplicates;
    }

    public static void main(String[] args) {
        // Sample input list
        List<Integer> inputList = new ArrayList<>();
        inputList.add(1);
        inputList.add(2);
        inputList.add(3);
        inputList.add(2);
        inputList.add(4);
        inputList.add(5);
        inputList.add(3);
        inputList.add(6);
        inputList.add(1);

        // Find duplicates
        List<Integer> duplicates = findDuplicates(inputList);

        // Print the duplicates
        System.out.println("Duplicates: " + duplicates);
    }
}
