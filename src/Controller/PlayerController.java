package Controller;

import Model.Creatures.Player;
import Model.Creatures.Warrior;
import View.Battle;
import View.CharacterCreator;

public class PlayerController {
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
            //add error handling

            int hp = Integer.parseInt(charCreator.getCharHp().getText().trim());
            int defense = Integer.parseInt(charCreator.getCharDef().getText().trim());
            int agility = Integer.parseInt(charCreator.getCharAgil().getText().trim());
            int baseAttack = Integer.parseInt(charCreator.getCharBaseAtk().getText().trim());

            int attackMod = Integer.parseInt(charCreator.getWeapAtkMod().getText().trim());
            int weight = Integer.parseInt(charCreator.getWeapWeight().getText().trim());

            Player newPlayer = new Player(hp,defense,agility,baseAttack,name,charClass);

            this.battle.getStats(newPlayer);
            //TODO: Build character after all input is taken
            System.out.println(newPlayer.toString());
        });





    }
}
