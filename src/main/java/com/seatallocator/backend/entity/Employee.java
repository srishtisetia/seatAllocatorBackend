package com.seatallocator.backend.entity;

import javax.persistence.*;

@Entity
@Table(name="employee")
public class Employee {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="employee_id")
    private int QuotEmployeeID;

    @Column(name="oe_code")
    private String OECode;

    @Column(name="supervisor_id")
    private int SupervisorID;

    @Column(name="supervisor_oe")
    private String SupervisorOE;

    public Employee() {}

    public Employee(String OECode, int supervisorID, String supervisorOE) {
        this.OECode = OECode;
        SupervisorID = supervisorID;
        SupervisorOE = supervisorOE;
    }

    public int getQuotEmployeeID() {
        return QuotEmployeeID;
    }

    public void setQuotEmployeeID(int quotEmployeeID) {
        QuotEmployeeID = quotEmployeeID;
    }

    public String getOECode() {
        return OECode;
    }

    public void setOECode(String OECode) {
        this.OECode = OECode;
    }

    public int getSupervisorID() {
        return SupervisorID;
    }

    public void setSupervisorID(int supervisorID) {
        SupervisorID = supervisorID;
    }

    public String getSupervisorOE() {
        return SupervisorOE;
    }

    public void setSupervisorOE(String supervisorOE) {
        SupervisorOE = supervisorOE;
    }
}
