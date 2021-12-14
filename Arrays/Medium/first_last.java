import java.util.Arrays;

public class first_last {
    public static void main(String[] args) {
        int[] a = {5,7,7,8,8,9};
        int[] ans = first(a, 8);
        System.out.println(Arrays.toString(ans));
    }
    static int[] first(int[] a ,int k)
    {
        int[] ans = {-1,-1};
        int i =0;
        int j= a.length-1;
        while(i<j)
        {
            if(a[i]<k)
            {
                i++;
            }
            if(a[j]>k)
            {
                j--;

            }
            if(a[i]>k && a[j]<k)
            {
                break;
            }
        }
        ans[0]=i;
        ans[1]=j;
        return ans;

    }
    
}
