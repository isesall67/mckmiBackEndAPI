package com.example.mckmiBackEndAPI;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class ConsultantResponse {

    private ArrayList<Consultant> Consultants;
    public ArrayList<Consultant> getConsultants() {
        return Consultants;
    }

    public void setConsultants(List<Map<String, Object>> result) {

        ArrayList<Consultant> consultants = new ArrayList<>();

        for (Map<String, Object> stringObjectMap : result) {
            consultants.add(new Consultant(Integer.parseInt(stringObjectMap.get("ConsultantID").toString()),
                    stringObjectMap.get("ConsultantName").toString(),
                    stringObjectMap.get("ConsultantStatus").toString(),
                    stringObjectMap.get("ConsultantRole").toString(),
                    Integer.parseInt(stringObjectMap.get("ClientID").toString()) ));
        }

        Consultants = consultants;
    }




    public void getConsultantData(String consultantId){

        String sql =    "SELECT ConsultantID " +
                ",ConsultantName " +
                ",ConsultantStatus " +
                ",ConsultantRole " +
                ",ClientID " +
                "FROM Consultant " +
                "WHERE ConsultantID = " + consultantId;

        List<Map<String, Object>> result = new SQLStatementRunner().runQueryStmt(sql);
        setConsultants(result);

    }



    public void getAllConsultantData(){

        String sql = "SELECT ConsultantID " +
                ",ConsultantName " +
                ",ConsultantStatus " +
                ",ConsultantRole " +
                ",ClientID " +
                "FROM Consultant ";

        List<Map<String, Object>> result = new SQLStatementRunner().runQueryStmt(sql);
        setConsultants(result);
    }
}
