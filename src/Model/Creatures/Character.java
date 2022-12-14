package Model.Creatures;

public abstract class Character {
    //Variables
    private int hitPoints;
    private int defense;
    private int agility;
    private int baseAttack;

    //Constructors
    public Character(){

    }

    public Character(int hitPoints, int defense, int agility, int baseAttack) {
        this.hitPoints = hitPoints;
        this.defense = defense;
        this.agility = agility;
        this.baseAttack = baseAttack;
    }

    //Getters
    public int getHitPoints() {
        return hitPoints;
    }

    public int getDefense() {
        return defense;
    }

    public int getAgility() {
        return agility;
    }

    public int getBaseAttack() {
        return baseAttack;
    }

    //toString
    @Override
    public String toString() {
        return "Character{" +
                "hitPoints=" + hitPoints +
                ", defense=" + defense +
                ", agility=" + agility +
                ", baseAttack=" + baseAttack +
                '}';
    }
}
