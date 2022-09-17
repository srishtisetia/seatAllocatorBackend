package com.seatallocator.backend.entity;

import com.seatallocator.backend.converter.StringSetConverter;

import javax.persistence.*;
import java.util.Date;
import java.util.List;
import java.util.Set;

@Entity
@Table(name="negotiate")
public class Negotiate {

    @Id
    @GeneratedValue(strategy= GenerationType.SEQUENCE)
    @Column(name="negotiation_id")
    private int NegotiationID;

    @Column(name="from_employee_id")
    private int FromEmployeeID;

    @Column(name="to_employee_id")
    private int ToEmployeeID;

    //obtain list of seats with link to seats table
    @Column(name="seat_unique_id_list")
    @Convert(converter = StringSetConverter.class)
    private Set<String> SeatUniqueIDs;

    @Column(name="request_date_timestamp")
    private Date RequestDateTimeStamp;

    @Column(name="status")
    private String Status;

    @Column(name="action_date_timestamp")
    private Date ActionDateTimeStamp;

    public Negotiate() {}

    public Negotiate(int fromEmployeeID, int toEmployeeID, /*List<String> seatUniqueIDs,*/
                     Date requestDateTimeStamp, String status, Date actionDateTimeStamp) {
        FromEmployeeID = fromEmployeeID;
        ToEmployeeID = toEmployeeID;
        //SeatUniqueIDs = seatUniqueIDs;
        RequestDateTimeStamp = requestDateTimeStamp;
        Status = status;
        ActionDateTimeStamp = actionDateTimeStamp;
    }

    public int getNegotiationID() {
        return NegotiationID;
    }

    public void setNegotiationID(int negotiationID) {
        NegotiationID = negotiationID;
    }

    public int getFromEmployeeID() {
        return FromEmployeeID;
    }

    public void setFromEmployeeID(int fromEmployeeID) {
        FromEmployeeID = fromEmployeeID;
    }

    public int getToEmployeeID() {
        return ToEmployeeID;
    }

    public void setToEmployeeID(int toEmployeeID) {
        ToEmployeeID = toEmployeeID;
    }

    /*public List<String> getSeatUniqueIDs() {
        return SeatUniqueIDs;
    }

    public void setSeatUniqueIDs(List<String> seatUniqueIDs) {
        SeatUniqueIDs = seatUniqueIDs;
    }*/

    public Date getRequestDateTimeStamp() {
        return RequestDateTimeStamp;
    }

    public void setRequestDateTimeStamp(Date requestDateTimeStamp) {
        RequestDateTimeStamp = requestDateTimeStamp;
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String status) {
        Status = status;
    }

    public Date getActionDateTimeStamp() {
        return ActionDateTimeStamp;
    }

    public void setActionDateTimeStamp(Date actionDateTimeStamp) {
        ActionDateTimeStamp = actionDateTimeStamp;
    }
}
