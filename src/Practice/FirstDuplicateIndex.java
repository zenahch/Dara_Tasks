package Practice;

import java.util.HashMap;
import java.util.Map;

public class FirstDuplicateIndex {

    public static int findFirstDuplicateIndex(int[] array) {
        Map<Integer, Integer> indexMap = new HashMap<>();

        for (int i = 0; i < array.length; i++) {
            int currentNumber = array[i];
            if (indexMap.containsKey(currentNumber)) {
                // If the number is already in the map, return its index
                return indexMap.get(currentNumber);
            } else {
                // Otherwise, add the number and its index to the map
                indexMap.put(currentNumber, i);
            }
        }

        // If no number appears more than once, return -1 or any appropriate value
        return -1;
    }

    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 5};
        int result1 = findFirstDuplicateIndex(array1);
        System.out.println("Result 1: " + result1);

        int[] array2 = {1, 5, 2, 4, 2, 5};
        int result2 = findFirstDuplicateIndex(array2);
        System.out.println("Result 2: " + result2);
    }
}
