import java.util.Arrays;

public class Array_Maximum {

    public static void main(String[] args) {
        int[] anArray = {-2,5,1,-7,8,13};

        int largest = anArray[0];

        for(int i = 0; i < anArray.length; i++){
            if(anArray[i] > largest){
                largest = anArray[i];
            }
        }

        System.out.println(largest);
    }
}
