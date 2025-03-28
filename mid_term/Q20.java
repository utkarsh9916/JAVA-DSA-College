package mid_term;

import java.util.Arrays;

public class Q20 {
    // moving zeros leetcode 283
    public static void swap(int nums[],int i,int j){
        while(i<=j){
            int temp=nums[i];
            nums[i]=nums[j];
            nums[j]=temp;
            i++;
            j--;
        }
    }
    public static void main(String[] args) {
        int arr[]={0,1,0,3,12};
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==0 && arr[j]!=0){
                   swap(arr,i,j);
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }


}
