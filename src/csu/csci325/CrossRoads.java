package csu.csci325;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by student on 4/24/2016.
 */
public class CrossRoads extends DirectionalScenarios {



    CrossRoads()
    {

    }
    public void startOfGame()
    {

        thePanel.removeAll();
        theLabel.setText("<html>You walk north and come to a fork in the road. To the West there is a dark and imposing <br>" +
                "forest. To the East there is a rolling green Meadow as far as the eye can see. If you look to the<br>" +
                " horizon, you see what seems to be the tops of a few buildings. Which way will you go?<br>" );

        thePanel.add(east);
        thePanel.add(west);
        thePanel.add(theLabel);


        theFrame.add(thePanel);
        theFrame.setVisible(true);
        theFrame.setSize(600, 200);

        thePanel.repaint();


    }

    public void displayScenario() {

        east.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                continueScenario();
                theLabel.setText("<html>You head East through the Meadow. It's a long walk but the breeze is light.<br>" +
                        " After making camp for one night you notice the rooftops getting closer. Soon full buildings<br>" +
                        " come into view, you have arrived at the town of Mallberry, a popular resting place for <br>" +
                        " merchants traveling between the two kingdoms.</html>");

                thePanel.add(theLabel);
                theContinue.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        MallberryVillage theMallberryVillage = new MallberryVillage();
                        theMallberryVillage.startOfGame();
                        theMallberryVillage.displayScenario();
                        theFrame.dispose();
                    }
                });
            }

        });
        thePanel.repaint();
        west.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                resetScenario();
                theLabel.setText("<html>When you enter the forest to the West, you feel a sense of dread, but you <br>" +
                        " press forward, determined. Hours pass and the forestry only grows more dense. Soon light<br>" +
                        " from the sun is completely enveloped by the canopy and you have to light a torch. You <br>" +
                        " have lost all sense of time and direction. Come to think of it, you've never heard of a forest<br>" +
                        " anywhere on the path to Castello.</html>");
                thePanel.add(theLabel);

                reset.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        starting theStart = new starting();
                        theStart.startOfGame();
                        theStart.displayScenario();
                        theFrame.dispose();
                    }
                });
                //link back to start of game
            }
        });
        thePanel.repaint();
    }
}
