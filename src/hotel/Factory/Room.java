/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hotel.Factory;

import Proxy.database;
import Proxy.proxy;
import java.sql.*;

/**
 *
 * @author eslamsemedo
 */
public abstract class Room {
    private final database connect = new proxy();
    
    private int roomNum;
    private String availabilty;
    private String status;
    private String price;
    private String bedType;
    
    public int getRoomNum(){
        return roomNum;
    }
    public void setRoomNum(int n){
        this.roomNum = n;
    }
    public String getavailabilty(){
        return availabilty;
    }
    public void setavailabilty(String n){
        this.availabilty = n;
    }
    public String getstatus(){
        return status;
    }
    public void setstatus(String n){
        this.status = n;
    }
    public String getprice(){
        return price;
    }
    public void setprice(String n){
        this.price = n;
    }
    public String getbedType(){
        return bedType;
    }
    public void setbedType(String n){
        this.bedType = n;
    }
    
    
    public void build(){
        //insert to database
//        Connection conn = null;

        try {
            Statement stm = connect.connectBy("eslam");
            
            String query = String.format("INSERT INTO `room` (`roomNum`, `availabilty`, `status`, `price`, `bedType`) VALUES ('%d', '%s', '%s', '%s', '%s');", getRoomNum(), getavailabilty(), getstatus(), getprice(), getbedType());
//            ResultSet rs = stm.executeQuery(query);
            
            int affectedrow = stm.executeUpdate(query);
            
            if (affectedrow > 0) {
                System.out.println("A new user was inserted successfully!");
            }

        } catch (SQLException e) {
            System.out.println(e);
        }
    }
    
    
    
    
}
