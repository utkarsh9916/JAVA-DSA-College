package mid_term;
public class Q19 {
    // Best time to buy and sell stocks Leetcdoe 121
    public static void main(String[] args) {
        int arr[]={7,1,5,3,6,4};
        int maxprofit=0;
        int buy=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]<buy){
                buy=arr[i];
            }
            else{
                int profit=arr[i]-buy;
                maxprofit=Math.max(maxprofit,profit);
            }
        }
             System.out.println(maxprofit);
    }
}
