class Chair implements Product {
    private final double weight;
    private final double distance;

    public Chair(double weight, double distance) {
        this.weight = weight;
        this.distance = distance;
    }

    public double getWeight() {
        return weight;
    }
    
    public double getDistance() {
        return distance;
    }

    @Override
    public double accept(DeliveryCostEstimator estimator) {
        return estimator.estimateForChair(this);
    }
}