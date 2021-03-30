import java.util.ArrayList;
class CurrentAccount extends Assignment2Q3 {
    int totalDeposits = 10000;
    int creditLimit = 2000;
    @Override
    public int getCash() {
        return totalDeposits+creditLimit;
    }
}
class SavingsAccount extends Assignment2Q3 {
    int totalDeposits = 10000;
    int fixedDepositAmount = 5000;
    @Override
    public int getCash() {
        return totalDeposits+fixedDepositAmount;
    }
}
public class Assignment2Q3 {
    public int totalCashInBank(ArrayList<Integer> cash)
    {
        int sum = 0;
        for(int i = 0; i < cash.size(); i++)
            sum += cash.get(i);
        return sum;
    }
    public int getCash(){
        return 0;
    }
    public static void main(String[] args)
    {
        CurrentAccount cu =new CurrentAccount();
        SavingsAccount sa =new SavingsAccount();
        Assignment2Q3 obj =new Assignment2Q3();
        ArrayList<Integer> al = new ArrayList<Integer>();
        al.add(cu.getCash());
        al.add(sa.getCash());
        System.out.println(obj.totalCashInBank(al));

    }
}