
public class search_in_rotated_1 {
    public static void main(String[] args) {
        int[] a = {4,5,6,7,0,1,2};
        System.out.println(solution(a, 0));
    }
    public static int  search(int[] a,int k,int start,int end)
    {
        
        int mid = start +((end-start)/2);
        
        while (start<=end) {
            if(a[mid]>k)
            {
                end = mid -1;
            }
             if(a[mid]<k)
            {
                start= mid+1;
            }
            if(a[mid]==k)
            {
                return mid;

            }
            mid = start +((end-start)/2);
            
        }
        return -1;
        
    }
    public static int solution(int[]a , int k)
    {
        int peak = find_peak(a);
        
        if(a[peak] == k)
        {
            return peak;
        }
        if(a[0]<k)
        {
           
            return search(a, k, 0, peak);
        }
        else if(a[0]>k)
        {
            
            return search(a, k, peak+1, a.length-1);
        }
        else if(a[0]==k)
        {
            return 0;
        }
        else {
            return -1;
        }
        
    }
    public static int find_peak(int[] arr)
    {
        int start =0;
        int end = arr.length -1;
        int l = arr.length;
        while(start<=end)
        {
        int mid = start + (end - start)/2;
            if(start+1 == end)
            {
                if(arr[start]<arr[end])
                    return end;
                else
                    return start;
                    
            }
            if(mid<l && mid+1 <l && mid-1>=0 && arr[mid]>arr[mid-1] && arr[mid]>arr[mid+1])
            {
                return mid;
            }
            if(mid<l && mid+1 <l&& mid-1>=0 && arr[mid]>arr[mid-1] && arr[mid]<arr[mid+1])
            {
                start = mid+1;
            }
            if(mid<l && mid+1 <l&& mid-1>=0 && arr[mid]<arr[mid-1] && arr[mid]>arr[mid+1])
            {
                end = mid-1;
            }
        }
        return -1;
        
    
    }
}
