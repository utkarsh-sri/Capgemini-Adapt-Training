import java.util.*;
class ResultDeclaration
{
    public String declareResults( double subject1Marks, double subject2Marks, double subject3Marks) {
        String str;
        if((subject1Marks>60)&&(subject2Marks>60)&&(subject3Marks>60))
        {
            str="Passed";
        }

        else if(((subject1Marks>60)&&(subject2Marks>60)&&(subject3Marks<60))||((subject1Marks>60)&&(subject2Marks<60)&&(subject3Marks>60))||((subject1Marks<60)&&(subject2Marks>60)&&(subject3Marks<60)))
        {
            str="Promoted";
        }

        else
        {
            str="Failed";
        }
        return str;
    }
}
public class Assignment1Q4 {
    public static void main(String[] args)
    {
        ResultDeclaration obj=new ResultDeclaration();
        System.out.println(obj.declareResults(70,40,90));
        System.out.println(obj.declareResults(10,10,10));
        System.out.println(obj.declareResults(70,10,10));
        System.out.println(obj.declareResults(70,40,90));
        System.out.println(obj.declareResults(70,80,90));

    }
}