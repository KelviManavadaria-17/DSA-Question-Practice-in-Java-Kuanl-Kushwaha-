//          4 4 4 4 4 4 4  
//          4 3 3 3 3 3 4   
//          4 3 2 2 2 3 4   
//          4 3 2 1 2 3 4   
//          4 3 2 2 2 3 4   
//          4 3 3 3 3 3 4   
//          4 4 4 4 4 4 4  

public class pattern_31 {
    public static void main(String[] args) {
        print_pattern(8);
    }
    static void print_pattern(int n)
    {
        int rows=2*n-1;
        int columns=2*n-1;
        for(int i=0;i<rows;i++)
        {
            int k ;
            int l ;
            int m,p;
            int s;
            if(i<n)
            {
                k=i;
                l=i+1;
                m= columns-i-1;
                p=n-i;
                s=rows-1-i;
            }
            else
            {
                k=rows-i;
                l=rows-i;
                m= i-1;
                p=n-(rows-1-i);
                s=i;
            }
            for(int j=0;j<k;j++)
            {
                System.out.print(n-j + " ");
            }
            for(int j=l;j<=m;j++)
            {
                System.out.print(p + " ");
            }
            for(int j=s;j<columns;j++)
            {
                System.out.print(n-(rows-1-j) + " ");
            }
            System.out.println();
            
        }

    }
}
