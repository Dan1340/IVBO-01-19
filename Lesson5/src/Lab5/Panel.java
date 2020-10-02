package Lab5;

import javax.swing.*;
import java.awt.*;

public class Panel extends JPanel
{
    String name = "";
    Panel(String[] a)
    {
        for (int i = 0; i < a.length; i++)
        {
            this.name += a[i];
        }
    }
    public void paintComponent (Graphics g)
    {
        Image img = new ImageIcon(name).getImage();
        Image gif = new ImageIcon("src/Lab5/image_860806171225273252755.gif").getImage();
        g.drawImage(img, 0, 0, 500, 458, this);
        g.drawImage(gif, 500, 0, 500, 458, this);
    }
}