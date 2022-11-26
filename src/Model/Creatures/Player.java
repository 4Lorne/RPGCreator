package Model.Creatures;

public class Player extends Character{
    public String getName() {
        return name;
    }

    public String getCharType() {
        return charType;
    }

    private String name;
    private String charType;

    public String getWeapon() {
        return weapon;
    }

    private String weapon;
    public Player() {

    }
    public Player(int hitPoints, int defense, int agility, int baseAttack, String name, String charType,String weapon){
        super(hitPoints,defense,agility,baseAttack);
        this.name = name;
        this.charType = charType;
        this.weapon = weapon;
    }

    @Override
    public String toString() {
        return super.toString() + "Player{" +
                "name='" + name + '\'' +
                ", charType='" + charType + '\'' +
                '}';
    }
}
