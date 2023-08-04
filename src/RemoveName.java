import java.util.ArrayList;
import java.util.List;
public class RemoveName {

    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Ahmed");
        names.add("John");
        names.add("Eric");
        names.add("Ahmed");

        removeAllOccurrences(names, "Ahmed");

        System.out.println(names);
    }
    public static void removeAllOccurrences(List<String> list, String nameToRemove) {
        list.removeIf(name -> name.equals(nameToRemove));
    }
}





