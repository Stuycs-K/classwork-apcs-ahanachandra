public class ColorDemo{
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









}