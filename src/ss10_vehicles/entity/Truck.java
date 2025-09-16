package ss10_vehicles.entity;

public class Truck extends Vehicle{
    private int payload;

    public Truck(){

    }

    public Truck(int plate, String brand, int since, String owner, int payload) {
        super(plate, brand, since, owner);
        this.payload = payload;
    }

    public int getPayload() {
        return payload;
    }

    public void setPayload(int payload) {
        this.payload = payload;
    }

    @Override
    public String toString() {
        return super.toString() + ", payload=" + payload + '}';
    }

    @Override
    public String getInfoToCSV() {
        return this.getPlate()+","+this.getBrand()+","+this.getSince()+","+this.getOwner()+","+this.payload;
    }
}
