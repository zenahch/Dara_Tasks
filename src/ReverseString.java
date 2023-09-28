public class ReverseString {

    public static void main(String[] args) {

        String name = "Rasha";

        String result = "";// declare an empty string to store your reversed string

        for(int i= name.length()-1; i >= 0; i--){ // using traditional loop to iterate from last index to first index , by decrementing each character backwards
            result+=name.charAt(i);// assign char i to the result starting from last to first
        }

        System.out.println(result);


    }
}
