import java.util.*;
class Login{
    int temp=1;
    String userId = "Ajay",password = "password";
    public String loginUser(String user, String pass)
    {
        String dis;
            if(temp==3)
            {
                dis="Contact Admin";
                System.out.println(dis);
                System.exit(0);
            }
            if((user.equals(userId))&&(pass.equals(password)))
            {
                dis="Welcome "+user;
                System.out.println(dis);
            }
            else
                {
                    dis="Try again";
                    temp += 1;
                    System.out.println("You have entered wrong credentials ,please enter the right credentials.");
                }

        return dis;
    }

}
public class Assignment1Q6 {
    public static void main(String[] args)
    {
        String u;
        String p;
        Login obj=new Login();
        while(true)
        {
            System.out.println("Enter User Id: ");
            Scanner sc=new Scanner(System.in);
            Scanner s=new Scanner(System.in);
            u= sc.nextLine();
            System.out.println("Enter Password: ");
            p=s.nextLine();
            obj.loginUser(u,p);

        }

    }
}