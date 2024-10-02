package Array;

public class ReaArrangeGFG
{
    public static void main(String[] args) {
        long arr[] = {1, 2, 3, 4, 5, 6};


        int n= arr.length;
        long[] result=new long[n];

        int left=0;
        int right=n-1;

        for(int i=0;i<n;i++)
        {
            if(i%2==0)
            {
                result[i]=arr[right--];

            }
            else
            {
                result[i]=arr[left++];
            }


        }

        for (int i=0; i<n; i++)
        {
            System.out.print(result[i] + " ");
        }


    }
}
