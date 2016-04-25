package csu.csci325;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by student on 4/24/2016.
 */
public class MallberryVillage extends DirectionalScenarios {
    public MallberryVillage(){}



    public void startOfGame()
    {

        thePanel.removeAll();
        theLabel.setText("<html>You enter the village. As a servant of the king you are welcomed with open <br>" +
                "arms. the townsfolk wish to host a party for you to celebrate your attempt at bringing peace<br>" +
                " to the kingdoms. You feel rather tired, but want to be hospitable. Will you join them?<br>"  );

        thePanel.add(yes);
        thePanel.add(no);
        thePanel.add(theLabel);


        theFrame.add(thePanel);
        theFrame.setVisible(true);
        theFrame.setSize(600, 200);

        thePanel.repaint();


    }

    public void displayScenario() {
        yes.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                continueScenario();
                theLabel.setText("<html>The feast is fantastic and you fill your belly. The local blacksmith warns <br>" +
                        "you about the bridge leading over the river, it's unstable and not safe to cross. He tells you <br>" +
                        "to head a bit further down the riverside to a stone bridge <br>");
                thePanel.add(theLabel);
                theContinue.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        River theRiver = new River();
                        theRiver.startOfGame();
                        theRiver.displayScenario();
                        theRiver.MallTest(true);
                        theFrame.dispose();
                    }
                });
                thePanel.repaint();
            }
        });
        no.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                continueScenario();
                theLabel.setText("<html> You turn into the local inn. <html>");
                thePanel.add(theLabel);
                theContinue.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        River theRiver = new River();
                        theRiver.startOfGame();
                        theRiver.displayScenario();
                        theRiver.MallTest(false);
                        theFrame.dispose();
                    }
                });
                thePanel.repaint();
            }
        });
    }






}
