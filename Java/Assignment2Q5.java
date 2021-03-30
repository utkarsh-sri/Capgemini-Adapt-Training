class Rectangle5 extends Shape5 {
    @Override
    public String draw()
    {
        return "Drawing a rectangle : \n*******\n*******";
    }
}

class Line5 extends Shape5{
    @Override
    public String draw()
    {
       return "Drawing a line : \n---------------------------";
    }
}

class Cube5 extends Shape5 {
    @Override
    public String draw() {
        return "Drawing a cube : \n****\n****";
    }
}
abstract class Shape5 {
    abstract public String draw();
}
public class Assignment2Q5{
    public static void main(String[] args)
    {
        Rectangle5 r=new Rectangle5();
        Cube5 c=new Cube5();
        Line5 l=new Line5();
        System.out.println(r.draw());
        System.out.println(c.draw());
        System.out.println(l.draw());
    }
}