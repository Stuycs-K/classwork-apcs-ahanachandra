import java.util.ArrayList;

public class ArrayListPractice{
    public static ArrayList<String>createRandomArray(int size){
        ArrayList<String> x = new ArrayList<>(size);
        for (int i = 0; i < size; i++){
            int theNum = (int) (Math.random() * 11);
            if (theNum == 0){
                x.add("");
            }
            else{
                x.add(String.valueOf(theNum));
            }
        }
        return x;
    }

    public static void replaceEmpty( ArrayList<String> original){
        //Modify the ArrayList such that it has all of the empty strings are
        //replaced with the word "Empty".
        for (int i = 0; i < original.size(); i++){
            if (original.get(i).length() == 0){
                original.set(i, "Empty");
            }
        }
    
    }

    public static ArrayList<String> makeReversedList( ArrayList<String> original){
        //return a new ArrayList that is in the reversed order of the original.
        ArrayList<String> xyz = new ArrayList<>(original.size());
        int theSize = original.size();
        for (int i = 0; i < theSize; i++){
            xyz.add(i, original.get((theSize - 1) - i));
        }
        return xyz;
    
    
    
    }      






}