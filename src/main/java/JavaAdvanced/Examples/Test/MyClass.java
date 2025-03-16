package JavaAdvanced.Examples.Test;

public class MyClass implements MyInterface{

    @Override
    public void print() {
        System.out.println("Hello World");
    }

    @Override
    public void printDefault(){
        System.out.println("Overriding default method");
    }

    public static void main(String[] args) {
        MyClass myClass = new MyClass();
        myClass.print();
        myClass.printDefault();
    }
}
