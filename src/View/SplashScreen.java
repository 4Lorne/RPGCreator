package View;

import javax.swing.*;
import java.awt.event.ActionListener;

public class SplashScreen extends JPanel{
    JButton button = new JButton("Build a Character");

    public SplashScreen(){
        add(button);
    }
    public void createCharacter(ActionListener actionListener){
        button.addActionListener(actionListener);
    }
}
