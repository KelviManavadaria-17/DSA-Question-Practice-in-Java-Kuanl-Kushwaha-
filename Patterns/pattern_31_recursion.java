public class pattern_31_recursion {
    public static void main(String[] args) {
        recursion(4);
    }
    static void recursion(int l)
    {
        int n = 2*l-1;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(i==0 || i==n-1 || j==0 ||j==n-1)
                {
                    System.out.print(l);
                }
                else
                {
                    recursion(l-1);
                }
            }
            System.out.println();
        }
    }
    
}
