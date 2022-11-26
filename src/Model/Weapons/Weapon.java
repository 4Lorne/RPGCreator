package Model.Weapons;

public abstract class Weapon {
    private int attackMod;
    private int weight;

    public Weapon(){

    }

    public Weapon(int attackMod, int weight){
        this.attackMod = attackMod;
        this.weight = weight;
    }
}
