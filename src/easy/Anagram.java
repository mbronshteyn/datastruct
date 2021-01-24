package easy;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/*
"An anagram is a word or phrase formed by rearranging
the letters of a different word or phrase,
typically using all the original letters exactly once"
 */
public class Anagram {
    public static void main(String[] args) {
        String wordOne = "restful";
        String wordTwo = "fluster";

        List<Character> wordOneList = wordOne.chars().mapToObj(c -> (char) c).collect(Collectors.toList());
        List<Character> wordTwoList = wordTwo.chars().mapToObj(c -> (char) c).collect(Collectors.toList());

        boolean match = true;
        for( Character c : wordOneList){
            if(wordTwoList.contains(c) == false ){
               match = false;
               break;
            }
        }

        System.out.println(match);
    }
}
