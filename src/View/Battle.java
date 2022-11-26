package View;

import Model.Creatures.Player;

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

    public void getStats(Player player){
        results.setText(player.toString());
    }
}
