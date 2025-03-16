package JavaFoundamentals.HomeWork;

public class Exercise13 {
    public static void main(String[] args) {
        multiplesOf5();
    }

    public static void multiplesOf5(){
        for(int i = 5; i <= 100; i += 5){
            System.out.print(i + ", ");
        }
    }
}
