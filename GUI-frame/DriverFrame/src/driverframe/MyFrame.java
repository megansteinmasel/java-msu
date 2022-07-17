package driverframe;

import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MyFrame extends JFrame{
    
    MyFrame()
    {
        super("MyFrame");
        setSize(500,500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JPanel buttonPanel = new MyPanel(new Color(255,255, 0));
        buttonPanel.setBackground(Color.YELLOW);
        JPanel colorPanel = new MyPanel(new Color(0,0,0));
        buttonPanel.setBackground(Color.BLACK);
        
        MyButton mb = new MyButton("Red", colorPanel);
        buttonPanel.add(mb);
        MyButton mb1 = new  MyButton("Blue", colorPanel);
        buttonPanel.add(mb1);
        
        getContentPane().add(buttonPanel, BorderLayout.WEST);
        getContentPane().add(colorPanel, BorderLayout.CENTER);
        setVisible(true);
    
    }
    
}
