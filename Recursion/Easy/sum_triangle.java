import java.util.Arrays;

public class sum_triangle {
    public static void main(String[] args) {
        int[] a ={1,2,3,4,5};
        recusrive(a);
    }
    static void recusrive(int[] a)
    {
        if(a.length == 1 )
        {
            System.out.println(Arrays.toString(a));
            return;
        }
        else
        {
            int[] b = new int[a.length-1];
            for(int i=0;i<a.length-1;i++)
            {
                b[i] = a[i] + a[i+1];
            }
            recusrive(b);
            System.out.println(Arrays.toString(a));
        }
            
    }
}
