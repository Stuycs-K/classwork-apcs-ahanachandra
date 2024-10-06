//Ahana Chandra achandra60@stuy.edu
//Arko Chakrabartiroy achakrabartiroy60@stuy.edu
public class ArrayMethods{
  public static void main(String[] args) {
    int[][] testArray = {{3, 8, 2}, {}, {71, 4, 3, 6}, {22, 9}};
    int[] otherArray = {2, 5, 3, 66};
    int[][] rectangularArray = {{4, 2, 89, 2}, {3, 12, 17, 3,}, {1, 2, 3, 4}};
    System.out.println(arrToString(otherArray));
    System.out.println(arrToString(testArray));
    System.out.println(arr2DSum(testArray));
    System.out.println(arrToString(swapRC(rectangularArray)));
    int[][] anotherTestArray = {{-3, -8, 2}, {}, {71, -4, -3, -6}, {22, 9}};
    replaceNegative(anotherTestArray);
    replaceNegative(rectangularArray);
    System.out.println(arrToString(anotherTestArray));
    System.out.println(arrToString(rectangularArray));
    int[][] copythisarray = copy(testArray);
    System.out.println(arrToString(copythisarray));
    testArray[0][0] = 54;
    System.out.println(arrToString(copythisarray));

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
    String newString = "[";
    for (int i = 0; i < ary.length; i++){
      newString += arrToString(ary[i]);
      if (i < ary.length - 1){
        newString += ", ";
      }
    }
    return newString + "]";
  }

  public static int arr2DSum(int[][] nums){
    int sum = 0;
    for (int i = 0; i < nums.length; i++){
      for (int x = 0; x < nums[i].length; x++){
        sum += nums[i][x];
      }
    }
    return sum;
  }

  public static int[][] swapRC(int[][] nums){
    int[][] returnedArr = new int[nums[0].length][nums.length];
    for (int i = 0; i < nums.length; i++){
      for (int x = 0; x < nums[0].length; x++){
        returnedArr[x][i] = nums[i][x];
      }
    }
    return returnedArr;
  }
  //3. Modify a given 2D array of integer as follows:
  //Replace all the negative values:
  //-When the row number is the same as the column number replace
  //that negative with the value 1
  //-All other negatives replace with 0
  public static void replaceNegative(int[][] vals){
    for (int i = 0; i < vals.length; i++){
      for (int x = 0; x < vals[i].length; x++){
        if (vals[i][x] < 0){
          if (i == x){
            vals[i][x] = 1;
          }
          else{
            vals[i][x] = 0;
          }
      }
    }
  }
}

  //4. Make a copy of the given 2d array.
  //When testing : make sure that changing the original does NOT change the copy.
  //DO NOT use any built in methods that "copy" an array.
  //You SHOULD write a helper method for this.
  //If you don't see a good way to do that, you should stop and look at prior methods.
  
  public static int[] helperCopy(int[] arya){
    int[] helperCopyArr = new int[arya.length];
    if (arya.length == 0){
      return new int[0];
    }
    for (int i = 0; i < arya.length; i++){
      helperCopyArr[i] = arya[i];
    }
    return helperCopyArr;
  }


  public static int[][] copy(int[][] nums){
    int[][] resultarry = new int[nums.length][];
    for (int i = 0; i < nums.length; i++){
      resultarry[i] = helperCopy(nums[i]);
    }
    return resultarry;
  }



}
