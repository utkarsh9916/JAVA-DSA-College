package mid_term;

import java.util.*;

public class Q7 {
    // find second largest element of arrays

    // by using sorting can only be used if there is no duplicate elements
    public static int secondlargestsort(int nums[]){
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]<nums[j]){
                    int temp=nums[i];
                    nums[i]=nums[j];
                    nums[j]=temp;
                }
            }
        }
        return nums[1];
    }

    // by using min_values
    public static int secondlargest1(int nums[]){
        int largest=Integer.MIN_VALUE;
        int second_largest=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>largest){
                second_largest=largest;
                largest=nums[i];
            }
            else if(nums[i]>second_largest && nums[i]!=largest){
                second_largest=nums[i];
            }
        }
        return second_largest;
    }
    public static int secondlargest(int arr[]){
           int min=Integer.MIN_VALUE;
           int index=-1;
           for(int i=0;i<arr.length;i++){
            if(arr[i]>min){
                min=arr[i];
                index=i;
            }
           }
           arr[index]=Integer.MIN_VALUE;
           min=Integer.MIN_VALUE;
           
           for(int i=0;i<arr.length;i++){
            if(arr[i]>min){
                min=arr[i];

            }

           }

           return min;


    }
     public static void main(String[] args) {
        int arr[]={12,35,1,10,34,1};
        int ans=secondlargest(arr);
        System.out.println(ans);

        int arr1[]={12,35,1,10};
        int ans1=secondlargestsort(arr1);
        System.out.println(Arrays.toString(arr1));
        System.out.println(ans1);

        int arr2[]={12,35,1,10,34,1};
        int ans2=secondlargest1(arr2);
        System.out.println(ans2);


     }
}
