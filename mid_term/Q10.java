package mid_term;
import java.util.*;
public class Q10 {
//     Q:-10 EASSY Sort an Array.
// Given an array of integers nums, sort the array in ascending order and return it.
// You must solve the problem without using any built-in functions in O(nlog(n)) time complexity and with the smallest space complexity possible.
// Example 1:
// Input: nums = [5,2,3,1]
// Output: [1,2,3,5]
// Explanation: After sorting the array, the positions of some numbers are not changed (for example, 2 and 3), while the positions of other numbers are changed (for example, 1 and 5).
// Example 2:
// Input: nums = [5,1,1,2,0,0]
// Output: [0,0,1,1,2,5]
// Explanation: Note that the values of nums are not necessairly unique.
// Constraints:
// 1 <= nums.length <= 5 * 104
// -5 * 104 <= nums[i] <= 5 * 104
public static int [] selectionsort(int []nums){
    for(int i=0;i<nums.length;i++){
        for(int j=i+1;j<nums.length;j++){
            if(nums[i]>nums[j]){
                int temp=nums[i];
                nums[i]=nums[j];
                nums[j]=temp;
            }
        }
    }
    return nums;
}
public static int [] bubblesort(int []nums){
    for(int turns=0;turns<nums.length-1;turns++){
        for(int j=0;j<nums.length-turns-1;j++){
            if(nums[j]>nums[j+1]){
                int temp=nums[j];
                nums[j+1]=nums[j];
                nums[j]=temp;
            }
        }
    }
    return nums;
}
public static int []insertionsort(int nums[]){
    for(int i=1;i<nums.length;i++){
        int j=i;
        while(j>0 && nums[j]<nums[j-1]){
            int temp=nums[j];
            nums[j-1]=nums[j];
            nums[j]=temp;
            j--;
        }
    }
    return nums;
}
public static void main(String[] args) {
    int nums[]={5,2,3,1};
    int ans[]=selectionsort(nums);
    System.out.println(Arrays.toString(ans));
     int ans1[]=bubblesort(nums);
     System.out.println(Arrays.toString(ans1));
   
     int ans2[]=insertionsort(nums);
     System.out.println(Arrays.toString(ans2));

}
}
