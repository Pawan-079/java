package collectionsframework;
import java.util.Stack;
public class SpecialStackDemo
{
    public static void main(String[] args)
    {
        Stack<String> books = new Stack<>();
        System.out.println("Default Capacity: "+books.capacity());
        books.push("Grey");
        books.push("LightGreen");
        books.push("Blue");
        books.push("Orange");
        books.push("Purple");
        books.push("Green");
        books.push("Blue");
        books.push(null);
        System.out.println("Stack of Books: "+books);
        
        System.out.println("pop: "+books.pop());
        System.out.println("pop: "+books.pop());

        System.out.println("peeks: "+books.peek());
        System.out.println("Stack of Books: "+books);
        
        System.out.println("search: "+books.search("LightGreen"));
        
    }
}
