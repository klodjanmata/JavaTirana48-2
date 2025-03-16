package JavaAdvanced.Examples.AbstractClasses.Polymorphism;

public class ACRemoteControl implements RemoteController{


    @Override
    public void switchOnOff() {
        System.out.println("Play music to greet the owner!");
        System.out.println("AC is turned ON/OFF");
    }
}
