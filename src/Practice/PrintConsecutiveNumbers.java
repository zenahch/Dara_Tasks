package Practice;

public class PrintConsecutiveNumbers {

    /*
    Write a function that, given a positive integer N, prints the consecutive numbers from 1 to N, each on a separate line. However, any number divisible by 2, 3 or 5 should be replaced by the word Codility, Test or Coders respectively. If a number is divisible by more than one of the numbers: 2,3 or 5, it should be replaced by a concatenation of the respective words CodilityTest and Coders in this given order.
        EX:
        Numbers divisible by both 2 and 3 should be replaced by CodilityTest and numbers divisible by all three numbers, 2,3 and 5, should be replaced by CodilityTestCoders
     */


    public static void conNumbers(int n){

        if(n <= 0){
            System.out.println("Number can not be zero or negative");
            System.exit(1);
        }

        String codility = "Codility";
        String test = "Test";
        String coders = "Coders";

        for (int i = 1; i <= n ; i++) {

            if(i % 2 == 0 ){
                System.out.print(codility);
            }
            if(i % 3 == 0){
                System.out.print(test);
            }
            if(i % 5 == 0){
                System.out.print(coders);
            }
            if(i % 2!=0 && i%3 !=0 && i % 5 !=0){
                System.out.print(i);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        conNumbers(100);
    }

    /*

    or

    public static void conNumbers(int n){

        if(n <= 0){
            System.out.println("Number can not be zero or negative");
            System.exit(1);
        }

        String codility = "Codility";
        String test = "Test";
        String coders = "Coders";
        String result ="";

        for (int i = 1; i <= n ; i++) {

            result = "";
            if(i % 2 == 0 ){
               // System.out.print(codility);
                result += codility;
            }
            if(i % 3 == 0){
               // System.out.print(test);
                result += test;
            }
            if(i % 5 == 0){
                //System.out.print(coders);
                result += coders;
            }
            if(result.isEmpty()){
            //if(i % 2!=0 && i%3 !=0 && i % 5 !=0){
                //System.out.print(i);
                result = String.valueOf(i);
            }
            System.out.println(result);
        }
    }

    public static void main(String[] args) {
        conNumbers(100);
    }
     */
}

