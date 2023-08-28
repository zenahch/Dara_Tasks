public class Different_Number {

    public static void main(String[] args) {

        //find the different number (4)
        int [] arr1 = {1,2,3};
        int [] arr2 = {1,2,3,4};

        int sum1=0, sum2=0;

        for (int i=0 ; i<arr1.length ; i++) {
            sum1 += arr1[i];
        }

        for (int i=0 ; i<arr2.length ; i++) {
            sum2 += arr2[i];
        }

        int diffNumber = sum2 - sum1;
        System.out.println(diffNumber);
    }
}
