import java.util.Arrays;
import java.util.ArrayList;
public class target_array_in_order {
    public static void main(String[] args) {
        int[] nums={0,1,2,3,4};
        int[] index={0,1,2,2,1};
        int[] ans =createTargetArray(nums, index);
        System.out.println(Arrays.toString(ans));
    }

    public static int[] createTargetArray(int[] nums, int[] index) {
        ArrayList < Integer > list = new ArrayList<>(20);
        int[] arr = new int[nums.length];
        for(int i = 0; i < nums.length; i++)
        {
        list.add(index[i], nums[i]);
        }
        
            for(int j = 0; j < nums.length; j++)
            {
               arr[j] = list.get(j); 
            }
            return arr;
        }
}
