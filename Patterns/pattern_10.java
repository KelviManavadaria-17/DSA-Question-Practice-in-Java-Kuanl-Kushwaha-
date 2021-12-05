// 10.      *
//         * *
//        * * *
//       * * * *
//      * * * * *



public class pattern_10 {
    public static void main(String[] args) {
        int row = 5;
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
