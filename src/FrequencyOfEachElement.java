public class FrequencyOfEachElement
{
    public static void main(String[] args) {

        int arr[]={10,2,3,10,2}; // length=5
        int res[]=new int[11];

        for(int i=0; i<arr.length; i++)
        {
           /* res[arr[i]]=res[arr[i]]+1;
            // arr[0]==>10       res[10]=1
            */

            int indexvalue=arr[i];  //i=0 10    i=1 2

            int updateindexvalue=res[indexvalue] + 1; //res[10]=0    10--1, 2--1, 3--1,

            res[indexvalue]=updateindexvalue;

        }

        for (int i=0; i< res.length; i++)
        {
            System.out.println(i + " frequency ---> "+res[i]);
        }

        //Hw
        //String s="kirtidas there dsa star batch"
        //how many times 1 character occur
        //a -->  ...
        //approach
        //res[27] --->0-26
        //ASCII code se hoga

    }
}
