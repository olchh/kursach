package com.example.kur;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;


public class Window_vhod {
    @FXML Button pol;
    @FXML Button men;
    public void Men()throws Exception {
        Stage stageCLose = (Stage) men.getScene().getWindow();
        stageCLose.close();

        Stage stage = new Stage();
        FXMLLoader fxmlLoader = new FXMLLoader();
        Scene scene = new Scene(fxmlLoader.load(getClass().getResource("авторизация.fxml")), 600, 400);
        stage.setTitle("курсовой проект!");
        stage.setScene(scene);
        stage.show();
    }

    public void Pol()throws Exception {
        Stage stageCLose = (Stage) pol.getScene().getWindow();
        stageCLose.close();
        Stage stage = new Stage();
        FXMLLoader fxmlLoader = new FXMLLoader();
        Scene scene = new Scene(fxmlLoader.load(getClass().getResource("приветствие.fxml")), 600, 400);
        stage.setTitle("курсовой проект!");
        stage.setScene(scene);
        stage.show();
    }
}
