package csu.csci325;

import javax.swing.*;

public class DirectionalScenarios {

    public JButton north = new JButton("North");
    public JButton south = new JButton("South");
    public JButton east = new JButton("East");
    public JButton west = new JButton("West");
    public JButton yes = new JButton("Yes");
    public JButton no = new JButton("No");
    public JButton reset = new JButton("Reset");
    public JButton theContinue = new JButton("Continue");

    public JLabel theLabel = new JLabel();
    public JFrame theFrame = new JFrame();
    public JPanel thePanel = new JPanel();




    public DirectionalScenarios()
    {

    }

    public void yesOrNoOption()
    {
        thePanel.removeAll();
        thePanel.add(yes);
        thePanel.add(no);


        theFrame.add(thePanel);
        theFrame.setVisible(true);
        theFrame.setSize(600, 250);
        thePanel.repaint();
    }
    public void continueReset()
    {
        theContinue = new JButton("Continue");
    }
    public void yesNoReset()
    {
        yes = new JButton("Yes");
        no = new JButton("No");
    }

    public void Scenario() {

        thePanel.removeAll();
        theFrame.add(thePanel);
        theFrame.setVisible(true);
        theFrame.setSize(600, 250);
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
        theFrame.setSize(600, 250);
        thePanel.repaint();
    }

    public void eastScenario()
    {
        thePanel.removeAll();
        thePanel.add(reset);
        theFrame.add(thePanel);
        theFrame.setVisible(true);
        theFrame.setSize(600, 250);
        thePanel.repaint();
    }
    public void resetScenario()
    {
        thePanel.removeAll();
        thePanel.add(reset);
        theFrame.add(thePanel);
        theFrame.setVisible(true);
        theFrame.setSize(600, 250);
        thePanel.repaint();


    }

    public void continueScenario()
    {
        thePanel.removeAll();
        thePanel.add(theContinue);
        theFrame.add(thePanel);
        theFrame.setVisible(true);
        theFrame.setSize(600, 250);
        thePanel.repaint();
    }
}
