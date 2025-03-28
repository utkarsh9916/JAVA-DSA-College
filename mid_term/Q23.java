package mid_term;
public class Q23 {
    // container with most water Q23
    public static void main(String[] args) {
        int height []={1,8,6,2,5,4,8,3,7};
        int i=0;
        int j=height.length-1;
        int max=0;
        while(i<j){
            int width=Math.abs(j-i);
            int len=Math.min(height[i],height[j]);
            int current=width*len;
            max=Math.max(max,current);
            if(height[i]<height[j]){
                i++;
            }
            else{
                j--;
            }
        }
            System.out.println(max);
    }
}
