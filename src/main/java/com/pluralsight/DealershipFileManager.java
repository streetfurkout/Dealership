import java.io.*;
import java.util.List;

public class DealershipFileManager {
    private String filePath;

    public DealershipFileManager(String filePath) {
        this.filePath = filePath;
    }

    // Method to read the dealership data from the file
    public Dealership getDealership() {
        Dealership dealership = null;
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line = br.readLine(); // Read the first line for dealership info
            if (line != null) {
                String[] parts = line.split("\\|");
                String name = parts[0].trim();
                String address = parts[1].trim();
                String phone = parts[2].trim();
                dealership = new Dealership(name, address, phone);

                // Read the rest of the lines for vehicle info
                while ((line = br.readLine()) != null) {
                    String[] vehicleParts = line.split("\\|");
                    Vehicle vehicle = new Vehicle(
                            Integer.parseInt(vehicleParts[0].trim()),
                            Integer.parseInt(vehicleParts[1].trim()),
                            vehicleParts[2].trim(),
                            vehicleParts[3].trim(),
                            vehicleParts[4].trim(),
                            vehicleParts[5].trim(),
                            Integer.parseInt(vehicleParts[6].trim()),
                            Double.parseDouble(vehicleParts[7].trim())
                    );
                    dealership.addVehicle(vehicle);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return dealership;
    }

    // Method to save the dealership data to the file
    public void saveDealership(Dealership dealership) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(filePath))) {
            // Write dealership info
            String dealershipInfo = String.join("|", dealership.getName(), dealership.getAddress(), dealership.getPhone());
            bw.write(dealershipInfo);
            bw.newLine();

            // Write vehicle info
            List<Vehicle> vehicles = dealership.getAllVehicles();
            for (Vehicle vehicle : vehicles) {
                String vehicleInfo = String.join("|",
                        String.valueOf(vehicle.getVin()),
                        String.valueOf(vehicle.getYear()),
                        vehicle.getMake(),
                        vehicle.getModel(),
                        vehicle.getVehicleType(),
                        vehicle.getColor(),
                        String.valueOf(vehicle.getOdometer()),
                        String.valueOf(vehicle.getPrice())
                );
                bw.write(vehicleInfo);
                bw.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        public void processGetByPriceRequest() {
            System.out.print("Enter minimum price: ");
            double minPrice = Double.parseDouble(scanner.nextLine());
            System.out.print("Enter maximum price: ");
            double maxPrice = Double.parseDouble(scanner.nextLine());

            List<Vehicle> vehicles = dealership.getVehiclesByPrice(minPrice, maxPrice);
            displayVehicles(vehicles);
        }
    }
}
