import java.util.Arrays;

public class product_except_self {
    public static void main(String[] args) {
        int[] a = {1,2,3,4};
        int[] ans = answer(a);
        System.out.println(Arrays.toString(ans));
    }
    static int[] answer(int[] a)
    {
        long pro =1;
        for (int i : a) {
            pro *= i;
        }
        int[] ans = new int[a.length];
        for(int i=0;i<a.length;i++)
        {
            if(a[i]==0)
            {
                int p=1;
               for(int j=0;j<a.length;j++)
               {
                   if(j!=i)
                   {
                       p=p*a[j];
                   }
               }
                ans[i]=p;
                
            }
            else{
            ans[i] = (int)pro/a[i];

            }

        }
        return ans;
    }
}
