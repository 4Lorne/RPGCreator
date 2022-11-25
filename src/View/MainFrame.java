package View;

import Controller.PlayerController;
import Model.Creatures.Player;

import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame {
    private CardLayout cardLayout;

    public MainFrame(){
        super("RPG Creator");
        cardLayout = new CardLayout();
        //Different views
        CharacterCreator characterCreator = new CharacterCreator();
        Battle battle = new Battle();

        //Objects
        Player player = new Player();

        //user controller
        new PlayerController(player,characterCreator);

        //Setting layout
        setLayout(cardLayout);

        //Adding the views to the frame
        add(characterCreator, "creator");

        //add(battle,"battle");

        //Setting size,close operation, and visibility
        setSize(720,720);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
}
