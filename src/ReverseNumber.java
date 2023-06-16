public class ReverseNumber {
    public static void main(String[] args) {

        int num = -1234;
        int reverse = 0;


        while (num != 0) { // -1234 doesnt equal 0

            reverse = reverse*10 + num%10;    // 0+1234%10=4      40+3=43      430+2=432       4320+1=4321
            num = num / 10;   // 1234/10=123    123/10=12    12/10=1    1/10=0
        }

        System.out.println(reverse);
    }
}
