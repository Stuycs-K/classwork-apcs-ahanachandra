import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class TriangleTester{
   public static void main(String[] args){
       System.out.println(countTrianglesB("inputTri.txt"));
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
  
   public static boolean isTriangle2(String[] tri){
       int side1 = Integer.parseInt(tri[0]);
       int side2 = Integer.parseInt(tri[1]);
       int side3 = Integer.parseInt(tri[2]);
       return ((side1 + side2) > side3 && (side2 + side3) > side1 && (side1 + side3) > side2);
   }
  
   public static String[] containsSpace(String[] arr){
    int count = 0;
    for (int i = 0; i < arr.length; i++){
        if (!arr[i].equals("")){
            count++;
        }
    }
    String[] newss = new String[count];
    int index = 0;
    for (int i = 0; i < arr.length; i++){
        if (!arr[i].equals("")){
            newss[index] = arr[i];
            index++;
        }
    }
    return newss;
   }
   
   public static int countTrianglesB(String filename){
       int sum2 = 0;
       try{
           File file3 = new File(filename);
           Scanner input1 = new Scanner(file3);
           while(input1.hasNextLine()){
               String[] tri1 = input1.nextLine().split(" ");
               tri1 = containsSpace(tri1);
               String[] tri2 = input1.nextLine().split(" ");
               tri2 = containsSpace(tri2);
               String[] tri3 = input1.nextLine().split(" ");
               tri3 = containsSpace(tri3);


               String[] firstTri = {tri1[0], tri2[0], tri3[0]};
               String[] secondTri = {tri1[1], tri2[1], tri3[1]};
               String[] thirdTri = {tri1[2], tri2[2], tri3[2]};


               if (isTriangle2(firstTri)){
                   sum2++;
               }
               if (isTriangle2(secondTri)){
                   sum2++;
               }
               if (isTriangle2(thirdTri)){
                   sum2++;
               }


           }
           input1.close();
       }
       catch (FileNotFoundException ex) {
           //File not found what should you do?
           System.out.println("File not found");
         }
         return sum2;
   }




   }
