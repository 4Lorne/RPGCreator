package Model.Creatures;

import Model.Weapons.Weapon;

public class Cleric extends Player{
    Cleric(int hitPoints, int defense, int agility, int baseAttack, String name, String charType, Weapon weapon){
        super(hitPoints, defense, agility, baseAttack, name, charType,weapon);

    }
}
