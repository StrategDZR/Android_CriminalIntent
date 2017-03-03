package com.example.strategdzr.criminalintent;

import java.util.Date;
import java.util.UUID;

/**
 * Created by StrategDZR on 19.02.2017
 */

public class Crime {

    private UUID mId;
    private String mTitle;
    private Date mDate;
    private boolean mSolved;


    public Crime(){
        mId = UUID.randomUUID(); //generating random ID
        mDate = new Date();
    }

    public UUID getId() {
        return mId;
    }

    public String getTitle() {
        return mTitle;
    }

    public Date getDate() {
        return mDate;
    }

    public void setDate(Date mDate) {
        this.mDate = mDate;
    }

    public boolean isSolved() {
        return mSolved;
    }

    public void setSolved(boolean mSolved) {
        this.mSolved = mSolved;
    }

    public void setTitle(String mTitle) {
        this.mTitle = mTitle;
    }
}
