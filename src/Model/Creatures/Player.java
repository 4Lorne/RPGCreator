package Model.Creatures;

public class Player extends Character{
    private String name;
    Player(int hitPoints, int defense, int agility, int baseAttack, String name){
        super(hitPoints,defense,agility,baseAttack);
        this.name = name;
    }

}
