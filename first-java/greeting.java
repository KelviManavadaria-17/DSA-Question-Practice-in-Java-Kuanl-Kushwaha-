import java.util.Scanner;

public class greeting {
    public static void main(String[] args) {
        String name;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your name");
        name = sc.next();
        System.out.println("good morning "+ name);
    }
    
}
