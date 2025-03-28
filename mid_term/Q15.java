package mid_term;
// leetcode 14
// longest common prefix
public class Q15 {
    public static String commonPrefix(String []arr){
        int len=0;
        while(true){
            if(arr[0].length()>len){
            char ch=arr[0].charAt(len);
            boolean b1=true;
              for(int i=1;i<arr.length;i++){
                if(arr[i].length()>len && arr[i].charAt(len)==ch){
                      b1=true;
                }
                else{
                    b1=false;
                    break;
                }
              }
              if(b1){
                len++;
              }
              else{
                break;
              }

            }
            else{
                break;
            }  
        }

         return arr[0].substring(0,len);
    }
    public static void main(String[] args) {
        String arr[]={"flower","flow","flight"};
          String ans=commonPrefix(arr);
          System.out.println(ans);
    }
}
