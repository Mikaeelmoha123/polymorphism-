public class VehicleRentalService {

    public void rentVehicle(int durationInDays, String vehicleType, boolean insuranceIncluded) {

        System.out.println("Renting a " + vehicleType + " for " + durationInDays + " days.");
        if (insuranceIncluded) {
            System.out.println("Insurance included.");
        } else {
            System.out.println("No insurance included.");
        }

    }


    public void rentVehicle(int durationInDays, String vehicleType, boolean insuranceIncluded, String carModel, int numberOfSeats) {

        System.out.println("Renting a " + vehicleType + " (" + carModel + ") for " + durationInDays + " days.");
        System.out.println("Number of seats: " + numberOfSeats);
        if (insuranceIncluded) {
            System.out.println("Insurance included.");
        } else {
            System.out.println("No insurance included.");
        }

    }


    public void rentVehicle(int durationInDays, String vehicleType, boolean insuranceIncluded, boolean helmetProvided) {

        System.out.println("Renting a " + vehicleType + " for " + durationInDays + " days.");
        if (insuranceIncluded) {
            System.out.println("Insurance included.");
        } else {
            System.out.println("No insurance included.");
        }
        if (helmetProvided) {
            System.out.println("Helmet provided.");
        } else {
            System.out.println("No helmet provided.");
        }

    }


    public void rentVehicle(int durationInDays, String vehicleType, boolean insuranceIncluded, int boatCapacity, boolean captainProvided) {

        System.out.println("Renting a " + vehicleType + " for " + durationInDays + " days.");
        System.out.println("Boat capacity: " + boatCapacity + " persons.");
        if (insuranceIncluded) {
            System.out.println("Insurance included.");
        } else {
            System.out.println("No insurance included.");
        }
        if (captainProvided) {
            System.out.println("Captain provided.");
        } else {
            System.out.println("No captain provided.");
        }

    }

    public static void main(String[] args) {
        VehicleRentalService rentalService = new VehicleRentalService();

        // Example usage
        rentalService.rentVehicle(7, "Car", true, "Sedan", 4);
        rentalService.rentVehicle(3, "Bike", false, true);
        rentalService.rentVehicle(5, "Boat", true, 10, false);
    }
}
