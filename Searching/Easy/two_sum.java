import java.util.Arrays;

public class two_sum {
    public static void main(String[] args) {
        int[] a = {2,7,11,15};
        int k =9;
        System.out.println(Arrays.toString(two(a, k)));        
    }
    public static int[] two(int[] a,int k)
    {
        int i = 0;
        int j=a.length-1;
        int[] ans = {-1,-1};
        while(i<=j)
        {
            if(a[i]+a[j]==k)
            {
                ans[0]=i;
                ans[1]=j;
                break;
            }
            else if(a[i]+a[j]>k)
            {
                j--;
            }
            else {
                i++;
            }
        }
        return ans; 
    }
}
