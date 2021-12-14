public class sort_colors {
    public static void main(String[] args) {
        int[] a = {0};
        sorte(a);
        for (int i : a) {
            System.out.println(i);
        }
        
    }
    static void sorte(int[]a)
    {
        int zeros=0;
        int ones=0;
        int twos=0;
        for(int i=0;i<a.length;i++)
        {
            if(a[i]==0)
            {
                zeros++;
            }
            if(a[i]==1)
            {
                ones++;
            }
            if(a[i]==2)
            {
                twos++;
            }
        }
        if(zeros!=0)
        {
            for(int i=0;i<zeros;i++)
            {
                a[i]=0;
            }
        }
        if(ones!=0)
        {
            for(int i=zeros;i<ones+zeros;i++)
            {
                a[i]=1;
            }
        }
        if(twos!=0)
        {
            for(int i=ones+zeros;i<a.length;i++)
            {
                a[i]=2;
            }
        }
    }
    
}
