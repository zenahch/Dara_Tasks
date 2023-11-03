package Practice;

public class DivisibleBy_3_5_15 {

    /*
    Write a program that can print the numbers between 1 ~ N that can be divisible by 3, 5, and 15.
    if the number can be divisible by 3, 5 and 15, then it should only be displayed in Divisible By15 section.
    if the number can be divisible by 3 but cannot be divisible by 15, then it should only be displayed in Divisible By3 section.
    if the number can be divisible by 5 but cannot be divisible by 15, then it should only be displayed in Divisible By5 section.
    EX:
    Input: 100
    Output:
    Divisible By15   15 30 45 60 75 90
    Divisible By5    5 10 20 25 35 40 50 55 65 70 80 85 95 100
    Divisible By3    3 6 9 12 18 21 24 27 33 36 39 42 48 51 54 57 63 66 69 72 78 81 84 87 93 96 99
     */



  /*  public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter a value for N: ");
            int N = scanner.nextInt();

            for (int num = 1; num <= N; num++) {
                if (num % 15 == 0) {
                    System.out.println(num + " is divisible by 3, 5, and 15 (Divisible By15 section)");
                } else if (num % 3 == 0) {
                    System.out.println(num + " is divisible by 3 but not by 15 (Divisible By3 section)");
                } else if (num % 5 == 0) {
                    System.out.println(num + " is divisible by 5 but not by 15 (Divisible By5 section)");
                }
            }
        }

   */

    public static void divisibleBy_3_5_15(int n) {
        String divisibleBy3 = "Divisible By3 = ";
        String divisibleBy5 = "Divisible By5 = ";
        String divisibleBy15 = "Divisible By15 = ";

        for (int i = 1; i <= n; i++) {

            if (i % 15 == 0) {
                divisibleBy15 += i + " ";

            } else if (i % 5 == 0) {
                divisibleBy5 += i + " ";

            } else if (i % 3 == 0) {
                divisibleBy3 += i + " ";
            }


        }
        System.out.println(divisibleBy3);
        System.out.println(divisibleBy5);
        System.out.println(divisibleBy15);


    }

    public static void main(String[] args) {
        divisibleBy_3_5_15(100);
    }
}



