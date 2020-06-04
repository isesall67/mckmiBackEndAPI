package com.example.mckmiBackEndAPI;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;


public class Response {

    private ArrayList<Client> Clients;

    public ArrayList<Client> getClients() {
        return Clients;
    }

    public void setClients(ArrayList<Client> clients) {
        Clients = clients;
    }



    public void getClientData(String clientId){
        System.out.println("calling getClientData(String clientId)");
        String sql = "SELECT ClientID, ClientName " +
                "FROM Client " +
                "WHERE ClientID = " + clientId;

        List<Map<String, Object>> result = new SQLStatementRunner().runStmt(sql);
        ArrayList<Client> clients = new ArrayList<>();

        for (Map<String, Object> stringObjectMap : result) {
            clients.add(new Client(Integer.parseInt(stringObjectMap.get("ClientID").toString()),
                    stringObjectMap.get("ClientName").toString()));
            System.out.println( stringObjectMap.get("ClientID").toString() + "  " +
                    stringObjectMap.get("ClientName").toString());
        }
        setClients(clients);
    }


    public void getAllClientData(){
        System.out.println("Calling getClientData()");
        String sql = "SELECT ClientID, ClientName " +
                "FROM Client ";

        List<Map<String, Object>> result = new SQLStatementRunner().runStmt(sql);
        ArrayList<Client> clients = new ArrayList<>();

        for (int i = 0; i<result.size();i++) {
            clients.add(new Client(Integer.parseInt(result.get(i).get("ClientID").toString()),
                    result.get(i).get("ClientName").toString()));
            System.out.println( result.get(i).get("ClientID").toString() + "  " +
                    result.get(i).get("ClientName").toString());
        }
        setClients(clients);
    }


}
