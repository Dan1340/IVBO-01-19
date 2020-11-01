package Lab6;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class Field extends JFrame
{
    Font f1 = new Font("Times new roman",Font.BOLD,20);
    Font f2 = new Font("MS Sans Serif",Font.BOLD,20);
    Font f3 = new Font("Courier New",Font.BOLD,20);

    JTextArea area = new JTextArea();
    JMenuBar menu = new JMenuBar();
    JMenu f = new JMenu("Font");
    JMenuItem TNR = new JMenuItem("Times New Roman");
    JMenuItem MSSS = new JMenuItem("MS Sans Serif");
    JMenuItem CN = new JMenuItem("Courier New");
    JMenu c = new JMenu("Color");
    JMenuItem BK = new JMenuItem("Black");
    JMenuItem R = new JMenuItem("Red");
    JMenuItem BE = new JMenuItem("Blue");

    Button tnr = new Button("Times New Roman");
    Button msss = new Button("MS Sans Serif");
    Button cn = new Button("Courier New");
    Button bk = new Button("Black");
    Button r = new Button("Red");
    Button be = new Button("Blue");

    Field()
    {
        super("Editor");
        setSize(400,400);
        setLayout(new BorderLayout());

        TNR.add(tnr);
        f.add(TNR);
        MSSS.add(msss);
        f.add(MSSS);
        CN.add(cn);
        f.add(CN);
        menu.add(f);

        BK.add(bk);
        c.add(BK);
        R.add(r);
        c.add(R);
        BE.add(be);
        c.add(BE);
        menu.add(c);
        add(area);
        add(menu, BorderLayout.NORTH);
        area.setFont(f1);
        area.setForeground(Color.black);

        tnr.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                area.setFont(f1);
            }
        });
        msss.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                area.setFont(f2);
            }
        });
        cn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                area.setFont(f3);
            }
        });
        bk.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                area.setForeground(Color.black);
            }
        });
        r.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                area.setForeground(Color.red);
            }
        });
        be.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                area.setForeground(Color.blue);
            }
        });

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
