package com.seatallocator.backend.entity;

import javax.persistence.*;

@Entity
@Table(name="wing")
public class Wing {

    @Id
    @GeneratedValue(strategy= GenerationType.SEQUENCE)
    @Column(name="wing_unique_id")
    private int WingUniqueID;

    @Column(name="building")
    private String Building;

    @Column(name="floor")
    private int Floor;

    @Column(name="wing")
    private String Wing;

    @Column(name="wing_capacity")
    private int WingCapacity;

    public Wing() {}

    public Wing(String building, int floor, String wing, int wingCapacity) {
        Building = building;
        Floor = floor;
        Wing = wing;
        WingCapacity = wingCapacity;
    }

    public int getWingUniqueID() {
        return WingUniqueID;
    }

    public void setWingUniqueID(int wingUniqueID) {
        WingUniqueID = wingUniqueID;
    }

    public String getBuilding() {
        return Building;
    }

    public void setBuilding(String building) {
        Building = building;
    }

    public int getFloor() {
        return Floor;
    }

    public void setFloor(int floor) {
        Floor = floor;
    }

    public String getWing() {
        return Wing;
    }

    public void setWing(String wing) {
        Wing = wing;
    }

    public int getWingCapacity() {
        return WingCapacity;
    }

    public void setWingCapacity(int wingCapacity) {
        WingCapacity = wingCapacity;
    }
}
