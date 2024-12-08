public class Driver{
    public static void main(String[] args){
        Adventurer p1 = new Fairy("Emerald Fairy",50);
        Adventurer p2 = new Fairy("Diamond Fairy",50);
        System.out.println(p1.attack(p2));
        System.out.println(p2.attack(p1));
        System.out.println(p1.specialAttack(p2));
        System.out.println(p1.specialAttack(p2));
    }



}