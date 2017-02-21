package com.example.chaithra.tourguideapp;

/**
 * Created by chaithra on 2/17/17.
 */

public class Design {

    private String name;
    private int imageresourceid;
    private String time;


    /**
     * @param name of the given item.
     * @param imageresourceid drawabke resource id for the image associated with the name.
     * @param time openinig and closing time of the particular data.
     */
    public Design(String name, int imageresourceid, String time) {
        this.name = name;
        this.imageresourceid = imageresourceid;
        this.time = time;
    }
/**
 *
 * */
    public String getName()
    {
        return name;

    }
    public String getTime()
    {
        return time;
    }
    public int getImageresourceid()
    {
        return  imageresourceid;
    }
}