package mid_term;
public class Q4 {
    public static int reverse_num(int num){
        int sum=0;
        num=Math.abs(num);
        while(num>0){
            int digit=num%10;
            if(sum<(Integer.MIN_VALUE)/10 || sum>(Integer.MAX_VALUE)/10){
                return 0;
            }
            sum=sum*10 +digit;
            num=num/10;
        }
        return sum;

    }
    public static void main(String[] args) {
        int num=153423646;
        int ans=reverse_num(num);
        if(num>0){
            System.out.println(ans);
        }
        else{
            System.out.println(0-ans);
        }

    }
}
