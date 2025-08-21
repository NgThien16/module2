package ss10_vehicles.entity;

public class motobike extends Vehicle{
    private int power;

    public motobike(){

    }

    public motobike(int plate, String brand, int since, String owner, int power) {
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
        return "motobike{" +
                "power=" + power +
                '}';
    }
}
