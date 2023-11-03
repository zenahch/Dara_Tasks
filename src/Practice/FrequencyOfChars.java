package Practice;

public class FrequencyOfChars {

    /*
    Write a return method that can find the frequency of characters
    Ex: FrequencyOfChars("AAABBCDD") ==> A3B2C1D2
     */

    public static void freqOfChar(String str){// AABABDCD

        String result = "";

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            int count =0;

            for (int j = 0; j < str.length(); j++) {

                if(ch ==str.charAt(j)){
                    count++;
                }
            }
            if(!result.contains(String.valueOf(ch))){
                result += String.valueOf(ch)+count;
            }
        }
        System.out.println(result);
    }
    public static void main(String[] args) {
        freqOfChar("AABABDCD");

    }
}
