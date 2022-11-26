package View;

import Model.Weapons.Staff;
import Model.Weapons.Sword;
import Model.Weapons.Wand;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.util.concurrent.ThreadLocalRandom;

public class CharacterCreator extends JPanel {
    //Character stat text field
    private JTextField charName = new JTextField(15);

    private JTextField charHp = new JTextField(5);
    private JTextField charDef = new JTextField(5);
    private JTextField charAgil = new JTextField(5);
    private JTextField charBaseAtk = new JTextField(5);

    //Weapon stat text field
    private JTextField weapAtkMod = new JTextField(5);
    private JTextField weapWeight = new JTextField(5);

    //Descriptions for classes and weapons
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

    private JRadioButton staffSelection = new JRadioButton("Staff");
    private JRadioButton swordSelection = new JRadioButton("Sword");
    private JRadioButton wandSelection = new JRadioButton("Wand");

    //Buttons to reroll stats and start final battle
    private JButton reroll = new JButton("Reroll");
    private JButton startBattle = new JButton("Start Battle");

    //Button groups for radio buttons
    ButtonGroup classSelection = new ButtonGroup();
    ButtonGroup weaponSelection = new ButtonGroup();

    Sword sword = new Sword();
    Staff staff = new Staff();
    Wand wand = new Wand();

    public CharacterCreator(){
        setLayout(null);

        //Setting font and size of text
        charGen.setFont(new Font("Serif", Font.PLAIN,30));
        enterName.setFont(new Font("Serif", Font.PLAIN,25));
        charType.setFont(new Font("Serif", Font.PLAIN,25));
        charStats.setFont(new Font("Serif", Font.PLAIN,25));
        selectWeapon.setFont(new Font("Serif", Font.PLAIN,25));
        weaponStats.setFont(new Font("Serif", Font.PLAIN,25));

        warriorSelection.setFont(new Font("Serif", Font.PLAIN,20));
        wizardSelection.setFont(new Font("Serif", Font.PLAIN,20));
        clericSelection.setFont(new Font("Serif", Font.PLAIN,20));

        staffSelection.setFont(new Font("Serif", Font.PLAIN,20));
        swordSelection.setFont(new Font("Serif", Font.PLAIN,20));
        wandSelection.setFont(new Font("Serif", Font.PLAIN,20));

        //Sets the initial value of the stats
        hitPoints.setFont(new Font("Serif", Font.PLAIN,20));
        defense.setFont(new Font("Serif", Font.PLAIN,20));
        agility.setFont(new Font("Serif", Font.PLAIN,20));
        baseAttack.setFont(new Font("Serif", Font.PLAIN,20));

        attackModifier.setFont(new Font("Serif", Font.PLAIN,20));
        weight.setFont(new Font("Serif", Font.PLAIN,20));

        reroll.setFont(new Font("Serif", Font.PLAIN,20));
        startBattle.setFont(new Font("Serif", Font.PLAIN,20));

        //Adding buttons to group
        classSelection.add(warriorSelection);
        classSelection.add(wizardSelection);
        classSelection.add(clericSelection);

        weaponSelection.add(staffSelection);
        weaponSelection.add(swordSelection);
        weaponSelection.add(wandSelection);

        classDescription.setEditable(false);
        weaponDescription.setEditable(false);

        //Main title
        charGen.setBounds(50,0,300,100);
        add(charGen);

        //Enter name and text box
        enterName.setBounds(50,50,250,100);
        add(enterName);

        charName.setBounds(180,95,125,20);
        add(charName);

        //Character type title
        charType.setBounds(50,100,300,100);
        add(charType);


        //Radio buttons
        warriorSelection.setBounds(50,180,100,20);
        add(warriorSelection);
        wizardSelection.setBounds(50,220,100,20);
        add(wizardSelection);
        clericSelection.setBounds(50,260,100,20);
        add(clericSelection);
        //Visible while no class is selected
        selectAClass.setBounds(250,220,100,50);
        add(selectAClass);
        //Description
        classDescription.setBounds(50,300,400,50);
        classDescription.setLineWrap(true);
        add(classDescription);

        //Weapon title
        selectWeapon.setBounds(50,350,400,50);
        add(selectWeapon);

        //Radio buttons
        staffSelection.setBounds(50,420,100,25);
        add(staffSelection);
        swordSelection.setBounds(50,460,100,25);
        add(swordSelection);
        wandSelection.setBounds(50,500,100,25);
        add(wandSelection);

        selectAWeapon.setBounds(250,460,100,20);
        add(selectAWeapon);

        weaponDescription.setBounds(50,530,400,100);
        weaponDescription.setLineWrap(true);
        add(weaponDescription);


        charStats.setBounds(500,100,300,100);
        add(charStats);

        hitPoints.setBounds(500,140,300,100);
        add(hitPoints);
        charHp.setBounds(600,183,50,20);
        add(charHp);

        defense.setBounds(500,170,300,100);
        add(defense);
        charDef.setBounds(600,213,50,20);
        add(charDef);
        agility.setBounds(500,200,300,100);
        add(agility);
        charAgil.setBounds(600,243,50,20);
        add(charAgil);
        baseAttack.setBounds(500,230,300,100);
        add(baseAttack);
        charBaseAtk.setBounds(600,273,50,20);
        add(charBaseAtk);

        reroll.setBounds(525,315,100,20);
        add(reroll);

        weaponStats.setBounds(500,350,400,50);
        add(weaponStats);

        attackModifier.setBounds(500,400,300,100);
        add(attackModifier);
        weapAtkMod.setBounds(630,443,50,20);
        add(weapAtkMod);
        weight.setBounds(500,430,300,100);
        add(weight);
        weapWeight.setBounds(600,473,50,20);
        add(weapWeight);

        startBattle.setBounds(500,575,150,20);
        add(startBattle);
    }

