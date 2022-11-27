package Model.Creatures;

import Model.Weapons.Weapon;

public class Warrior extends Player{
    //Constructor
    public Warrior(int hitPoints, int defense, int agility, int baseAttack, String name, String charType, Weapon weapon){
        super(hitPoints, defense, agility, baseAttack, name, charType,weapon);
    }
}
