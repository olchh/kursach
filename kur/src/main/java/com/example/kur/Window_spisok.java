package com.example.kur;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.sql.Connection;
import java.sql.ResultSet;


public class Window_spisok {

    @FXML Button f;
    @FXML Button p;
    @FXML Button q;
    @FXML Button h;
    @FXML Button k;
    @FXML Button y;
    @FXML Button m;
    @FXML Button o;

    @FXML private Button got;

    @FXML private Button dob;

    @FXML  Button nazad;

    @FXML private Label price;

    static int allprice = 0;

    public void F() throws Exception{
        Stage stageCLose = (Stage) f.getScene().getWindow();
        stageCLose.close();
        int id = 1;
        String name1 = "";
        String content1 = "";
        String price1 = "";
        Connection connection = Connecter.Connect();

        String sqlName = String.format("select * from menu.menu where id='%d'", id);
        ResultSet rsName = connection.createStatement().executeQuery(sqlName);
        while (rsName.next()){
            name1 = rsName.getString(2);
        }

        String sqlContent = String.format("select * from menu.menu where Name='%s'", name1);
        ResultSet rs  = connection.createStatement().executeQuery(sqlContent);
        while (rs.next()){
            content1 += rs.getString(4);
            price1 += rs.getString(3);
        }
        Stage stage = new Stage();
        FXMLLoader fxmlLoader = new FXMLLoader();
        Scene scene = new Scene(fxmlLoader.load(this.getClass().getResource("состав.fxml")), 600, 400);
        Label name = (Label) scene.lookup("#name");
        Label price = (Label) scene.lookup("#price");
        Label sost = (Label) scene.lookup("#sost");

        name.setText(name1);
        price.setText(price1);
        sost.setText(content1.replaceAll("-", "\n"));
        stage.setTitle("курсовой проект!");
        stage.setScene(scene);
        stage.show();
    }

