import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class MoveAllZeros {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        list.addAll(Arrays.asList(1,0,2,0,3,0,4,0));

        int countZeros = Collections.frequency(list, 0);

        list.removeAll(Arrays.asList(0));

        for (int i = 0; i < countZeros; i++) {
            list.add(0);
        }

        System.out.println(list);


    }
}
