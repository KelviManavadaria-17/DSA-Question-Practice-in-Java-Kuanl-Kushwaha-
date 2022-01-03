

public class im_using_ll {
    public static void main(String[] args) {
       

    }    
}
class Stacks_ll{
    static StackNode root;
    static class StackNode{
        int data;
        StackNode next;
        StackNode(int data)
        {
            this.data = data;
        }
        boolean is_empty()
        {
            if(root==null)
            {
                return true;
            }
            else
            {
                return false;
            }
        }
        void push(int data)
        {
            StackNode temp = new StackNode(data);
            if(root==null)
            {
                root=temp;
            }
            else{
                StackNode newt = root;
                root = newt;
                temp.next = temp;
            }

        }
        int pop()
        {
            int pooped = Integer.MIN_VALUE;
            if(root == null )
            {
                System.out.println("Stack is empty");
            }
            else{
                pooped = root.data;
                root = root.next;
            }
            return pooped;
        }
        int peek()
        {
            if(root == null)
            {
                return Integer.MIN_VALUE;
            }
            else{
                return root.data;
            }
        }
    }

}