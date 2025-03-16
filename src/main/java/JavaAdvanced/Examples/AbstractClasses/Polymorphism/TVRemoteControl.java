package JavaAdvanced.Examples.AbstractClasses.Polymorphism;

public class TVRemoteControl implements RemoteController{
    @Override
    public void switchOnOff() {
        System.out.println("TV is turned ON/OFF");
    }

    @Override
    public void makeNoise(){
        System.out.println("Remote controller is muted!");
    }
}
