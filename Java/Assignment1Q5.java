class TaxAmount
{
    public double calculateTaxAmount(int ctc)
    {
        double tax=0;
        if((ctc>0)&&(ctc<180000))
        {
            tax=0;
        }
        else if((ctc>181001)&&(ctc<300000))
        {
            tax=ctc*0.10;
        }
        else if ((ctc)>300001&&(ctc<500000))
        {
            tax=ctc*.20;
        }
        else if((ctc>500001)&&(ctc<1000001))
        {
            tax=ctc*.30;
        }


        return tax;
    }
}
public class Assignment1Q5 {
    public static void main(String args[])
    {
        TaxAmount obj=new TaxAmount();
        System.out.println("Tax amount is : "+obj.calculateTaxAmount(150000));
        System.out.println("Tax amount is : "+obj.calculateTaxAmount(200000));
        System.out.println("Tax amount is : "+obj.calculateTaxAmount(400000));
        System.out.println("Tax amount is : "+obj.calculateTaxAmount(750000));

    }
}