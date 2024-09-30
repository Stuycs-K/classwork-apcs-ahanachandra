public class MyArrays{
  public static void main(String[] args){
    int[] arr = {1, 2, 3, 4, 5};
    System.out.println("Is the original array " + arrayToString(arr) + " the same as " + arrayToString(returnCopy(arr)) + arr == returnCopy(arr));
    System.out.println("Do the values match?" + (arrayToString(arr).equals(arrayToString(returnCopy(arr)))));
  }

  public static String arrayToString(int[] nums){
    String result = "[";
    for (int i = 0; i < nums.length; i++){
      result += nums[i];
      if (i < nums.length - 1){
        result += ", ";
      }
    }
    return result + "]";
  }


  public static int[] returnCopy(int[]ary){
    int[] copiedArray = new int[ary.length];
    for (int i = 0; i < ary.length; i++){
      copiedArray[i] = ary[i];
    }
    return copiedArray;
  }



}
