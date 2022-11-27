package View;

import Controller.PlayerController;
import Model.Creatures.Player;
import com.sun.tools.javac.Main;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class MainFrame extends JFrame {
    private final CardLayout cardLayout;

    public MainFrame(){
        super("RPG Creator");
        cardLayout = new CardLayout();
        //Different views
        SplashScreen splashScreen = new SplashScreen();
        CharacterCreator characterCreator = new CharacterCreator();
        Battle battle = new Battle();

        //Objects
        Player player = new Player();

        //Setting layout
        setLayout(cardLayout);

        //user controller
        new PlayerController(player,characterCreator,battle);

        //Adding the views to the frame
        add(splashScreen, "splash");
        add(characterCreator, "creator");
        add(battle,"battle");

        //Changes frames if button is pressed
        splashScreen.createCharacter(e -> {
            cardLayout.show(MainFrame.this.getContentPane(),"creator");
        });
        characterCreator.startBattle(e -> {
            cardLayout.show(MainFrame.this.getContentPane(),"battle");
        });
        //Restarts the GUI
        battle.newGame(e->{
            dispose();
            new MainFrame();
        });

        //Setting size,close operation, and visibility
        setSize(720,720);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
}
