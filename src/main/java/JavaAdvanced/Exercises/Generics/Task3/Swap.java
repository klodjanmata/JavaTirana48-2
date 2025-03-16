package JavaAdvanced.Exercises.Generics.Task3;

import java.util.List;

public class Swap<T> {
    private List<T> mylist;

    public Swap(List<T> list) {
        this.mylist = list;
    }

    public List<T> swapElements(int firstIndex, int secondIndex) {
        T temp = mylist.get(firstIndex);
        mylist.set(firstIndex, mylist.get(secondIndex));
        mylist.set(secondIndex, temp);
        return mylist;
    }

}
