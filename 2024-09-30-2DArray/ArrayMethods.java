//Ahana Chandra achandra60@stuy.edu
//Arko Chakrabartiroy achakrabartiroy60@stuy.edu
public class ArrayMethods{
  public static void main(String[] args) {
    int[][] testArray = {{3, 8, 2}, {}, {71, 4, 3, 6}, {22, 9}};
    int[] otherArray = {2, 5, 3, 66};
    System.out.println(arrToString(otherArray));
    System.out.println(arrToString(testArray));

  }
  public static String arrToString(int[] ary){
    String result = "[";
    for (int i = 0; i < ary.length; i++){
      result += ary[i];
      if (i < ary.length - 1){
        result += ", ";
      }
    }
    return result + "]";
  }
  public static String arrToString(int[][] ary) {

  }
}
