package com.example.monarnv.remindme.dto;

/**
 * Created by monarnv on 18.06.2016.
 */
public class RemindDTO {

    private String title;

    public RemindDTO(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
