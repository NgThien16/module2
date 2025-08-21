package ss10_vehicles.entity;

public class Vehicle {
   private int plate;
   private String brand;
   private int since;
   private String owner;

    public Vehicle() {
    }

    public Vehicle(int plate, String brand, int since, String owner) {
        this.plate = plate;
        this.brand = brand;
        this.since = since;
        this.owner = owner;
    }

    public int getPlate() {
        return plate;
    }

    public void setPlate(int plate) {
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

    public String toString() {
        return plate + "," + brand + "," + since + "," + owner;
    }
}
