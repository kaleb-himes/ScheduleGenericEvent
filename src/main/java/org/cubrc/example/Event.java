package org.cubrc.example;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.cglib.core.Local;

import java.time.LocalDateTime;


/**
 * @author Robert Weber
 */
public class Event {
    private String day;
    private String month;
    private String year;
    private String title;
    private String description;
    private String streetAddress;
    private String city;
    private int zipCode;
    private String state;
    private String startTime;
    private String startTimePeriod;
    private String endTime;
    private String endTimePeriod;
    private LocalDateTime dateTime;

    public void setDay(String day){
        this.day = day;
    }
    public void setMonth(String month){
        this.month = month;
    }
    public void setYear(String year){
        this.year = year;
    }
    public void setTitle(String title) { this.title = title;}
    public void setDescription(String description){this.description = description;}
    public void setStartTime(String startTime){this.startTime = startTime;}
    public void setEndTime(String endTime){this.endTime = endTime;}
    public void setStreetAddress(String streetAddress){this.streetAddress=streetAddress;}
    public void setState(String state){this.state = state;}
    public void setZipCode(int zipCode){this.zipCode=zipCode;}
    public void setCity(String city){this.city=city;}
    public void setStartTimePeriod(String startTimePeriod){this.startTimePeriod=startTimePeriod;}
    public void setEndTimePeriod(String endTimePeriod){this.endTimePeriod=endTimePeriod;}


    public String getDay(){
        return this.day;
    }
    public String getMonth(){
        return this.month;
    }
    public String getYear(){
        return this.year;
    }
    public String toString(){
        return (year + "-" + month + "-" + day);
    }
    public String getTitle() { return this.title;}
    public String getDescription(){return this.description; }
    public String getStreetAddress(){return this.streetAddress;}
    public String getState(){return this.state;}
    public int getZipCode(){return this.zipCode;}
    public String getCity(){return this.city;}
    public String getStartTime(){return this.startTime; }
    public String getEndTime(){return this.endTime; }
    public String getStartTimePeriod(){return this.startTimePeriod;}
    public String getEndTimePeriod(){return this.endTimePeriod;}


}
