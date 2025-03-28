package mid_term;
public class Q25 {
    // reverse vowels of a string
    // leetcode Q345
    public static boolean isVowel(char ch){
        ch=Character.toLowerCase(ch);
        if(ch=='a'|| ch=='e'|| ch=='i' || ch=='o'|| ch=='u'){
            return true;
        }
        return false;

    }
    public static void swap(StringBuilder str, int i,int j){
        
        char temp=str.charAt(i);
        str.setCharAt(i,str.charAt(j));
        str.setCharAt(j,temp);

    }
    public static void main(String[] args) {
        String s="IceCreAm";
        StringBuilder str=new StringBuilder(s);
        int i=0;
        int j=str.length()-1;
        while(i<=j){
            if(isVowel(str.charAt(i)) && isVowel(str.charAt(j))){
                     swap(str,i,j);
                     i++;
                     j--;
            }
            else if(isVowel(str.charAt(i)) && !isVowel(str.charAt(j))){
                j--;
            }
            else{
                i++;
            }
        }
        System.out.println(str.toString());
    }
}
