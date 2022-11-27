package Model.Creatures;

import Model.Weapons.Weapon;

public class Player extends Character{
    //Variables
    private String name;
    private String charType;
    private Weapon weapon = new Weapon();

    //Constructors
    public Player() {
    }

    public Player(int hitPoints, int defense, int agility, int baseAttack, String name, String charType, Weapon weapon){
        super(hitPoints,defense,agility,baseAttack);
        this.name = name;
        this.charType = charType;
        this.weapon = weapon;
    }

    //Getters
    public String getName() {
        return name;
    }

    public String getCharType() {
        return charType;
    }

    public String getWeapon() {
        return String.valueOf(weapon.getClass());
    }

    //toString
    @Override
    public String toString() {
        return super.toString() + "Player{" +
                "name='" + name + '\'' +
                ", charType='" + charType + '\'' +
                '}';
    }
}
