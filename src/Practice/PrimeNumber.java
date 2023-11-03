package Practice;

public class PrimeNumber {

    /*
    Write a method that can check if a number is prime or not.
    a whole number greater than 1 that cannot be exactly divided by any whole number other than itself and 1 (e.g. 2, 3, 5, 7, 11).
     */

    public static boolean isPrime(int n){

        for(int i = 2; i < n; i++){

            if(n % i == 0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isPrime(53));
    }
}
