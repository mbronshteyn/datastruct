package easy;

import java.util.HashSet;
import java.util.Set;

/*
we want to find duplicates in a T[] one-dimensional array of integers
in O(N) running time where the integer values are smaller
than the length of the array - and we can not use negative values!
 */
public class Duplicates {
    public static void main(String[] args) {
        Set<Integer> integerSet = new HashSet<>();

        int[] array = new int[]{ 1, 2, 4, 5, 2, 3 };

        boolean result = true;
        for( int i = 0; i < array.length; i++ ){
            if( integerSet.contains(array[i])){
                result = false;
            } else {
                integerSet.add(array[i]);
            }
        }

        System.out.println(result);
    }
}
