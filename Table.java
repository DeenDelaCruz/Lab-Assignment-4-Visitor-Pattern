class Table implements Product {
    private final double surfaceArea;
    private final double distance;

    public Table(double surfaceArea, double distance) {
        this.surfaceArea = surfaceArea;
        this.distance = distance;
    }

    public double getSurfaceArea() {
        return surfaceArea;
    }
    
    public double getDistance() {
        return distance;
    }

    @Override
    public double accept(DeliveryCostEstimator estimator) {
        return estimator.estimateForTable(this);
    }
}