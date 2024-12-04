import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;

public class Day6 {
    public static void main(String[] args) {
        System.out.println(findPassword("input3.txt"));
    }

    public static String findPassword(String filename) {
        ArrayList<String> listOfLines = new ArrayList<>();
        String finalResult = "";
        try {
            File file = new File(filename);
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()){
                String instructions = scanner.nextLine();
                listOfLines.add(instructions);
            }
            ArrayList<String> listOfColumns = new ArrayList<>();
            for (int i = 0; i < listOfLines.get(0).length(); i++){
                String aColumn = "";
                for (int x = 0; x < listOfLines.size(); x++){
                    aColumn += listOfLines.get(x).charAt(i);
                }
                listOfColumns.add(aColumn);
            }
            for (int i = 0; i < listOfColumns.size(); i++){
                finalResult += findMostOccurringChar(listOfColumns.get(i));
            }
            scanner.close();
        } catch (FileNotFoundException ex) {
            System.out.println("File not found");
        }
        return finalResult;
    }

    public static int countOccurrencesOf(String original, char checkingFor){
        int sum1 = 0;
        for (int i = 0; i < original.length(); i++){
            if (original.charAt(i) == checkingFor){
                sum1++;
            }
        }
        return sum1;
    }

    public static char findMostOccurringChar(String original1){
        char currentMostChar = original1.charAt(0);
        for (int i = 1; i < original1.length(); i++){
            if (countOccurrencesOf(original1, original1.charAt(i)) > countOccurrencesOf(original1, currentMostChar)){
                currentMostChar = original1.charAt(i);
            }
        }
        return currentMostChar;
    }

}