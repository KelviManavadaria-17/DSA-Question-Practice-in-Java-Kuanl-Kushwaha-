import java.util.Stack;

public class paranthesis_1 {
    public static void main(String[] args) {
        String s = "(a+(c-d)-(b*a))";
        System.out.println(is_balance(s));
        
    }
    static boolean is_balance(String s)
    {
        Stack a = new Stack<>();
        for(int i =0;i<s.length();i++)
        {
            if(s.charAt(i)=='(')
            {
                a.add(s.charAt(i));
            }
            else if(s.charAt(i)==')')
            {
                if(a.isEmpty())
                {
                    return false;
                }
                else
                {
                   a.pop();
                }
            }
        }
        if(a.isEmpty())
        {
            return true;
        }
        else
        {
            return false;
        }



        

        
    }

    
}