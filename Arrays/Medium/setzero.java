import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class setzero {
    public static void main(String[] args) {
        int[][] a = {{1,1,1},{1,0,1},{1,1,1}};
        setvalue(a);
        System.out.println(Arrays.toString(a));
        for (int[] b : a) {
            for (int i : b) {
                System.out.print(i);
            }
            System.out.println();
        }
        
    }
    static void setvalue(int[][] a)
    {
        
        List<Integer> rows = new ArrayList<Integer>();
        List<Integer> columns = new ArrayList<Integer>();
        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<a[0].length;j++)
            {
                if(a[i][j]==0)
                {
                    rows.add(i);
                    columns.add(j);
                }
            }
        }
        for(int i=0;i<rows.size();i++)
        {
            for(int j =0;j<a[0].length;j++)
            {
                a[rows.get(i)][j]=0;
            }
        }

        for(int i=0;i<columns.size();i++)
        {
            for(int j =0;j<a.length;j++)
            {
                a[j][columns.get(i)]=0;
            }
        }
        




    }
    
}
