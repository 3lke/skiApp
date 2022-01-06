package com.accenture.villakunterbunt.ski.entitties;

import com.accenture.villakunterbunt.ski.SkiLiftType;

public class SkiLift extends Place {

    private SkiLiftType liftType;
    private int capacityPerHour;

    public int getCapacityPerHour() {
        return capacityPerHour;
    }

    public void setCapacityPerHour(int capacityPerHour) {
        this.capacityPerHour = capacityPerHour;
    }

    public SkiLiftType getLiftType() {
        return liftType;
    }

    public void setLiftType(SkiLiftType liftType) {
        this.liftType = liftType;
    }
}
