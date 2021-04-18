package udemy.arrays;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] array = new int[]{1,2,3,4,5,6,7,8};

        Arrays.stream(array).forEach(System.out::print);
        System.out.println("");

        for(int i = 0; i < array.length/2; i++){
            int index = array.length - 1;
            int k = array[(array.length - 1) - i];
            array[(array.length-1) - i] = array[i];
            array[i] = k;
        }

        Arrays.stream(array).forEach(System.out::print);
    }
}
