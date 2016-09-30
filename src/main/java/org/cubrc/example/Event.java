package org.cubrc.example;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.cglib.core.Local;

import javax.validation.constraints.NotNull;

/**
 * @author Robert Weber
 */
public class Event {
    @NotNull(message="You must select a day")
    private String day;
    @NotNull(message="You must select a month")
    private String month;
    @NotNull(message="You must select a year")
    private String year;
    @NotEmpty(message="You must enter a title")
    private String title;
    @NotEmpty(message="You must enter a description")
    private String description;
    @NotEmpty(message="You must enter an address")
    private String streetAddress;
    @NotEmpty(message="You must enter a city")
    private String city;
    @NotNull(message="You must enter a zipcode")
    private Integer zipCode;
    @NotNull(message="You must select a state")
    private String state;
//    private String startTime;
//    private String startTimePeriod;
//    private String endTime;
//    private String endTimePeriod;
//    private LocalDateTime dateTime;

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
//    public void setStartTime(String startTime){this.startTime = startTime;}
//    public void setEndTime(String endTime){this.endTime = endTime;}
    public void setStreetAddress(String streetAddress){this.streetAddress=streetAddress;}
    public void setState(String state){this.state = state;}
    public void setZipCode(Integer zipCode){this.zipCode=zipCode;}
    public void setCity(String city){this.city=city;}
//    public void setStartTimePeriod(String startTimePeriod){this.startTimePeriod=startTimePeriod;}
//    public void setEndTimePeriod(String endTimePeriod){this.endTimePeriod=endTimePeriod;}


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
    public Integer getZipCode(){return this.zipCode;}
    public String getCity(){return this.city;}
//    public String getStartTime(){return this.startTime; }
//    public String getEndTime(){return this.endTime; }
//    public String getStartTimePeriod(){return this.startTimePeriod;}
//    public String getEndTimePeriod(){return this.endTimePeriod;}


}
