class Vehicle {
    String ownerName;      
    String vehicleType;  
    static double registrationFee = 100; 
    Vehicle(String ownerName, String vehicleType) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
    }
    void displayVehicleDetails() {
        System.out.println("Owner: " + ownerName + ", Vehicle: " + vehicleType +
                ", Registration Fee: $" + registrationFee);
    }
    static void updateRegistrationFee(double newFee) {
        registrationFee = newFee;
    }
}