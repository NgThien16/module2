package ss10_vehicles.entity;

public class Car extends Vehicle {
    private int seats;
    private String type;

    public Car() {

    }

    public Car(int plate, String brand, int since, String owner, int seats, String type) {
        super(plate, brand, since, owner);
        this.seats = seats;
        this.type = type;
    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return super.toString() +
                "seats=" + seats +
                ", type='" + type + '\'' +
                '}';
    }
}
