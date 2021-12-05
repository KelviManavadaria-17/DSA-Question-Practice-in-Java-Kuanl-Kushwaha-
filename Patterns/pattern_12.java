// 12.  * * * * *
//       * * * *
//        * * *
//         * *
//          *
//          *
//         * *
//        * * *
//       * * * *
//      * * * * *
public class pattern_12 {
    public static void main(String[] args) {
        for(int i=1;i<=5;i++)
        {
            int spaces=i-1;
            for(int j =1;j<=spaces;j++)
            {
                System.out.print(" ");
            }
            int j = 2*(5-i) +1;
            for(;j>0;j--)
            {
                if(j%2==0)
                {
                    System.out.print(" ");
                }
                else
                {
                    System.out.print("*");

                }

            }
            System.out.println();
        }
        int row =5;
        for(int i=1;i<=row;i++)
        {
            int spaces= row -i;
            for(int j=1;j<=spaces;j++)
            {
                System.out.print(" ");
            }
            for(int j=1;j<=2*i-1;j++)
            {
                if(j%2==0)
                {
                    System.out.print(" ");
                }
                else
                {
                    System.out.print("*");
                    
                }
            }
            System.out.println();

        }
    }
}
