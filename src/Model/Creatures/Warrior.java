package Model.Creatures;

import Model.Weapons.Weapon;

public class Warrior extends Player{
    private String specialAbility;

    //Constructor
    public Warrior(int hitPoints, int defense, int agility, int baseAttack, String name, String charType, Weapon weapon, String specialAbility){
        super(hitPoints, defense, agility, baseAttack, name,charType,weapon);
        this.specialAbility = specialAbility;
    }
    @Override
    public String getSpecialAbility() {
        return specialAbility;
    }
}
