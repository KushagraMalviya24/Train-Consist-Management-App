import java.util.Arrays;
import java.util.Scanner;

public class U19 {

    public static void main(String[] args) {

        // Step 1: Create array (can be unsorted)
        String[] bogieIds = {
                "BG309", "BG101", "BG550", "BG205", "BG412"
        };

        // Step 2: Sort array (important precondition)
        Arrays.sort(bogieIds);

        // Step 3: Take input
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Bogie ID to search: ");
        String key = sc.nextLine();

        // Step 4: Binary Search
        boolean found = binarySearch(bogieIds, key);

        // Step 5: Output
        if (found) {
            System.out.println("Bogie ID found: " + key);
        } else {
            System.out.println("Bogie ID not found");
        }

        sc.close();
    }

    // Binary Search Method
    public static boolean binarySearch(String[] arr, String key) {

        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {

            int mid = (low + high) / 2;

            int cmp = key.compareTo(arr[mid]);

            if (cmp == 0) {
                return true; // found
            } else if (cmp > 0) {
                low = mid + 1; // search right
            } else {
                high = mid - 1; // search left
            }
        }

        return false; // not found
    }
}
