package com.seatallocator.backend.entity;

import com.seatallocator.backend.converter.StringSetConverter;

import javax.persistence.*;
import java.util.Date;
import java.util.List;
import java.util.Set;

@Entity
@Table(name="additional_quota")
public class AdditionalQuota {

    @Id
    @GeneratedValue(strategy= GenerationType.SEQUENCE)
    @Column(name="quota_id")
    private int QuotaID;

    @Column(name="manager_id")
    private int ManagerId;
//obtain list of seats with link to seats table

    @Column(name="seat_ids_list")
    @Convert(converter = StringSetConverter.class)
    private Set<String> SeatIds;

    @Column(name="date_time_stamp")
    private Date DateTimeStamp;

    @Column(name="negotiation_id")
    private int NegotiationID;

    public AdditionalQuota() {}

    public AdditionalQuota(int managerId, /*List<String> seatIds,*/ Date dateTimeStamp, int negotiationID) {
        ManagerId = managerId;
        //SeatIds = seatIds;
        DateTimeStamp = dateTimeStamp;
        NegotiationID = negotiationID;
    }

    public int getQuotaID() {
        return QuotaID;
    }

    public void setQuotaID(int quotaID) {
        QuotaID = quotaID;
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

    public int getNegotiationID() {
        return NegotiationID;
    }

    public void setNegotiationID(int negotiationID) {
        NegotiationID = negotiationID;
    }
}
