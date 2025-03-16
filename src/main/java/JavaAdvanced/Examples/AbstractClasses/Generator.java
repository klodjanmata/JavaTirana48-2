package JavaAdvanced.Examples.AbstractClasses;

public interface Generator {

    void generate();

    void print();

    default void print(String text){
        System.out.println("This line is in Generator Interface");
    }
}
