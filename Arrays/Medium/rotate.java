public class rotate {
    public static void main(String[] args) {
        
        int[] a = {1,2,3,4,5,6,7};
        rotated(a, 3);
        for (int i : a) {
            System.out.println(i);
            
        }
    }
    static void rotated(int[] a,int k)
    {
        int[] b = new int[k];
        int j=0;
        for(int i = a.length-k;i<a.length;i++)
        {
            b[j]=a[i];
            j++;
        }
        j=0;
        for(int i=a.length-k-1;i>=0;i--)
        {
            a[a.length-1-j]= a[i];
            j++;
        }
        for(int i=0;i<k;i++)
        {
            a[i]=b[i];
        }
    }
}

