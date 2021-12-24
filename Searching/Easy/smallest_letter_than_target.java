
public class smallest_letter_than_target {
    public static void main(String[] args) {
        char[] a= {'c','f','j','m'};
        char k = 'z';
        System.out.println(answer(a, k));

    }
    static char answer(char[] a,char k)
    {
        int s=0;
        int e = a.length-1;
        if(k>=a[e])
        {
            return a[0];
        }
        while(s<=e)
        {
            int mid = s+(e-s)/2;
            if(a[mid]==k)
            {
                if(mid+1>a.length-1)
                {
                    return a[0];
                }
                else
                {
                    return a[mid+1];
                }
            }
            else if(a[mid]>k)
            {
                e= mid-1;
            }
            else {
                s=mid+1;
            }

        }
        return a[e+1];
    }
    
}
