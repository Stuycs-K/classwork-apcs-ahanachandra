//Ahana Chandra achandra60@stuy.edu
//Arko Chakrabartiroy achakrabartiroy60@stuy.edu
public class ArrayMethods{
  public static void main(String[] args) {
    int[][] testArray = {{3, 8, 2}}

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
