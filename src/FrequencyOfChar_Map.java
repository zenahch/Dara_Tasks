import java.util.HashMap;
import java.util.Map;

public class FrequencyOfChar_Map {

    public static void main(String[] args) {
            String input = "Hello, world!";
            printCharacterFrequency(input);
        }

        public static void printCharacterFrequency(String input) {
            Map<Character, Integer> frequencyMap = new HashMap<>();

            for (char c : input.toCharArray()) {
                if (Character.isLetterOrDigit(c)) {
                    frequencyMap.put(c, frequencyMap.getOrDefault(c, 0) + 1);
                }
            }

            for (Map.Entry<Character, Integer> entry : frequencyMap.entrySet()) {
                System.out.println("'" + entry.getKey() + "' appears " + entry.getValue() + " times.");
            }
        }
    }


