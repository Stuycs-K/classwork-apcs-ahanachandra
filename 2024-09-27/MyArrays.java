public class MyArrays{
  public static void main(String[] args){
    int[] arr = [1, 2, 3, 4, 5];
    System.out.println("Is the original array " + arrayToString(arr) + " the same as " + arrayToString(returnCopy(arr)) + (arrayToString(arr) == arrayToString(returnCopy(arr))));
    System.out.println("Do the values match?" + (arrayToString(arr).equals(arrayToString(returnCopy(arr)))));
  }

  public static String arrayToString(int[] nums){
    String final = "[";
    for (int i = 0; i < nums.length; i++){
      final += nums[i];
      if (i < nums.length - 1){
        final += ", ";
      }
    }
    return final + "]";
  }
}
