package part_03;

import java.util.Scanner;

class Exercise_06 {

    // the goal of this method is to print out the local time in any given timezone
    public static void main(String[] strings) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the time zone offset to GMT (ie, -8 or 8): ");
        long timeZoneChange = input.nextInt();

        // Get total milliseconds since midnight, 1/1/1970
        long totalMilliseconds = System.currentTimeMillis();

        // Get total seconds since midnight, 1/1/1970
        long totalSeconds = totalMilliseconds / 1000;
        System.out.println(totalSeconds);

        // Get the current second within the minute within the hour
        long currentSecond = totalSeconds % 60;

        // Get total minutes
        long totalMinutes = totalSeconds / 60;
        System.out.println(totalMinutes);

        // Get the current minute in the hour
        long currentMinute = totalMinutes % 60;

        // Get the total hours
        long totalHours = totalMinutes / 60;
        System.out.println(totalHours);

        // Get the current hour
        long currentHour = totalHours % 60;

        // Display results using a 12 hour clock, include AM or PM
        /*  amPM = "AM"
            currentTime + timeZoneChange
            if currentHour > 12 {
                currentHour -= 12;
                amPM = PM
         */
        System.out.println(convertToTimeZone(timeZoneChange, currentHour, currentMinute, currentSecond));
    }

    public static String convertToTimeZone(long timeZoneChange, long hr, long min, long sec) {
        String amPM = "AM";

        hr += timeZoneChange;
        min += timeZoneChange;
        sec += timeZoneChange;

        if (hr > 12) {
            hr -= 12;
            amPM = "PM";
        }

        return hr + ":" + min + ":" + sec + " " + amPM;
    }
}
