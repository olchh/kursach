package com.example.kur;
import java.sql.Connection;
import java.sql.DriverManager;

public class Connecter {
    public static Connection Connect() throws Exception{
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/kursach", "root", "difrend");
        return con;
    }
}
