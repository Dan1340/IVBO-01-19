package Lab5;

import javax.swing.*;

class Picture extends JFrame
{
    Picture(String[] a)
    {
        JFrame frame = new JFrame();
        Panel panel = new Panel(a);

        frame.getContentPane().add(panel);

        frame.setTitle("Pictures");
        frame.setSize(1000, 458);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}