class BubbleSort{

    public int[] bubbleSort(int arr[])
    {
        int temp=0;
        for(int i=0;i< arr.length;i++)
        {
            for(int j=1;j< (arr.length-i);j++)
            {
                if(arr[j-1]>arr[j])
                {
                    temp=arr[j-1];
                    arr[j-1]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        for(int i=0;i< arr.length;i++)
        {
            System.out.println(arr[i]);
        }
        return arr;
    }
}
public class Assignment1Q8 {
    public static void main(String args[]) {
        int arr[] = {5,12,14,6,78,19,1,23,26,35,37,7,52,86,47};
        BubbleSort obj=new BubbleSort();
        obj.bubbleSort(arr);
    }
}