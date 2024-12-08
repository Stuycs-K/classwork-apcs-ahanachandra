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









}