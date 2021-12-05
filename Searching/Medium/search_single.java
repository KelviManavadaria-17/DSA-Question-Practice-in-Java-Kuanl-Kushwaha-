


/**
 * search_single
 */
public class search_single {

    public static void main(String[] args) {
    
        int[] a = {3,3,7,7,8,8,10,11,11};
        System.out.println("using bitwise operator");
        System.out.println(singleNonDuplicate(a));
        System.out.println("using binary search");
        System.out.println(search(a, 0, a.length-1));
    }
    //using biwise operator

    public static int singleNonDuplicate(int[] nums) {
        int ans=nums[0];
        for(int i=1;i<nums.length;i++)
        {
            ans = ans^nums[i];
        }
        return ans;

        
    }

    public static int search(int[] a ,int start,int end)
    {
        if(a.length%2==0)
            return -1;
        
        
        while(start<=end)
        {
            int mid = start +(end -start)/2;
            if(a[mid] == a[mid-1])
            {
                
                int s = search(a,start,mid -2);
                if(s==-1)
                {
                    return search(a, mid+1, end);
                }
                else
                {
                    return s;
                }
            }
            else if(a[mid] == a[mid+1])
            {
                int s = search(a,start,mid -1);
                if(s==-1)
                {
                    return search(a, mid+2, end);
                }
                else
                {
                    return s;
                }
            }
            else{
                return a[mid];
            }
        }
        return -1;

    }
    
}