package mid_term;
import java.util.*;
public class Q9 {
//     Q:-9 EASSY Find First and Last Position of Element in Sorted Array.
// Given an array of integers nums sorted in non-decreasing order, find the starting and ending position of a given target value.
// If target is not found in the array, return [-1, -1].
// You must write an algorithm with O(log n) runtime complexity.
// Example 1:
// Input: nums = [5,7,7,8,8,10], target = 8
// Output: [3,4]
// Example 2:
// Input: nums = [5,7,7,8,8,10], target = 6
// Output: [-1,-1]

public static int binarysearch(int[]nums,boolean findfirstindex,int target){
    int start=0;
    int end=nums.length-1;
    int ans=-1;
    while(start<=end){
        int mid=(start+end)/2;
        if(nums[mid]>target){
          end=mid-1;
        }
        else if(nums[mid]<target){
            start=mid+1;
        }
        else if(nums[mid]==target){
            ans=mid;
            if(findfirstindex){
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
    }
    return ans;
}
public static int [] firstLast(int []nums,int target){
    int arr[]={-1,-1};
    int first=binarysearch(nums,true,target);
    int last=binarysearch(nums,false,target);
    arr[0]=first;
    arr[1]=last;
    return arr;
}
public static void main(String[] args) {
    int arr[]={5,7,7,8,8,10};
    int target=6;
    int ans[]=firstLast(arr,target);
    System.out.println(Arrays.toString(ans));

    
}
}
