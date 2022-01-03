import java.util.Arrays;

public class double_exist {
    public static void main(String[] args) {
        int[] a ={-20,8,-6,-14,0,-19,14,4};
        System.out.println(checkIfExist(a));
    }
    public static boolean checkIfExist(int[] a) {
        for(int i=0;i<a.length;i++)
        {
            if(a[i]<0)
            {
                a[i]=a[i]*-1;
            }
        }
        Arrays.sort(a);
        int i=0,j=a.length-1;
        while(i<=j)
        {
            if(a[i]*2==a[j])
            {
                return true;
            }
            else if(2*a[i]>a[j])
            {
                j--;
            }
            else{
                i++;
            }
            
        }
        return false;
    }
    
}
