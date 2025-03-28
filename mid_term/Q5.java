package mid_term;
import java.util.*;

//  majority element leetcode Q5
public class Q5 {
    public static void main(String[] args) {
        int arr[]={2,2,1,1,1,2,2};
        int len=arr.length/2;
        Arrays.sort(arr);
        int count=1;
        int ans=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]==arr[i-1]){
                count++;
            }
            else{
                count=1;
                ans=arr[i];
            }
            if(count>len){
                System.out.println(arr[i]);
                break;
            }
        }

    }
    
}
