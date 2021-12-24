public class insert_position {
    public static void main(String[] args) {
        int[] a ={1,3,5,6};
        int k = 2;
        System.out.println(answer(a, k));
    }
    static int answer(int[] a,int k)
    {
        int s=0;
        int e=a.length-1;
        if(a[e]<k)
        {
            
            return e+1;
        }
        while(s<=e)
        {
            int mid = s+(e-s)/2;
            if(a[mid]==k)
            {
                return mid;
            }
            else if(a[mid]>k)
            {
                e=mid-1;
            }
            else {
                s= mid+1;
            }

        }
        return s+1;
    }
    
}
