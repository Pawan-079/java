package innerclasses;
public class LinkedList
{
    static class node
    {
        int data;
        node next;
        public node(int val)
        {
            this.data = val;
            this.next=null;
        }
    }
    public static void main(String args[])
    {
        node head = new node(10);
        node n2 = new node(20);
        node n3 = new node(30);
        head.next=n2;
        n2.next=n3;  
        System.out.print(head.data+"->");
        System.out.print(head.next.data+"->");
        System.out.print(head.next.next.data+"->null");
    }
}
