package com.seatallocator.backend.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="allocation")
public class Allocation {

    @Id
    @GeneratedValue(strategy= GenerationType.SEQUENCE)
    @Column(name="allocation_id")
    private int AllocationID;

    @Column(name="manager_id")
    private int ManagerID;

    @Column(name="seat_unique_id")
    private int seatUniqueID;

    @Column(name="allocation_date_timestamp")
    private Date AllocationDateTimeStamp;

    @Column(name="seat_status")
    private String SeatStatus;

    public Allocation() {}

    public Allocation(int managerID, int seatUniqueID, Date allocationDateTimeStamp,
                      String seatStatus) {
        ManagerID = managerID;
        this.seatUniqueID = seatUniqueID;
        AllocationDateTimeStamp = allocationDateTimeStamp;
        SeatStatus = seatStatus;
    }

    public int getAllocationID() {
        return AllocationID;
    }

    public void setAllocationID(int allocationID) {
        AllocationID = allocationID;
    }

    public int getManagerId() {
        return ManagerID;
    }

    public void setManagerId(int managerId) {
        ManagerID = managerId;
    }

    public int getSeatUniqueID() {
        return seatUniqueID;
    }

    public void setSeatUniqueID(int seatUniqueID) {
        this.seatUniqueID = seatUniqueID;
    }

    public Date getAllocationDateTimeStamp() {
        return AllocationDateTimeStamp;
    }

    public void setAllocationDateTimeStamp(Date allocationDateTimeStamp) {
        AllocationDateTimeStamp = allocationDateTimeStamp;
    }

    public String getSeatStatus() {
        return SeatStatus;
    }

    public void setSeatStatus(String seatStatus) {
        SeatStatus = seatStatus;
    }
}
