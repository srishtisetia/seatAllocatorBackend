package com.seatallocator.backend.entity;

import javax.persistence.*;
import java.util.Date;

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

    @Column(name="allocated_to")
    private String AllocatedTo;

    @Column(name="amend_request_by")
    private String amendRequestBy;

    @Column(name="booking_status")
    private String BookingStatus;

    @Column(name = "booking_date")
    private Date bookingDate;

    public Seat() {}

    public Seat(String building, int floor, String wing, String seatNo, String allocatedTo,
                String amendRequestBy, String bookingStatus, Date bookingDate) {
        Building = building;
        Floor = floor;
        Wing = wing;
        SeatNo = seatNo;
        AllocatedTo = allocatedTo;
        this.amendRequestBy = amendRequestBy;
        BookingStatus = bookingStatus;
        this.bookingDate = bookingDate;
    }

    public Date getBookingDate() {
        return bookingDate;
    }

    public void setBookingDate(Date bookingDate) {
        this.bookingDate = bookingDate;
    }

    public String getAllocatedTo() {
        return AllocatedTo;
    }

    public void setAllocatedTo(String allocatedTo) {
        AllocatedTo = allocatedTo;
    }

    public String getAmendRequestBy() {
        return amendRequestBy;
    }

    public void setAmendRequestBy(String amendRequestBy) {
        this.amendRequestBy = amendRequestBy;
    }

    public String getBookingStatus() {
        return BookingStatus;
    }

    public void setBookingStatus(String bookingStatus) {
        BookingStatus = bookingStatus;
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
