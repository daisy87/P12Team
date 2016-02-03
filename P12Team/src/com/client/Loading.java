
package com.client;

import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Loading extends JPanel {
   Image LoadImage, back;
   JLabel LoadTitle;
 //  JButton LoadConfirm;    
   
   public Loading() {
      LoadImage = Toolkit.getDefaultToolkit().getImage("c:\\image\\loading3.gif");
      back = Toolkit.getDefaultToolkit().getImage("c:\\image\\back.png");
      LoadTitle = new JLabel("Loading...");
     // LoadConfirm = new JButton("Ω√¿€!");
      LoadTitle.setFont(new Font("Courier New", Font.BOLD, 50));
      setLayout(null);
      
      LoadTitle.setBounds(280, 130, 300, 100);
    //  LoadConfirm.setBounds(120, 120, 30, 30);
      
      add(LoadTitle);
     // add(LoadConfirm);   
      
   }
   @Override   //
   protected void paintComponent(Graphics g) {
      super.paintComponent(g);
      g.drawImage(back, 0, 0, getWidth(), getHeight(), this);
      g.drawImage(LoadImage, 300, 250, this);
      
   }
}
	


	