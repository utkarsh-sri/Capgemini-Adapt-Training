import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
class ArmstrongNumBetweenRange{
    public int[] armstrongNumbersInRange(int min , int max){
        ArrayList<Integer> a1 = new ArrayList<Integer>();
        for(int i=100;i<=999;i++)
        {
            int c=0,a,temp;
            temp=i;
            while(temp>0)
            {
                a = temp % 10;
                temp = temp / 10;
                c = c + (a * a * a);
            }
            if(i==c)
            {
                a1.add(i);
            }



        }
        int[] arr = new int[a1.size()];
        Arrays.setAll(arr, a1::get);
        return arr;
    }
}

public class Assignment1Q2{
    public static void main (String [] args) {

        int min = 100;int max = 999;
        ArmstrongNumBetweenRange obj=new ArmstrongNumBetweenRange();
        int[] arr = obj.armstrongNumbersInRange(min,max);
        for(int i:arr){
            System.out.println(i);

        }

    }
}