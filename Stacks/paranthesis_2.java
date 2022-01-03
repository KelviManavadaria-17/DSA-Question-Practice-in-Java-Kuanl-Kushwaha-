import java.util.Stack;

public class paranthesis_2 {
    public static void main(String[] args) {
        String s = "{(a+b*[c-d]) + [r+x+{k-o} +(y-j)]}";
        System.out.println(answer(s));
    }
    static boolean answer(String s)
    {
        Stack a = new Stack<>();
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i) == '(' ||s.charAt(i) == '[' ||s.charAt(i) == '{' )
            {
                a.add(s.charAt(i));
            }
            else if(s.charAt(i) == ')' ||s.charAt(i) == ']' ||s.charAt(i) == '}')
            {
                char x = (char) a.peek();
                if((s.charAt(i)==')' && x=='(')|| (s.charAt(i)=='}' && x=='{')|| (s.charAt(i)==']' && x=='['))
                {
                    a.pop();
                }
            }
        } 
        return a.isEmpty();
    }

}
