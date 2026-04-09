import java.util.Arrays;
public class U20 {

    public static void main(String[] args) {

        // Try with empty array to test exception
        String[] bogieIds = {};

        String key = "BG101";

        try {
            boolean found = searchBogie(bogieIds, key);

            if (found) {
                System.out.println("Bogie ID found: " + key);
            } else {
                System.out.println("Bogie ID not found");
            }

        } catch (IllegalStateException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    // Search method with validation
    public static boolean searchBogie(String[] arr, String key) {

        // 🔥 UC20 core logic (fail-fast)
        if (arr == null || arr.length == 0) {
            throw new IllegalStateException("No bogies available to search.");
        }

        // Normal linear search (can reuse UC18 logic)
        for (String id : arr) {
            if (id.equals(key)) {
                return true;
            }
        }

        return false;
    }
}