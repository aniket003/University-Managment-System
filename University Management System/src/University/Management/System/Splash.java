package University.Management.System;
import java.awt.*;
import javax.swing.*;
public class Splash {
	
	
	public static void main(String [] agrs)
	{
		Frame f=new Frame();
		f.setVisible(true);
		int i; 
		int x=1;
		for(i=2;i<=600;i+=4,x+=1)
		{
			f.setLocation((600-((i+x)/2) ),350-(i/2)) ;
			f.setSize(i+4*x,i+x);
			
			try {
				Thread.sleep(10);
			}
			catch(Exception e)
			{e.printStackTrace();}
		}
		
		
	}
	

}
class Frame extends JFrame implements Runnable{
	Thread t1;
	Frame()
	{
		super("Ace University Managment System"); //to give heading of frame
		setLayout(new FlowLayout());
		//ADDRESS OF IMAGE STARTS AFTER ENTERING SRC FOLDER
		ImageIcon c1=new ImageIcon("icons/splashimage.jpg");
		Image i1=c1.getImage().getScaledInstance(1200,700, Image.SCALE_DEFAULT) ;
		ImageIcon i2=new ImageIcon(i1);
		JLabel jb1=new JLabel(i2);
		add(jb1);
		
		t1=new Thread(this);
		t1.start();
	}
	public void run() {
		try {
			Thread.sleep(5000);
			this.setVisible(false);
			new Login();
		}
		catch(Exception e)
		{
			 e.printStackTrace();
		}
	}
}

