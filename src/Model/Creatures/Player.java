package Model.Creatures;

public class Player extends Character{
    private String name;
    private String charType;
    public Player() {

    }
    public Player(int hitPoints, int defense, int agility, int baseAttack, String name, String charType){
        super(hitPoints,defense,agility,baseAttack);
        this.name = name;
        this.charType = charType;
    }

    @Override
    public String toString() {
        return super.toString() + "Player{" +
                "name='" + name + '\'' +
                ", charType='" + charType + '\'' +
                '}';
    }
}
