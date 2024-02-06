package Practice;

public class SecondMaxNumber {

// Given an array of integers return second max number

    public static int secondMax(int[] arr){ // 6,2,3,4,5,1

        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

        for(int num: arr){

            if(num > max){
                secondMax = max;
                max = num;
            }else if(num > secondMax){
                secondMax = num;
            }
        }
        return secondMax;
    }

    public static void main(String[] args) {
        int[] arr ={6,-5,3,-4,2,1};
        System.out.println(secondMax(arr));

    }
}
/*
or
  public static void secondMaxViaSorting(int[] nums) {
        int temp = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length - 1; j++) {
                if (nums[j + 1] > nums[j]) {
                    temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(nums)); //sorted array
        System.out.println(nums[1]); //second max
    }
 */