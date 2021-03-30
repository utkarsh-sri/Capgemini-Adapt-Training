class SearchArray{
    public boolean searchArray(int[] arr,int toCheckValue)
    {
        int flag=0,index=0;
        for(int i=0;i< arr.length;i++)
        {
            if(arr[i]==toCheckValue)
            {
                flag=1;
                index=i;

            }
        }
        if(flag==1)
        {
            System.out.println("FOUND at index " + index);
            return true;
        }
        else
        {
            System.out.println("Not Found");
            return false;
        }
    }
}
public class Assignment1Q7 {
    public static void main(String[] args) {
        int arr[] = {5, 12, 14, 6, 78, 19, 1, 23, 26, 35, 37, 7, 52, 86, 47};
        int valueToCheck = 19;
        SearchArray obj = new SearchArray();
        obj.searchArray(arr, valueToCheck);
    }
}
