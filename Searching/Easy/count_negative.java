public class count_negative {
    public static void main(String[] args) {
        int[][] b ={{4,3,2,-1},{3,2,1,-1},{1,1,-1,-2},{-1,-1,-2,-3}};
        int sum = 0;
        for (int[] a : b) {
            sum += countNegatives(a);
            
        } 
        System.out.println(sum);
    }
    public static int countNegatives(int[] a)   
    {
        int s = 0;
        int e = a.length-1;
        if(a[e]>=0)
        {
            return 0;

        }
        if(a[s]<0)
        {
            return a.length;
        }
        while(s<=e)
        {
            int mid = s+(e-s)/2;
            if(a[mid]>0)
            {
                s = mid+1;

            }
            else
            {
                if(mid-1>=0 && a[mid-1]>0)
                {
                    return a.length - mid;
                }
                else if(mid-1>=0 && a[mid-1]<0){
                     e = mid -1;
                }
            }
        }
        return -1;
        
    }
    
}
