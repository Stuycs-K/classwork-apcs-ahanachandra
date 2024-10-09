import java.util.Arrays;
public class ArrayDemo{
  public static void main(String[]args){
    //write your tests here!
    //You can now use Arrays.toString(yourArray) instead of writing arrayToString again.
    //Compare Arrays.toString(yourArray) to YOUR arrayToString() method to make sure yours is correct
    //do not use any other Arrays.method()
    int[][] testArray = {{3, -8, 0}, {}, {0, 4, -3, 6}, {22, 9}};
    int[][] rectangularArray = {{4, 2, 89, 2}, {3, 12, 17, 3,}, {1, 2, 3, 4}};
    int[] otherArray = {2, 5, 3, 66};
    System.out.println(countZeros2D(testArray));
    System.out.println(countZeros2D(rectangularArray));
    System.out.println(arrToString(otherArray));
    System.out.println(Arrays.toString(otherArray));
    System.out.println(htmlTable(testArray));
    System.out.println(htmlTable(rectangularArray));


  }

  //0. Include your prior methods to help you print a 1D/2D array of ints.
  public static String arrToString(int[]ary){
    String result = "[";
    for (int i = 0; i < ary.length; i++){
      result += ary[i];
      if (i < ary.length - 1){
        result += ", ";
      }
    }
    return result + "]";
  }

  //The name of different methods can be the same,
  //as long as the parameters are different! (type and/or quantity must be different)
  //Pro tip: you should be using your 1D arrToString in this method!
  public static String arrToString(int[][]ary){
    String newString = "[";
    for (int i = 0; i < ary.length; i++){
      newString += arrToString(ary[i]);
      if (i < ary.length - 1){
        newString += ", ";
      }
    }
    return newString + "]";
  }

  //1. Calculate and return how many elements equal zero in the 2D array.
  public static int countZeros2D(int[][] nums){
    int sum = 0;
    for (int i = 0; i < nums.length; i++){
      for (int x = 0; x < nums[i].length; x++){
        if (nums[i][x] == 0){
          sum++;
        }
      }
    }
    return sum;
  }

  //2. Calculate the sum of a 2d array
  /*Return the sum of all of the values in the 2D array
   *Use a nested loop instead of a helper method*/
  public static int arr2DSum(int[][]nums){
    int sum = 0;
    for (int i = 0; i < nums.length; i++){
      for (int x = 0; x < nums[i].length; x++){
        sum += nums[i][x];
      }
    }
    return sum;
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

  //4. Make a copy of the given 2d array.
  //When testing : make sure that changing the original does NOT change the copy.
  //DO NOT use any built in methods that "copy" an array.
  //You SHOULD write a helper method for this.
  //If you don't see a good way to do that, you should stop and look at prior methods.
  public static int[][] copy(int[][] nums){
    int[][] resultarry = new int[nums.length][];
    for (int i = 0; i < nums.length; i++){
      resultarry[i] = helperCopy(nums[i]);
    }
    return resultarry;
  }

  //5. Rotate an array by returning a new array with the rows and columns swapped.
  //   You may assume the array is rectangular and neither rows nor cols is 0.
  //   e.g. swapRC({{1,2,3},{4,5,6}}) returns {{1,4},{2,5},{3,6}}
  public static int[][] swapRC(int[][]nums){
    int[][] returnedArr = new int[nums[0].length][nums.length];
    for (int i = 0; i < nums.length; i++){
      for (int x = 0; x < nums[0].length; x++){
        returnedArr[x][i] = nums[i][x];
      }
    }
    return returnedArr;
  }

  //6. Make an HTML table by putting a table tag around the entire 2d array,
  //   tr tags around each row, and td tags around each value.
  //   You may use a helper method
  //   Note there is no whitespace in the string, it all one line with no spaces/tabs.
  //   e.g. htmlTable(new int[][]{{1,2},{3}})  returns:
  // "<table><tr><td>1</td><td>2</td></tr><tr><td>3</td></tr></table>"
  public static String htmlTable(int[][]nums){
    String theTable = "<table>";
    for (int i = 0; i < nums.length; i++){
      theTable += "<tr>";
      for (int x = 0; x < nums[i].length; x++){
        theTable += "<td>" + nums[i][x] + "</td>";
      }
      theTable += "</tr>";
    }
    theTable += "</table>";
    return theTable;
  }
}
