//      * * * * *
//       * * * *
//        * * *
//         * *
//          *

public class pattern_11 {
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
    }
}
