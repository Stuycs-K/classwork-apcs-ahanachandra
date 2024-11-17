import java.util.ArrayList;
import java.util.Arrays;

public class Driver{
    public static void main(String[] args){
        //System.out.println(ArrayListPractice.createRandomArray(0));
        //System.out.println(ArrayListPractice.createRandomArray((int) (Math.random() * 11)));
        //System.out.println(ArrayListPractice.createRandomArray((int) (Math.random() * 11)));
        //System.out.println(ArrayListPractice.createRandomArray((int) (Math.random() * 200000)));
        ArrayList<String> yz = new ArrayList<>(Arrays.asList("a", "b", "c"));
        ArrayList<String> abcd = new ArrayList<>(Arrays.asList("a"));
        ArrayList<String> abcde = new ArrayList<>(Arrays.asList());
        System.out.println(ArrayListPractice.makeReversedList(yz));
        System.out.println(ArrayListPractice.makeReversedList(abcd));
        System.out.println(ArrayListPractice.makeReversedList(abcde));

    }







}