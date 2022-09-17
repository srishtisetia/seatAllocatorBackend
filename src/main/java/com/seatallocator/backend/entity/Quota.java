package com.seatallocator.backend.entity;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name="quota")
public class Quota {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="quota_id")
    private int QuotaID;

    @Column(name="manager_id")
    private int ManagerId;

//obtain list of seats with link to seats table
    /*
    @Column(name="seat_ids_list")
    private List<String> SeatIds;*/

    @Column(name="date_time_stamp")
    private Date DateTimeStamp;

    public Quota() {}

    public Quota(int managerId, /*List<String> seatIds,*/ Date dateTimeStamp) {
        ManagerId = managerId;
       // SeatIds = seatIds;
        DateTimeStamp = dateTimeStamp;
    }

    public int getManagerId() {
        return ManagerId;
    }

    public void setManagerId(int managerId) {
        ManagerId = managerId;
    }

    /*public List<String> getSeatIds() {
        return SeatIds;
    }

    public void setSeatIds(List<String> seatIds) {
        SeatIds = seatIds;
    }*/

    public Date getDateTimeStamp() {
        return DateTimeStamp;
    }

    public void setDateTimeStamp(Date dateTimeStamp) {
        DateTimeStamp = dateTimeStamp;
    }
}
