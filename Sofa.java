class Sofa implements Product {
    private final double volume;
    private final double distance;

    public Sofa(double volume, double distance) {
        this.volume = volume;
        this.distance = distance;
    }

    public double getVolume() {
        return volume;
    }
    
    public double getDistance() {
        return distance;
    }

    @Override
    public double accept(DeliveryCostEstimator estimator) {
        return estimator.estimateForSofa(this);
    }
}