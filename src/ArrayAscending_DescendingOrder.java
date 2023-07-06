public class ArrayAscending_DescendingOrder {
    public static void main(String[] args) {
        int[] array = {45,77,32,65,87};
        int x;
        for(int i=0; i < array.length; i++){
            for(int j=i; j< array.length; j++ ){
                if(array[i] > array[j]) {
                    x = array[i];
                    array[i] = array[j];
                    array[j] = x;
                }
            }
        }

        for (int a : array) {
            System.out.print(a + " ");
        }

    }
}
