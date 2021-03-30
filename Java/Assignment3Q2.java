import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class Assignment3Q2 {

    public static void main(String[] args) {
        Assignment3Q2 obj=new Assignment3Q2();
        HashSet<String> hashSet = new HashSet<String>();
        hashSet.add("One");
        hashSet.add("Two");
        hashSet.add("Three");
        hashSet.add("Four");
        hashSet.add("Five");
        obj.unordered(hashSet);

        LinkedHashSet<String> lhs= new LinkedHashSet<String>();
        lhs.add("One");
        lhs.add("Two");
        lhs.add("Three");
        lhs.add("Four");
        lhs.add("Five");
        obj.ordered(lhs);
    }
    public static String ordered(LinkedHashSet linkedHashSet) {
        Iterator<String> i=linkedHashSet.iterator();
        while(i.hasNext())
        {
            System.out.println(i.next());
        }
        return null;
    }

    public static HashSet unordered(HashSet hashSet) {
        Iterator<String> i=hashSet.iterator();
        while(i.hasNext())
        {
            System.out.println(i.next());
        }
        return null;
    }
}