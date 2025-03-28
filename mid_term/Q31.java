package mid_term;
public class Q31 {
    // Q:-31 ESAY Armstrong Numbers
// You are given a 3-digit number n, Find whether it is an Armstrong number or not.

// An Armstrong number of three digits is a number such that the sum of the cubes of its digits is equal to the number itself. 371 is an Armstrong number since 33 + 73 + 13 = 371. 

// Examples
// Input: n = 153
// Output: true
// Explanation: 153 is an Armstrong number since 13 + 53 + 33 = 153. 
public static void main(String[] args) {
    int num=372;
    String str=Integer.toString(num);
    int sum=0;
    for(int i=0;i<str.length();i++){
        int digit=Character.getNumericValue(str.charAt(i));
        double po=Math.pow(digit,3);
        // System.out.println(po);
                  sum+=po;

    }
    // System.out.println(sum);
    if(sum==num){
        System.out.println("yes its is armstrong");
    }
    else{
        System.out.println("No its is armstrong");
    }
    // System.out.println(Math.pow(2,3));
}

}
