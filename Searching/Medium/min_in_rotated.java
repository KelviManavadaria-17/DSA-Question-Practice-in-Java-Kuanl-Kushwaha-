
public class min_in_rotated {
    public static void main(String[] args) {
        int[] a= {0,1,2,3,4,5};
        int[] b = {5,4,3,2,1,0};
        int[] c = {4,5,0,1,2,3};
        System.out.println(solution(a));
        System.out.println(solution(b));
        System.out.println(solution(c));
        
    }
    public static int solution(int[] a)
    {
        if(sort_in_ascending(a))
        {
           System.out.println("k");
            return a[0];
        }
        else if(sort_in_descending(a))
        {
            System.out.println("e");
            return a[a.length-1];
        }
            System.out.println("l");
            int peak = find_peak(a);
            System.out.println(peak);
            if(peak == a.length-1)
            {
                return a[0];

            }
            else
            {
                return a[peak+1];
            }
        
    }
    public static int find_peak(int[] arr)
    {
        
        int start =0;
        int end = arr.length-1;
        int l = arr.length-1;
        while(start<=end)
        {
            int mid = start + (end-start)/2;
            if(mid-1>=0 && mid+1<= l && arr[mid-1] < arr[mid] && arr[mid] >arr[mid+1] )
            {
                return mid;
            }
            if(mid-1>=0 && mid+1<= l && arr[mid-1] < arr[mid] && arr[mid] <arr[mid+1] )
            {
                end=mid-1;

            }
            if(mid-1>=0 && mid+1<= l && arr[mid-1] > arr[mid] && arr[mid] >arr[mid+1] )
            {
                start=mid+1;

            }
        }
        return -1;
    }
    public static boolean sort_in_ascending(int[] a)
    {
        for(int i =0;i<a.length-1;i++)
        {
            if(a[i]<=a[i+1])
            {
                continue;
            }
            else
            {
                return false;
            }
        }
        return true;

    }
    public static boolean sort_in_descending(int[] a)
    {
        for(int i =0;i<a.length-1;i++)
        {
            if(a[i]>=a[i+1])
            {
                    continue;

            }
            else
            {
                return false;
            }
        }
        return true;

    }
    
}
