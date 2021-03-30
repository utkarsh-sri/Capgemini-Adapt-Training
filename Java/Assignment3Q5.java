import java.util.Hashtable;

class Emp {
    int id;
    String name;

    Emp(int id, String name){
        this.id=id;
        this.name=name;
    }

    public int getId() {
        return id;
    }

    public void putId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void putName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object obj){

        Emp emp=(Emp) obj;
        return emp.getId()!=this.getId();

    }

    public int hashcode(){
        return id;
    }
}

public class Assignment3Q5{

    public static void main(String[] args) {
        Hashtable<Emp, String> ht=new Hashtable<Emp, String>();
        Emp emp=new Emp(101, "Rahul");
        Emp emp1=new Emp(102, "Rajesh");
        Emp emp2=new Emp(103, "Rohan");


        System.out.println(emp.hashcode());
        System.out.println(emp.equals(emp1));

    }}