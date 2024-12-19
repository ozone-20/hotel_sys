/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hotel.Factory;

/**
 *
 * @author eslamsemedo
 */
public class doupleRoom extends Room {
    
    doupleRoom(int n){
        setRoomNum(n);
        setavailabilty("available");
        setstatus("clean");
        setprice("2000");
        setbedType("Douple");

    }
    
}
