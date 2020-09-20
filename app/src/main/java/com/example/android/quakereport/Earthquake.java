package com.example.android.quakereport;

public class Earthquake {
    /** to store the mMagnitude */
    private Double mMagnitude;
    /** mLocation to show the place where earthquake occured */
    private String mLocation;
    /** mDate to show the date of occurence */
    private Long mTimeInMilliseconds;
    /** Website URL of the earthquake */
    private String mUrl;

    /**
     * Constructs a new {@link Earthquake} object.
     *
     * @param magnitude is the magnitude (size) of the earthquake
     * @param location is the city location of the earthquake
     * @param timeInMilliseconds is the time in milliseconds (from the Epoch) when the
     *  earthquake happened
     */
    public Earthquake(Double magnitude, String location, Long timeInMilliseconds, String url) {
        mMagnitude = magnitude;
        mLocation = location;
        mTimeInMilliseconds = timeInMilliseconds;
        mUrl = url;
    }

    //Getter method for Url
    public String getUrl() { return mUrl; }

    //Getter method for Magnitude
    public Double getMagnitude() {
        return mMagnitude;
    }

    //Getter method for Place
    public String getLocation() {
        return mLocation;
    }

    //Getter method for Date
    public Long getTimeInMilliseconds() {
        return mTimeInMilliseconds;
    }

}
