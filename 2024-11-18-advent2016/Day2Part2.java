import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Day2Part2 {
    public static void main(String[] args) {
        System.out.println(findPassword("input1.txt"));
    }

    public static String findPassword(String filename) {
        char currentButton = '5';
        int x = 2;
        int y = 0;
        String overallKey = "";
        char[][] theKeypad = {{' ', ' ', '1', ' ', ' '}, {' ', '2', '3', '4', ' '}, {'5', '6', '7', '8', '9'}, {' ', 'A', 'B', 'C', ' '}, {' ', ' ', 'D', ' ', ' '}};
        try {
            File file = new File(filename);
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()){
                String instructions = scanner.nextLine();
                for (int i = 0; i < instructions.length(); i++){
                    if (instructions.charAt(i) == 'U'){
                        if (x - 1 >= 0){
                            if (theKeypad[x - 1][y] != ' '){
                                x--;
                                currentButton = theKeypad[x][y];
                            }
                        }
                    }
                    if (instructions.charAt(i) == 'D'){
                        if (x + 1 <= 4){
                            if (theKeypad[x + 1][y] != ' '){
                                x++;
                                currentButton = theKeypad[x][y];
                            }
                        }
                    }
                    if (instructions.charAt(i) == 'R'){
                        if (y + 1 <= 4){
                            if (theKeypad[x][y + 1] != ' '){
                                y++;
                                currentButton = theKeypad[x][y];
                            }
                        }
                    }
                    if (instructions.charAt(i) == 'L'){
                        if (y - 1 >= 0){
                            if (theKeypad[x][y - 1] != ' '){
                                y--;
                                currentButton = theKeypad[x][y];
                            }
                        }
                    }
                }
                overallKey += currentButton;
            }
            scanner.close();
        } catch (FileNotFoundException ex) {
            System.out.println("File not found");
        }
        return overallKey;
    }



}