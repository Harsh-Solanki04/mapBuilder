package com.example.mapbuilder;

public class Structure {
    private final int drawableId;
    private String label;

    public Structure(int drawableId, String label)
    {
        this.drawableId = drawableId;
        this.label = label;
    }

    public int getDrawableId()
    {
        return drawableId;
    }

    public String getLabel()
    {
        return label;
    }
}
