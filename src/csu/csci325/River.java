package csu.csci325;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by student on 4/24/2016.
 */
public class River extends DirectionalScenarios{

    public River(){}

    public boolean trueMall = false;

    public void MallTest(boolean n){
        trueMall = n;
    }
    public void startOfGame()
    {

        thePanel.removeAll();
        theLabel.setText("<html>Early morning comes and you rise with the sun. You head out and soon come to a river.<br>" +
                "  You walk along its shore looking for a bridge to use, you note how strong the current gets as you go<br>" +
                " further upstream. Suddenly, you spot a young boy trapped in the current. Do you save him?<br>"  );

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
                theLabel.setText("<html>Every member of the kingdom is important, and as a royal servant it is your duty<br>" +
                        "to protect the life of any good citizen. You dive in to save the boy. After throwing him ashore<br>" +
                        "he coughs up some water and warns you about the dangerous bridge ahead. <html>"  );

                thePanel.add(theLabel);
                theContinue.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        Bridge theBridge = new Bridge();
                        theBridge.startOfGame();
                        theBridge.displayScenario();
                        theBridge.RiverTest(true);
                        theFrame.dispose();
                    }
                });
            }
        });
        no.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                continueScenario();
                theLabel.setText("<html> You are on an important quest and not even a minute can be spared. One life <br>" +
                        "is nothing compared to the hundreds of thousands your letter could save. You ignore<br>" +
                        " his cries and press forward. <html>");
                thePanel.add(theLabel);
                theContinue.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        Bridge theBridge = new Bridge();
                        theBridge.startOfGame();
                        theBridge.displayScenario();
                        theBridge.RiverTest(trueMall);
                        theFrame.dispose();
                    }
                });
            }
        });
    }


}
