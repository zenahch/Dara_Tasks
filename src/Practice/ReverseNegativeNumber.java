package Practice;

public class ReverseNegativeNumber {

    /*
    Write a return method that can reverse digits of a negative number and return it as int input: -35  output: -53
     */

    public static int reverseNum(int num){

        if(num >= 0 ){
            System.out.println("Number must be negative");
            System.exit(1);
        }

        String numStr = String.valueOf(Math.abs(num));
        StringBuilder numWord = new StringBuilder();
        for (int i = 0; i < numStr.length(); i++) {

            numWord.insert(0,numStr.charAt(i));
        }

        int number = Integer.valueOf(numWord.toString());
        return number *-1;

    }

    public static void main(String[] args) {
        System.out.println(reverseNum(-53));
    }
}
  /*
  or
     public static int reverseNumber(int n){

        String numStr = String.valueOf(Math.abs(n));
        String numNew = "";

        for (int i = numStr.length()-1; i >= 0; i--) {

            numNew += numStr.charAt(i);
        }
        return Integer.parseInt(numNew) * -1;
    }

    public static void main(String[] args) {
        System.out.println(reverseNumber(-53));
    }
   */
