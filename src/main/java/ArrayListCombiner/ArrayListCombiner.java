package ArrayListCombiner;


import Employee.Employee;

import java.util.ArrayList;

/**
 * Create two generic methods that take two arraylists.  The methods should both append the second ArrayList's items,
 * to the first.  Use a wildcard for one of the type arguments in each method.
 * The first method should be called extendCombiner and should use ? extends E
 * The second method should be called superCombiner and should use ? super E
 */
public class ArrayListCombiner<T> {


    public static <T> void extendCombiner(ArrayList<T> first, ArrayList<? extends T> second) {
        first.addAll(second);
    }

    public static <T> void superCombiner(ArrayList<? super T> first, ArrayList<T> second) {
        first.addAll(second);
    }
}
