/**
 * Generic Pair class
 * ------------------
 * Represents a pair of values: one of type T and another of type U.
 *
 * This class is used by PairRegistry to associate a name (e.g., String) with a number (e.g., Integer).
 */

public class Pair<T, U> {

    // TODO: declare two public attributes named 'first' and 'second'
    public T first;
    public U second;    


    // TODO: implement a constructor that takes two parameters (first and second) and assigns them
    public Pair(T first, U second) {
        this.first = first;
        this.second = second;
    }   
    
}
