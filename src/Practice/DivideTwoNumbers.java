package Practice;

public class DivideTwoNumbers {

    public static int divideTwoNums(int num1, int num2){ // num1 = 10 , num2 = -2

        if(num2 == 0){
            System.out.println("You can not divide by zero!");
            System.exit(1);
        }
        int sign = 1;
        if(num1 * num2 < 0){
            sign = -1;

        }
        int num1Abs = Math.abs(num1);
        int num2Abs = Math.abs(num2);

        int counter = 0;

        while(num1Abs >= num2Abs){

            num1Abs -= num2Abs;
            counter++;
        }

        return counter * sign;

    }

    public static void main(String[] args) {
        System.out.println(divideTwoNums(10, 2));
    }



}
