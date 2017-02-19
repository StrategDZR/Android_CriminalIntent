package com.example.strategdzr.criminalintent;

import java.util.UUID;

/**
 * Created by StrategDZR on 19.02.2017
 */

public class Crime {
    private UUID mId;
    private String mTitle;

    public Crime(){
        mId = UUID.randomUUID(); //generating random ID
    }

    public UUID getId() {
        return mId;
    }

    public String getTitle() {
        return mTitle;
    }

    public void setTitle(String mTitle) {
        this.mTitle = mTitle;
    }
}
