package driverframe;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JPanel;


public class MyButton extends JButton implements ActionListener{
    JPanel colorPanel;
    
    MyButton(String name, JPanel p){
    super(name);
    colorPanel = p;
    addActionListener(this); // so each button can have the action preformed
    }
    
   
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getActionCommand().equals("Red"))
            colorPanel.setBackground(new Color(255, 0, 0));
        else if(e.getActionCommand().equals("Blue"))
            colorPanel.setBackground(new Color(0, 0, 255));
    }
   
}

   

