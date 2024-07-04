package hackerrank.calendar;

import java.time.DayOfWeek;
import java.util.Calendar;

class Result {

    public static String findDay(int month, int day, int year) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(year, month -1, day);
        int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);

        if (dayOfWeek > 1) {
            return DayOfWeek.of(dayOfWeek -1).name();
        } else {
            dayOfWeek = 7;
            return DayOfWeek.of(dayOfWeek).name();
        }
    }
}