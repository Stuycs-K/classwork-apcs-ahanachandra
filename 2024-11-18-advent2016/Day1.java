import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Day1 {
    public static void main(String[] args) {
        System.out.println(calcBlocks("input.txt"));
    }

    public static int calcBlocks(String filename) {
        int direction = 0;
        int north = 0;
        int east = 0;
        int south = 0;
        int west = 0;
        try {
            File file = new File(filename);
            Scanner scanner = new Scanner(file);
            String[] pathLayout = scanner.nextLine().split(", ");
            for (int i = 0; i < pathLayout.length; i++){
                direction = directionToAddBlocks(pathLayout[i].charAt(0), direction);
                if (direction == 0){
                    north += Integer.parseInt(pathLayout[i].substring(1));
                }
                if (direction == 1){
                    east += Integer.parseInt(pathLayout[i].substring(1));
                }
                if (direction == 2){
                    south += Integer.parseInt(pathLayout[i].substring(1));
                }
                if (direction == 3){
                    west += Integer.parseInt(pathLayout[i].substring(1));
                }
            }
            scanner.close();
        } catch (FileNotFoundException ex) {
            System.out.println("File not found");
        }
        return Math.abs(east - west) + Math.abs(north - south);
    }

    public static int directionToAddBlocks(char rightLeft, int currentDirection){
        if (rightLeft == 'R'){
            if (currentDirection == 3){
                currentDirection = 0;
            }
            else{
                currentDirection++;
            }
        }
        if (rightLeft == 'L'){
            if (currentDirection == 0){
                currentDirection = 3;
            }
            else{
                currentDirection--;
            }
        }
        return currentDirection;
    }


}