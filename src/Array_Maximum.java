import java.util.Arrays;

public class Array_Maximum {

    public static void main(String[] args) {
        int a[] = {2,5,3,7,8};
        Arrays.sort(a);

        int min =a[0];
        System.out.println(min);

        int max= a[a.length-1];
        System.out.println(max);
    }
}
