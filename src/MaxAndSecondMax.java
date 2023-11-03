public class MaxAndSecondMax {

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};

        int max = 0;
        int secondMax = 0;

        for (int i : arr) {

            if (i > max) {

                max = i;
            }
        }
        for (int i1 : arr) {

            if (i1 > secondMax && i1 < max) {

                secondMax = i1;

            }
        }

        System.out.println("max = " + max);
        System.out.println("secondMax = " + secondMax);
    }
}
