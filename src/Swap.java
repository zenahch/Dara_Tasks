public class Swap {
    public static void main(String[] args) {

        int x = 10;
        int y = 15;

        System.out.println("Before swapping:");
        System.out.println("x = " + x);
        System.out.println("y = " + y);

        y = x + y;
        x = y - x;
        y = y - x;

        System.out.println("After swapping:");
        System.out.println("x = " + x);
        System.out.println("y = " + y);
    }
}
