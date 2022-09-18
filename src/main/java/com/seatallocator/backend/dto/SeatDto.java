package com.seatallocator.backend.dto;

public class SeatDto {
    private String seatNo;
    private String status;
    private String allocatedTo;
    private String amendRequestBy;

    public SeatDto() {}
    public SeatDto(String seatNo, String status, String allocatedTo, String amendRequestBy) {
        this.seatNo = seatNo;
        this.status = status;
        this.allocatedTo = allocatedTo;
        this.amendRequestBy = amendRequestBy;
    }

    public String getSeatNo() {
        return seatNo;
    }

    public void setSeatNo(String seatNo) {
        this.seatNo = seatNo;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getAllocatedTo() {
        return allocatedTo;
    }

    public void setAllocatedTo(String allocatedTo) {
        this.allocatedTo = allocatedTo;
    }

    public String getAmendRequestBy() {
        return amendRequestBy;
    }

    public void setAmendRequestBy(String amendRequestBy) {
        this.amendRequestBy = amendRequestBy;
    }
}
