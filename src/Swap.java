public class Swap {
    public static void main(String[] args) {

        /*
          1. Initialize a temporary variable, let's call it 'temp'.
          2. Assign the value of 'a' to 'temp'.
          3. Assign the value of 'b' to 'a'.
          4. Assign the value of 'temp' (which holds the original value of 'a') to 'b'.

     */

        int a = 10;
        int b = 5;

        // swapping using a temp variable
        int temp = a; // --> temp = 10
        a = b; // --> a = 5
        b = temp; // --> b = 10

        System.out.println("After swapping:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}


