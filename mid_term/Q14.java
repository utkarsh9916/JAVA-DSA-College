package mid_term;
// valid anagram

import java.util.Arrays;


// leetcode Q 242
public class Q14 {
    public static boolean Validanagram(String s, String t){
        if(s.length()!=t.length()){
               return true;
        }
        else{
            String str1[]=s.split("");
            String str2[]=t.split("");
            Arrays.sort(str1);
            Arrays.sort(str2);
            if(Arrays.equals(str1,str2)){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        boolean b1=Validanagram("anagram","nagaram");
        System.out.println(b1);
        
        
    }
}
