public class Secrets {
    public static int shiftBack(int value, int amount) {
        int valor;
        valor = (value >>> amount);

        return valor;
    }

    public static int setBits(int value, int mask) {
        int valor;
        valor = (value | mask);

        return valor;
    }

    public static int flipBits(int value, int mask) {
        int valor;
        valor = (value ^ mask);

        return valor;
    }

    public static int clearBits(int value, int mask) {
        int valor;
        
        valor = (value & ~mask);

        return valor;    }
}