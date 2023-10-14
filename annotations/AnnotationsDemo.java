package annotations;
class Demo
{
    public void helloEveryOneImShowMethod(){
        System.out.println("Show in Demo");
    }
}
class Visual extends Demo{
    @Override
    public void helloEveryOneImShowMethod(){
        System.out.println("Show in Visual");
    }
}
class AnnotationsDemo1{
    public static void main(String[] args){
        
        Demo v = new Visual();
        v.helloEveryOneImShowMethod();
    }
}