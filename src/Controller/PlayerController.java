package Controller;

import Model.Creatures.Cleric;
import Model.Creatures.Player;
import Model.Creatures.Warrior;
import Model.Creatures.Wizard;
import Model.Weapons.Sword;
import Model.Weapons.Weapon;
import View.Battle;
import View.CharacterCreator;

public class PlayerController {
    //Objects
    private Player player;
    private CharacterCreator charCreator;
    private Battle battle;

    public PlayerController(Player player, CharacterCreator charCreator, Battle battle){
        this.player = player;
        this.charCreator = charCreator;
        this.battle = battle;

        //Changes the text to an image when a radio button is selected
        charCreator.displayImage(e -> {
            this.charCreator.isSelected();
        });

        charCreator.displayWeapon(e ->{
            this.charCreator.weapIsSelected();
        });

        //Randomizes the values in the stat text boxes
        charCreator.setReroll(e -> {
            this.charCreator.setCharHp();
            this.charCreator.setCharDef();
            this.charCreator.setCharAgil();
            this.charCreator.setCharBaseAtk();
        });

        //Creates the character object
        charCreator.startBattle(e -> {
            String name = this.charCreator.getCharName().getText().trim();
            String charClass = this.charCreator.getCharClass();
            String weapName = this.charCreator.getWeap();

            int hp = Integer.parseInt(charCreator.getCharHp().getText().trim());
            int defense = Integer.parseInt(charCreator.getCharDef().getText().trim());
            int agility = Integer.parseInt(charCreator.getCharAgil().getText().trim());
            int baseAttack = Integer.parseInt(charCreator.getCharBaseAtk().getText().trim());

            int attackMod = Integer.parseInt(charCreator.getWeapAtkMod().getText().trim());
            int weight = Integer.parseInt(charCreator.getWeapWeight().getText().trim());


            Weapon weapon = new Weapon(attackMod,weight,weapName);
            //Constructor
            if (charClass.contains("Warrior")){
                Player newWarrior = new Warrior(hp,defense,agility,baseAttack,name,charClass,weapon,"Berserk");
                this.battle.getStats(newWarrior,weapon);
                this.battle.setClass(newWarrior);
            } else if (charClass.contains("Cleric")){
                Player newCleric = new Cleric(hp,defense,agility,baseAttack,name,charClass, weapon,"Prayer");
                this.battle.getStats(newCleric,weapon);
                this.battle.setClass(newCleric);
            } else if (charClass.contains("Wizard")){
                Player newWizard = new Wizard(hp,defense,agility,baseAttack,name,charClass,weapon,"Spell Bomb");
                this.battle.getStats(newWizard,weapon);
                this.battle.setClass(newWizard);
            }

            //Adds things to the battle screen
            this.battle.setMonster();

        });



    }
}
