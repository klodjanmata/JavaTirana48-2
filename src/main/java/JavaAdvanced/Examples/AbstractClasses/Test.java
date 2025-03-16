package JavaAdvanced.Examples.AbstractClasses;

public class Test implements Generator{
    @Override
    public void generate() {
        System.out.println("Generate Method");
    }

    @Override
    public void print() {
        System.out.println("Print Method");
    }

//    @Override
//    public void print(String text) {
//        System.out.println("Print Method with parameters: " + text);
//    }

    public static void main(String[] args){
        Test test = new Test();
        test.print("Hello World");
        Generator g = new Bus();
        g.generate();
        g.print();
        g.print("Hello World");
    }
}
