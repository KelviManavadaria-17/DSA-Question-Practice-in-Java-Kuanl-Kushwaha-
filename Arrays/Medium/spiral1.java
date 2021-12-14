public class spiral1 {
    public static void main(String[] args) {
        int[][] a ={{1,2,3},{4,5,6},{7,8,9}};
        printspiral(a);
    }
    static void printspiral(int[][] a)
    {
        int n = a.length;
        for(int i=0;i<=n/2;i++)
        {
            for(int j=i;j<n-i;j++)
            {
                System.out.println(a[i][j]);
            }
            for(int j = i;j<n-i;j++)
            {
                System.out.println(a[j][n-i-1]);
            }
            for(int j= n-i-1;j>i;j--)
            {
                System.out.println(a[n-i-1][j]);
            }
            for(int j = n-i-1;j>i;j--)
            {
                System.out.println(a[j][n-i-1]);
            }
        }
    }    
}
