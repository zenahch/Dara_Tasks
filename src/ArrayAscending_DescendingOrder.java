public class ArrayAscending_DescendingOrder {
    public static void main(String[] args) {
        int[] array = {45,77,32,65,87};
        int temp = 0;
        for(int i=0; i < array.length; i++){// this outer for loop goes through each element starting from index 0
            for(int j=i; j< array.length; j++ ){//inner loop inside of outer loop
                if(array[i] > array[j]) {
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }

        for (int a : array) {
            System.out.print(a + " ");
        }

    }
}
