import java.sql.SQLOutput;
import java.util.*;
public class subsequqnce {
    public static void subsequence(String str){
        ArrayList <String> list = new ArrayList<>();

        for(int i=0;i<str.length();i++){
            for(int j=i;j<str.length();j++){
                String ans=str.substring(i,j+1);
                System.out.println(ans);
                list.add(ans);
            }
        }
        System.out.println(list);
    }

    public static void main(String[] args) {
        String str="abcd";
        subsequence(str);
    }
}
