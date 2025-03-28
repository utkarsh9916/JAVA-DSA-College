package mid_term;
// leetcode 118 - pascals triangle

import java.util.Arrays;

public class Q18 {
    public static void main(String[] args) {
        int arr1[][]=new int [5][];
        int index=0;
        for(int i=0;i<arr1.length;i++){
            int arr2[]=new int [i+1];
            System.out.println();
            for(int j=0;j<=i;j++){
              
                if(j==0 || j==i){
                    arr2[j]=1;
                    System.out.print(arr2[j]);
                    System.out.print("");
                }
                else{
                    // System.out.println();
                    arr2[j]=arr1[i-1][j-1]+arr1[i-1][j];
                    System.out.print(arr2[j]);
                }
               
            }
            arr1[index]=arr2;
            index++;
        }
        System.out.println();
        System.out.println(Arrays.deepToString(arr1));

        // now printing of numbers;
           
    }
}
