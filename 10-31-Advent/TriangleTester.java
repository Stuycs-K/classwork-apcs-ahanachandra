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
        
    }



















}
