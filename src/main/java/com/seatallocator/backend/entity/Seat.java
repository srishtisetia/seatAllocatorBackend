package com.seatallocator.backend.entity;

import javax.persistence.*;
@Entity
@Table(name="seat")
public class Seat {

    @Id
    @GeneratedValue(strategy= GenerationType.SEQUENCE)
    @Column(name="seat_unique_id")
    private int SeatUniqueID;

    @Column(name="building")
    private String Building;

    @Column(name="floor")
    private int Floor;

    @Column(name="wing")
    private String Wing;

    @Column(name="seat_no")
    private String SeatNo;

    public Seat() {}

    public Seat(String building, int floor, String wing, String seatNo) {
        Building = building;
        Floor = floor;
        Wing = wing;
        SeatNo = seatNo;
    }

    public int getSeatUniqueID() {
        return SeatUniqueID;
    }

    public void setSeatUniqueID(int seatUniqueID) {
        SeatUniqueID = seatUniqueID;
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

    public String getSeatNo() {
        return SeatNo;
    }

    public void setSeatNo(String seatNo) {
        SeatNo = seatNo;
    }
}
