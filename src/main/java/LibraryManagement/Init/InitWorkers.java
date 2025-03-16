package LibraryManagement.Init;

import LibraryManagement.Worker;
import java.time.LocalDate;

public class InitWorkers {

    public static Worker[] initWorkers(){
        Worker worker1 = new Worker("M10L", "Alban", "Trebeshina", 'M',
                                    "Vasil Shanto", "0684523654", "alban@gmail.com",
                                    true, LocalDate.of(2023, 5, 1));
        Worker worker2 = new Worker("B24Y", "Majlinda", "Cani", 'F',
                                    "Kombinat", "0687745632", "majlinda@gmail.com",
                                    true, LocalDate.of(2023, 9, 2));
        Worker[] workers = new Worker[]{worker1, worker2};
        return workers;
    }
}
