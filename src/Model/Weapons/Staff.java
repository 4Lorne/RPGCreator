package Model.Weapons;

public class Staff extends Weapon{
    //Variables
    private int attackMod = 3;
    private int weight = 5;

    //Constructor
    public Staff(){

    }

    public Staff(int attackMod,int weight, String name){
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
