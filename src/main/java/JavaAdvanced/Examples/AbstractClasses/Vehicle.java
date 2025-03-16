package JavaAdvanced.Examples.AbstractClasses;

public abstract class Vehicle {
    private String model;
    private String vin;
    private String licencePlate;

    public Vehicle(String model, String vin, String licencePlate) {
        this.model = model;
        this.vin = vin;
        this.licencePlate = licencePlate;
    }

    public Vehicle() {}

    public abstract void startEngine();

    public void move(){
        System.out.println("Vehicle is moving!");
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getVin() {
        return vin;
    }

    public void setVin(String vin) {
        this.vin = vin;
    }

    public String getLicencePlate() {
        return licencePlate;
    }

    public void setLicencePlate(String licencePlate) {
        this.licencePlate = licencePlate;
    }
}
