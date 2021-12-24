public class square {
    public static void main(String[] args) {
        int a = 8;
        System.out.println(mySqrt(a));
    }
    public static int mySqrt(int x) {
        long l=1;
       long h = x;
        
           while(l<=h)
           {
               long mid=l+(h-l)/2;
               if(mid*mid==x)
               {
                   h=mid;
                   break;
               }
               else if(mid*mid>x)
               {
                   h=mid-1;
               }
               else
               {
                   l=mid+1;
               }
           }
           return (int)h;
   }
}
