package com.example.cs349.a3;

public class Pic {
    private String Rate;
    private int Thumbnail;
    //private int Orientation;

    public Pic(String rate, int thumbnail) {
        Rate = rate;
        Thumbnail = thumbnail;
    }

    //get method
    public String getRate() {
        return Rate;
    }
    public int getThumbnail() {
        return Thumbnail;
    }
    /*public int getOrientation() {
        return Orientation;
    }*/

    //set method
    public void setRate(String rate) {
        Rate = rate;
    }
    public void setThumbnail(int thumbnail) {
        Thumbnail = thumbnail;
    }
    /*public void setOrientation(int orientation) {
        Orientation = orientation;
    }*/
}
