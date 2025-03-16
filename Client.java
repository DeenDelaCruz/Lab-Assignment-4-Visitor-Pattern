public class Client {
    public static void main(String[] args) {
        Product chair = new Chair(4.5, 50.0);
        Product table = new Table(12.0, 75.0);
        Product sofa = new Sofa(25.0, 100.0);

        DeliveryCostEstimator estimator = new StandardDeliveryCostEstimator();

        double chairCost = chair.accept(estimator);
        double tableCost = table.accept(estimator);
        double sofaCost = sofa.accept(estimator);

        System.out.println("Delivery cost breakdown:");
        System.out.println("Chair - Base Price: $12.0, Shipping Fee: $" + (0.5 * 50.0) + ", Total: $" + chairCost);
        System.out.println("Table - Base Price: $" + (6.0 * 12.0) + ", Shipping Fee: $" + (0.5 * 75.0) + ", Total: $" + tableCost);
        System.out.println("Sofa - Base Price: $" + (2.5 * 25.0) + ", Shipping Fee: $" + (0.5 * 100.0) + ", Total: $" + sofaCost);
    }
}