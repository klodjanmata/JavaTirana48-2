package JavaAdvanced.Exercises.Generics.Task1;

public class Pair<T, S> {
    private T first;
    private S second;

    Pair(T first, S second){
        this.first = first;
        this.second = second;
    }

    public void print(){
        System.out.println("Pair -> First: " + first + ", Second: " + second);
    }

    public Pair<S, T> invertedPair(){
        return new Pair<>( this.second, this.first);
    }

    public T getFirst() {
        return first;
    }

    public void setFirst(T first) {
        this.first = first;
    }

    public S getSecond() {
        return second;
    }

    public void setSecond(S second) {
        this.second = second;
    }


}
