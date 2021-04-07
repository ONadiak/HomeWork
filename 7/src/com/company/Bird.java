package com.company;

public abstract class Bird {
    private boolean feathers, layEggs;
    abstract void fly();
    private String name;

    public Bird () {}

    public void setFeathers(boolean feathers) {
        this.feathers = feathers;
    }

    public void setLayEggs(boolean layEggs) {
        this.layEggs = layEggs;
    }

    public boolean isFeathers() {
        return feathers;
    }

    public boolean isLayEggs() {
        return layEggs;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}
