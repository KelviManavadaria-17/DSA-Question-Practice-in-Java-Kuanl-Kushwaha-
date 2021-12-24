// non duplicate element

public class question_2 {
    public static void main(String[] args) {
        int[] a = {2,7,6,5,6,7,2,5,8};
        int ans=0 ;
        for (int i : a) {
            ans = ans^i;
        }
        System.out.println(ans);
    }
    
}
