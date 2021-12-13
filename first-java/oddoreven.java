import java.util.Scanner;

public class oddoreven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a;
        System.out.println("enter a number");
        a = sc.nextInt();
        if(a%2==0)
        {
            System.out.println("given number is even");
        }
        else
        {
            System.out.println("given number is odd");

        }
    }
    
}
