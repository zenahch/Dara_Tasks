import java.util.Arrays;

public class ArrayConcat2 {
    public static void main(String[] args) {

        int[] arr1 = {1, 2, 3,4};
        int[] arr2 = {7, 8, 9};

        int lengthArr1 = arr1.length;
        int lengthArr2 = arr2.length;

        int[] result = new int[lengthArr1 + lengthArr2];

        System.arraycopy(arr1, 0, result, 0, lengthArr1);
        System.arraycopy(arr2, 0, result, lengthArr1, lengthArr2);

        System.out.println(Arrays.toString(result));
    }

}
