/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Proxy;

import java.sql.*;
import hotel.Hotel;
import hotel.Hotel;

/**
 *
 * @author eslamsemedo
 */
public class connection implements database {
    public Statement connectBy(String Name){
        Statement stm = null;
        try{
//            Hotel.conn = null;
            Hotel.conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/hotel", "root", "");
            stm = Hotel.conn.createStatement();
            
        }catch(SQLException e){
            System.out.println(e);
        }

        return stm;
        
    }
    
}
