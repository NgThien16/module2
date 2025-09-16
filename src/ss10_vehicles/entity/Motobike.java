package ss10_vehicles.entity;

public class Motobike extends Vehicle{
    private int power;

    public Motobike(){

    }

    public Motobike(String plate, String brand, int since, String owner, int power) {
        super(plate, brand, since, owner);
        this.power = power;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    @Override
    public String toString() {
        return super.toString() + ", power=" + power + '}';
    }

    @Override
    public String getInfoToCSV() {
        return this.getPlate()+","+this.getBrand()+","+this.getSince()+","+this.getOwner()+","+this.getPower();
    }


}
