package JavaAdvanced.Examples.AbstractClasses.Polymorphism;

public class Main {
    public static void main(String[] args){
        RemoteController rc = new ACRemoteControl();
        rc.switchOnOff();
        rc.makeNoise();

        rc = new TVRemoteControl();
        rc.switchOnOff();
        rc.makeNoise();

        String[] strings = new String[10];
        System.out.println(strings.length);
    }
}
