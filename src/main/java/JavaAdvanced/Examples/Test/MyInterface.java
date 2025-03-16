package JavaAdvanced.Examples.Test;

public interface MyInterface {

    void print();

    default void printDefault(){
        System.out.println("Default method print");
    }
}
