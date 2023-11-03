package Practice;

public class SwapNumbers {

    // Swap two variables' values without using a third variable.

    public static void swap(int a, int b){ // a = 1 and b = 2

        a = a + b; // a = 2 + 1 = 1
        b = a - b; // b = 3 - 2 = 1
        a = a - b; // a = 3 - 1 = 2

        System.out.println("a = " + a);
        System.out.println("b = " + b);

    }

    public static void main(String[] args) {
        swap(4,12);
    }
}
