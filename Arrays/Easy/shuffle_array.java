import java.util.Arrays;

public class shuffle_array {
    public static void main(String[] args) {
        int[] a ={2,5,1,3,4,7};
        int n=3;
        int[] b= shuffle(a, n);
        System.out.println(Arrays.toString(b));
    }
    public static int[] shuffle(int[] nums, int n) {
        int []ans= new int [2*n]; 
            int c=0;
         for(int i=0;i<2*n;i=i+2)
         {
             ans[i] = nums[c];
             ans[i+1]=nums[n+c];
             c++;         
         }
            return ans;
            
            
        }
    
}
