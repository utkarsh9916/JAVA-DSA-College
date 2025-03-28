package mid_term;


// check if array is sorted or not
public class Q6 {
    public static boolean checksort(int arr[]){
        int i =0;
        while(i+1<arr.length){
            if(arr[i+1]<arr[i]){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int arr[]={90,80,100,70,40,30};
          boolean b1=checksort(arr);
          System.out.println(b1);
    }
}
