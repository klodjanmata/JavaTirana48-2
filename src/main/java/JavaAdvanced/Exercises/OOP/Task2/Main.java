package JavaAdvanced.Exercises.OOP.Task2;

public class Main {
    public static void main(String[] args){
        Person p1 = new Student("Alban Hoxha", "Kompleksi Partizani",
                "Bachelor", 2, 400);
        Person p2 = new Lecturer("Albana Hoxha", "FEUT",
                "Programim Java", 1500);
        Person p3 = new Secretary();
        //Student s1 = new Secretary();
        System.out.println(p1);
        System.out.println(p2);
    }
}
