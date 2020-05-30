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
		
		l2=new JLabel("CREATORS");
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
        l5=new JLabel("(Team Leader)");
		l5.setFont(new Font("serif",Font.BOLD,14));
		l5.setBounds(50,138,500,30);
		le.add(l5);

        		
        l6=new JLabel("* Amandeep Sachdeva 1710991077 6G-01");
		l6.setFont(new Font("serif",Font.BOLD,21));
		l6.setBounds(20,240,500,30);
		le.add(l6);
        
        ImageIcon aman=new ImageIcon("icons/aamm.jpg");
        Image am=aman.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        l7=new JLabel();
        l7.setBounds(430,200,100,100);
        l7.setIcon(new ImageIcon(am));
        le.add(l7);
        
        
        l8=new JLabel("* Anirudh Sharma 1710991100 6F-01");
		l8.setFont(new Font("serif",Font.BOLD,24));
		l8.setBounds(20,360,500,30);
		le.add(l8);
        

        ImageIcon ann=new ImageIcon("icons/anirudh.jpg");
        Image agi=ann.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        l9=new JLabel();
        l9.setBounds(430,330,100,100);
        l9.setIcon(new ImageIcon(agi));
        le.add(l9);

        l10=new JLabel("* Amod T.V 1710991081 6F-01");
		l10.setFont(new Font("serif",Font.BOLD,24));
		l10.setBounds(20,480,500,30);
		le.add(l10);

		 ImageIcon gg=new ImageIcon("icons/amod.jpg");
	     Image qwe=gg.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
	     l11=new JLabel();
	     l11.setBounds(430,460,100,100);
	     l11.setIcon(new ImageIcon(qwe));
	     le.add(l11);
		
        
	}
    public static void main(String [] agrs)
    {
    	new AboutUs().setVisible(true);
    }
}
