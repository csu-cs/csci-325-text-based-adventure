package csu.csci325;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GameBehindTheScenes
{
    private JButton button1;
    private JButton button2;
    private JButton button3;
    private JButton button4;
    private JLabel theLabel;
    private JFrame theFrame;
    private JPanel thePanel;

    public GameBehindTheScenes()
    {

    }

    public void startOfGame()
    {
        button1 = new JButton("North");
        button2 = new JButton("South");
        button3 = new JButton("East");
        button4 = new JButton("West");
        thePanel = new JPanel();
        theFrame = new JFrame();
        theLabel = new JLabel("Welcome to the Game.");

        thePanel.add(button1);
        thePanel.add(button2);
        thePanel.add(button3);
        thePanel.add(button4);
        thePanel.add(theLabel);


        theFrame.add(thePanel);
        theFrame.setVisible(true);
        theFrame.setSize(200, 150);
    }

    public void yesOrNoOption()
    {

        button1 = new JButton("Yes");
        button2 = new JButton("No");
        thePanel = new JPanel();
        theFrame = new JFrame();

        thePanel.add(button1);
        thePanel.add(button2);

        theFrame.add(thePanel);
        theFrame.setVisible(true);
        theFrame.setSize(200,150);

    }

    public void secondScenario()
    {

    }
        public void displayScenario() {

            button1.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {

                    theFrame.dispose();
                    yesOrNoOption();
                    theLabel = new JLabel("Welcome to north!");
                    thePanel.add(theLabel);

                    button1.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            theFrame.dispose();
                            secondScenario();
                        }
                    });
                    button2.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            theFrame.dispose();
                            startOfGame();
                            displayScenario();
                        }
                    });
                }
            });
            button2.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    theFrame.dispose();
                    yesOrNoOption();
                    theLabel = new JLabel("Welcome to South!");
                    thePanel.add(theLabel);
                }
            });
            button3.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    theFrame.dispose();
                    yesOrNoOption();
                    theLabel = new JLabel("Welcome to East!");
                    thePanel.add(theLabel);
                }
            });
            button4.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    theFrame.dispose();
                    yesOrNoOption();
                    theLabel = new JLabel("Welcome to West!");
                    thePanel.add(theLabel);
                }
            });
        }




    public static void main(String[] args) {

        GameBehindTheScenes theScenes = new GameBehindTheScenes();

        theScenes.startOfGame();
        theScenes.displayScenario();

    }



}