    //Listener for the radio button
    public void displayImage(ActionListener actionListener){
        warriorSelection.addActionListener(actionListener);
        wizardSelection.addActionListener(actionListener);
        clericSelection.addActionListener(actionListener);
    }

    public void displayWeapon(ActionListener actionListener){
        staffSelection.addActionListener(actionListener);
        swordSelection.addActionListener(actionListener);
        wandSelection.addActionListener(actionListener);
    }

    //Changes the image when a radio button is selected
    public void isSelected(){
        if (warriorSelection.isSelected() == true){
            setCharStats();
            selectAClass.setBounds(250,200,64,64);
            selectAClass.setIcon(new ImageIcon(getClass().getResource("../Images/Warrior.png")));
            classDescription.setText("The Warrior wears strong armor and uses his magic helmet to inspire his allies in battle.");

        } else if (wizardSelection.isSelected() == true){
            selectAClass.setBounds(250,200,64,64);
            setCharStats();
            selectAClass.setIcon(new ImageIcon(getClass().getResource("../Images/Wizard.png")));
            classDescription.setText("The Wizard deals damage from a long distance and blasts enemies with powerful spells.");

        } else if (clericSelection.isSelected() == true){
            selectAClass.setBounds(250,200,64,64);
            setCharStats();
            selectAClass.setIcon(new ImageIcon(getClass().getResource("../Images/Priest.png")));
            classDescription.setText("The Cleric attacks at long range and can heal himself and his allies.");

        }
    }

    public void weapIsSelected(){
        if (staffSelection.isSelected() == true){
            selectAWeapon.setBounds(250,440,64,64);
            weapAtkMod.setText(String.valueOf(staff.getAttackMod()));
            weapWeight.setText(String.valueOf(staff.getWeight()));
            selectAWeapon.setIcon(new ImageIcon(getClass().getResource("../Images/Staff.png")));
            weaponDescription.setText("A magical wooden staff topped with a white crystal.");
        } else if (swordSelection.isSelected() == true){
            selectAWeapon.setBounds(250,440,64,64);
            weapAtkMod.setText(String.valueOf(sword.getAttackMod()));
            weapWeight.setText(String.valueOf(sword.getWeight()));
            selectAWeapon.setIcon(new ImageIcon(getClass().getResource("../Images/Sword.png")));
            weaponDescription.setText("A steel short sword.");
        } else if (wandSelection.isSelected()){
            selectAWeapon.setBounds(250,440,64,64);
            weapAtkMod.setText(String.valueOf(wand.getAttackMod()));
            weapWeight.setText(String.valueOf(wand.getWeight()));
            selectAWeapon.setIcon(new ImageIcon(getClass().getResource("../Images/Wand.png")));
            weaponDescription.setText("A wand that casts a simple fire spell.");
        }
    }

    //Action listeners for when the button is clicked
    public void setReroll(ActionListener actionListener){
        reroll.addActionListener(actionListener);
    }

    public void startBattle(ActionListener actionListener){
        startBattle.addActionListener(actionListener);
    }

    //Returns their class type
    public String getCharClass() {
        if (warriorSelection.isSelected() == true) {
            return warriorSelection.getText();
        } else if (wizardSelection.isSelected() == true){
            return wizardSelection.getText();
        } else if (clericSelection.isSelected() == true){
            return clericSelection.getText();
        } else {
            return null;
        }
    }

    public String getWeap(){
        if (staffSelection.isSelected() == true){
            return staffSelection.getText();
        } else if (swordSelection.isSelected() == true){
            return swordSelection.getText();
        } else if (wandSelection.isSelected() == true){
            return wandSelection.getText();
        } else {
            return null;
        }
    }

    public void setCharStats(){
        charHp.setText((Integer.toString(ThreadLocalRandom.current().nextInt(50,100+1))));
        charDef.setText((Integer.toString(ThreadLocalRandom.current().nextInt(50,100+1))));
        charAgil.setText((Integer.toString(ThreadLocalRandom.current().nextInt(50,100+1))));
        charBaseAtk.setText((Integer.toString(ThreadLocalRandom.current().nextInt(50,100+1))));
    }

    //Getters
    public JTextField getCharName() {
        return charName;
    }

    public JTextField getCharHp() {
        return charHp;
    }

    public JTextField getCharDef() {
        return charDef;
    }

    public JTextField getCharAgil() {
        return charAgil;
    }

    public JTextField getCharBaseAtk() {
        return charBaseAtk;
    }

    public JTextField getWeapAtkMod() {
        return weapAtkMod;
    }

    public JTextField getWeapWeight() {
        return weapWeight;
    }

    public JTextArea getClassDescription() {
        return classDescription;
    }

    public JTextArea getWeaponDescription() {
        return weaponDescription;
    }

    //Setters
    public void setCharHp() {
        this.charHp.setText(Integer.toString(ThreadLocalRandom.current().nextInt(50,100+1)));
    }

    public void setCharDef() {
        this.charDef.setText(Integer.toString(ThreadLocalRandom.current().nextInt(50,100+1)));
    }

    public void setCharAgil() {
        this.charAgil.setText(Integer.toString(ThreadLocalRandom.current().nextInt(50,100+1)));
    }

    public void setCharBaseAtk() {
        this.charBaseAtk.setText(Integer.toString(ThreadLocalRandom.current().nextInt(50,100+1)));
    }
}
