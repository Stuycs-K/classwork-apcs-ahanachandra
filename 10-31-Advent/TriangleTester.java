import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TriangleTester{
    public static void main(String[] args){
        System.out.println(countTrianglesA("inputTri.txt"));
    }
    public static boolean isTriangle(String tri){
        String[] splitString = tri.split(" ");
        int side1 = Integer.parseInt(splitString[0]);
        int side2 = Integer.parseInt(splitString[1]);
        int side3 = Integer.parseInt(splitString[2]);
        return ((side1 + side2) > side3 && (side2 + side3) > side1 && (side1 + side3) > side2);
    }
    public static int countTrianglesA(String filename){
        int sum = 0;
        try{
            File file2 = new File(filename);
            Scanner input0 = new Scanner(file2);
            while(input0.hasNextLine()){
                if (isTriangle(input0.nextLine())){
                    sum++;
                }
                }
            input0.close();
            }
            catch (FileNotFoundException ex) {
                //File not found what should you do?
                System.out.println("File not found");
              }
              return sum;
        }
    }
