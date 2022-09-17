package com.seatallocator.backend.entity;

import javax.persistence.*;

@Entity
@Table(name="office")
public class Office {

    @Id
    @GeneratedValue(strategy= GenerationType.SEQUENCE)
    @Column(name="building_id")
    private int BuildingID;

    @Column(name="building_name")
    private String BuildingName;

    @Column(name="floor")
    private int Floor;

    @Column(name="wing")
    private String Wing;

    @Column(name="no_of_seats")
    private int NoOfSeats;

    public Office() {}

    public Office(String buildingName, int floor, String wing, int noOfSeats) {
        BuildingName = buildingName;
        Floor = floor;
        Wing = wing;
        NoOfSeats = noOfSeats;
    }

    public int getBuildingId() {
        return BuildingID;
    }

    public void setBuildingId(int buildingId) {
        BuildingID = buildingId;
    }

    public String getBuildingName() {
        return BuildingName;
    }

    public void setBuildingName(String buildingName) {
        BuildingName = buildingName;
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

    public int getNoOfSeats() {
        return NoOfSeats;
    }

    public void setNoOfSeats(int noOfSeats) {
        NoOfSeats = noOfSeats;
    }
}
