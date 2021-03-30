abstract class Persistence {
    abstract public String persist();
}
class FilePersistence extends Persistence{
    @Override
    public String persist()
    {
        return "Under File Persistence";
    }
}
class DatabasePersistence extends Persistence{
    @Override
    public String persist() {
        return "Under Database Persistence";
    }
}

public class Assignment2Q6 {
    public static void main(String[] args)
    {
        Persistence obj1=new DatabasePersistence();
        Persistence obj2=new FilePersistence();
        System.out.println(obj1.persist());
        System.out.println(obj2.persist());

    }
}