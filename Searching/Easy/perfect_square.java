public class perfect_square {
    public static void main(String[] args) {
        System.out.println(check(16));
        System.out.println(check(15));
    }
    static boolean check(int n)
    {
        int s=1;
        int e=n;
        while(s<e)
        {
            int mid = s+(e-s)/2;
            if(mid*mid==n)
                return true;
            else if(mid*mid<n)
            {
                s=mid+1;
            }
            else {
                e = mid-1;

            }


        }
        return false;
    }
}
