import java.util.ArrayList;
class Manager extends Assignment2Q2 {
    @Override
    public int getSalary(int salary) {

        int incentive = 5000;
        return incentive+salary;

    }
}

class Labour extends Assignment2Q2 {
    @Override
    public int getSalary(int salary) {
        int overtime = 500;
       return overtime+salary;
    }
}

public class Assignment2Q2 {
    int salary = 10000;
    public int getSalary(int salary){
        return salary;
    }
    public int totalEmployeesSalary(ArrayList<Integer> employeeSalaries)
    {
        int sum = 0;
        for(int i = 0; i < employeeSalaries.size(); i++)
        sum += employeeSalaries.get(i);
        return sum;
    }
    public static void main(String[] args)
    {
        Manager m=new Manager();
        Labour l=new Labour();
        Assignment2Q2 a=new Assignment2Q2();
        ArrayList<Integer> al = new ArrayList<Integer>();
        al.add(m.getSalary(a.salary));
        al.add(l.getSalary(a.salary));
        //al.add(a.getSalary(a.salary));
        System.out.println(a.totalEmployeesSalary(al));


    }
}