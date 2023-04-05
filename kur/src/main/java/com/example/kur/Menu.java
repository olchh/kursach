package com.example.kur;

public class Menu {
    String name, price, sostav;

    public Menu(String name, String price, String sostav){
        this.name = name;
        this.price = price;
        this.sostav = sostav;
    }
    public String getName(){
        return name;
    }
    public String getPrice(){
        return price;
    }
    public String getSostav(){
        return sostav;
    }

}
