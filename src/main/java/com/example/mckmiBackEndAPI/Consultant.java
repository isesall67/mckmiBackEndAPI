package com.example.mckmiBackEndAPI;

public class Consultant {

    private int consultantId;
    private String ConsultantName;
    private String ConsultantStatus;
    private String ConsultantRole;
    private int ClientId;

    public Consultant(int consultantId, String consultantName, String consultantStatus, String consultantRole, int clientId) {
        this.consultantId = consultantId;
        this.ConsultantName = consultantName;
        this.ConsultantStatus = consultantStatus;
        this.ConsultantRole = consultantRole;
        this.ClientId = clientId;
    }

    public int getConsultantId() {
        return consultantId;
    }

    public void setConsultantId(int consultantId) {
        this.consultantId = consultantId;
    }

    public String getConsultantName() {
        return ConsultantName;
    }

    public void setConsultantName(String consultantName) {
        this.ConsultantName = consultantName;
    }

    public String getConsultantStatus() {
        return ConsultantStatus;
    }

    public void setConsultantStatus(String consultantStatus) {
        this.ConsultantStatus = consultantStatus;
    }

    public String getConsultantRole() {
        return ConsultantRole;
    }

    public void setConsultantRole(String consultantRole) {
        this.ConsultantRole = consultantRole;
    }

    public int getClientId() {
        return ClientId;
    }

    public void setClientId(int clientId) {
        this.ClientId = clientId;
    }





}
