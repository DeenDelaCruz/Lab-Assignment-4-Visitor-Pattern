class StandardDeliveryCostEstimator implements DeliveryCostEstimator {
    private static final double DISTANCE_RATE = 0.5; // Increase cost per unit distance
    private static final double BASE_PRICE_CHAIR = 12.0;
    private static final double BASE_PRICE_TABLE = 6.0;
    private static final double BASE_PRICE_SOFA = 2.5;

    @Override
    public double estimateForChair(Chair chair) {
        double shippingFee = DISTANCE_RATE * chair.getDistance();
        return BASE_PRICE_CHAIR + shippingFee;
    }

    @Override
    public double estimateForTable(Table table) {
        double basePrice = BASE_PRICE_TABLE * table.getSurfaceArea();
        double shippingFee = DISTANCE_RATE * table.getDistance();
        return basePrice + shippingFee;
    }

    @Override
    public double estimateForSofa(Sofa sofa) {
        double basePrice = BASE_PRICE_SOFA * sofa.getVolume();
        double shippingFee = DISTANCE_RATE * sofa.getDistance();
        return basePrice + shippingFee;
    }
}