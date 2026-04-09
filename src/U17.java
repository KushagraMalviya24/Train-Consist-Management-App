import java.util.Arrays;

public class U17 {

    public static void main(String[] args) {

        // Step 1: Create array of bogie names
        String[] bogies = {
                "Sleeper",
                "AC Chair",
                "First Class",
                "General",
                "Luxury"
        };

        // Step 2: Sort using built-in method
        Arrays.sort(bogies);

        // Step 3: Print sorted result
        System.out.println("Sorted Bogie Names:");
        System.out.println(Arrays.toString(bogies));
    }
}