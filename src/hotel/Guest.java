/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hotel;

/**
 *
 * @author eslamsemedo
 */
//public abstract class Guest {
//    private String documentType;
//    private String number;
//    private String name;
//    private String gender;
//    private String country;
//    private String roomNumber;
//    private String status;
//    private Guest(Guest guest){
//        this.documentType = guest.documentType;
//        this.number = guest.number;
//        this.name = guest.name;
//        this.gender = guest.gender;
//        this.country = guest.country;
//        this.roomNumber = guest.roomNumber;
//        this.status = guest.status;
//    }
//    
//    public abstract Guest clone();
//}
import Proxy.database;
import Proxy.proxy;
import java.sql.*;
import java.util.HashMap;
import java.util.Map;

// Base Class for all Guest Types
abstract class Guest implements Cloneable {

    private final database connect = new proxy();

    protected String documentType;
    protected String number;
    protected String name;
    protected String gender;
    protected String country;
    protected String roomNumber;
    protected String status;
    protected String deposite;
    protected String category;
    protected String feature;

    public Guest(String documentType, String number, String name, String gender, String country, String roomNumber, String status, String deposite) {
        this.documentType = documentType;
        this.number = number;
        this.name = name;
        this.gender = gender;
        this.country = country;
        this.roomNumber = roomNumber;
        this.status = status;
        this.deposite = deposite;

    }

    // Common method to display basic guest details
    public void displayDetails() {
        System.out.println("documentType: " + documentType);
        System.out.println("number: " + number);
        System.out.println("Name: " + name);
        System.out.println("gender: " + gender);
        System.out.println("country: " + country);
        System.out.println("roomNumber: " + roomNumber);
        System.out.println("status: " + status);
        System.out.println("deposite: " + deposite);
    }

    public void sendToDatabase() {
        try {
            Statement stm = connect.connectBy("eslam");

            String query = String.format("INSERT INTO `guest` (`documentType`, `number`, `name`, `gender`, `country`, `roomNumber`, `status`, `deposite`, `category`, `feature`) VALUES ('%S', '%S', '%S', '%S', '%S', '%S', '%S', '%S', '%S', '%S');", documentType, number, name, gender, country, roomNumber, status, deposite, category, feature);
//            ResultSet rs = stm.executeQuery(query);

            int affectedrow = stm.executeUpdate(query);

            if (affectedrow > 0) {
                System.out.println("A new user was inserted successfully!");
            }

        } catch (SQLException e) {
            System.out.println(e);
        }
    }

    // Abstract method for specific guest features
    public abstract void displaySpecialFeatures();

    // Implement the clone method for cloning objects
    @Override
    public Guest clone() {
        try {
            return (Guest) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException("Cloning not supported for this class", e);
        }
    }
}

// VIP Guest Class
class VIP extends Guest {

    public VIP(String documentType, String number, String name, String gender, String country, String roomNumber, String status, String deposite) {
        super(documentType, number, name, gender, country, roomNumber, status, deposite);
        this.category = "VIP";
        this.feature = "- Priority check-in and check-out\n- Personalized amenities\n- Access to VIP lounge";
    }

    @Override
    public void displaySpecialFeatures() {
        System.out.println("Special Features for VIP:");
        System.out.println("- Priority check-in and check-out");
        System.out.println("- Personalized amenities");
        System.out.println("- Access to VIP lounge");
    }
}

// Family Guest Class
class Family extends Guest {

    public Family(String documentType, String number, String name, String gender, String country, String roomNumber, String status, String deposite) {
        super(documentType, number, name, gender, country, roomNumber, status, deposite);
        this.category = "family";
        this.feature = "- Interconnected rooms\n- Kid-friendly amenities\n- Access to family activities";
    }

    @Override
    public void displaySpecialFeatures() {
        System.out.println("Special Features for Family:");
        System.out.println("- Interconnected rooms");
        System.out.println("- Kid-friendly amenities");
        System.out.println("- Access to family activities");
    }
}

// Couple Guest Class
class Couple extends Guest {

    public Couple(String documentType, String number, String name, String gender, String country, String roomNumber, String status, String deposite) {
        super(documentType, number, name, gender, country, roomNumber, status, deposite);
        this.category = "Couple";
        this.feature = "- Romantic room setup\n- Couple spa packages\n- Late check-out options";

    }

    @Override
    public void displaySpecialFeatures() {
        System.out.println("Special Features for Couple:");
        System.out.println("- Romantic room setup");
        System.out.println("- Couple spa packages");
        System.out.println("- Late check-out options");
    }
}

// Prototype Registry
class PrototypeRegistry {

    private final Map<String, Guest> guestPrototypes = new HashMap<>();

    // Register a prototype
    public void registerPrototype(String key, Guest guest) {
        guestPrototypes.put(key, guest);
    }

    // Get a clone of the prototype
    public Guest getPrototype(String key) {
        Guest prototype = guestPrototypes.get(key);
        if (prototype == null) {
            throw new IllegalArgumentException("No prototype registered with key: " + key);
        }
        return prototype.clone();
    }
}
