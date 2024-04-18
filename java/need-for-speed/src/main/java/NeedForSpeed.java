class NeedForSpeed {
    int speed;
    int batteryDrain;
    int meters = 0;
    int battery = 100;

    NeedForSpeed(int speed, int batteryDrain) {
        this.speed = speed;
        this.batteryDrain = batteryDrain;
    }

    public boolean batteryDrained() {
        return (battery > 0) ? false : true;
    }

    public int distanceDriven() {
        return meters;
    }

    public void drive() {
        if (battery >= batteryDrain){
            meters = meters + speed;
            battery = battery - batteryDrain;
        }
    }

    public static NeedForSpeed nitro() {
        return new NeedForSpeed(50, 4);
    }
}

class RaceTrack {
    int distance;

    RaceTrack(int distance) {
        this.distance = distance;
    }

    public boolean tryFinishTrack(NeedForSpeed car) {
        while(car.battery >= car.batteryDrain) {
            car.drive();
        }
        return (car.meters >= distance) ? true : false;
    }
}
