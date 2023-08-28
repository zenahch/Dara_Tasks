public class ReverseStringUsingStringBuilder {

    public static void main(String[] args) {
        String originalString = "Hello, World!";

        // Create a StringBuilder object with the original string
        StringBuilder stringBuilder = new StringBuilder(originalString);

        // Use the reverse() method to reverse the string
        stringBuilder.reverse();

        // Convert the StringBuilder back to a String
        String reversedString = stringBuilder.toString();

        System.out.println("Original String: " + originalString);
        System.out.println("Reversed String: " + reversedString);
    }
}




