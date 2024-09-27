public class MyArrays{
  public static void main(String[] args){

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
