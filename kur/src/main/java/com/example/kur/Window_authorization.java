package com.example.kur;

import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.io.IOException;

public class Window_authorization {
    @FXML Button vhod;
    @FXML TextField login;
    @FXML
    PasswordField password;
    @FXML Label error;
    private static final String LOGIN = "olch";
    private static final String PASSWORD = "frend";

    private static final String ERROR = "Ошибка! Попробуйте снова!";


    public void toAccount() throws IOException {


        String login1 = login.getText();
        String password1 = password.getText();




        if(login1.equals(LOGIN) && password1.equals(PASSWORD)){
            Stage stage = new Stage();
            FXMLLoader fxmlLoader = new FXMLLoader();
            Scene scene = new Scene(fxmlLoader.load(getClass().getResource("обновление.fxml")), 600, 400);
            stage.setTitle("курсовой проект!");
            stage.setScene(scene);
            stage.show();
        }
        else{
            error.setText(ERROR);

        }
    }
}
