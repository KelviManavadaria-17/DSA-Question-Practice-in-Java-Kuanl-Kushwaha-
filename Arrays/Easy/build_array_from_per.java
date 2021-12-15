import java.util.Arrays;

public class build_array_from_per{
    public static void main(String[] args) {
        int[] a = {0,2,1,5,3,4};
        int[] ans = buildArray(a);
        System.out.println(Arrays.toString(ans));

    }
    public static int[] buildArray(int[] nums) {
        int [] new_num=new int[nums.length];
        for(int i=0;i<nums.length;i++)
        {
            new_num[i]=nums[nums[i]];
        }
        return new_num;
    }
    
}
