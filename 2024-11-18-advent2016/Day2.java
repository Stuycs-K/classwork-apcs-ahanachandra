import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Day2 {
    public static void main(String[] args) {
        System.out.println(findPassword("input1.txt"));
    }

    public static int findPassword(String filename) {
        int currentNumber = 5;
        String overallKey = "";
        try {
            File file = new File(filename);
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()){
                String instructions = scanner.nextLine();
                for (int i = 0; i < instructions.length(); i++){
                    if (instructions.charAt(i) == 'U'){
                        if (currentNumber != 1 && currentNumber != 2 && currentNumber != 3){
                            currentNumber -= 3;
                        }
                    }
                    if (instructions.charAt(i) == 'D'){
                        if (currentNumber != 7 && currentNumber != 8 && currentNumber != 9){
                            currentNumber += 3;
                        }
                    }
                    if (instructions.charAt(i) == 'R'){
                        if (currentNumber != 3 && currentNumber != 6 && currentNumber != 9){
                            currentNumber++;
                        }
                    }
                    if (instructions.charAt(i) == 'L'){
                        if (currentNumber != 1 && currentNumber != 4 && currentNumber != 7){
                            currentNumber--;
                        }
                    }
                }
                overallKey += currentNumber;
            }
            scanner.close();
        } catch (FileNotFoundException ex) {
            System.out.println("File not found");
        }
        return Integer.parseInt(overallKey);
    }



}