public class Fairy extends Adventurer{
    private int special;
    private int specialmax = 50;
    public Fairy(String name){
        super(name);
        this.special = 0;
    }
    public Fairy(String name, int hp){
        super(name, hp);
        this.special = 0;
    }
    
    public String getSpecialName(){
        return "fairy dust";
    }

    public int getSpecial(){
        return special;
    }

    public void setSpecial(int n){
        special = n;
    }

    public int getSpecialMax(){
        return specialmax;
    }

    public String attack(Adventurer other){
        other.applyDamage(5);
        return "attacked " + other.getName() + " and reduced HP by 5";
    }

    public String support(Adventurer other){
        return "supporting " + other.getName();
    }

    public String support(){
        return "supporting " + this.getName();
    }

    public String specialAttack(Adventurer other){
        other.applyDamage(5);
        this.applyDamage(5);
        return "attacked " + other.getName() + " and reduced both own and other's HP by 5";
    }







}