package Model.Creatures;

public class Monster extends Character{
    //Variables
    private String name;

    //Constructor
    public Monster(int hitPoints, int defense, int agility, int baseAttack, String name){
        super(hitPoints, defense, agility, baseAttack);
        this.name = name;

    }

    //Getter
    public String getName() {
        return name;
    }
}
