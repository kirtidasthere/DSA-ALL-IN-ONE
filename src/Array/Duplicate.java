package Array;

public class Duplicate
{
    public static void main(String[] args) {
        int arr[]={1,3,4,5,1,3};

        for (int malik=0; malik <arr.length; malik++)
        {
            for (int kaka=malik+1; kaka<arr.length;kaka++)
            {
                if (arr[malik]==arr[kaka])
                {
                    System.out.println(arr[malik]);
                }
            }

        }

      /*  System.out.println("********for each loop*************");
        for(int data:arr)
        {
            System.out.println(data);
        }

       */
    }
}
