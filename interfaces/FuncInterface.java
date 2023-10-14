package interfaces;
@FunctionalInterface
public interface FuncInterface {
    public void display();
    //public void run();
    default void show()
    {
        System.out.println("Welcome");
    }
    default void fly()
    {
        System.out.println("Fly the SKY!!");
    }
    //java.util.function
}
