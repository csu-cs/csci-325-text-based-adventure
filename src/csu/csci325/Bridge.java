package csu.csci325;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by student on 4/24/2016.
 */
public class Bridge extends DirectionalScenarios{
    public Bridge(){}


    public boolean trueRiver = false;

    public void startOfGame() {


        thePanel.removeAll();
        theLabel.setText("<html>You eventually reach a bridge. It's made of wood and rope and looks pretty strong.<br>" +
                " The water below you is rushing at unbelievable speeds. Froth is shooting over rocks. Falling in it <br>" +
                " would spell certain doom!<html>");

        thePanel.add(theContinue);
        thePanel.add(theLabel);


        theFrame.add(thePanel);
        theFrame.setVisible(true);
        theFrame.setSize(600, 200);

        thePanel.repaint();
    }


    public void RiverTest(boolean m){
        trueRiver = m;
    }
    public void displayScenario() {

        theContinue.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                continueReset();
                if(trueRiver == true)
                {continueScenario();
                    theLabel.setText("<html>The warning you heard before rings in your ears. You know better than to test<br>" +
                        " fate with this bridge. You make your way further up the river until it reaches a waterfall. A<br>" +
                        " stone bridge spans from shore to shore. You cross it without incident.<html>"  );
                thePanel.add(theLabel);
                    theContinue.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {

                            Scenario();
                            theLabel.setText("<html>You march on for two days without any event of importance <br>" +
                                    " you soon reach the gates of Castello and are brought before their king. You<br>" +
                                    " deliver your message and are greeted with kindness. You have brought peace to <br>" + "" +
                                    "the kingdoms! <br> YOU WIN!");
                            thePanel.add(theLabel);
                        }
                    });
                }
                else {resetScenario();
                    theLabel.setText("<html>The bridge looks steady enough. You make good way across it. But as you reach<br>" +
                            " the halfway point, a strong wind blows and it rocks. Your feet slip from under you and you<br>" +
                            " are met with the rushing water.<html>");
                    thePanel.add(theLabel);
                    reset.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent s) {
                            starting theStart = new starting();
                            theStart.startOfGame();
                            theStart.displayScenario();
                            theFrame.dispose();
                        }
                    });

                }

            }
        });

    }




}

