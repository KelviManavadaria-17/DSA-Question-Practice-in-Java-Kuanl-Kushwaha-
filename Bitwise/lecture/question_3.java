// find ith bit
public class question_3 {
    public static void main(String[] args) {
        int b =162;
        System.out.println(Integer.toBinaryString(b));
        int n=6;
        int mask=1<<(n-1);
        System.out.println(b&mask);
        
    }
    
}
