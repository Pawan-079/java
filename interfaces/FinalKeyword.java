package interfaces;
public class FinalKeyword{
    final static int id;
    final static String name;
    final static String passwd;
    //final int num;
    static{
    //num=456;
    id =123;
    name="kiran";
    passwd="kiran#123";
    }
    /*
    FinalKeyword(int num, String str, String pwd){
        id=num;
        name=str;
        passwd=pwd;
    }
    */
    public static void main(String args[])
    {
        FinalKeyword fk = new FinalKeyword();
        System.out.println(fk.id);
        System.out.println(fk.name);
        System.out.println(fk.passwd);
    }
}