import java.util.ArrayList;
import java.util.List;

public class greatest_candies {

    public static void main(String[] args) {
        int[] a = {2,3,5,1,3};
        
        List<Boolean> l=kidsWithCandies(a,3);
        System.out.println(l);  
    }
    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max=candies[0];
        for(int i=1;i<candies.length;i++)
        {
            if(max<candies[i])
            {
                max=candies[i];
            }
        }
        List<Boolean> k = new ArrayList<Boolean>();
        for(int i=0;i<candies.length;i++)
        {
            if(extraCandies + candies[i] >= max)
            {
                k.add(true);
            }
            else
            {
                k.add(false);

            }
    
        }
        
        return k;
    }
    
}