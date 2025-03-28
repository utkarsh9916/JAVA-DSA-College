package mid_term;

import java.util.Arrays;

public class Q2 {
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
        int arr[]={1,2,3,4,5,6,7};
        int arr2[]={1,-100,3,99};
        int k2=2;
        int k=3;
        k=k%(arr.length);
        swap(arr,0,arr.length-1);
        swap(arr,0,k-1);
        swap(arr,k,arr.length-1);


        swap(arr2,0,arr2.length-1);
        swap(arr2,0,k2-1);
        swap(arr2,k2,arr2.length-1);
        System.out.println(Arrays.toString(arr));

        System.out.println(Arrays.toString(arr2));
    }
}
