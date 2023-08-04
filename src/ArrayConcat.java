public class ArrayConcat {
    public static int[] concatArrays(int[] array1, int[] array2) {
        int[] concatArray = new int[array1.length + array2.length];

        // Copy elements from array1 to the new array
        for (int i = 0; i < array1.length; i++) {
            concatArray[i] = array1[i];
        }

        // Copy elements from array2 to the new array
        for (int i = 0; i < array2.length; i++) {
            concatArray[array1.length + i] = array2[i];
        }

        return concatArray;
    }

}
