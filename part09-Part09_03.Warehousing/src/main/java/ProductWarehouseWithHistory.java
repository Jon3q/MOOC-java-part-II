import java.util.ArrayList;
public class ProductWarehouseWithHistory extends ProductWarehouse{

private ChangeHistory example;


    public ProductWarehouseWithHistory(String productName, double capacity) {
        super(productName, capacity);
    }
    public ProductWarehouseWithHistory(String productName, double capacity, double initialBalance){
        super(productName, capacity);
        this.example = new ChangeHistory();
        addToWarehouse(initialBalance);
    }
    public String history(){
        return example.toString();
    }
    public void addToWarehouse(double amount){
        if (amount < 0) {
            return;
        }
        if (amount <= howMuchSpaceLeft()) {
            super.addToWarehouse(amount);
            example.add(super.getBalance());
        }
    }
    public double takeFromWarehouse(double amount){
        if (amount < 0) {
            return 0.0;
        }
        double takenAmount = super.takeFromWarehouse(amount); // Call the superclass method
        example.add(super.getBalance()); // Add the current balance to history
        return takenAmount;
    }
    public void printAnalysis(){
        System.out.println("Product: " + getName());
        System.out.println("History: " + example.toString());
        System.out.println("Largest amount of product: " + example.maxValue());
        System.out.println("Smallest amount of product: " + example.minValue());
        System.out.println("Average: " + example.average());
    }

}
