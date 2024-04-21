import java.util.List;

public class TestTrack {

    // static List<RemoteControlCar> cars = new ArrayList<RemoteControlCar>();

    public static void race(RemoteControlCar car) {
        car.drive();
    }

    public static List<ProductionRemoteControlCar> getRankedCars(List<ProductionRemoteControlCar> cars) {
        cars.sort(null);
        return cars;
    }
}
