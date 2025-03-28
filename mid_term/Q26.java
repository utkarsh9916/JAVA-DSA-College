package mid_term;

public class Q26 {
    // leetcode 387 first unique character
    public static void main(String[] args) {
        String str= "loveleetcode";
        int arr[]=new int[26];
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            int ascii=(int)(ch-'a');
            arr[ascii]++;
        }
        int index=-1;
        for(int i=0;i<str.length();i++){
            if(arr[str.charAt(i)-'a']==1){
                index=i;
                System.out.println(i);
                break;
            }
        }
        if(index==-1){
            System.out.println(-1);
        }
      
    }
}
