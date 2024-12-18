/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hotel;

import java.sql.*;
import java.util.ArrayList;

/**
 *
 * @author eslamsemedo
 */
public class singleton {

    private static singleton instance;

    private static ArrayList<ArrayList<String>> guest = new ArrayList<>();
    private static ArrayList<ArrayList<String>> employee = new ArrayList<>();
    private static ArrayList<ArrayList<String>> room = new ArrayList<>();

    public static singleton getInstance() {
        if (instance == null) {
            instance = new singleton();
        }
        return instance;
    }

    public static singleton updateInstance() {
        instance = new singleton();
        return instance;
    }

    private singleton() {
        Connection conn = null;

        try {
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/hotel", "root", "");
            Statement stm = conn.createStatement();
            
            String query = "select * from guest";
            ResultSet rs = stm.executeQuery(query);

            ArrayList<String> newRow = new ArrayList<>();


            while (rs.next()) {
                newRow.clear();

                newRow.add(rs.getString("documentType"));
                newRow.add(rs.getString("number"));
                newRow.add(rs.getString("name"));
                newRow.add(rs.getString("gender"));
                newRow.add(rs.getString("country"));
                newRow.add(rs.getString("roomNumber"));
                newRow.add(rs.getString("status"));
                newRow.add(rs.getString("deposite"));
//                System.out.println(newRow);
                guest.add(newRow);
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
        
        try {
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/hotel", "root", "");
            Statement stm = conn.createStatement();
            
            String query = "select * from employee";
            ResultSet rs = stm.executeQuery(query);

            ArrayList<String> newRow = new ArrayList<>();


            while (rs.next()) {
                newRow.clear();

                newRow.add(rs.getString("name"));
                newRow.add(rs.getString("age"));
                newRow.add(rs.getString("gender"));
                newRow.add(rs.getString("department"));
                newRow.add(rs.getString("salary"));
                newRow.add(rs.getString("phone"));
                newRow.add(rs.getString("email"));
//                System.out.println(newRow);
                employee.add(newRow);
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
        
         try {
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/hotel", "root", "");
            Statement stm = conn.createStatement();
            
            String query = "select * from room";
            ResultSet rs = stm.executeQuery(query);

            ArrayList<String> newRow = new ArrayList<>();


            while (rs.next()) {
                newRow.clear();

                newRow.add(rs.getString("roomNum"));
                newRow.add(rs.getString("availabilty"));
                newRow.add(rs.getString("status"));
                newRow.add(rs.getString("price"));
                newRow.add(rs.getString("bedType"));
//                System.out.println(newRow);
                room.add(newRow);
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
