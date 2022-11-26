package View;

import Model.Creatures.Player;
import Model.Weapons.Weapon;

import javax.swing.*;

public class Battle extends JPanel {
    JLabel battleTitle = new JLabel("Battle To The Death!");
    JLabel characterTitle = new JLabel("");
    JLabel monsterTitle = new JLabel("");

    JTextArea results = new JTextArea();
    JButton playAgain = new JButton("Play Again");

    CharacterCreator characterCreator = new CharacterCreator();
    public Battle(){
        setLayout(null);
        results.setBounds(20,300,600,300);
        add(results);
    }

    public void getStats(Player player, Weapon weapon){
        results.setText(String.format("Player: %s \n -------------------\n" +
                "Class: %s\n" +
                "HP: %d\tDefense:%d\tAgility:%d\tBase Attack:%d\n"+
                "Weapon: %s\t\tWeight: %d\tAttack Mod: %d"
                ,player.getName(),player.getCharType(),player.getHitPoints(),player.getDefense(),player.getAgility(),player.getBaseAttack(),player.getWeapon(),weapon.getWeight(),weapon.getAttackMod()));
    }
}
