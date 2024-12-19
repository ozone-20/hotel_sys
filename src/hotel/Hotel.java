package hotel;

import hotel.Factory.roomFactory;
import hotel.Factory.Room;
import hotel.singletonFile.singleton;
import hotel.singletonFile.paymentProcessor;
import java.sql.*;
import java.util.ArrayList;
import java.util.Properties;

public class Hotel {

    public static void main(String[] args) {
        // TODO code application logic here

        Login frame = new Login();

        //  frame.setSize(820, 440);
        // Set the location of the JFrame (x, y)
        frame.setLocation(450, 250);

        // Set the default close operation
        frame.setDefaultCloseOperation(Login.EXIT_ON_CLOSE);

        frame.setVisible(true);



        // singleton
        
//        singleton instance1 = singleton.getInstance();
//        singleton instance2 = singleton.getInstance();
//
//        System.out.println(instance1.getGuest().get(0));
//        System.out.println(instance2.getGuest());
//        System.out.println(instance1.getEmployee());
//        System.out.println(instance2.getEmployee());
//        System.out.println(instance1.getRoom());
//        System.out.println(instance2.getRoom());
////           
////           
//        paymentProcessor processor1 = paymentProcessor.getInstance();
//        paymentProcessor processor2 = paymentProcessor.getInstance();
//
//        processor1.processPayment("Payment of $100 to Account A");
//        processor2.processPayment("Payment of $200 to Account b");
        
        // factory

//        Room newRoom = roomFactory.createRoom(2, 155);
//
//        newRoom.build();
        
        
        
        
        

//        for (ArrayList<String> row : guest) {
//            for (String element : row) {
//                System.out.print(element + " ");
//            }
//            System.out.println();
//        }
    }

//    public static boolean isString(String input) {
//        return input != null && input.matches("^[a-zA-Z\\s]+$");
//    }
}
