package com.accenture.villakunterbunt.ski.entitties;

public class Place {

    private String address;
    private String name;

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Name: " + name + " , Address: " + address;
    }
}
