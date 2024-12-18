package hotel;

import java.sql.*;
import java.util.Properties;

public class Hotel {

    public static void main(String[] args) {
        // TODO code application logic here
        
        
        Login frame = new Login();

        // Set the size of the JFrame (width, height)
//        frame.setSize(820, 440);

        // Set the location of the JFrame (x, y)
        frame.setLocation(450, 250);

        // Set the default close operation
        frame.setDefaultCloseOperation(Login.EXIT_ON_CLOSE);

        frame.setVisible(true);
        
        
        
        
//         String[][] x = {
//             {"1", "eslam", "mokhtar"}, 
//             {"2", "eslam", "mohamed"}, 
//             {"3", "eslam", "fouad"}};
//        
//        
//
//        Connection conn = null;
//
//        try {
//            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/eslam", "root", "");
//
//            Statement stm = conn.createStatement();
//            String query = "select * from name";
//            ResultSet rs = stm.executeQuery(query);
//
//            while (rs.next()) {
//                System.out.println(rs.getString("fName"));
//                System.out.println(rs.getString("lName"));
//
//            }
//        } catch (SQLException e) {
//            System.out.println(e);
//        }

    }

}
