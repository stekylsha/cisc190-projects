package edu.sdccd.mesa.cisc190.matchmaker;

import java.time.Instant;
import java.util.Calendar;
import java.util.Date;
/**
 * Write a description of class Description here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Description
{
    // height in meters
    private float height;
    
    // weight in kilograms
    private float weight;
    
    private EyeColor eyeColor;
    
    private Gender gender;

    private Date birthDate;
    
    /**
     * Constructor for objects of class Description
     */
    public Description(float height, float weight, EyeColor eyeColor, Gender gender, int year, int month, int day)
    {
        this.height = height;
        this.weight = weight;
        this.eyeColor = eyeColor;
        this.gender = gender;
        Calendar bday = new Calendar.Builder()
                .setCalendarType("iso8601")
                .setDate(year, month, day)
                .build();
        // convert the calendar to a date
        Instant instant = bday.toInstant();
        this.birthDate = Date.from(instant);
    }
    
    public float getHeightMetric()
    {
        return height;
    }
    
    public float getHeightImperial()
    {
        // TODO: convert to feet/inches
        return 0.0F;
    }
    
    public float getWeightMetric()
    {
        return weight;
    }
    
    public float getWeightImperial()
    {
        // TODO: convert to pounds/oz
        return 0.0F;
    }
    
    public EyeColor getEyeColor()
    {
        return eyeColor;
    }
    
    public Gender getGender()
    {
        return gender;
    }
    
    public Date getBirthDate()
    {
        return birthDate;
    }
    
}
