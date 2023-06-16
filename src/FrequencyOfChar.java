public class FrequencyOfChar {
    public static void main(String[] args) {

        String str = "XXXYZZZ";

        String result = "";   // because we will put the result end of the execution of loop


        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);    // this characters will be used to count in the string

            int count = 0;

            for (int j = 0; j < str.length(); j++) {  // frequency and count
                if (str.charAt(j) == ch){
                    count++;
                }
            }

            if (result.contains(""+ch)){
                continue;
            }

            result += "" + ch + count;

        }


        System.out.println(result);



    }
}
