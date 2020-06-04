package com.example.mckmiBackEndAPI;

import org.apache.commons.dbutils.handlers.MapListHandler;

import java.sql.*;
import java.util.List;
import java.util.Map;

public class SQLStatementRunner {
    private final String jdbcDriver = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
    private final String connectionURL = "jdbc:sqlserver://DESKTOP-EKDQISM;user=MCKMIBackendUser;password=Password1;";

    public SQLStatementRunner(){


    }

    private Connection getConnection() throws SQLException, ClassNotFoundException {

        Class.forName(jdbcDriver);
        return DriverManager.getConnection(connectionURL);

    }

    public List<Map<String, Object>> runStmt(String sql){
        Statement stmt = null;
        ResultSet rs = null;
        List<Map<String, Object>> result = null;
        try {
            Connection conn = getConnection();
            stmt = conn.createStatement();
            rs = stmt.executeQuery(sql);
            result = new MapListHandler().handle(rs);
            rs.close();
            stmt.close();
            conn.close();
        } catch (SQLException  | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return result;
    }

}
