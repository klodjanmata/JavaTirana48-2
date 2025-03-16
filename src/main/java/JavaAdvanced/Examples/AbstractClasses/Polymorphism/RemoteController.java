package JavaAdvanced.Examples.AbstractClasses.Polymorphism;

public interface RemoteController {
    void switchOnOff();

    default void makeNoise() {
        System.out.println("Beep");
    }
}
