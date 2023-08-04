import java.util.ArrayList;
import java.util.List;

public class RemoveValuesGreaterThan100 {

    public static void removeValuesGreaterThan100(List<Integer> list) {
        list.removeIf(value -> value > 100);
    }
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(105);
        numbers.add(200);
        numbers.add(7);

        removeValuesGreaterThan100(numbers);

        System.out.println("After removing values greater than 100: " + numbers);
    }

}
