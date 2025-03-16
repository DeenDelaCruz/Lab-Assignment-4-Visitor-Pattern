interface DeliveryCostEstimator {
    double estimateForChair(Chair chair);
    double estimateForTable(Table table);
    double estimateForSofa(Sofa sofa);
}