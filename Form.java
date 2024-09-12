import java.awt.*;
import java.swing.*;

import java.*;

public class Form{
    public static void main (String args[]){
        JFrame f = new JFrame ("login");
        f.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
        f.setSize(400,400);
        Jpanel p = new Jpanel();
        p.add(new Jlabel("user name"));
        p.add(new JTextfield(15));
        p.add(new Jlabel ("password"));
        p.add(new JTextfield(10));
        p.add(new JButton("login"));
        Flowlayout Flowlayout = new Flowlayout();
        p.setLayout(Flowlayout);
        F.add(panel);
        F.setVisible(); 
        }

}