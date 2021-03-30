class ArmstrongOrNot {
    public boolean armstrongCheck(int num) {
        int c=0,a,temp;
        temp=num;
        while(num>0)
        {
            a=num%10;
            num=num/10;
            c=c+(a*a*a);
        }
        if(temp==c)
            return true;
        else
            return false;

    }
}

    public class Assignment1Q1 {
        public static void main(String[] args) {
            ArmstrongOrNot obj=new ArmstrongOrNot();
            System.out.println(obj.armstrongCheck(153));
        }
    }
