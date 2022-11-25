package Model.Creatures;

public abstract class Character {
    private int hitPoints;
    private int defense;
    private int agility;
    private int baseAttack;

    public Character(){

    }

    public Character(int hitPoints, int defense, int agility, int baseAttack) {
        this.hitPoints = hitPoints;
        this.defense = defense;
        this.agility = agility;
        this.baseAttack = baseAttack;
    }
}
