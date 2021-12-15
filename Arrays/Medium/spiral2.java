public class spiral2 {
    public static void main(String[] args) {
        int[][] ans = printspiral(3);
        for (int[] a : ans) {
            for (int i : a) {
                System.out.print(i);
                
            }
            System.out.println();
            
        }   
    }
    static int[][] printspiral(int n)
    {
        if(n==0)
        {
            return new int[0][0];
        }
        int[][] ans = new int[n][n];
        
        
        int top=0;
        int bottom=n-1;
        int left=0;
        int right = n-1;
        int c=1;
        while(top<=bottom && left<=right )
        {
            for(int i = left;i<=right;i++)
            {
                ans[top][i] = c;
                c++;
            }
            top++;
            for(int i = top;i<=bottom;i++)
            {
                ans[i][right]=c;
                c++;

            }
            right--;
            if(top<=bottom)
            {
                    for(int i=right;i>=left;i--)
                    {
                        ans[bottom][i]=c;
                        c++;

                    }
            }
            bottom--;
            if(left<=right)
            {
                for(int i=bottom;i>=top;i--)
                {
                    ans[i][left]=c;
                    c++;

                }
            }
            left++;

        }
        return ans;

    }   
}
