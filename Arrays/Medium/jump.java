import java.util.Arrays;

public class jump {
    public static void main(String[] args) {
        int[] a = {1,1,1,0,4};
        System.out.println(answer(a));
    }
    static boolean answer(int[] a)
    {
       
        int reachable =0;
        for(int i=0;i<a.length;i++)
        {
            System.out.println(reachable);
            if(reachable<i)
                return false;
            reachable = max(reachable,i+a[i]);
        }
        return true;
    }
     static int max(int j, int i) {
        if(i>j) 
            return i;
        else
            return j;
    } 
    
}
