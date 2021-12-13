public class palidrome {
    public static void main(String[] args) {
        String name = "mosdom";
        for(int i=0;i<=name.length()/2;i++)
        {
            if(name.charAt(i) != name.charAt(name.length()-1-i))
            {
                System.out.println("not a palidrome");
                break;
            }
        }
        System.out.println("is palidrome");
    }
    
}
