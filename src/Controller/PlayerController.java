package Controller;

import Model.Creatures.Player;
import Model.Creatures.Warrior;
import View.CharacterCreator;

public class PlayerController {
    private Player player;
    private CharacterCreator charCreator;

    public PlayerController(Player player, CharacterCreator charCreator){
        this.player = player;
        this.charCreator = charCreator;

        charCreator.setReroll(e -> {
            this.charCreator.setCharHp();
            this.charCreator.setCharDef();
            this.charCreator.setCharAgil();
            this.charCreator.setCharBaseAtk();
        });

        charCreator.startBattle(e -> {
            String name = this.charCreator.getCharName().getText().trim();
            String charClass = this.charCreator.getCharClass();
            //add error handling

            //Commenting out until testing is done
//            int hp = Integer.parseInt(charCreator.getCharHp().getText().trim());
//            int defense = Integer.parseInt(charCreator.getCharDef().getText().trim());
//            int agility = Integer.parseInt(charCreator.getCharAgil().getText().trim());
//            int baseAttack = Integer.parseInt(charCreator.getCharBaseAtk().getText().trim());



            //TODO: Build character after all input is taken
            System.out.println(name);
            //System.out.println(hp);
            System.out.println(charClass);
        });



    }
}
