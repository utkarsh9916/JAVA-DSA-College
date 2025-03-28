package mid_term;

public class Q8 {
    // binary search
    public static int binary_search(int nums[],int target){
        int start=0;
        int end=nums.length-1;
        while(start<=end){
            int mid=(start+end)/2;
            if(nums[mid]==target){
                return mid;
            }
            else if(nums[mid]>target){
                end=mid-1;
            }
            else if(nums[mid]<target){
                start=mid+1;
            }
        }
        return -1;


    } 
    public static void main(String[] args) {
        int arr[]={-1,0,3,5,9,12};
        int ans=binary_search(arr,2);
        System.out.println(ans);
        
    }
}
