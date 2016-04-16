package csu.csci325;

import javax.swing.*;

/**
 * Created by student on 4/16/2016.
 */
public class GameBehindTheScenes
{
    private JButton north = new JButton("North");
    private JButton south = new JButton("South");
    private JButton east = new JButton("East");
    private JButton west = new JButton("West");
    private JLabel theLabel = new JLabel("Hi Welcome");
    private JFrame theFrame = new JFrame();
    private JPanel thePannel = new JPanel();

    public GameBehindTheScenes()
    {
        thePannel.add(north);
        thePannel.add(south);
        thePannel.add(east);
        thePannel.add(west);
        thePannel.add(theLabel);

        theFrame.add(thePannel);
        theFrame.setVisible(true);
        theFrame.setSize(200,150);


    }

    public JFrame getTheFrame()
    {
        return theFrame;
    }


    public static void main(String[] args) {

        GameBehindTheScenes theScenes = new GameBehindTheScenes();
        theScenes.getTheFrame();

    }



}
