public class single {
    public static void main(String[] args) {
        int[] a = {7,7,6,54,54,5,5};
        int ans =0;
        for(int i=0;i<a.length;i++)
        {
            ans^=a[i];
        }
        System.out.println(ans);
    }
    
}
