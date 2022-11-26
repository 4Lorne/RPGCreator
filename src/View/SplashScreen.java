package View;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class SplashScreen extends JPanel{
    JButton button = new JButton("Build a Character");
    JLabel title = new JLabel("RPG Maker");
    JLabel splash = new JLabel("");
    public SplashScreen(){
        title.setFont(new Font("Serif", Font.PLAIN,30));
        button.setFont(new Font("Serif", Font.PLAIN,20));
        splash.setIcon(new ImageIcon(getClass().getResource("../Images/splash.png")));
        setLayout(null);
        title.setBounds(300,50,200,100);
        add(title);
        splash.setBounds(100,150,600,300);
        add(splash);
        button.setBounds(265,500,200,50);
        add(button);
    }
    public void createCharacter(ActionListener actionListener){
        button.addActionListener(actionListener);
    }
}
