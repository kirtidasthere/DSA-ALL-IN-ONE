package Array;
// WAP to find the average of elements in an array

public class AverageElement {
    public static void main(String[] args) {
        int arr[] = {10, 20, 30, 40, 50};
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
            //sum+=arr[i];
        }
        System.out.println("Sum = "+sum);

        //calculate average
        double average = (double) sum / arr.length;
        System.out.println("Average = "+average);
    }

}
