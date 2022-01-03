

public class im_using_array {

    public static void main(String[] args) {
        Stacks s = new Stacks();
        System.out.println(s.isEmpty());
        System.out.println(s.StackTop());

        s.push(7);
        s.push(8);
        s.push(9);
        s.push(10);
        s.push(11);
        s.push(12);
        System.out.println(s.peek());
        System.out.println(s.pop());

        
        s.push(12);

        System.out.println(s.isEmpty());
        System.out.println(s.StackTop());
        System.out.println(s.toString());

    }
    
}
class Stacks{
    static final int max = 5;
    int top;
    int[] a = new int[max];
    Stacks()
    {
        top=-1;
    }
    boolean isEmpty()
    {
        return (top<0);
    }
    int StackTop()
    {
        return top;
    }
    boolean push(int x)
    {
        if(top>=max-1)
        {
            System.out.println("Stack Overflowed");
            return false;
        }
        else{
            ++top;
            a[top]= x;
            System.out.println("element pushed in stack");
            return true;
        }
    }
    int pop()
    {
        if(top<0)
        {
            System.out.println("Stack underflow");
            return Integer.MIN_VALUE;
        }
        else
        {
            top--;
            return a[top+1]; 
        }
    }
    int peek()
    {
        if(top<0)
        {
            System.out.println("Stack underflow");
            return Integer.MIN_VALUE;
        }
        else
        {
            
            return a[top]; 
        }
    }
    @Override
    public String toString(){
        String s = "";
       for (int i : a) {
           s = s + i + " ";
       }
       return s;
    }
       

}