package mid_term;
// remove duplicated from sorted array
// leetcode 26/

public class Q22 {
    public static void main(String[] args) {
        int arr[]={0,0,1,1,1,2,2,3,3,4};
        int index=0;
        for(int i=1;i<arr.length-1;i++){
            if(arr[i]!=arr[i-1]){
                arr[index]=arr[i];
                index++;
            }
        }
        arr[index]=arr[arr.length-1];
        System.out.println(index+1);
    }
}
