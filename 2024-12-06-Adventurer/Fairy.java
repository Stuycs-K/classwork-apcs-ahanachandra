public class Fairy extends Adventurer{
    private int special;
    public Fairy(String name){
        super(name);
        this.special = 0;
    }
    public Fairy(String name, int hp){
        super(name, hp);
        this.special = 0;
    }
    
    public String getSpecialName(){
        return "fairy_dust";
    }







}