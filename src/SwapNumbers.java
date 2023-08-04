public class SwapNumbers {
    public static void main(String[] args) {
        int x = 10;
        int y = 5;
        x = x + y; //x=10+5 --> x = 15
        y = x - y; //y=15-5 --> y = 10
        x = x - y; //x=15-10 --> x = 5
        System.out.println("After swapping:" + " x = " + x + ", y = " + y);
    }
}
