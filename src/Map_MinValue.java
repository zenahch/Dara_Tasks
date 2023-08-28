import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Map_MinValue {

    public static void main(String[] args) {
        Map<String, Integer> nameAndAge = new HashMap<>();
        nameAndAge.put("A", 2);
        nameAndAge.put("B", 6);
        nameAndAge.put("C", 13);
        nameAndAge.put("D", 5);
        nameAndAge.put("E", 1);
        nameAndAge.put("F", 3);

        int min = nameAndAge.get("A");

        for (Integer value : nameAndAge.values()) {
            if (value < min)
                min = value;
        }
        System.out.println(min);

    }

/*String minKey="";
        for (Map.Entry<String, Integer> stringIntegerEntry : nameAndAge.entrySet()) {

            if (stringIntegerEntry.getValue()<min){
                min=stringIntegerEntry.getValue();
                minKey=stringIntegerEntry.getKey();
            }
        }


        System.out.println(min);
        System.out.println(minKey);
    }

 */
}
