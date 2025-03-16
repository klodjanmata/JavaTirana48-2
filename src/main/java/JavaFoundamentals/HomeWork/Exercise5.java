package JavaFoundamentals.HomeWork;

public class Exercise5 {
    public static void main(String[] args) {
        for(int i = 1; i <= 50; i++){
            if(i % 3 == 0){
                System.out.print("Fizz");
            }
            if(i % 5 == 0){
                System.out.print("Buzz");
            }
            else {
                System.out.print(i);
            }
            System.out.println();

//            if (i % 3 == 0 && i % 5 == 0){
//                System.out.println("FizzBuzz");
//            }
//            else if(i % 3 == 0){
//                System.out.println("Fizz");
//            }
//            else if(i % 5 == 0){
//                System.out.println("Buzz");
//            }
//            else{
//                System.out.println(i);
//            }
        }
    }

}