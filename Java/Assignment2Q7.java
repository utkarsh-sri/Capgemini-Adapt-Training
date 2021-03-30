import java.util.Scanner;

abstract class DesertItem {

    abstract public int getCost();
}
class Candy extends DesertItem {
    public int can=10;
    public int addCandies(int candies)
    {
        can+=candies;
        return candies;
    }
    public int getCost()
    {
        int cost=60;
        return cost;
    }

}
class Cookie extends DesertItem {
    public int cok=10;
    public int addCookies(int cookies)
    {
        cok+=cookies;
        return cookies;
    }
    public int getCost()
    {
        int cost=70;
        return cost;
    }
}
class IceCream extends DesertItem {
    public int ice=10;
    public int addIceCreams(int icecream)
    {
        ice+=icecream;
        return icecream;
    }
    public int getCost()
    {
        int cost=1;
        return cost;
    }
}
public class Assignment2Q7 {
    public static void main(String[] args)
    {
        int a;
        boolean b=true;
        Scanner s=new Scanner(System.in);
        Assignment2Q7 ob = new Assignment2Q7();
        while(b) {
            ob.selectRoles();
            System.out.println("Enter 1 to make another transaction any other digit to exit ");
            a=s.nextInt();
            if(a==1)
            {
                continue;
            }
            else
            {
                b=false;
            }
        }
    }
    Cookie obj1=new Cookie();
    Candy obj2=new Candy();
    IceCream obj3=new IceCream();
    private void selectRoles()
    {
        String s;
        Scanner sc1=new Scanner(System.in);
        System.out.println("Are you a customer or owner ?");
        s=sc1.nextLine();
        roles(s);

    }
    private void roles(String role)
    {
        if(role.equals("owner"))
        {
            addItems();
        }
        else if(role.equals("customer"))
        {
            placeOrder();
        }
    }
    private void addItems()
    {
        int ch;
        System.out.println("What do you want to add: Enter:-\n1. for cookie\n2. for candy \n3. for icecream");
        Scanner sc2=new Scanner((System.in));
        ch=sc2.nextInt();
        addItemsOperation(ch);

    }
    private void addItemsOperation(int choice)
    {
        int qty;
        Scanner sc3=new Scanner(System.in);
        if(choice==1)
        {
            System.out.println("Enter how much you want to add: ");
            qty=sc3.nextInt();
            obj1.addCookies(qty);
            System.out.println("Currently we have : "+obj1.cok+" cookies");
        }
        else if(choice==2)
        {
            System.out.println("Enter how much you want to add: ");
            qty=sc3.nextInt();
            obj2.addCandies(qty);
            System.out.println("Currently we have : "+obj2.can+" candies");
        }
        else if(choice==3)
        {
            System.out.println("Enter how much you want to add: ");
            qty=sc3.nextInt();
            obj3.addIceCreams(qty);
            System.out.println("Currently we have : "+obj3.ice+" ice creams");
        }
    }
    private void placeOrder()
    {
        int ch;
        System.out.println("What do you want to order: Enter:-\n1. for cookie\n2. for candy \n3. for icecream");
        Scanner sc4=new Scanner(System.in);
        ch=sc4.nextInt();
        placeOrderOperation(ch);
    }
    private void placeOrderOperation(int choice)
    {
        Scanner sc5 = new Scanner(System.in);
        int qty;
        if(choice==1)
        {
            System.out.println("Enter how much you want to order: ");
            qty=sc5.nextInt();
            obj1.cok=obj1.cok-qty;
            System.out.println("Your bill is : "+(qty*obj1.getCost()));
        }
        else if(choice==2)
        {
            System.out.println("Enter how much you want to order: ");
            qty=sc5.nextInt();
            obj2.can= obj2.can-qty;
            System.out.println("Your bill is : "+(qty*obj2.getCost()));

        }
        else if(choice==3)
        {
            System.out.println("Enter how much you want to order: ");
            qty=sc5.nextInt();
            obj3.ice= obj3.ice-qty;
            System.out.println("Your bill is : "+(qty*obj3.getCost()));


        }
    }

}