    public void P() throws Exception{
        Stage stageCLose = (Stage) p.getScene().getWindow();
        stageCLose.close();
        int id = 2;
        String name1 = "";
        String content1 = "";
        String price1 = "";
        Connection connection = Connecter.Connect();

        String sqlName = String.format("select * from menu.menu where id='%d'", id);
        ResultSet rsName = connection.createStatement().executeQuery(sqlName);
        while (rsName.next()){
            name1 = rsName.getString(2);
        }

        String sqlContent = String.format("select * from menu.menu where Name='%s'", name1);
        ResultSet rs  = connection.createStatement().executeQuery(sqlContent);
        while (rs.next()){
            content1 += rs.getString(4);
            price1 += rs.getString(3);
        }
        Stage stage = new Stage();
        FXMLLoader fxmlLoader = new FXMLLoader();
        Scene scene = new Scene(fxmlLoader.load(getClass().getResource("состав.fxml")), 600, 400);
        Label name = (Label) scene.lookup("#name");
        Label price = (Label) scene.lookup("#price");
        Label sost = (Label) scene.lookup("#sost");

        name.setText(name1);
        price.setText(price1);
        sost.setText(content1.replaceAll("-", "\n"));
        stage.setTitle("курсовой проект!");
        stage.setScene(scene);
        stage.show();

    }
    public void Q() throws Exception{
        Stage stageCLose = (Stage) q.getScene().getWindow();
        stageCLose.close();
        int id = 3;
        String name1 = "";
        String content1 = "";
        String price1 = "";
        Connection connection = Connecter.Connect();

        String sqlName = String.format("select * from menu.menu where id='%d'", id);
        ResultSet rsName = connection.createStatement().executeQuery(sqlName);
        while (rsName.next()){
            name1 = rsName.getString(2);
        }
        String sqlContent = String.format("select * from menu.menu where Name='%s'", name1);
        ResultSet rs  = connection.createStatement().executeQuery(sqlContent);
        while (rs.next()){
            content1 += rs.getString(4);
            price1 += rs.getString(3);
        }
        Stage stage = new Stage();
        FXMLLoader fxmlLoader = new FXMLLoader();
        Scene scene = new Scene(fxmlLoader.load(getClass().getResource("состав.fxml")), 600, 400);
        Label name = (Label) scene.lookup("#name");
        Label price = (Label) scene.lookup("#price");
        Label sost = (Label) scene.lookup("#sost");

        name.setText(name1);
        price.setText(price1);
        sost.setText(content1.replaceAll("-", "\n"));
        stage.setTitle("курсовой проект!");
        stage.setScene(scene);
        stage.show();

    }
    public void H() throws Exception{
        Stage stageCLose = (Stage) h.getScene().getWindow();
        stageCLose.close();
        int id = 4;
        String name1 = "";
        String content1 = "";
        String price1 = "";
        Connection connection = Connecter.Connect();

        String sqlName = String.format("select * from menu.menu where id='%d'", id);
        ResultSet rsName = connection.createStatement().executeQuery(sqlName);
        while (rsName.next()){
            name1 = rsName.getString(2);
        }
        String sqlContent = String.format("select * from menu.menu where Name='%s'", name1);
        ResultSet rs  = connection.createStatement().executeQuery(sqlContent);
        while (rs.next()){
            content1 += rs.getString(4);
            price1 += rs.getString(3);
        }
        Stage stage = new Stage();
        FXMLLoader fxmlLoader = new FXMLLoader();
        Scene scene = new Scene(fxmlLoader.load(getClass().getResource("состав.fxml")), 600, 400);
        Label name = (Label) scene.lookup("#name");
        Label price = (Label) scene.lookup("#price");
        Label sost = (Label) scene.lookup("#sost");

        name.setText(name1);
        price.setText(price1);
        sost.setText(content1.replaceAll("-", "\n"));
        stage.setTitle("курсовой проект!");
        stage.setScene(scene);
        stage.show();

    }
    public void K() throws Exception{
        Stage stageCLose = (Stage) k.getScene().getWindow();
        stageCLose.close();
        int id = 5;
        String name1 = "";
        String content1 = "";
        String price1 = "";
        Connection connection = Connecter.Connect();

        String sqlName = String.format("select * from menu.menu where id='%d'", id);
        ResultSet rsName = connection.createStatement().executeQuery(sqlName);
        while (rsName.next()){
            name1 = rsName.getString(2);
        }
        String sqlContent = String.format("select * from menu.menu where Name='%s'", name1);
        ResultSet rs  = connection.createStatement().executeQuery(sqlContent);
        while (rs.next()){
            content1 += rs.getString(4);
            price1 += rs.getString(3);
        }
        Stage stage = new Stage();
        FXMLLoader fxmlLoader = new FXMLLoader();
        Scene scene = new Scene(fxmlLoader.load(getClass().getResource("состав.fxml")), 600, 400);
        Label name = (Label) scene.lookup("#name");
        Label price = (Label) scene.lookup("#price");
        Label sost = (Label) scene.lookup("#sost");

        name.setText(name1);
        price.setText(price1);
        sost.setText(content1.replaceAll("-", "\n"));
        stage.setTitle("курсовой проект!");
        stage.setScene(scene);
        stage.show();

    }
    public void Y() throws Exception{
        Stage stageCLose = (Stage) y.getScene().getWindow();
        stageCLose.close();
        int id = 6;
        String name1 = "";
        String content1 = "";
        String price1 = "";
        Connection connection = Connecter.Connect();

        String sqlName = String.format("select * from menu.menu where id='%d'", id);
        ResultSet rsName = connection.createStatement().executeQuery(sqlName);
        while (rsName.next()){
            name1 = rsName.getString(2);
        }
        String sqlContent = String.format("select * from menu.menu where Name='%s'", name1);
        ResultSet rs  = connection.createStatement().executeQuery(sqlContent);
        while (rs.next()){
            content1 += rs.getString(4);
            price1 += rs.getString(3);
        }
        Stage stage = new Stage();
        FXMLLoader fxmlLoader = new FXMLLoader();
        Scene scene = new Scene(fxmlLoader.load(getClass().getResource("состав.fxml")), 600, 400);
        Label name = (Label) scene.lookup("#name");
        Label price = (Label) scene.lookup("#price");
        Label sost = (Label) scene.lookup("#sost");

        name.setText(name1);
        price.setText(price1);
        sost.setText(content1.replaceAll("-", "\n"));
        stage.setTitle("курсовой проект!");
        stage.setScene(scene);
        stage.show();

    }
    public void M() throws Exception{
        Stage stageCLose = (Stage) m.getScene().getWindow();
        stageCLose.close();
        int id = 7;
        String name1 = "";
        String content1 = "";
        String price1 = "";
        Connection connection = Connecter.Connect();

        String sqlName = String.format("select * from menu.menu where id='%d'", id);
        ResultSet rsName = connection.createStatement().executeQuery(sqlName);
        while (rsName.next()){
            name1 = rsName.getString(2);
        }
        String sqlContent = String.format("select * from menu.menu where Name='%s'", name1);
        ResultSet rs  = connection.createStatement().executeQuery(sqlContent);
        while (rs.next()){
            content1 += rs.getString(4);
            price1 += rs.getString(3);
        }
        Stage stage = new Stage();
        FXMLLoader fxmlLoader = new FXMLLoader();
        Scene scene = new Scene(fxmlLoader.load(getClass().getResource("состав.fxml")), 600, 400);
        Label name = (Label) scene.lookup("#name");
        Label price = (Label) scene.lookup("#price");
        Label sost = (Label) scene.lookup("#sost");

        name.setText(name1);
        price.setText(price1);
        sost.setText(content1.replaceAll("-", "\n"));
        stage.setTitle("курсовой проект!");
        stage.setScene(scene);
        stage.show();

    }
    public void O() throws Exception{
        Stage stageCLose = (Stage) o.getScene().getWindow();
        stageCLose.close();
        int id = 8;
        String name1 = "";
        String content1 = "";
        String price1 = "";
        Connection connection = Connecter.Connect();

        String sqlName = String.format("select * from menu.menu where id='%d'", id);
        ResultSet rsName = connection.createStatement().executeQuery(sqlName);
        while (rsName.next()){
            name1 = rsName.getString(2);
        }
        String sqlContent = String.format("select * from menu.menu where Name='%s'", name1);
        ResultSet rs  = connection.createStatement().executeQuery(sqlContent);
        while (rs.next()){
            content1 += rs.getString(4);
            price1 += rs.getString(3);
        }
        Stage stage = new Stage();
        FXMLLoader fxmlLoader = new FXMLLoader();
        Scene scene = new Scene(fxmlLoader.load(getClass().getResource("состав.fxml")), 600, 400);
        Label name = (Label) scene.lookup("#name");
        Label price = (Label) scene.lookup("#price");
        Label sost = (Label) scene.lookup("#sost");

        name.setText(name1);
        price.setText(price1);
        sost.setText(content1.replaceAll("-", "\n"));
        stage.setTitle("курсовой проект!");
        stage.setScene(scene);
        stage.show();

    }
    public void Nazad() throws Exception{
        Stage stageCLose = (Stage) nazad.getScene().getWindow();
        stageCLose.close();
        Stage stage = new Stage();
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("список.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 600, 400);
        stage.setTitle("курсовой проект!");
        stage.setScene(scene);
        stage.show();
    }
    public void Dob() {
        allprice += DodPrice(Integer.parseInt(price.getText()));
    }
    public int DodPrice(int p){
        int result = p;
        return result;
    }
    public void Got()throws Exception {
        Stage stageCLose = (Stage) got.getScene().getWindow();
        stageCLose.close();

        Stage stage = new Stage();
        FXMLLoader fxmlLoader = new FXMLLoader();
        Scene scene = new Scene(fxmlLoader.load(getClass().getResource("сумма.fxml")), 600, 400);
        stage.setTitle("курсовой проект!");
        Label label = (Label) scene.lookup("#sum");
        label.setText(String.valueOf(allprice));
        stage.setScene(scene);
        stage.show();

    }

    public void Exit(ActionEvent actionEvent) {
        System.exit(0);
    }
}
