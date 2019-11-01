package date;

import java.time.LocalTime;

public class DateExample {
    public static void main(String[] args) {
        LocalTime time = LocalTime.of(16, 40);
        String unalo = time.getHour() >= 12 ? (time.getHour() == 12) ? "pm" : "am" : "10";
        System.out.println(unalo);
    }
}
