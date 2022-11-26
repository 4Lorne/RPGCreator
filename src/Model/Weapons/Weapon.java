package Model.Weapons;

public class Weapon {
    private WEAPONS weapon;

    enum WEAPONS{
        Sword,
        Staff,
        Wand
    }

    private int attackMod;
    private int weight;

    public int getAttackMod() {
        return attackMod;
    }

    public int getWeight() {
        return weight;
    }

    public Weapon(){

    }

    public Weapon(int attackMod,int weight){
        this.attackMod = attackMod;
        this.weight = weight;
    }

}
