public class LogLevels {
    
    public static String message(String logLine) {

        return logLine.split(":")[1].trim(); // splits the string into 2 parts using : as the delimiter and removes whitespace from second value in the resulting list

    }

    public static String logLevel(String logLine) {
        return logLine.split(":")[0].replace("[", "").replace("]", "").toLowerCase();
    }

    public static String reformat(String logLine) {
        return message(logLine) + " (" + logLevel(logLine) + ")";
    }
}
