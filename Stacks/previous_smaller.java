import java.util.Stack;

public class previous_smaller {
    public static void main(String[] args) {
        int[] a = {4,10,5,18,3,12,7};
        int[] ans = answer(a);
        for (int i : ans) {
            System.out.println(i);
        }
    }
    static int[] answer(int[] a)
    {
        Stack<Integer> s= new Stack<>();
        int[] ans = new int[a.length];
      
        for(int i=1;i<a.length;i++)
        {
            int x = s.peek();
            while(a[i]>=x)
            {
                
            }
            if(a[i]<x){
                ans[i] = -1;
                s.pop();
                s.add(a[i]);
            }
           
        }
        return ans;
    }
    
}
