public class IsOddAndIsEven {
    public static void main(String[] args) {

        System.out.println(isOdd(5));
        System.out.println(isEven(6));

    }
    public static boolean isOdd(int number){
        if (number % 2 != 0){
            return true;
        }else{
            return false;
        }

    }
    public static boolean isEven(int number){
        if ( number % 2 == 0){
            return true;
        }else {
            return false;
        }

    }

}
