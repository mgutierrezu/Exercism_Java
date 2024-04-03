public class LogLevels {

    //Removemos el level de cada uno y cortamos los espacios en blanco con trim().
    public static String message(String logLine) {
        if (logLine.contains("ERROR")) {
            return logLine.substring(9).trim();
        } else if (logLine.contains("WARNING")) {
            return logLine.substring(11).trim();
        } else if (logLine.contains("INFO")) {
            return logLine.substring(8).trim();
        } else
            return null;
    }

    //Se obtiene un substring y se transforma a lowerCase.
    public static String logLevel(String logLine) {
        if (logLine.contains("ERROR")) {
            return logLine.substring(1, 6).toLowerCase();
        } else if (logLine.contains("WARNING")) {
            return logLine.substring(1, 8).toLowerCase();
        } else if (logLine.contains("INFO")) {
            return logLine.substring(1, 5).toLowerCase();
        } else
            return null;
    }

    //Utilizamos los 2 metodos anteriores y agregamos formateo con .concat().
    public static String reformat(String logLine) {
        String reformat = message(logLine);

        return reformat.concat(" (").concat(logLevel(logLine)).concat(")");

    }
}
