// java program to create a simple Jdoalog 

import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

 class Dailog extends JFrame implements ActionListener{

    //frame 
    static JFrame f;

    //main class
    public static void main(String [] args)
    {
        // create a ne frame 
        f = new JFrame("frame");

        // create a object 
        Solve s = new Solve();

        // create a pannel 
        Jpannel p = new Jpanel();

        JButton b= new JButton("click");

        // add actionlistner to button 
        b.addActionListner(s);

        // add button to pannel 
        p.add(p);

        // set the size of frame 
        f.setSize(400,400);

        f.setVisible(true);
    }
    public void actionPerformed(ActionEvent e)
    {
        String s = e.getActionCommand();
        if (s.equals("click")){
            // create a dialog box
            Jdialog d = new Jdialog(f,"dialog Box",false);

            // create a label 
            Jlabel l = new Jlabel("this is a dialog box");

            d.add(L);

            // set size of dialog 
            d.setSize (100,100);

            // set visibility of dialog 
            d.setVisible(true); 
        }
    }
 }