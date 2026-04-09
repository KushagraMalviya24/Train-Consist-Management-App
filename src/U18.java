import java.util.Scanner;
public class U18 {

    public static void main(String[] args) {

        // Step 1: Create array of bogie IDs
        String[] bogieIds = {
                "BG101", "BG205", "BG309", "BG412", "BG550"
        };

        // Step 2: Take input from user
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Bogie ID to search: ");
        String key = sc.nextLine();

        // Step 3: Linear search
        boolean found = false;

        for (String id : bogieIds) {
            if (id.equals(key)) {
                found = true;
                break; // early termination
            }
        }

        // Step 4: Display result
        if (found) {
            System.out.println("Bogie ID found: " + key);
        } else {
            System.out.println("Bogie ID not found");
        }

        sc.close();
    }
}