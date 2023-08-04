public class SumOfDigitInString {

    //Declare and Initialize a String variable.
    //Declare a sum variable to hold the sum of digits.
    //Use the charAt() method to extract a single character from a given String.
    //Now use the isDigit() method to check character is a digit or not, if yes add it to the sum variable else ignore it.
    //Before adding the digit to the sum, convert it to an integer from a character using getNumericValue() method of Character class.
    //Repeat the 3 to 5 steps until the end of the String.
            //Finally, print the total sum.


    // Method to calculate sum of digits
    public static int sumOfDigitInString(String str) {
        // initialize sum variable
        int sum = 0;

        for (int i = 0; i < str.length(); i++) {
            // extract single character from string
            char ch = str.charAt(i);

            // check digit character
            if (Character.isDigit(ch)) {

                // convert character to digit and add into sum variable
                int digit = Character.getNumericValue(ch);
                sum = sum + digit;
            }
        }
        // finally return the calculated sum
        return sum;
    }

    // Main method
    public static void main(String[] args) {

        // Declare and Initialize a string (with digits)
        String stringWithDigit = "1ab26xyz88www5";

        // Find the sum
        int sum = sumOfDigitInString(stringWithDigit);

        // Print the result
        System.out.println("The sum of total available digits in the given String= " + sum);

    }
}
