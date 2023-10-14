package innerclasses;
class OuterClass
{
    private int id = 101;
    public void show()
    {
        System.out.println("OuterClass show()");
        System.out.println("OuterClass id: "+id);
    }
    //default
    class InnerClass1
    {
        int id=102;
        public void display()
        {
            int id=103; 
            OuterClass oc2 = new OuterClass();
            System.out.println("InnerClass1 display()");
            System.out.println("InnerClass1 id: "+id);
            System.out.println("InnerClass1 this.id: "+this.id);
            System.out.println("InnerClass1 oc2.id: "+oc2.id);
            oc2.show();
        }
    }
    //example for extending inner class from non abstract class
    class InnerClass2 extends Student
    {
        
    }
    //extending inner class from abstract class
    class InnerClass3 extends Trainer
    {
        @Override
        public void salary()
        {
            System.out.println("Awesome");
        }        
    }
    //implementing inner class from interface
    class InnerClass4 implements Employee
    {
        public void display(){
            System.out.println("Interface display");
        }
        public void show() {
            System.out.println("Interface show");
        }
        public void wish() {
            System.out.println("Interface wish");
        }
    }
    //extending inner class from another inner class
    class InnerClass5 extends InnerClass4
    {
        public void run()
        {
            System.out.println("InnerClass is running..");
        }
        public void fly()
        {
            System.out.println("InnerClass is flying..");
        }
    }
}
public class InnerClassDemo
{
    public static void main(String args[])
    {
        OuterClass oc = new OuterClass();
        
        oc.show();        
        //OuterClass.InnerClass1 ic1 = new OuterClass().new InnerClass1();
        OuterClass.InnerClass1 ic1 = oc.new InnerClass1();
        System.out.println(ic1.id);
        ic1.display();

        OuterClass.InnerClass2 ic2 = oc.new InnerClass2();
        System.out.println("Marks: "+ic2.marks());
        ic2.display();        
       
        OuterClass.InnerClass3 ic3 = oc.new InnerClass3();
        ic3.salary();
        ic3.display();        
        
        OuterClass.InnerClass4 ic4 = oc.new InnerClass4();
        ic4.show();
        ic4.display();        
        ic4.wish();
        
        OuterClass.InnerClass5 ic5 = oc.new InnerClass5();
        ic5.show();
        ic5.display();        
        ic5.wish();
        ic5.run();
        ic5.fly();

    }
}
