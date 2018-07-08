package com.example.amrkamal.textme;

/**
 * Created by Amr Kamal on 02/07/18.
 */

public class MessageModel {

    private String text;
    private String name;
    private String photoUrl;

    public MessageModel() {
    }

    MessageModel(String text, String name, String photoUrl) {
        this.text = text;
        this.name = name;
        this.photoUrl = photoUrl;
    }

    public String getText() {
        return text;
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

    public void setPhotoUrl(String photoUrl) {
        this.photoUrl = photoUrl;
    }

}
