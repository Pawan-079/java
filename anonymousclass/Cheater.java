package anonymousclass;
class Student{
    public int marks(){
        return 279;
    }
}
public class Cheater{
    public static void main(String args[]){
        Student mallesh = new Student()
        {
            public int marks()
            {
                return 495;
            }
        };
        System.out.println("Marks: "+mallesh.marks());
    }
}