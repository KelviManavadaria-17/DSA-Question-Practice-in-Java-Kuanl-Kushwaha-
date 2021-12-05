// 13.      *
//         * *
//        *   *
//       *     *
//      *********

public class pattern_13 {
    public static void main(String[] args) {
        for(int i=1;i<5;i++)
        {
            int spaces = 5-i;
            for(int j =1;j<=spaces;j++)
            {
                System.out.print(" ");
            }
            for(int j =1;j<=2*i-1;j++)
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
        for(int i=1;i<=9;i++)
        {
            System.out.print("*");
        }
    }
    
}
