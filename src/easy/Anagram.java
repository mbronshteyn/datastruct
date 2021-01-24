package easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/*
"An anagram is a word or phrase formed by rearranging
the letters of a different word or phrase,
typically using all the original letters exactly once"
 */
public class Anagram {
    public static void main(String[] args) {
        // assume length is the same, other wise it is easy
        String wordOne = "restful";
        String wordTwo = "fluster";

        char[] wordOneArray = wordOne.toCharArray();
        char[] wordTwoArray = wordTwo.toCharArray();

        Arrays.sort(wordOneArray);
        Arrays.sort(wordTwoArray);

        boolean match = true;
        for(int i = 0; i < wordOneArray.length; i++){
            if(wordOneArray[i] != wordTwoArray[i]){
                match = false;
                break;
            }
        }

        System.out.println(match);
    }
}
