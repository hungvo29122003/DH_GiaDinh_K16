package com.nhom4.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class DAOMySQL {
    private Connection connection = null;
    private String ipAddress;
    private int port;
    private String database;
    private String username;
    private String password;

    private void prepareDriver() throws Exception {
        Class.forName("com.mysql.cj.jdbc.Driver");
    }

    public DAOMySQL(String ipAddress, int port, String database, String username, String password) throws Exception {
        prepareDriver();
        this.ipAddress = ipAddress;
        this.port = port;
        this.database = database;
        this.username = username;
        this.password = password;
    }

    protected PreparedStatement getPrepareStatement(String sql) {
        try {
            if (this.connection == null) {
                return null;
            }

            return this.connection.prepareStatement(sql);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return null;
    }

    protected Statement createStatement() {
        try {
            if (this.connection == null) {
                return null;
            }

            return this.connection.createStatement();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return null;
    }

    protected void connect() {
        if (this.connection == null) {
            try {
                this.connection = DriverManager.getConnection("jdbc:mysql://" + ipAddress + ":" + port + "/" + database + "?allowPublicKeyRetrieval=true&useSSL=false", username, password);
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
        ;
    }

    protected void close() {
        if (this.connection != null) {
            try {
                this.connection.close();
            } catch (Exception ex) {
                ex.printStackTrace();
            }
            this.connection = null;
        }
    }

    public Boolean isExist(int maHD) {
        Boolean result = false;

        connect();

        String sql = "select maHD from invoice where (maHD = ?)";

        try {
            PreparedStatement preparedStatement = this.connection.prepareStatement(sql);
            preparedStatement.setInt(1, maHD);

            ResultSet resultSet = preparedStatement.executeQuery();
            if (resultSet.next()) {
                result = true;
            }

        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }

        close();

        return result;
    }
}
