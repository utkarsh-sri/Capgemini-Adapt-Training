import java.util.*;
import java.util.Map.Entry;
import java.util.Iterator;
class DateClass {
    private int date;
    private int month;
    private int year;
    private String name;
    public DateClass(int date, int month, int year ) {
        this.date = date;
        this.month = month;
        this.year = year;
    }
    public DateClass(String name)
    {
        this.name = name;
    }


    static class Assignment3Q4 {
        public static void main(String[] args) {
            //Creating map 
            Map<DateClass,DateClass> map=new HashMap<DateClass,DateClass>();
            //Creating objects
            DateClass d1=new DateClass(16,9,1996);
            DateClass d2=new DateClass(15,9,1998);
            DateClass d3=new DateClass(20,5,1997);
            DateClass b1=new DateClass("Rahul");
            DateClass b2=new DateClass("Rajesh");
            DateClass b3=new DateClass("Rohan");
            //Adding to map
            map.put(d1,b1);
            map.put(d2,b2);
            map.put(d3,b3);

            //Traversing map
            for(Entry<DateClass, DateClass> entry:map.entrySet()){
                DateClass key=(entry.getKey());
                DateClass b=entry.getValue();
                System.out.print(b.name+" Dob : ");
                System.out.println(key.date+"/"+key.month+"/"+key.year);
            }
        }
    }
}