package View;

import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;

public class CharacterCreator extends JPanel {

    private JTextField charName = new JTextField(25);
    private JTextField charHp = new JTextField(5);
    private JTextField charDef = new JTextField(5);
    private JTextField charAgil = new JTextField(5);
    private JTextField charBaseAtk = new JTextField(5);

    private JTextField weapAtkMod = new JTextField(5);
    private JTextField weapWeight = new JTextField(5);

    private JTextArea classDescription = new JTextArea(5,20);
    private JTextArea weaponDescription = new JTextArea(5,20);

    //Labels for all the sections

    //Title
    private final JLabel charGen = new JLabel("Character Generator");

    //Sections
    private final JLabel enterName = new JLabel("Enter Name");
    private final JLabel charType = new JLabel("Character Type");
    private final JLabel charStats = new JLabel("Character Stats");
    private final JLabel selectWeapon = new JLabel("Select Your Weapon");
    private final JLabel weaponStats = new JLabel("Weapon Stats");

    //Character stats
    private final JLabel hitPoints = new JLabel("Hit Points");
    private final JLabel defense = new JLabel("Defense");
    private final JLabel agility = new JLabel("Agility");
    private final JLabel baseAttack = new JLabel("Base Attack");

    //Weapon stats
    private final JLabel attackModifier = new JLabel("Attack Modifier");
    private final JLabel weight = new JLabel("Weight");

    //Appears before class is chosen
    private final JLabel selectAClass = new JLabel("Select a Class");
    private final JLabel selectAWeapon = new JLabel("Select a Weapon");


    //Radio buttons for options
    private JRadioButton warriorSelection = new JRadioButton("Warrior");
    private JRadioButton wizardSelection = new JRadioButton("Wizard");
    private JRadioButton clericSelection = new JRadioButton("Cleric");

    private JRadioButton daggerSelection = new JRadioButton("Dagger");
    private JRadioButton swordSelection = new JRadioButton("Sword");
    private JRadioButton hammerSelection = new JRadioButton("Hammer");

    //Buttons to reroll stats and start final battle
    private JButton reroll = new JButton("Reroll");
    private JButton startBattle = new JButton("Start Battle");



    //Button groups for radio buttons
    ButtonGroup classSelection = new ButtonGroup();
    ButtonGroup weaponSelection = new ButtonGroup();

    //Constraints
    GridBagConstraints gc = new GridBagConstraints();

    public CharacterCreator(){
        setLayout(new GridBagLayout());

        //Distance between elements
        gc.insets = new Insets(5,5,5,5);

        gc.gridwidth=20;

        //Setting font and size of text
        charGen.setFont(new Font("Serif", Font.PLAIN,30));
        enterName.setFont(new Font("Serif", Font.PLAIN,25));
        charType.setFont(new Font("Serif", Font.PLAIN,25));
        charStats.setFont(new Font("Serif", Font.PLAIN,25));
        selectWeapon.setFont(new Font("Serif", Font.PLAIN,25));
        weaponStats.setFont(new Font("Serif", Font.PLAIN,25));

        //Adding buttons to group
        classSelection.add(warriorSelection);
        classSelection.add(wizardSelection);
        classSelection.add(clericSelection);

        weaponSelection.add(daggerSelection);
        weaponSelection.add(swordSelection);
        weaponSelection.add(hammerSelection);

        classDescription.setEditable(false);
        weaponDescription.setEditable(false);


        gc.gridx = 0;
        gc.gridy= 0;

        add(charGen,gc);

        gc.gridx = 2;
        gc.gridy = 1;
        add(enterName,gc);

    }
}
