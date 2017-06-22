package com.teamproject.shoutbox;

/**
 * Created by Adarsh Kumar on 12/21/2016.
 */



public class FriendlyMessage {

    private String id;
    private String text;
    private String name;
    private String photoUrl;
    private String currentTime;


    public String getCurrentTime() {
        return currentTime;
    }

    public void setCurrentTime(String currentTime) {
        this.currentTime = currentTime;
    }



    public FriendlyMessage() {

    }

    public FriendlyMessage(String text, String name, String photoUrl,String currentTime) {
        this.text = text;
        this.name = name;
        this.photoUrl = photoUrl;
        this.currentTime = currentTime;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhotoUrl() {
        return photoUrl;
    }

    public String getText() {
        return text;
    }

    public void setPhotoUrl(String photoUrl) {
        this.photoUrl = photoUrl;
    }
}