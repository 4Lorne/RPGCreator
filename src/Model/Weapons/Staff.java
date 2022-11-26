package Model.Weapons;

public class Staff extends Weapon{
    private int attackMod = 3;
    private int weight = 5;

    public Staff(){

    }

    public Staff(int attackMod,int weight){
        super(attackMod, weight);
    }

    public int getAttackMod() {
        return attackMod;
    }

    public int getWeight() {
        return weight;
    }
}
