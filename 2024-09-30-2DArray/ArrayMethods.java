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
    System.out.println(swapRC(rectangularArray));

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




}
