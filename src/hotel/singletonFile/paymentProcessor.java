/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hotel.singletonFile;

/**
 *
 * @author eslamsemedo
 */
public class paymentProcessor {
    
    private static paymentProcessor instance;

    // Step 2: Private constructor to restrict instantiation
    private paymentProcessor() {
        System.out.println("PaymentProcessor instance created!");
    }

    // Step 3: Public static method to provide access to the instance
    public static paymentProcessor getInstance() {
        if (instance == null) {
            // Lazy initialization
            synchronized (paymentProcessor.class) { // Thread-safe initialization
                if (instance == null) {
                    instance = new paymentProcessor();
                }
            }
        }
        return instance;
    }

    // Payment processing method
    public void processPayment(String paymentDetails) {
        System.out.println("Processing payment: " + paymentDetails);
    }
}
