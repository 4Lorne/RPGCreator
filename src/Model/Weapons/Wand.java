package Model.Weapons;

public class Wand extends Weapon{
    //Variables
    private int attackMod = 2;
    private int weight = 2;

    //Constructor
    public Wand(){

    }
    public Wand(int attackMod,int weight, String name){
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
