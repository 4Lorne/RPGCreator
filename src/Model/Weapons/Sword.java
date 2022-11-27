package Model.Weapons;

public class Sword extends Weapon{
    //Variables
    private int attackMod = 5;
    private int weight = 10;

    //Constructor
    public Sword(){

    }

    public Sword(int attackMod,int weight, String name){
        super(attackMod, weight, name);
    }

    //Getters
    public int getAttackMod() {
        return attackMod;
    }

    public int getWeight() {
        return weight;
    }
}
