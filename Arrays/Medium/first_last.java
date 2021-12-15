import java.util.Arrays;



public class first_last {
    public static void main(String[] args) {
        int[] a = {5,7,7,8,8,9};
        int[] ans ={-1,-1};
        ans[0]= first(a,8);
      
        if(ans[0]!=-1)
        {
            ans[1]= last(a, 8);
        }
        

        System.out.println(Arrays.toString(ans));
    }
    static int first(int[] a ,int k)
    {
        int start = 0;
        int last = a.length-1;
        int ans=-1;
        while(start<=last)
        {
            int mid = start +(last-start)/2;
            if(a[mid]<k)
            {
                start= mid+1;
            }
            if(a[mid]>k)
            {
                last = mid-1;
            }
            if(a[mid]==k){
                ans = mid;
                last = mid-1;
            }

        }
        return ans;

    }
    static int last(int[] a ,int k)
    {
        int start = 0;
        int last = a.length-1;
        int ans=-1;
        while(start<=last)
        {
            int mid = start +(last-start)/2;
            if(a[mid]<k)
            {
                start= mid+1;
            }
            else if(a[mid]>k)
            {
                last = mid-1;
            }
            else{
                ans = mid;
                start = mid+1;
            }

        }
        return ans;

    }
    
}
