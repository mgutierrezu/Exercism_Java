public class ExperimentalRemoteControlCar implements RemoteControlCar{
    int distance = 0;

    // constructor
    public ExperimentalRemoteControlCar(int distance) {
        this.distance = distance;
    }


    // constructor vacio
    public ExperimentalRemoteControlCar() {
    }



    public void drive() {
        distance += 20;
    }

    public int getDistanceTravelled() {
        return distance;
    }
}
