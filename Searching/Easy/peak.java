public class peak {
    public static void main(String[] args) {
        int[] a = {5,6,7,8,1,2,3,4};
        System.out.println(answer(a));
    }
    static int answer(int[]arr)
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
