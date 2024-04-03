public class CarsAssemble {

    public double productionRatePerHour(int speed) {

        // Declaramos la variable double.
        double production = speed * 221;

        // Logica del success rate.
        if (speed >= 1 && speed <= 4) {
            return production;
        }
        else if (speed >= 5 && speed <= 8) {
            return (production * 0.9);
        }
        else if (speed == 9) {
            return (production * 0.8);
        }
        else return (production * 0.77);
    }

    public int workingItemsPerMinute(int speed) {
        //Usamos el metodo anterior, y lo dividimos por 60 minutos.
        return  (int) (productionRatePerHour(speed)/60);
    }
}
