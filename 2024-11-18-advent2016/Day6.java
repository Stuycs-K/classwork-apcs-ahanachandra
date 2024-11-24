import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Day6 {
    public static void main(String[] args) {
        System.out.println(findPassword("input3.txt"));
    }

    public static int findPassword(String filename) {

        try {
            File file = new File(filename);
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()){
                String instructions = scanner.nextLine();
                for (int i = 0; i < instructions.length(); i++){
                    
                }

            }
            scanner.close();
        } catch (FileNotFoundException ex) {
            System.out.println("File not found");
        }
        return 0;
    }



}