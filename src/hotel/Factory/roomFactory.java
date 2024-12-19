/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hotel.Factory;

/**
 *
 * @author eslamsemedo
 */
public class roomFactory {

    public static Room createRoom(int id, int num) {
        switch (id) {
            case 1:
                return new VIProom(num);
            case 2:
                return new doupleRoom(num);
            case 3:
                return new singleRoom(num);
            default: 
                return null;
        
        }
    }

}
