package com.example.kur;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ResourceBundle;

public class Window_obnovlenie implements Initializable {
    @FXML TableView table;
    @FXML TableColumn name;
    @FXML TableColumn price;
    @FXML TableColumn sostav;
    @FXML TextField n;
    @FXML TextField p;
    @FXML TextField s;

    ObservableList<Menu> list = FXCollections.observableArrayList();

    Connection connection; //подключение
    int id;
    String text;

    public void Ob() throws Exception {
        try {
            connection = Connecter.Connect();;
            String name = n.getText();
            String price = p.getText();
            String sostav = s.getText();

            String sql = String.format("update menu.menu set name= '%s',price= '%s', sostav= '%s' where name= '%s'", name, price, sostav, text);

            PreparedStatement statement = connection.prepareStatement(sql);
            statement.execute();
            toDisplay();
        }
catch (Exception exception){
            System.out.println(exception);
        }
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {//вывод на экран
        try{
            toDisplay();
        }
        catch (Exception ex){
            System.out.println(ex);
        }
    }

    public void toDisplay() throws Exception{ //вывести на экран данные из базы данных
        table.getItems().clear();
        connection = Connecter.Connect();
        ResultSet rs = connection.createStatement().executeQuery("select * from menu.menu");

        while (rs.next()){
            list.add(new Menu(rs.getString(2), rs.getString(3), rs.getString(4)));
        }

            name.setCellValueFactory(new PropertyValueFactory<Menu, String>("name"));
            price.setCellValueFactory(new PropertyValueFactory<Menu, String>("price"));
            sostav.setCellValueFactory(new PropertyValueFactory<Menu, String>("sostav"));


        table.setItems(list);
    }
    public void getSelected() { //фиксирование лэйблов
        int index = table.getSelectionModel().getSelectedIndex();
            if (index < -1) {
                return;
            }
            n.setText(name.getCellData(index).toString());
            p.setText(price.getCellData(index).toString());
            s.setText(sostav.getCellData(index).toString());

            text = name.getCellData(index).toString();
    }

    public void Exit() {
        System.exit(0);
    }
}
