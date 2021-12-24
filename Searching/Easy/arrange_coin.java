public class arrange_coin {
    public static void main(String[] args) {
        System.out.println(answer(8));
    }
    static int answer(int n)
    {
        int i=0;
        while(n>0)
        {
            i++;
            n=n-i;
        }
        return i-1;
    }
    
}
