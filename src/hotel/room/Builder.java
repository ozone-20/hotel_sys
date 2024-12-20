/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hotel.room;

public class Builder {
    private final String type; // Single, Double, VIP
    private final double price;
    private final boolean isAvailable;

    // Private constructor to enforce object creation via the builder
    private Builder(BuilderClass builder) {
        this.type = builder.type;
        this.price = builder.price;
        this.isAvailable = builder.isAvailable;
    }

    // Getters for accessing properties
    public String getType() { return type; }
    public double getPrice() { return price; }
    public boolean isAvailable() { return isAvailable; }

    @Override
    public String toString() {
        return "Room [type=" + type + ", price=" + price +
               ", isAvailable=" + isAvailable + "]";
    }

    // Static nested BuilderClass
    public static class BuilderClass {
        private String type;
        private double price;
        private boolean isAvailable;

        public BuilderClass setType(String type) {
            this.type = type;
            return this;
        }

        public BuilderClass setPrice(double price) {
            this.price = price;
            return this;
        }

        public BuilderClass setAvailability(boolean isAvailable) {
            this.isAvailable = isAvailable;
            return this;
        }

       

        // Build method to create the Room object
        public Builder build() {
            return new Builder(this);
        }
    }
}



