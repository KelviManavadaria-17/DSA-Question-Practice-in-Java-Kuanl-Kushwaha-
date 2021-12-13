import java.util.Scanner;

public class operations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,b;
        char c;
        System.out.println("enter numbers and operations");
        a=sc.nextInt();
        b=sc.nextInt();
        
        c = sc.nextLine().charAt(0);
        if(c=='+')
        {
            System.out.println("sum is " + (a+b));
        }
        if(c=='-')
        {
            System.out.println("sub is " + (a-b));

        }
        if(c=='*')
        {
            System.out.println("multiply is " + (a*b));

        }
        if(c=='/')
        {
            System.out.println("div is " + (a/b));

        }

    }
    
}
