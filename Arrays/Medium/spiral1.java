import java.util.ArrayList;
import java.util.List;

public class spiral1 {
    public static void main(String[] args) {
        int[][] a ={{1,2,3},{4,5,6},{7,8,9}};
        List<Integer> ans= printspiral(a);
        System.out.println(ans);
    }
    static List<Integer> printspiral(int[][] a)
    {
        List<Integer> ans = new ArrayList<>();
        if(a== null || a.length==0)
        {
            return ans;
        }
        int m= a.length;
        int n = a[0].length;
        int top=0;
        int bottom=m-1;
        int left=0;
        int right = n-1;
        while(top<=bottom && left<=right )
        {
            for(int i = left;i<=right;i++)
            {
                ans.add(a[top][i]);
            }
            top++;
            for(int i = top;i<=bottom;i++)
            {
                ans.add(a[i][right]);
            }
            right--;
            if(top<=bottom)
            {
                    for(int i=right;i>=left;i--)
                    {
                        ans.add(a[bottom][i]);
                    }
            }
            bottom--;
            if(left<=right)
            {
                for(int i=bottom;i>=top;i--)
                {
                    ans.add(a[i][left]);
                }
            }
            left++;

        }
        return ans;

    }    
}
