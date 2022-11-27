package Model.Weapons;

public class Weapon {
    //Variables
    private int attackMod;
    private int weight;
    private String name;

    //Constructor
    public Weapon(){

    }

    public Weapon(int attackMod,int weight, String name){
        this.attackMod = attackMod;
        this.weight = weight;
        this.name = name;
    }

    //Getter
    public String getName() {
        return name;
    }

    public int getAttackMod() {
        return attackMod;
    }

    public int getWeight() {
        return weight;
    }

}
