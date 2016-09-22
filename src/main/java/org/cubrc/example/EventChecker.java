package org.cubrc.example;

/**
 * Created by reitersg on 9/20/2016.
 */
public class EventChecker {
    private EventChecker(){

    }
    public static boolean validate(Event event){
        if (event.getDay().isEmpty() || event.getMonth().isEmpty() || event.getYear().isEmpty() || event.getTitle().isEmpty() || event.getDescription().isEmpty() || event.getCity().isEmpty() || event.getState().isEmpty() || event.getStreetAddress().isEmpty() || event.getZipCode() == 0){
            return true;
        } else {
            return false;
        }
    }
}
