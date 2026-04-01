

// Custom Runtime Exception
class CargoSafetyException extends RuntimeException {
    public CargoSafetyException(String message) {
        super(message);
    }
}

public class U15 {
    public static void main(String[] args) {

        // Display welcome banner
        System.out.println("========================================");
        System.out.println("=== Train Consist Management App ===");
        System.out.println("========================================\n");

        GoodsBogie b1 = new GoodsBogie("Cylindrical");
        GoodsBogie b2 = new GoodsBogie("Rectangular");

        assignCargo(b1, "Petroleum");
        assignCargo(b2, "Petroleum"); // unsafe
        assignCargo(b2, "Coal");      // safe
    }

    public static void assignCargo(GoodsBogie bogie, String cargo) {
        try {
            if (bogie.type.equals("Rectangular") && cargo.equals("Petroleum")) {
                throw new CargoSafetyException("Unsafe: Petroleum cannot be assigned to Rectangular bogie");
            }

            bogie.setCargo(cargo);
            System.out.println("Cargo assigned: " + bogie);

        } catch (CargoSafetyException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            System.out.println("Assignment attempt completed.\n");
        }
    }
}