import java.util.Arrays;

public class running_sum {
    public static void main(String[] args) {
        int[] a = {1,1,1,1,1};
        int[] b= runningSum(a);
        System.out.println(Arrays.toString(b));
    }
    public static int[] runningSum(int[] nums) {
        int sum=0;
        int []ans=new int[nums.length];
           for(int i=0;i<nums.length;i++)
           {
               sum=sum+nums[i];
               ans[i]=sum;
           }
           return ans;
       }

    
}
