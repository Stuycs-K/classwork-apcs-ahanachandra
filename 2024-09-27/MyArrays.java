public class MyArrays{
  public static void main(String[] args){
    int[] arr = {1, 2, 3, 4, 5};
    System.out.println("Is the original array " + arrayToString(arr) + " the same as " + arrayToString(returnCopy(arr)) + (arr == returnCopy(arr)));
    System.out.println("Do the values match?" + (arrayToString(arr).equals(arrayToString(returnCopy(arr)))));

    int[] secondArr = {8, 2, 3};
    System.out.println("Should return " + arrayToString(arr) + " + " + arrayToString(secondArr) + " returned: " + concatArray(arr, secondArr));

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


  public static int[] concatArray(int[]ary1,int[]ary2){
    int[] combinedArray = new int[ary1.length + ary2.length];
    for (int i = 0; i < ary1.length; i++){
      combinedArray[i] = ary1[i];
    }
    for (int i = 0; i < ary2.length; i++){
      combinedArray[i + ary1.length] = ary2[i];
    }
    return combinedArray;
  }

}
