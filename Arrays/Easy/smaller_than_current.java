import java.util.Arrays;

public class smaller_than_current {
    public static void main(String[] args) {
        int[] a={8,1,2,2,3};
        int[] b=smallerNumbersThanCurrent(a);
        System.out.println(Arrays.toString(b));
    }
    public static int[] smallerNumbersThanCurrent(int[] nums) {
        int c=0;
        int []ans=new int[nums.length];
        for(int i=0;i<nums.length;i++)
        {
            c=0;
            for(int j=0;j<nums.length;j++)
            {
                if(nums[i]>nums[j] && i!=j)
                {
                    c++;
                }
            }
            ans[i]=c;
        }
        return ans;
    }
    
}
