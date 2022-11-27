package View;

import Model.Creatures.Monster;
import Model.Creatures.Player;
import Model.Weapons.Weapon;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class Battle extends JPanel {
    //Monsters are only used on this screen, so I instantiated them here to make things simpler.
    Monster beholder = new Monster(50,10,20,30,"Beholder");
    Monster flyingBrain = new Monster(75,20,10,15,"Flying Brain");

    JLabel battleTitle = new JLabel("Battle To The Death!");

    JLabel characterTitle = new JLabel("");
    JLabel characterImage = new JLabel("");
    JLabel monsterTitle = new JLabel("");
    JLabel monsterImage = new JLabel("");

    JTextArea results = new JTextArea();
    JButton playAgain = new JButton("Play Again");

    CharacterCreator characterCreator = new CharacterCreator();
    public Battle(){
        setLayout(null);

        battleTitle.setFont(new Font("Serif", Font.PLAIN,50));
        battleTitle.setBounds(125,10,500,100);
        add(battleTitle);

        characterTitle.setBounds(125,100,100,100);
        add(characterTitle);
        characterImage.setBounds(140,150,100,100);
        add(characterImage);
        monsterTitle.setBounds(400,100,150,100);
        add(monsterTitle);
        monsterImage.setBounds(425,150,100,100);
        add(monsterImage);

        results.setBounds(50,300,600,250);
        add(results);
        playAgain.setBounds(300,600,100,50);
        add(playAgain);
    }

    //Prints the stats of the player and monster in the text box
    public void getStats(Player player, Weapon weapon){
        results.setText(String.format("Player: %s \n -------------------\n" +
                "Class: %s\n" +
                "HP: %d\tDefense:%d\tAgility:%d\tBase Attack:%d\n"+
                "Weapon: %s\t\tWeight: %d\tAttack Mod: %d\tSpecial Ability:%s"
                ,player.getName(),player.getCharType(),player.getHitPoints(),player.getDefense(),player.getAgility(),player.getBaseAttack(),weapon.getName(),weapon.getWeight(),weapon.getAttackMod(),player.getSpecialAbility()));
    }


    //Sets the image of the player battling and the name of the class
    public void setClass(Player player){
        characterTitle.setText("Player: "+player.getCharType());
        if (player.getCharType().contains("Warrior")){
            characterImage.setIcon(new ImageIcon(getClass().getResource("../Images/Warrior.png")));
        } else if (player.getCharType().contains("Wizard")){
            characterImage.setIcon(new ImageIcon(getClass().getResource("../Images/Wizard.png")));
        } else if (player.getCharType().contains("Cleric")){
            characterImage.setIcon(new ImageIcon(getClass().getResource("../Images/Priest.png")));
        }
    }

    //Sets the monsters name and image
    public void setMonster(){
        if (characterTitle.getText().contains("Warrior") || characterTitle.getText().contains("Wizard")){
            monsterTitle.setText("Monster: "+flyingBrain.getName());
            monsterImage.setIcon(new ImageIcon(getClass().getResource("../Images/Flying_Brain.png")));
            results.append(String.format("\n\n\nMonster: %s\n -------------------\n" +
                    "HP: %d\t\tDefense: %d\tAgility:%d\tBase Attack:%d",flyingBrain.getName(),flyingBrain.getHitPoints(),flyingBrain.getDefense(),flyingBrain.getAgility(),flyingBrain.getBaseAttack()));
        } else if (characterTitle.getText().contains("Cleric")){
            monsterTitle.setText("Monster: "+beholder.getName());
            monsterImage.setIcon(new ImageIcon(getClass().getResource("../Images/Beholder.png")));
            results.append(String.format("\n\n\nMonster: %s\n -------------------\n" +
                    "HP: %d\t\tDefense: %d\tAgility:%d\tBase Attack:%d",beholder.getName(),beholder.getHitPoints(),beholder.getDefense(),beholder.getAgility(),beholder.getBaseAttack()));
        }
    }

    //Button functionality
    public void newGame(ActionListener actionListener){
        playAgain.addActionListener(actionListener);
    }
}
