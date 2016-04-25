package csu.csci325;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by student on 4/24/2016.
 */
public class starting extends DirectionalScenarios{



    public starting()
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

    public void displayScenario() {

        north.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent n) {
                thePanel.removeAll();
                yesNoReset();
                yesOrNoOption();


                theLabel.setText("<html>When you look to the north, you see the path before you paved with <br>" +
                        " cobblestone and beaten down by stallion hooves that have trampled the land. You feel a <br>" +
                        " cool breeze hit your back and feel yourself relaxing. The kingdom of Costello lies this <br>" +
                        " way. </html>");
                thePanel.add(theLabel);

                yes.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent n) {
                        CrossRoads theCrossRoad = new CrossRoads();
                        theCrossRoad.startOfGame();
                        theCrossRoad.displayScenario();
                        theFrame.dispose();
                    }
                });
                no.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent n) {
                        startOfGame();
                        displayScenario();
                    }
                });

                thePanel.repaint();
            }

        });
        south.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent s) {
                thePanel.removeAll();
                yesNoReset();
                yesOrNoOption();


                theLabel.setText("<html>When you look to the south, you see the path you came upon. Longingly, you<br>" +
                        " realize that it will be a long time before you make it back home... if you even make it<br>" +
                        " back home. You could turn back and head to your house, but doing this will cause the<br>" +
                        " peace talks between the two kingdoms to cease, and war will start anew.</html>");
                thePanel.add(theLabel);
                yes.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent s) {
                        southScenario();
                        reset.addActionListener(new ActionListener() {
                            @Override
                            public void actionPerformed(ActionEvent s) {
                                startOfGame();
                                displayScenario();
                            }
                        });
                    }
                });
                no.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent n) {
                        startOfGame();
                        displayScenario();
                    }
                });
                thePanel.repaint();
            }
        });
        east.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                thePanel.removeAll();
                yesNoReset();
                yesOrNoOption();
                theLabel.setText("<html>When you look to the east, you see the tall grass fields flailing around in<br>" +
                        " the wind, with rolls of hay being built in the distance by hardworking farmers. You could<br>" +
                        " cut through the field perhaps and ask the farmers questions about Costello themselves,<br>" +
                        " but you risk losing valuable time in delivering your message.</html>");
                thePanel.add(theLabel);
                yes.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        continueScenario();
                        theLabel.setText("<html>You speak to the farmers and they tell you about the troubles they've <br>" +
                                " been having. Apparently the tension between the nations has made selling crops <br>" +
                                " difficult and the impending war has caused a raise in taxes. Your actions now can<br>" +
                                " help the lives of so many citizens.</html>");
                        thePanel.add(theLabel);
                        theContinue.addActionListener(new ActionListener() {
                            @Override
                            public void actionPerformed(ActionEvent e) {
                                startOfGame();
                            }
                        });

                    }
                });
                no.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent n) {
                        startOfGame();
                        displayScenario();
                    }
                });
                thePanel.repaint();
            }
        });
        west.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent w) {
                thePanel.removeAll();
                yesNoReset();
                yesOrNoOption();
                theLabel.setText("<html>When you look to the west, you see a crooked wooden fence that covers an<br>" +
                        " immense range of the field, stretching as far as the horizon. Inside, you see a wide<br>" +
                        " variety of animals, such as cows, horses, goats, and pigs. The farm life itself seems<br>" +
                        " happy and content, the warm summer sun beaming down on them. Perhaps you could enjoy<br>" +
                        " petting the farm animals before you head onto Costello.</html>");
                thePanel.add(theLabel);
                yes.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent w) {
                        continueScenario();
                        theLabel.setText("<html>You pet the cow. That was nice. <br>");
                        thePanel.add(theLabel);
                        theContinue.addActionListener(new ActionListener() {
                            @Override
                            public void actionPerformed(ActionEvent e) {
                                startOfGame();
                            }
                        });

                    }
                });
                no.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent n) {
                        startOfGame();
                        displayScenario();
                    }
                });
            }
        });
        thePanel.repaint();
    }

}
