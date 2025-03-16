package JavaAdvanced.Exercises.OOP.Task3;

import java.util.ArrayList;
import java.util.List;

public interface OrderReverser {

    static <E extends Square> List<E> reverseList(List<E> inputList){
        List<E> outputList = new ArrayList<E>();
        for(int i = inputList.size() - 1; i >= 0; i--){
            outputList.add(inputList.get(i));
        }
        return outputList;
    }
}
