import java.lang.Math;
class SiCi {

    public double simpleInterest(double principalAmount,int time,double interestRate)
    {
        double si=(principalAmount*time*interestRate)/100;
        return si;
    }
    public double compoundInterest(double principalAmount,int time,double interestRate)
    {
        double ci=principalAmount*(Math.pow((1+(interestRate)/100),time))-(principalAmount);
        return ci;
        //P(1+r)^t-P
    }
}
public class Assignment1Q3 {
    public static void main (String args[])
    {
        SiCi obj=new SiCi();
        System.out.println("The Simple Interest is "+obj.simpleInterest(100,3,14.7));
        System.out.println("The compound Interest is "+obj.compoundInterest(100,3,14.7));
    }
}