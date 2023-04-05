package com.example.kur;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.sql.Connection;
import java.sql.ResultSet;

public class Window_hello {
    @FXML Button menuu;

Connection connection;
    public void Menu() throws Exception{
        Stage stageCLose = (Stage) menuu.getScene().getWindow();
        stageCLose.close();
        Stage stage = new Stage();
        String name = "";
        FXMLLoader fxmlLoader = new FXMLLoader(this.getClass().getResource("список.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 600, 400);
        stage.setTitle("курсовой проект!");

        connection = Connecter.Connect();
        for (int i = 1; i < 9; i++) {
            String sql = String.format("select * from menu.menu where id='%s'", i);
            String label = String.format("#label%s", i);
            ResultSet rs = connection.createStatement().executeQuery(sql);
            while (rs.next()) {
                name = rs.getString(2);
            }
            Label rsLabel = (Label) scene.lookup(label);
            rsLabel.setText(name);
            stage.setScene(scene);
            stage.show();
        }
    }
}
