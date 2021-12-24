//find the right most set bit
public class question_6 {
    public static void main(String[] args) {
        int b = 128;
        System.out.println(Integer.toBinaryString(b));
        System.out.println(b&(-b));
    }

}
