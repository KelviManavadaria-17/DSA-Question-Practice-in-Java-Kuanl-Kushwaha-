import java.util.Arrays;

import javax.swing.event.SwingPropertyChangeSupport;

public class concate {
    public static void main(String[] args) {
        int[] a = {1,2,1};
        int[] b = getConcatenation(a);
        System.out.println(Arrays.toString(b));

            
    }
    public static int[] getConcatenation(int[] nums) {
        int n=nums.length;
        int []ans= new int[2*n];
        for(int i=0;i<n;i++)
        {
            ans[i]=nums[i];
            ans[i+n]=nums[i];
        }
        return ans;
    }

    
}
