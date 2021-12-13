public class fibonnaci {
    public static void main(String[] args) {
        int n =8;
        series(n);

    }
    static void series(int n )
    {
        int a =0;
        int b = 1;
        System.out.println(a);
        for(int i =2;i<=n;i++)
        {
            System.out.println(b);

            int t = a+b;
            a=b;
            b=t;
        
        }
    }
    
}
