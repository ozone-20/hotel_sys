package hotel;

import java.sql.*;
import java.util.ArrayList;
import java.util.Properties;

public class Hotel {

    public static void main(String[] args) {
        // TODO code application logic here

//        Login frame = new Login();
//
//        //  frame.setSize(820, 440);
//        // Set the location of the JFrame (x, y)
//        frame.setLocation(450, 250);
//
//        // Set the default close operation
//        frame.setDefaultCloseOperation(Login.EXIT_ON_CLOSE);
//
//        frame.setVisible(true);


           singleton instance1 = singleton.getInstance();
           singleton instance2 = singleton.getInstance();
           
           System.out.println(instance1.getGuest().get(0));
           System.out.println(instance2.getGuest());
           System.out.println(instance1.getEmployee());
           System.out.println(instance2.getEmployee());
           System.out.println(instance1.getRoom());
           System.out.println(instance2.getRoom());

       
        
        
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
