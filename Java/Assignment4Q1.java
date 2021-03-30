public class Assignment4Q1 {
    double d;

    public double addition(int num1,int num2) {
        return num1+num2;
    }
    public double subtraction(int num1,int num2){
        return num1-num2;
    }
    public double multiplication(int num1,int num2){
        return num1*num2;
    }
    public double division(double num1,double num2){
        if(num2==0)
            return 0;
        else
            return num1/num2;
    }

    public static void main(String[] args)
    {
        Assignment4Q1 ob=new Assignment4Q1();
        System.out.println(ob.addition(13,5));
        System.out.println(ob.subtraction(13,5));
        System.out.println(ob.multiplication(13,5));
        System.out.println(ob.division(13,5));


    }
}
interface sol
{
    double get (int a,int b);
}