// 14.  *********
//       *     *
//        *   *
//         * *
//          *

public class pattern_14 {
    public static void main(String[] args) {
        for(int i=1;i<=9;i++)
        {
            System.out.print("*");
        }
        System.out.println();
        for(int i=1;i<5;i++)
        {
            int spaces = i-1;
            for(int j =1;j<=spaces;j++)
            {
                System.out.print(" ");
            }
            int j = 2*(5-i) +1;
            for(;j>0;j--)
            {
                if(j==1 || j==2*i-1)
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
