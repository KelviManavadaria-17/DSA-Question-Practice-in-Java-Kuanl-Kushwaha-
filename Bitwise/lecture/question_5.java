/**
 * q
 * uestion_5
 * reset the bit change to 0
 */
public class question_5 {

    public static void main(String[] args) {
        int b =162;
        System.out.println(Integer.toBinaryString(b));
        int n=6;
        int mask=~(1<<(n-1));
        b = b&mask;
        System.out.println(Integer.toBinaryString(b));
    }
    
}