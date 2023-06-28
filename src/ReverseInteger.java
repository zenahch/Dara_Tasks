public class ReverseInteger {

    public static void main(String[] args) {

        int num = 1234;
        int reverse = 0;

        while (num != 0) {
            int remainderDigit = num % 10;
            reverse = reverse * 10 + remainderDigit;
            num /= 10;
        }
        System.out.println(reverse);


    }
}