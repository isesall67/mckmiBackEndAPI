package com.example.mckmiBackEndAPI;

import org.apache.commons.dbutils.handlers.MapListHandler;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Client {

    private int clientId;
    private String clientName;

    public void setClientId(int clientId) {
        this.clientId = clientId;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public int getClientId() {
        return clientId;
    }

    public String getClientName() {
        return clientName;
    }

    public Client(){
    }

    public Client(int clientId, String clientName){
        setClientId(clientId);
        setClientName(clientName);
    }
}





