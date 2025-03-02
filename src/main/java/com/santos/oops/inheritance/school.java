package com.santos.oops.inheritance;

public class school {
    String name;
    String address;
    int volume;

    public school(String name, String address, int volume) {
        this.name = name;
        this.address = address;
        this.volume = volume;
    }

    public school() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }
}
