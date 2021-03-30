import java.util.*;
public class Assignment3Q3{
    public static List traverseReverse(ArrayList al)
    {
        Collections.reverse(al);
        return al;
    }
    public static void main(String[] args)
    {
        Assignment3Q3 obj = new Assignment3Q3();
        ArrayList<String> al = new ArrayList<String>();
        al.add("A");
        al.add("B");
        al.add("C");
        al.add("D");
        System.out.println(obj.traverseReverse(al));
    }
}