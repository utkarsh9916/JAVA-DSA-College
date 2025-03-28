package mid_term;
//  count number of homogeneous string 
// /eetcdoe 1759
public class Q16 {
    public static int homogeneous(String str){
        //    String cha=str.charAt(0);
           int count=1;
           int sum=0;
           for(int i=1;i<str.length();i++){
            if(str.charAt(i)==str.charAt(i-1)){
                count++;
            }
            else{
              sum+=count*(count+1)/2;
              count=1;

            }
           }
           sum+=count*(count+1)/2;
           return sum;
    }
    public static void main(String[] args) {
        String str="abbcccaa";
        int ans=homogeneous(str);
        System.out.println(ans);
    }
}
