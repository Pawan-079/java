package interfaces;
interface interface0 {
    public void greet();
    static void reply(){
    System.out.println("I am fine");
}
}
interface interface2{
    public void greet1();
    static void reply(){
        System.out.println("I am fine");
    }
}
class check implements interface0,interface2{
    public void greet(){
        System.out.println("hii");
    }
    public void greet1(){
        System.out.println("Hello");
    }
}
public class interface1{
    public static void main(String[] args){
        check obj = new check();
        obj.greet();
        obj.greet1();
        interface0.reply();
        interface2.reply();
    }
}