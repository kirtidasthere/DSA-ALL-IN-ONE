package Array;
//WAP to find the second largest element in an array
public class SecondLargest
{
    public static void main(String[] args) {
        int arr[] = {1, 34, 12, 10, 11};
        int max=Integer.MIN_VALUE;
        int smax=Integer.MIN_VALUE;

        for (int i=0; i< arr.length; i++)
        {
            if(arr[i] > max)
            {

                max=arr[i];
            } else if (arr[i]>smax)
            {
                smax=arr[i];
            }
        }
        System.out.println(max);
        System.out.println(smax);


    }
    
}
