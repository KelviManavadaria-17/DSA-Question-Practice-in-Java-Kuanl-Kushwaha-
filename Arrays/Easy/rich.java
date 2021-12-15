public class rich {
    public static void main(String[] args) {
        int[][] a = {{1,2},{3,1}};
        System.out.println(maximumWealth(a));
    }
    public static int maximumWealth(int[][] accounts) {
        int max=accounts[0][0];
        for(int [] a : accounts)
        {
            int sum=0;
            for(int i : a)
            {
                sum = sum + i;
            }
            if(max<sum)
            {
                max=sum;
            }
        }
        return max;
    }
    
}
