package practice;

public class Product {
    private static double sum = 0;
    private double productCost;
    private int productQuantity;
    private String productName;

    public Product(double cost, int quantity, String name) {
        this.productCost = cost;
        this.productQuantity = quantity;
        this.productName = name;
    }


    public double totalCost() {
        if (this.productQuantity < 1) {
            System.out.println("You do not have any products to calculate");
        } else {
         sum = this.productCost * this.productQuantity;
        }
        return sum;
    }

    public void printProduct() {
        System.out.println(
                this.productName + " costs $" + this.productCost + " each and " + this.productQuantity
                        + " units were purchased.");
    }
}
