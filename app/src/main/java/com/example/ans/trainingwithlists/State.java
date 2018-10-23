package com.example.ans.trainingwithlists;

import android.os.Parcel;

public class State
{
    private String name;
    private String capital;
    private int flagResource;

    public State(String name,String capital,int flag)
    {
        this.name = name;
        this.capital = capital;
        this.flagResource = flag;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getCapital()
    {
        return capital;
    }

    public void setCapital(String capital)
    {
        this.capital = capital;
    }

    public int getFlagResource()
    {
        return flagResource;
    }

    public void setFlagResource(int flag)
    {
        this.flagResource = flag;
    }
}
