package com.example.crimereportingapp;

import java.util.Date;
import java.util.UUID;

public class Crime {
    private final UUID id;
    private String title;
    private Date date;
    private boolean solved;
    private boolean requirePolice;


    public Crime() {
        this(UUID.randomUUID());
//        id=UUID.randomUUID();
//        date=new Date();
    }

    public Crime(UUID id) {
        this.id = id;
        date = new Date();
    }

    public UUID getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public Date getDate() {
        return date;
    }

    public boolean isSolved() {
        return solved;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setSolved(boolean solved) {
        this.solved = solved;
    }

    public boolean isRequirePolice() {
        return requirePolice;
    }

    public void setRequirePolice(boolean requirePolice) {
        this.requirePolice = requirePolice;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
