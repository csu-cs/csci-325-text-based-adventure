package csu.csci325;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GameBehindTheScenes
{
    DirectionalScenarios theScenarios = new DirectionalScenarios();
    private JButton north = new JButton("North");
    private JButton south = new JButton("South");
    private JButton east = new JButton("East");
    private JButton west = new JButton("West");
    private JButton yes = new JButton("Yes");
    private JButton no = new JButton("No");
    private JButton reset = new JButton("Reset");
    private JButton theContinue = new JButton("Continue");

    private JLabel theLabel = new JLabel();
    private JFrame theFrame = new JFrame();
    private JPanel thePanel = new JPanel();

    public GameBehindTheScenes()
    {

    }

    public void startOfGame()
    {

        thePanel.removeAll();
        theLabel.setText("<html>Welcome to the kingdom of Abbot! You are a knight, sworn to your loyalty of the king.<br>" +
                " You must deliver a message to the kingdom of Costello, which contains a peace treaty. For a thousand<br>" +
                " years, the two kingdoms have been at war with one enough, causing devastation and destruction. With<br>" +
                " this message, it may be possible that the two kingdoms will finally come together in harmony.<br>" +
                " Now it is time to start your journey and go throughout the land!</html>");

        thePanel.add(north);
        thePanel.add(south);
        thePanel.add(east);
        thePanel.add(west);
        thePanel.add(theLabel);


        theFrame.add(thePanel);
        theFrame.setVisible(true);
        theFrame.setSize(600, 200);

        thePanel.repaint();


    }

    public void yesOrNoOption()
    {
        thePanel.removeAll();
        thePanel.add(yes);
        thePanel.add(no);

        theFrame.add(thePanel);
        theFrame.setVisible(true);
        theFrame.setSize(600, 200);
        thePanel.repaint();
    }

    public void southScenario()
    {
        thePanel.removeAll();
        theLabel.setText("<html> You decide to end your journey before it even began. You head back home and abandon <br>" +
                " your quest. Without your peace treaty, the two kingdoms break off the negotiations and go to war <br>" +
                " The Game has ended. </html>");

        thePanel.add(theLabel);
        thePanel.add(reset);
        theFrame.add(thePanel);
        theFrame.setVisible(true);
        theFrame.setSize(600, 200);
        thePanel.repaint();
    }

    public void eastScenario() {

        thePanel.removeAll();
        thePanel.add(reset);
        theFrame.add(thePanel);
        theFrame.setVisible(true);
        theFrame.setSize(600, 200);
        thePanel.repaint();

    }
    public void westScenario(){
        thePanel.removeAll();
        thePanel.add(reset);
        thePanel.add(theContinue);

    }

    public void displayScenario() {

        north.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                thePanel.removeAll();
                yesOrNoOption();
                theLabel.setText("<html>When you look to the north, you see the path before you paved with <br>" +
                        " cobblestone and beaten down by stallion hooves that have trampled the land. You feel a <br>" +
                        " cool breeze hit your back and feel yourself relaxing. The kingdom of Costello lies this <br>" +
                        " way. </html>");
                thePanel.add(theLabel);

                    yes.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                        }
                    });
                no.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        startOfGame();
                    }
                });
                thePanel.repaint();
            }
        });
        south.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                thePanel.removeAll();
                yesOrNoOption();
                theLabel.setText("<html>When you look to the south, you see the path you came upon. Longingly, you<br>" +
                        " realize that it will be a long time before you make it back home... if you even make it<br>" +
                        " back home. You could turn back and head to your house, but doing this will cause the<br>" +
                        " peace talks between the two kingdoms to cease, and war will start anew.</html>");
                thePanel.add(theLabel);
                yes.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        southScenario();
                        reset.addActionListener(new ActionListener() {
                            @Override
                            public void actionPerformed(ActionEvent e) {
                                startOfGame();
                            }
                        });
                    }
                });
                thePanel.repaint();
            }
        });
        east.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                thePanel.removeAll();
                yesOrNoOption();
                theLabel.setText("<html>When you look to the east, you see the tall grass fields flailing around in<br>" +
                        " the wind, with rolls of hay being built in the distance by hardworking farmers. You could<br>" +
                        " cut through the field perhaps and ask the farmers questions about Costello themselves,<br>" +
                        " but you risk losing valuable time in delivering your message.</html>");
                thePanel.add(theLabel);
                yes.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        eastScenario();
                        reset.addActionListener(new ActionListener() {
                            @Override
                            public void actionPerformed(ActionEvent e) {
                                startOfGame();
                            }
                        });

                    }
                });
                thePanel.repaint();
            }
        });
        west.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                thePanel.removeAll();
                yesOrNoOption();
                theLabel.setText("<html>When you look to the west, you see a crooked wooden fence that covers an<br>" +
                        " immense range of the field, stretching as far as the horizon. Inside, you see a wide<br>" +
                        " variety of animals, such as cows, horses, goats, and pigs. The farm life itself seems<br>" +
                        " happy and content, the warm summer sun beaming down on them. Perhaps you could enjoy<br>" +
                        " petting the farm animals before you head onto Costello.</html>");
                thePanel.add(theLabel);
                yes.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {

                    }
                });
            }
            });
        thePanel.repaint();
        }




    public static void main(String[] args) {

        GameBehindTheScenes theScenes = new GameBehindTheScenes();

        theScenes.startOfGame();
        theScenes.displayScenario();

    }



}
