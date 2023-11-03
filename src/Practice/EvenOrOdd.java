package Practice;

public class EvenOrOdd {

    /*
    Write a method that can identify  a given number is even or odd.
        EX:
       identify(5) --> "Odd"
       identify(6) --> "Even"
     */

    public static String evenOdd(int num){
         return num%2 == 0?"Even":"Odd";
    }

    public static String evenOrOddNum(int num){
        if(num % 2 == 0){
            return "Even";
        }
        return "Odd";
    }

    public static void main(String[] args) {
        System.out.println(evenOdd(10));
        System.out.println(evenOrOddNum(10));
    }
}

