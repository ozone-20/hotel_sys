package hotel;

import hotel.Factory.roomFactory;
import hotel.Factory.Room;
import hotel.room.Builder;
import hotel.singletonFile.singleton;
import hotel.singletonFile.paymentProcessor;
import java.sql.*;
import java.util.ArrayList;
import java.util.Properties;

public class Hotel {

    public static Connection conn = null;

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
        // singleton
//        singleton instance1 = singleton.getInstance();
//        singleton instance2 = singleton.getInstance();
        ////        singleton instance2 = new singleton();
//
//        System.out.println(instance1.getGuest());
//        System.out.println(instance2.getGuest());
//        System.out.println(instance1.getEmployee());
//        System.out.println(instance2.getEmployee());
//        System.out.println(instance1.getRoom());
//        System.out.println(instance2.getRoom());
//           
//           
//        paymentProcessor processor1 = paymentProcessor.getInstance();
//        paymentProcessor processor2 = paymentProcessor.getInstance();
//
//        processor1.processPayment("Payment of $100 to Account A");
//        processor2.processPayment("Payment of $200 to Account b");

        // factory
//        Room newRoom = roomFactory.createRoom(3, 101);
//
//        newRoom.build();
//        for (ArrayList<String> row : guest) {
//            for (String element : row) {
//                System.out.print(element + " ");
//            }
//            System.out.println();
//        }


        // prototype
//        PrototypeRegistry registry = new PrototypeRegistry();
//
//        // Register Guest Prototypes
//        registry.registerPrototype("VIP", new VIP("null", "null", "null", "null", "null", "null", "null", "null"));
//        registry.registerPrototype("Family", new Family("null", "null", "null", "null", "null", "null", "null", "null"));
//        registry.registerPrototype("Couple", new Couple("null", "null", "null", "null", "null", "null", "null", "null"));
//
//        // Retrieve and customize clones
//        Guest clonedVipGuest = registry.getPrototype("VIP");
//        clonedVipGuest.documentType = "mezza";
//        clonedVipGuest.number = "134321";
//        clonedVipGuest.name = "ahmed";
//        clonedVipGuest.gender = "male";
//        clonedVipGuest.country = "german";
//        clonedVipGuest.roomNumber = "114";
//        clonedVipGuest.status = "Tue Apr 05 11:00 AM";
//        clonedVipGuest.deposite = "1000";
//
//        Guest clonedFamilyGuest = registry.getPrototype("Family");
//        clonedVipGuest.documentType = "mezza";
//        clonedVipGuest.number = "134321";
//        clonedVipGuest.name = "ahmed";
//        clonedVipGuest.gender = "male";
//        clonedVipGuest.country = "german";
//        clonedVipGuest.roomNumber = "114";
//        clonedVipGuest.status = "Tue Apr 05 11:00 AM";
//        clonedVipGuest.deposite = "2000";
//
//        Guest clonedCoupleGuest = registry.getPrototype("Couple");
//        clonedVipGuest.documentType = "mezza";
//        clonedVipGuest.number = "134321";
//        clonedVipGuest.name = "ahmed";
//        clonedVipGuest.gender = "male";
//        clonedVipGuest.country = "german";
//        clonedVipGuest.roomNumber = "114";
//        clonedVipGuest.status = "Tue Apr 05 11:00 AM";
//        clonedVipGuest.deposite = "3000";
//
//        // Displaying cloned details
//        System.out.println("=== Cloned VIP Guest ===");
//        clonedVipGuest.displayDetails();
//        clonedVipGuest.displaySpecialFeatures();
//        clonedVipGuest.sendToDatabase();
//
//        System.out.println("\n=== Cloned Family Guest ===");
//        clonedFamilyGuest.displayDetails();
//        clonedFamilyGuest.displaySpecialFeatures();
//
//        System.out.println("\n=== Cloned Couple Guest ===");
//        clonedCoupleGuest.displayDetails();
//        clonedCoupleGuest.displaySpecialFeatures();

          // bulider
        Builder vipRoom = new Builder.BuilderClass()
                .setType("VIP")
                .setPrice(200.0)
                .setAvailability(true)
                .build();

        // Create a Single Room
        Builder singleRoom = new Builder.BuilderClass()
                .setType("Single")
                .setPrice(100.0)
                .setAvailability(true)
                .build();

        // Display the created rooms
        System.out.println("Created Rooms:");
        System.out.println(vipRoom);
        System.out.println(singleRoom);

    }

//    public static boolean isString(String input) {
//        return input != null && input.matches("^[a-zA-Z\\s]+$");
//    }
}
