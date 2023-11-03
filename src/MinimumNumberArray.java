public class MinimumNumberArray {

    public static void main(String[] args) {
      // created an Array called anArray and assigned some random values to it
        int[] anArray = {-5,3,1,-7,4,-12};
      // created a variable called smallest, and assuming smallest number is at index 0
        int smallest = anArray[0]; // --> -5
        // using for-loop starting with i = 0, then continue as long as i < anArray.length then we'll end by incrementing i at the end of each iteration at the loop
      for(int i = 0; i < anArray.length; i++){
          //this will check each index
          if(anArray[i] < smallest){ //this will keep looking for the smallest---->
              smallest = anArray[i];// until the end of Array
          }
      }

      System.out.println(smallest);

    }
}


