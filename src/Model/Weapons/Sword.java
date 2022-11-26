package Model.Weapons;

public class Sword extends Weapon{
    private int attackMod = 5;
    private int weight = 10;
    public Sword(){

    }
    public Sword(int attackMod,int weight){
        super(attackMod, weight);
    }

    public int getAttackMod() {
        return attackMod;
    }

    public int getWeight() {
        return weight;
    }
}
