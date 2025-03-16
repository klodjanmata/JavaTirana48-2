package JavaAdvanced.Examples.AbstractClasses.Enum;

public enum Coffe {
    LATTE(10, 10),
    MEDIUM(5, 8),
    DARK(0, 5);

    private int milk;
    private int price;

    Coffe(int milk, int price) {
        this.milk = milk;
        this.price = price;
    }

    public void printCoffe() {
        System.out.println("Milk amount: " + this.milk);
        System.out.println("Price      : " + this.price);
    }

}
