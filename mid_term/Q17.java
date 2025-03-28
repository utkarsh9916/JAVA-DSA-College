package mid_term;
//  climbing stairs;
// leetcode 70
public class Q17 {
    public static int climbing(int n){
        int arr[]=new int [n+2];
        arr[1]=1;
        arr[2]=1;
        arr[3]=arr[1]+arr[2];
        for(int i=4;i<arr.length;i++){
            arr[i]=arr[i-2]+arr[i-1];
        }
        return arr[n+1];
    }
    public static void main(String[] args) {
        int ans=climbing(5);
        System.out.println(ans);
    }
}
