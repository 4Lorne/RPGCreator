package Model.Creatures;

public class Monster extends Character{
    private String name;

    Monster(int hitPoints, int defense, int agility, int baseAttack, String name){
        super(hitPoints, defense, agility, baseAttack);
        this.name = name;

    }
}
