public class q3 {
    public static void main(String[] args) {
        long totalMilliseconds = System.currentTimeMillis();
        //System.out.println(totalMilliseconds + " milliseconds");

        long totalSeconds = totalMilliseconds / 1000;
        //System.out.println(totalSeconds + " seconds");

        long currentSecond = totalSeconds % 60;
        //System.out.println("currentSecond: " + currentSecond);

        long totalMinutes = totalSeconds / 60;
        //System.out.println(totalMinutes + " minutes");

        long currentMinute = totalMinutes % 60;
        //System.out.println("currentMinute: " + currentMinute);

        long totalHours = totalMinutes / 60;
        //System.out.println(totalHours + " hours");

        long currentHour = totalHours % 24;
        //System.out.println("currentHour: " + currentHour);

        System.out.println("Current time is " + currentHour + ":" + currentMinute + ":" + currentSecond + " GMT");
    }
}
