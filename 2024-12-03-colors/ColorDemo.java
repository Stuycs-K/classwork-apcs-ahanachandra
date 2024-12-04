public class ColorDemo{
<<<<<<< HEAD
  public static void main(String[] args){
    for(int r = 0; r < 256; r+=32){
  for(int g = 0; g <= 256; g+=32){
    for(int b = 0; b <= 256; b+=32){
      System.out.print("\u001b[38;2;"+r+";"+g+";"+b+";7m.");
    }
  }
    System.out.println();
}
  }
=======
    public static void main(String[] args) {
        for (int x = 1; x < 101; x++){
            for (int i = 1; i < x; i++){
                if (i % 2 != 0){
                    System.out.print("\u001b[36m Are you ");
                    System.out.print(i + "?"); 
                }
                else{
                    System.out.print("\u001b[35m Are you ");
                    System.out.print(i + "?"); 
                }
    
            }
            System.out.print("\u001b[30;47mYou're ");
            System.out.print(x + "!! Happy Birthday!");
            System.out.println("\u001b[0m");
        }
        System.out.print("\u001b[0m");
    }
>>>>>>> 4217541b9f25aa05b51b5900b67d19890a71bdb6









<<<<<<< HEAD






}
=======
}
>>>>>>> 4217541b9f25aa05b51b5900b67d19890a71bdb6
