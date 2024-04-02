public class Lasagna {
    // TODO: define the 'expectedMinutesInOven()' method
    public int expectedMinutesInOven() {
        return 40;
    }

    // TODO: define the 'remainingMinutesInOven()' method
    public int remainingMinutesInOven(int minutesInOven) {
        return (40 - minutesInOven);
    }

    // TODO: define the 'preparationTimeInMinutes()' method
    public int preparationTimeInMinutes(int numbersOfLayers) {
        return (numbersOfLayers * 2);
    }

    // TODO: define the 'totalTimeInMinutes()' method
    public int totalTimeInMinutes(int numbersOfLayers, int minutesInOven) {
        return (preparationTimeInMinutes(numbersOfLayers) + minutesInOven);
    }
}
