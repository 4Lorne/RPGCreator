package View;

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

        //user controller
        setLayout(cardLayout);

        //Adding the views to the frame
        add(characterCreator, "creator");
        //add(battle,"battle");

        //Setting size,close operation, and visibility
        setSize(1280,720);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
}
