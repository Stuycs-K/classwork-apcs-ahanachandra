import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Day4 {
    public static void main(String[] args) {
        System.out.println(findPassword("input2.txt"));
    }

    public static int findPassword(String filename) {
        int idCode = 0;
        int sum = 0;
        try {
            File file = new File(filename);
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()){
                String instructions = scanner.nextLine();
                String checksum = instructions.substring(instructions.indexOf('[') + 1, instructions.indexOf(']'));
                String name = "";
                for (int i = 0; i < instructions.length(); i++){
                    if (Character.isDigit(instructions.charAt(i))){
                        idCode = Integer.parseInt(instructions.substring(i, instructions.indexOf('[')));
                        name = instructions.substring(0, i);
                        break;
                    }
                }
                if (fiveMostCommon(name).equals(checksum)){
                    sum += idCode;
                }
            }
            scanner.close();
        } catch (FileNotFoundException ex) {
            System.out.println("File not found");
        }
        return sum;
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

    public static String fiveMostCommon(String given){
        ArrayList<ArrayList<Object>> pairCharWithOccurrence = new ArrayList<>();
        String eee = "";
        String finalResult = "";
        for (int i = 0; i < given.length(); i++){
            if (Character.isLetter(given.charAt(i)) && eee.indexOf(given.charAt(i)) == -1){
                pairCharWithOccurrence.add(new ArrayList<>(Arrays.asList(given.charAt(i), countOccurrencesOf(given, given.charAt(i)))));
                eee += given.charAt(i);
            }
        }
        pairCharWithOccurrence.sort((a, b) -> {
            int frequencyy = (int) b.get(1) - (int) a.get(1);
            if (frequencyy != 0) {
                return frequencyy;
            }
            return ((char) a.get(0)) - ((char) b.get(0));
        });
        finalResult += pairCharWithOccurrence.get(0).get(0);
        finalResult += pairCharWithOccurrence.get(1).get(0);
        finalResult += pairCharWithOccurrence.get(2).get(0);
        finalResult += pairCharWithOccurrence.get(3).get(0);
        finalResult += pairCharWithOccurrence.get(4).get(0);

        return finalResult;

    }



}