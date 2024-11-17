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
    
    public static ArrayList<String> mixLists( ArrayList<String> a,  ArrayList<String> b){
        //return a new ArrayList that has all values of a and b in alternating order that is:
        //a[0], b[0], a[1], b[1]...
        //If one list is longer than the other, just attach the remaining values to the end.
        ArrayList<String> combinedList = new ArrayList<>();
        int theSize2 = a.size();
        int theSize3 = b.size();
        int largestSize = 0;
        if (theSize2 > theSize3){
            largestSize = theSize2;
        }
        else{
            largestSize = theSize3;
        }
        for (int i = 0; i < largestSize; i++){
            if (i < theSize2){
                combinedList.add(a.get(i));
            }
            if (i < theSize3){
                combinedList.add(b.get(i));
            }
        }

        return combinedList;
    
    }       


}