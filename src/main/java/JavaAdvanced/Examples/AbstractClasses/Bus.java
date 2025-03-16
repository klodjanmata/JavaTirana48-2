package JavaAdvanced.Examples.AbstractClasses;

public class Bus extends Vehicle implements Generator{
    private int horsePower;
    private int displacement;
    private int numberOfSeats;
    private int lugageCapacity;

    public Bus(String model,String vin, String licencePlate,
               int horsepower, int displacement,
               int numberOfSeats, int lugageCapacity) {
        super(model, vin, licencePlate);
        this.horsePower = horsepower;
        this.displacement = displacement;
        this.numberOfSeats = numberOfSeats;
        this.lugageCapacity = lugageCapacity;
    }

    public Bus(){
        super();
    }

    @Override
    public void startEngine(){
        System.out.println("Bus engine has started");
    }

    public static void main(String[] args) {
        Vehicle a = new Bus();
        a.startEngine();
        System.out.println(a.getClass());

        a = new Truck();
        a.startEngine();
        System.out.println(a.getClass());

        Bus b = new Bus("MAN", "12345", "AB789DE",
                500, 6000, 50, 1000);
        System.out.println(b.getLicencePlate());
        b.move();
        b.startEngine();


    }

    @Override
    public void generate() {
        System.out.println("Bus generation started");
    }

    @Override
    public void print() {

    }

    public int getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }

    public int getDisplacement() {
        return displacement;
    }

    public void setDisplacement(int displacement) {
        this.displacement = displacement;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public void setNumberOfSeats(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }

    public int getLugageCapacity() {
        return lugageCapacity;
    }

    public void setLugageCapacity(int lugageCapacity) {
        this.lugageCapacity = lugageCapacity;
    }
}
