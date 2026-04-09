import java.util.*;

class PassengerBogie {
    String type;
    int capacity;

    public PassengerBogie(String type, int capacity) {
        this.type = type;
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return type + "(" + capacity + ")";
    }
}

public class U16 {

    // 🔵 Bubble Sort by capacity
    public static void bubbleSort(List<PassengerBogie> bogies) {
        int n = bogies.size();

        for (int i = 0; i < n - 1; i++) {
            boolean swapped = false;

            for (int j = 0; j < n - i - 1; j++) {
                if (bogies.get(j).capacity > bogies.get(j + 1).capacity) {
                    Collections.swap(bogies, j, j + 1);
                    swapped = true;
                }
            }

            if (!swapped) break; // optimization
        }
    }

    public static void main(String[] args) {

        List<PassengerBogie> bogies = new ArrayList<>();

        // Sample Data
        bogies.add(new PassengerBogie("Sleeper", 72));
        bogies.add(new PassengerBogie("AC Chair", 50));
        bogies.add(new PassengerBogie("First Class", 30));
        bogies.add(new PassengerBogie("Second Sitting", 90));

        System.out.println("Before Sorting: " + bogies);

        // Sort using Bubble Sort
        bubbleSort(bogies);

        System.out.println("After Sorting (by capacity): " + bogies);
    }
}