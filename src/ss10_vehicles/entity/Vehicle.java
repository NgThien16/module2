package ss10_vehicles.entity;

public abstract class Vehicle {
   private String plate;
   private String brand;
   private int since;
   private String owner;

    public Vehicle() {
    }

    public Vehicle(String plate, String brand, int since, String owner) {
        this.plate = plate;
        this.brand = brand;
        this.since = since;
        this.owner = owner;
    }

    public String getPlate() {
        return plate;
    }

    public void setPlate(String plate) {
        this.plate = plate;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getSince() {
        return since;
    }

    public void setSince(int since) {
        this.since = since;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "plate=" + plate +
                ", brand='" + brand + '\'' +
                ", since=" + since +
                ", owner='" + owner + '\'' +
                '}';
    }
    public abstract String getInfoToCSV();
}
