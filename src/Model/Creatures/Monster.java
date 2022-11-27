package Model.Creatures;

public class Monster extends Character{
    private String name;

    public Monster(int hitPoints, int defense, int agility, int baseAttack, String name){
        super(hitPoints, defense, agility, baseAttack);
        this.name = name;

    }

    public String getName() {
        return name;
    }
}
