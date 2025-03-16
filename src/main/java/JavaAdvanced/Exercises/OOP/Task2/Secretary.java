package JavaAdvanced.Exercises.OOP.Task2;

public class Secretary extends Person{
    private String department;

    public Secretary(String name, String address, String department) {
        super(name, address);
        this.department = department;
    }

    public Secretary() {
        this.department = "";
    }
}
