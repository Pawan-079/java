package unittest;
public class BasicApp
{
    public String isEligible(int age)
    {
        if(age>=18)
            return("Eligible");
        else
            return("Not Eligible");
    }
}