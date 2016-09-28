package org.cubrc.example;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * Created by reitersg on 9/20/2016.
 */
public class EventChecker {
//    private EventChecker(){
//
//    }
//    public static boolean validate(Event event){
//        if (event.getDay().isEmpty() || event.getMonth().isEmpty() || event.getYear().isEmpty() || event.getTitle().isEmpty() || event.getDescription().isEmpty() || event.getCity().isEmpty() || event.getState().isEmpty() || event.getStreetAddress().isEmpty() || event.getZipCode() == 0){
//            return true;
//        } else {
//            return false;
//        }
//    }
    public static boolean checkDate(Event event) {
        Calendar c = Calendar.getInstance();
        c.set(Calendar.HOUR_OF_DAY, 0);
        c.set(Calendar.MINUTE, 0);
        c.set(Calendar.SECOND, 0);
        c.set(Calendar.MILLISECOND, 0);
        Date today = c.getTime();

        c.set(Calendar.YEAR, Integer.parseInt(event.getYear()));
        c.set(Calendar.MONTH, Integer.parseInt(event.getMonth()));
        c.set(Calendar.DAY_OF_MONTH, Integer.parseInt(event.getDay()));

        Date eventDate = c.getTime();
        if (eventDate.after(today)){
            return true;
        } else {
            return false;
        }
    }


}
