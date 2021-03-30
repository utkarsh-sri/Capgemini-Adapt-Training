import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class Assignment3Q8b
{
    public static void main(String[] args)
    {
        //Creating a CopyOnWriteArrayList

        CopyOnWriteArrayList<Integer> list=new CopyOnWriteArrayList<Integer>();

        //Adding elements to CopyOnWriteArrayList

        list.add(2017);
        list.add(2018);
        list.add(2019);
        list.add(2020);
        list.add(2021);

        //Getting an Iterator from list

        Iterator<Integer> it = list.iterator();

        while (it.hasNext())
        {
            Integer integer = (Integer) it.next();
            System.out.println(integer);
            list.add(2022);    //This will not give error since it's a fail safe iterator
        }
    }
}