package Model.Weapons;

public class Wand extends Weapon{
    private int attackMod = 2;
    private int weight = 2;

    public Wand(){

    }

    public Wand(int attackMod,int weight){
        super(attackMod, weight);
    }

    public int getAttackMod() {
        return attackMod;
    }

    public int getWeight() {
        return weight;
    }
}
