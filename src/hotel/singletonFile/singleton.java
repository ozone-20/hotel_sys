/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hotel.singletonFile;

import Proxy.database;
import Proxy.proxy;
import hotel.*;
import java.sql.*;
import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author eslamsemedo
 */
public class singleton {

    private static singleton instance;

    private static ArrayList<ArrayList<String>> guest = new ArrayList<>();
    private static ArrayList<ArrayList<String>> employee = new ArrayList<>();
    private static ArrayList<ArrayList<String>> room = new ArrayList<>();
    private final database connect = new proxy();

    public static singleton getInstance() {
        if (instance == null) {
            instance = new singleton();
        }
        return instance;
    }

//    public static singleton updateInstance() {
//        instance = new singleton();
//        return instance;
//    }
    private singleton() {
//        Connection conn = null;

        try {
            Statement stm = connect.connectBy("reyad");

            String query = "select * from guest";
            ResultSet rs = stm.executeQuery(query);

            while (rs.next()) {
                
                guest.add(new ArrayList<>(Arrays.asList(
                        rs.getString("documentType"), 
                        rs.getString("number"), 
                        rs.getString("name"),
                        rs.getString("gender"),
                        rs.getString("country"),
                        rs.getString("roomNumber"),
                        rs.getString("status"),
                        rs.getString("deposite")
                        )));
            }
        } catch (SQLException e) {
            System.out.println(e);
        }

        try {
            Statement stm = connect.connectBy("eslam");

            String query = "select * from employee";
            ResultSet rs = stm.executeQuery(query);


            while (rs.next()) {                            
                employee.add(new ArrayList<>(Arrays.asList(
                        rs.getString("name"), 
                        rs.getString("age"), 
                        rs.getString("gender"),
                        rs.getString("department"),
                        rs.getString("salary"),
                        rs.getString("phone"),
                        rs.getString("email")
                        )));
            }
        } catch (SQLException e) {
            System.out.println(e);
        }

        try {
            Statement stm = connect.connectBy("reyad");

            String query = "select * from room";
            ResultSet rs = stm.executeQuery(query);

            while (rs.next()) {               
                room.add(new ArrayList<>(Arrays.asList(
                        rs.getString("roomNum"), 
                        rs.getString("availabilty"), 
                        rs.getString("status"),
                        rs.getString("price"),
                        rs.getString("bedType")
                        )));
            }
        } catch (SQLException e) {
            System.out.println(e);
        }

    }

    public static ArrayList<ArrayList<String>> getGuest() {
        return guest;
    }

    public static ArrayList<ArrayList<String>> getEmployee() {
        return employee;
    }

    public static ArrayList<ArrayList<String>> getRoom() {
        return room;
    }

}
