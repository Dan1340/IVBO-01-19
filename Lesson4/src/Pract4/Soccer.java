package Pract4;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class Soccer extends JFrame
{
    int a=0, r=0;
    JButton bMilan = new JButton("AC Milan");
    JButton bMadrid = new JButton("Real Madrid");
    JButton bFinish = new JButton("Finish");
    JLabel lResult = new JLabel("Result: "+a+"X"+r);
    JLabel lLast = new JLabel("Last Scorer: N/A");
    JLabel lWinner = new JLabel("Winner: DRAW");

    JPanel[] pnl = new JPanel[6];

    Soccer()
    {
        super("Soccer match");
        //setLayout(new FlowLayout());
        setSize(600, 400);
        setLayout(new GridLayout(3,2));
        for(int i=0;i<6;i++)
        {
            pnl[i] = new JPanel();
            pnl[i].setBackground(new Color(255,255,255));
            add(pnl[i]);
        }

        pnl[0].setLayout(new BorderLayout());
        pnl[0].add(bMilan);

        pnl[1].setLayout(new BorderLayout());
        pnl[1].add(bMadrid);

        pnl[2].setLayout(new BorderLayout());
        pnl[2].add(lLast, BorderLayout.CENTER);

        pnl[3].setLayout(new BorderLayout());
        pnl[3].add(lResult, BorderLayout.CENTER);

        pnl[4].setLayout(new BorderLayout());
        pnl[4].add(lWinner, BorderLayout.CENTER);

        pnl[5].setLayout(new BorderLayout());
        pnl[5].add(bFinish);

        bMilan.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent ae)
            {
                a++;
                lResult.setText("Result: "+a+"X"+r);
                lLast.setText("Last Scorer: AC Milan");
                pnl[2].setBackground(new Color(255,0,0));
                if(a>r)
                {
                    lWinner.setText("Winner: AC Milan");
                    pnl[4].setBackground(new Color(255,0,0));
                }
                else if(a==r)
                {
                    lWinner.setText("Winner: DRAW");
                    pnl[4].setBackground(new Color(255,255,255));
                }
            }
        });
        bMadrid.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent ae)
            {
                r++;
                lResult.setText("Result: "+a+"X"+r);
                lLast.setText("Last Scorer: Real Madrid");
                pnl[2].setBackground(new Color(255,255,0));
                if(a<r)
                {
                    lWinner.setText("Winner: Real Madrid");
                    pnl[4].setBackground(new Color(255,255,0));
                }
                else if(a==r)
                {
                    lWinner.setText("Winner: DRAW");
                    pnl[4].setBackground(new Color(255,255,255));
                }
            }
        });
        bFinish.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent ae)
            {
                if(a>r)
                    System.out.println("AC Milan is win.");
                else if(a==r)
                    System.out.println("Draw.");
                else if(a<r)
                    System.out.println("Real Madrid is win.");
                System.exit(0);
            }
        });
        setVisible(true);
    }
}
