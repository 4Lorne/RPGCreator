package Model.Creatures;

import Model.Weapons.Weapon;

public class Wizard extends Player{
    Weapon weapon = new Weapon();
    Wizard(int hitPoints, int defense, int agility, int baseAttack, String name, String charType, Weapon weapon){
        super(hitPoints, defense, agility, baseAttack, name, charType,weapon);

    }
}
