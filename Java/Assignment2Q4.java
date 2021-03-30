abstract class c1
{
    public void m1()
    {
        System.out.println("Non abstract method od c1");
    }

    public abstract void a1();
    public abstract void a2();
}
abstract class c2 extends c1
{
    public void m2()
    {
        System.out.println("Non abstract method of c2");
    }

    public abstract void a3();
}

class c3 extends c2
{
    @Override
    public void a1() {
        System.out.println("Overriding abstract method a1 of c1");
    }

    @Override
    public void a2() {
        System.out.println("Overriding abstract method a2 of c1");
    }

    @Override
    public void a3() {
        System.out.println("Overriding abstract method a3 of c2");
    }
}


public class Assignment2Q4 {
    public static void main(String[] args) {
        //c1 obj =new c1();
        //obj.m1();
        //c2 obj1=new c2();
        //obj1.m1();
        //obj1.m2(); do not work so we have to make c2 also abstract
        c3 ob =new c3();
        ob.a1();
        ob.a2();
        ob.a3();
        ob.m1();
        ob.m2();

    }
}
