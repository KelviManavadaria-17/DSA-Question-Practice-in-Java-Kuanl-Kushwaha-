import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class intersection_2 {
    public static void main(String[] args) {
        int[] a = {1,2,2,1};
        int[] b = {1,2};
        List<Integer> ans = answer(a, b);
        System.out.println(ans);
    }
    static List<Integer> answer(int[]a,int[]b)
    {
        Arrays.sort(a);
        Arrays.sort(b);
        List<Integer> ans = new ArrayList<Integer>();
        int i=0,j=0;
        int m = a.length,n=b.length;
        while(i<m && j<n)
        {
            if(a[i]==b[j])
            {
                ans.add(a[i]);
                i++;
                j++;
            }
            else if(a[i]<b[j])
            {
                i++;
            }
            else {
                j++;
            }
        }
        return ans ;
        
    }
    
}
