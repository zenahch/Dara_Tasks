package Practice;

public class Finra {

    public static void finraTask(int n) {

        int i = 1;

        while (i <= n) {

            if (i % 3 == 0 && i % 5 == 0) {

                System.out.println("Finra");
            } else if (i % 3 == 0) {
                System.out.println("Fin");
            } else if (i % 5 == 0) {
                System.out.println("Ra");

            } else {
                System.out.println(i);
            }
            i++;
        }
    }
    public static void main(String[] args) {
        finraTask(50);
    }
}
