import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class VehicleRegistry {
    private HashMap<LicensePlate, String> map;

    public VehicleRegistry() {
        this.map = new HashMap<>();
    }

    public boolean add(LicensePlate licensePlate, String owner) {
        if (!map.containsKey(licensePlate)) { // Check if key exists
            map.put(licensePlate, owner);
            return true;
        }
        return false;
    }

    public String get(LicensePlate licensePlate) {
        String owner = map.get(licensePlate);
        if (owner != null && !owner.isEmpty()) { // Check if value is not null and not empty
            return owner;
        }
        return null;
    }

    public boolean remove(LicensePlate licensePlate) {
        if (map.containsKey(licensePlate)) {
            map.remove(licensePlate);
            return true;
        }
        return false;
    }

    public void printLicensePlates() {
        for (Map.Entry<LicensePlate, String> entry : map.entrySet()) {
            System.out.println(entry.getKey());
        }
    }

    public void printOwners() {
        Set<String> printedValues = new HashSet<>();

        // Print each entry on a new line, avoiding duplicate values
        for (Map.Entry<LicensePlate, String> entry : map.entrySet()) {
            String value = entry.getValue();
            if (!printedValues.contains(value)) {
                System.out.println(entry.getValue());
                printedValues.add(value);
            }
        }
    }
}
