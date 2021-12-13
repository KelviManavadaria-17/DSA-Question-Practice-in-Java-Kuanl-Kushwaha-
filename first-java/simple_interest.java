import java.util.Scanner;

public class simple_interest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float p,r,t;
        System.out.println("enter p t r in sequence");
        p = sc.nextFloat();
        t = sc.nextFloat();
        r = sc.nextFloat();
        float si = p*r*t/100;
        System.out.println("simple innterest is " + si);

    }
    
}
