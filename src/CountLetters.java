public class CountLetters {

    public static void main(String[] args) {
        String word = "google";
        countEachLetter(word);


    }

    public static void countEachLetter(String word){
        //google //g2o2l1e1
        String res =""; //create res string to store result
        int count; // counter bcz we need to count each letter (ex:g2o2l1e1)
        for (int i = 0; i < word.length() ; i++) { //<--- outer loop
            count = 0; // counter resets to 0 every iteration of outer loop
            for (int j = 0; j < word.length(); j++) {//<--- inner loop
                if(word.charAt(i)==word.charAt(j)){//
                    count++; //2
                }
            }
            if(!res.contains(""+word.charAt(i))){
                res+=word.charAt(i)+""+count;
            }
        }
        System.out.println(res);
    }
}
