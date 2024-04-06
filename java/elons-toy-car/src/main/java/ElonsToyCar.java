public class ElonsToyCar {
    private int distanceMeters;
    private int battery = 100;


    public static ElonsToyCar buy() {
        ElonsToyCar car = new ElonsToyCar();
        return car;
    }

    public String distanceDisplay() {
        int meters = 20 * (100 - battery);
        return (battery <= 0) ? "Driven 2000 meters" : "Driven " + String.valueOf(meters) + " meters";
    }

    public String batteryDisplay() {
        return (battery <= 0) ? "Battery empty" : "Battery at " + String.valueOf(battery) + "%";
    }

    public void drive() {
        battery = battery - 1;
        distanceMeters = distanceMeters + 20;
    }
}
