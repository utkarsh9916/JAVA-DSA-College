package mid_term;

import java.util.Arrays;

public class Q1 {
    public static int [] findminmax(int arr[]){
        // finding min element
        int ans[]={-1,-1};
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<min){
                min=arr[i];
            }
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
              max=arr[i];
            }
        }
            ans[0]=max;
            ans[1]=min;
            return ans;
    }
    public static void main(String[] args) {
        int nums[]={1,5,7,2,9,3};
        int ans[]=findminmax(nums);
        System.out.println(Arrays.toString(ans));
    }
}
