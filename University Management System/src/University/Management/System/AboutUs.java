package University.Management.System;
import javax.swing.*;
import java.awt.*;
public class AboutUs extends JFrame {
	JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,le,l11;
	AboutUs(){
		super("ABOUT US");
		setVisible(false);
		setSize(800,700);
		setLayout(null);

		setLocation(350,50);
		
		le=new JLabel();
		le.setBounds(0,0,800,700);
        le.setLayout(null);
        ImageIcon img = new ImageIcon("icons/aboback.jpg");
        Image i3 = img.getImage().getScaledInstance(800, 800,Image.SCALE_DEFAULT);
        ImageIcon icc3 = new ImageIcon(i3);
        le.setIcon(icc3);
        add(le);
		
//		l1=new JLabel("ABOUT US");
//		l1.setFont(new Font("serif",Font.BOLD,30));
//		l1.setBounds(200,10,500,30);
//		l1.setForeground(Color.RED);
//		le.add(l1);
		
		l5=new JLabel("All rights reserved by Ace University Patiala @2020");
		l5.setBounds(20,600,500,40);
		l5.setForeground(Color.RED);
		le.add(l5);
		
		l2=new JLabel("CREATOR");
		l2.setFont(new Font("TimesRoman",Font.BOLD,35));
		l2.setForeground(Color.BLACK);
		l2.setBounds(200,20,500,30);
		le.add(l2);
        
        l3=new JLabel("* Aniket Singla  1710991096  6G-01    ");
		l3.setFont(new Font("serif",Font.BOLD,24));
		l3.setBounds(20,120,500,30);
		le.add(l3);
        
        ImageIcon ani=new ImageIcon("icons/upload.PNG");
        Image aa=ani.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        l4=new JLabel();
        l4.setBounds(430,70,100,100);
        l4.setIcon(new ImageIcon(aa));
        
        le.add(l4);
        

       
	}
    public static void main(String [] agrs)
    {
    	new AboutUs().setVisible(true);
    }
}
