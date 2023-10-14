package encapsulation;
class Human
{
    private int rollID1;
    private String rollID2;
    private String passwd;
    String name;
    private int age;
    public void setRollID(int rollID)
    {
        this.rollID1=rollID;
    }
    public void setRollID(String rollID)
    {
        this.rollID2=rollID;
    }
    public int getRollID1()
    {
        return rollID1;
    }
    public String getRollID2()
    {
        return rollID2;
    }
}
public class Demo 
{
    public static void main(String args[])
    {
        Human h = new Human();
        h.setRollID(2013);
        h.setRollID("2022AIML1025");
   
        System.out.println(h.getRollID1());        
        System.out.println(h.getRollID2());        
    }
}