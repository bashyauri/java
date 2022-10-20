public class SecondsAndMinute {
    public static String getDurationString(int minutes, int seconds) {
        if (minutes >= 0 && (seconds >= 0 && seconds <= 59)) {
            int hoursToMinute =  minutes / 60;
            int reminder = minutes % 60;
            return hoursToMinute + "h " + reminder + "m " + seconds+ " s";

        }
        return "Invalid Value";

    }

    public static String getDurationString(int seconds) {
        if (seconds >= 0) {
            int minutesInSeconds = seconds / 60;
            int remainder = seconds % 60;
            return getDurationString(minutesInSeconds,remainder);

        }
        return "Invalid Val";
        
    }
    public static void main(String[] args) {
     System.out.println(getDurationString(3945));   
    }
    
}
