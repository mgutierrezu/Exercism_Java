public class LogLine {

    String logLine;

    public LogLine(String logLine) {
        this.logLine = logLine;
    }

    public LogLevel getLogLevel() {

        switch (logLine.substring(1, 4)) {
            case "TRC":
                return LogLevel.TRACE;
            case "DBG":
                return LogLevel.DEBUG;
            case "INF":
                return LogLevel.INFO;
            case "WRN":
                return LogLevel.WARNING;
            case "ERR":
                return LogLevel.ERROR;
            case "FTL":
                return LogLevel.FATAL;

            default:
                return LogLevel.UNKNOWN;
        }

    }

    public String getOutputForShortLog() {
        switch (logLine.substring(1, 4)) {
            case "TRC":
                return "1:".concat(logLine.substring(7, logLine.length()));
            case "DBG":
                return "2:".concat(logLine.substring(7, logLine.length()));
            case "INF":
                return "4:".concat(logLine.substring(7, logLine.length()));
            case "WRN":
                return "5:".concat(logLine.substring(7, logLine.length()));
            case "ERR":
                return "6:".concat(logLine.substring(7, logLine.length()));
            case "FTL":
                return "42:".concat(logLine.substring(7, logLine.length()));

            default:
                return "0:".concat(logLine.substring(7, logLine.length()));
        }
    }
}
