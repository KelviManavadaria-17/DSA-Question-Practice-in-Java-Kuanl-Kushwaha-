// 8.      *
//        ***
//       *****
//      *******
//     *********

public class pattern_8 {
    public static void main(String[] args) {
        for(int i=0;i<=5;i++)
        {
            for(int j=0;j<5;j++)
            {
                if(i+j>=5)
                {
                System.out.print("*");

                }
                else
                {
                    System.out.print(" ");
                }

            }
          
            for(int j = 0;j<i-1;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        
        }
    }
}
