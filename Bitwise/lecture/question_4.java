//set ith bit

public class question_4 {
    public static void main(String[] args) {
        int b =162;
        System.out.println(Integer.toBinaryString(b));
        int n=5;
        int mask=1<<(n-1);
        b = b|mask;
        System.out.println(Integer.toBinaryString(b));

    }
}
