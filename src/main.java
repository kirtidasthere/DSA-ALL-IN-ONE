/*import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

class main {

    public static void main(String args[]) throws Exception {
        // BufferedReader for reading input
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();

        // Split input line into array of integers (stations)
        String[] parts = line.split(" ");
        int[] stations = Arrays.stream(parts).mapToInt(Integer::parseInt).toArray();

        // Function to determine if the probe can reach the final station
        boolean result = canReachFinalStation(stations);

        // Output result
        System.out.println(result ? "True" : "False");  // Output "True" or "False"
    }

    // Function to check if the probe can reach the final station
    public static boolean canReachFinalStation(int[] stations) {
        int n = stations.length;

        // Base case: If there are no stations or only one, we can't proceed
        if (n < 2) return false;

        // The initial fuel needed to move from the first station
        int fuel = 1;

        // Start from the second station (index 1) and iterate through the stations
        for (int i = 1; i < n; i++) {
            int distance = stations[i] - stations[i - 1];

            // The next jump should be either fuel-1, fuel, or fuel+1
            if (distance < 1 || distance > fuel + 1) {
                return false; // The probe cannot land on the next station
            }

            // Update fuel for the next jump to the current distance
            fuel = distance;
        }

        // If we manage to reach the last station, return true
        return true;
    }
}
 */



import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

class main {

    public static void main(String args[]) throws Exception {
        // BufferedReader for reading input
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // Reading size of the array
        int n = Integer.parseInt(br.readLine().trim());

        // Reading the array elements
        String[] parts = br.readLine().trim().split(" ");
        int[] arr = Arrays.stream(parts).mapToInt(Integer::parseInt).toArray();

        // Function to find the missing and duplicate numbers
        findMissingAndDuplicate(arr, n);
    }

    // Function to find the missing and duplicate numbers
    public static void findMissingAndDuplicate(int[] arr, int n) {
        // Calculate the expected sum and sum of squares for numbers 1 to n
        long sum_n = (n * (n + 1)) / 2;
        long sum_squares_n = (n * (n + 1) * (2 * n + 1)) / 6;

        // Calculate the actual sum and sum of squares from the array
        long sum_arr = 0, sum_squares_arr = 0;

        for (int num : arr) {
            sum_arr += num;
            sum_squares_arr += (long) num * num;
        }

        // Difference between expected and actual sum and sum of squares
        long sum_diff = sum_n - sum_arr;  // missing - duplicate
        long square_diff = sum_squares_n - sum_squares_arr;  // missing^2 - duplicate^2

        // Solve the two equations:
        // missing - duplicate = sum_diff
        // missing^2 - duplicate^2 = square_diff
        long sum_missing_plus_duplicate = square_diff / sum_diff;

        // Now, we can calculate the missing and duplicate
        long missing = (sum_missing_plus_duplicate + sum_diff) / 2;
        long duplicate = missing - sum_diff;

        // Output the result
        System.out.println("Duplicate: " + duplicate + ", Missing: " + missing);
    }
}
