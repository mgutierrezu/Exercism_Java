class ProductionRemoteControlCar implements RemoteControlCar, Comparable<ProductionRemoteControlCar> {
    int distance = 0;
    int victories = 0;

    // constructor
    public ProductionRemoteControlCar(int distance, int victories) {
        this.distance = distance;
        this.victories = victories;
    }

    // constructor vacio
    public ProductionRemoteControlCar() {
    }

    public void drive() {
        distance += 10;
    }

    public int getDistanceTravelled() {
        return distance;
    }

    public int getNumberOfVictories() {
        return victories;
    }

    public void setNumberOfVictories(int numberOfVictories) {
        victories = numberOfVictories;
    }

    @Override
    public int compareTo(ProductionRemoteControlCar o) {
        if (this.victories < o.victories) {
            return 1;
        } else if (this.victories > o.victories) {
            return -1;
        } else
            return 0;
    }
}
