package com.seatallocator.backend.dto;

import com.seatallocator.backend.entity.Seat;

import java.util.Date;
import java.util.List;

public class SeatsInfoDto {
    private Date date;
    private String office;
    private String requestedTeam;
    private int floor;
    private String wing;
    private int wingCapacity;
    private int availableSeats;

    private List<SeatDto> seats;

    public List<SeatDto> getSeats() {
        return seats;
    }

    public void setSeats(List<SeatDto> seats) {
        this.seats = seats;
    }

    public SeatsInfoDto(){}

    public SeatsInfoDto(Date date, String office, String requestedTeam, int floor,
                        String wing, int wingCapacity, int availableSeats, List<SeatDto> seats) {
        this.date = date;
        this.office = office;
        this.requestedTeam = requestedTeam;
        this.floor = floor;
        this.wing = wing;
        this.wingCapacity = wingCapacity;
        this.availableSeats = availableSeats;
        this.seats = seats;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getOffice() {
        return office;
    }

    public void setOffice(String office) {
        this.office = office;
    }

    public String getRequestedTeam() {
        return requestedTeam;
    }

    public void setRequestedTeam(String requestedTeam) {
        this.requestedTeam = requestedTeam;
    }

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    public String getWing() {
        return wing;
    }

    public void setWing(String wing) {
        this.wing = wing;
    }

    public int getWingCapacity() {
        return wingCapacity;
    }

    public void setWingCapacity(int wingCapacity) {
        this.wingCapacity = wingCapacity;
    }

    public int getAvailableSeats() {
        return availableSeats;
    }

    public void setAvailableSeats(int availableSeats) {
        this.availableSeats = availableSeats;
    }
}
