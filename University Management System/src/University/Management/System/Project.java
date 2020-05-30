package University.Management.System;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Project extends JFrame implements ActionListener {

	
	Project()
	{
		super("Ace University Managment System");
		setSize(1500,800);  
		setLocation(20,10);
		
		   ImageIcon ic =  new ImageIcon("icons/uni3.jpg");
	       Image i3 = ic.getImage().getScaledInstance(1500,750,Image.SCALE_DEFAULT);
	       ImageIcon icc3 = new ImageIcon(i3);
	       JLabel l1 = new JLabel(icc3);
		   add(l1);
		   
		   JMenuBar mb=new JMenuBar();
	//1	   
		   JMenu master=new JMenu();
		   JMenuItem m1=new JMenuItem("New Faculty");
		   JMenuItem m2=new JMenuItem("New Student");
		   master.setForeground(Color.BLACK);
		   
		 //  Toolkit t=Toolkit.getDefaultToolkit();
		   m1.setFont(new Font("monospaced",Font.BOLD,20));
		   ImageIcon icon1 = new ImageIcon("icons/icon1.png");
	        Image image1 = icon1.getImage().getScaledInstance(25, 25,Image.SCALE_DEFAULT);
	        m1.setIcon(new ImageIcon(image1));
		  // m1.setMnemonic('A');
		   m1.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_D,ActionEvent.CTRL_MASK));
		   m1.setBackground(Color.WHITE);
		   
		   m2.setFont(new Font("monospaced",Font.BOLD,20));
		   ImageIcon icon2=new ImageIcon("icons/icon2.png");
		   Image image2=icon2.getImage().getScaledInstance(25, 25,Image.SCALE_DEFAULT);
		   m2.setIcon(new ImageIcon(image2));
		   m2.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N,ActionEvent.CTRL_MASK));
		   m2.setBackground(Color.WHITE);
		   
		   m1.addActionListener(this);
		   m2.addActionListener(this);
		   master.add(m1);
		   master.add(m2);
	//2	   
		   JMenu details=new JMenu("DETAILS");
		   JMenuItem ds=new JMenuItem("Student Details");
		   JMenuItem dt=new JMenuItem("Teacher Details");
           details.setFont(new Font("TimesRoman",Font.BOLD,16));

           details.setForeground(Color.DARK_GRAY);
           
           ds.setFont(new Font("monospaced",Font.BOLD,20));
           ImageIcon icon3=new ImageIcon("icons/icon3.png");
           Image imag3=icon3.getImage().getScaledInstance(25,25,Image.SCALE_DEFAULT );
           ds.setIcon(new ImageIcon(imag3));
           ds.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_P,ActionEvent.CTRL_MASK));
           ds.setBackground(Color.WHITE);
           details.add(ds);
           
           dt.setFont(new Font("monospaced",Font.BOLD,20));
           ImageIcon icon4=new ImageIcon("icons/icon4.jpg");
           Image imag4=icon4.getImage().getScaledInstance(25,25,Image.SCALE_DEFAULT );
           dt.setIcon(new ImageIcon(imag4));
           dt.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_B,ActionEvent.CTRL_MASK));
           dt.setBackground(Color.WHITE);
           details.add(dt);
            
           ds.addActionListener(this);
           dt.addActionListener(this);
           
           
     //3           
           JMenu attendance=new JMenu("ATTENDANCE");
           JMenuItem sa=new JMenuItem("Student Attenance");
           JMenuItem ta=new JMenuItem("Teacher Attendance");
           attendance.setFont(new Font("TimesRoman",Font.BOLD,16));

           attendance.setForeground(Color.DARK_GRAY);
           
           sa.setFont(new Font("monospaced",Font.BOLD,20));
           ImageIcon icon5=new ImageIcon("icons/icon14.jpg");
           Image imag5=icon5.getImage().getScaledInstance(25,25,Image.SCALE_DEFAULT );
           sa.setIcon(new ImageIcon(imag5));
           sa.setBackground(Color.WHITE);
           sa.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_A,ActionEvent.CTRL_MASK));
           attendance.add(sa);
           
           ta.setFont(new Font("monospaced",Font.BOLD,20));
           ImageIcon icon6=new ImageIcon("icons/icon15.png");
           Image imag6=icon6.getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT);
           ta.setIcon(new ImageIcon(imag6));
           ta.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_C,ActionEvent.CTRL_MASK));
           ta.setBackground(Color.WHITE);
           attendance.add(ta);
           
           sa.addActionListener(this);
           ta.addActionListener(this);
      ////utility
           JMenu utility = new JMenu("UTILITY");
           JMenuItem ut1 = new JMenuItem("Notepad");
           JMenuItem ut2 = new JMenuItem("Calculator");
           JMenuItem ut3 = new JMenuItem("Web Browser");
           utility.setForeground(Color.DARK_GRAY); 
           utility.setFont(new Font("TimesRoman",Font.BOLD,16));


           ut1.setFont(new Font("monospaced",Font.BOLD,20));
           ImageIcon icon18 = new ImageIcon("icons/icon9.png");
           Image image19 = icon18.getImage().getScaledInstance(25, 25,Image.SCALE_DEFAULT);
           ut1.setIcon(new ImageIcon(image19));
           ut1.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_M, ActionEvent.CTRL_MASK));
           ut1.setBackground(Color.WHITE);
           utility.add(ut1);

           ut2.setFont(new Font("monospaced",Font.BOLD,16));
           ImageIcon icon20 = new ImageIcon("icons/icon10.png");
           Image image21 = icon20.getImage().getScaledInstance(25, 25,Image.SCALE_DEFAULT);
           ut2.setIcon(new ImageIcon(image21));
           ut2.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_X, ActionEvent.CTRL_MASK));
           ut2.setBackground(Color.WHITE);
           utility.add(ut2);

           ut3.setFont(new Font("monospaced",Font.BOLD,20));
           ImageIcon icon10 = new ImageIcon("icons/icon11.png");
           Image image10 = icon10.getImage().getScaledInstance(25, 25,Image.SCALE_DEFAULT);
           ut3.setIcon(new ImageIcon(image10));
           ut3.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_W, ActionEvent.CTRL_MASK));
           ut3.setBackground(Color.WHITE);
           utility.add(ut3);
           
           ut1.addActionListener(this);
           ut2.addActionListener(this);
           ut3.addActionListener(this);
           
          ///////about
           JMenu about = new JMenu("ABOUT");
           JMenuItem aboutus = new JMenuItem("About Us");
           about.setForeground(Color.DARK_GRAY);
           about.setFont(new Font("TimesRoman",Font.BOLD,18));

           
           aboutus.setFont(new Font("monospaced",Font.BOLD,20));
           ImageIcon icon21 = new ImageIcon("icons/icon13.jpg");
           Image image22 = icon21.getImage().getScaledInstance(25, 25,Image.SCALE_DEFAULT);
           aboutus.setIcon(new ImageIcon(image22));
           aboutus.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_C, ActionEvent.CTRL_MASK));
           aboutus.setBackground(Color.WHITE);
           about.add(aboutus);
           aboutus.addActionListener(this);
           about.add(aboutus);
           
           JMenu exit = new JMenu("EXIT");
           JMenuItem ex = new JMenuItem("Exit");
           exit.setForeground(Color.DARK_GRAY);
           exit.setFont(new Font("TimesRoman",Font.BOLD,18));
           
           
           ex.setFont(new Font("monospaced",Font.BOLD,20));
           ImageIcon icon11 = new ImageIcon("icons/icon12.png");
           Image image11 = icon11.getImage().getScaledInstance(25, 25,Image.SCALE_DEFAULT);
           ex.setIcon(new ImageIcon(image11));
           ex.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_Z, ActionEvent.CTRL_MASK));
           ex.setBackground(Color.WHITE);
           ex.addActionListener(this);
           exit.add(ex);
           
     ///////atttendence
           JMenu attendance_detail = new JMenu("ATTENDANCE DETAIL");
           JMenuItem b1 = new JMenuItem("Student Attendance Detail");
           JMenuItem b2 = new JMenuItem("Teacher Attendance Detail");
           attendance_detail.setForeground(Color.DARK_GRAY);
           attendance_detail.setFont(new Font("TimesRoman",Font.BOLD,16));

           
           b1.setFont(new Font("monospaced",Font.BOLD,20));
           ImageIcon icon27 = new ImageIcon("icons/icon15.png");
           Image image28 = icon27.getImage().getScaledInstance(25, 25,Image.SCALE_DEFAULT);
           b1.setIcon(new ImageIcon(image28));
           b1.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_P, ActionEvent.CTRL_MASK));
           b1.setBackground(Color.WHITE);
           attendance_detail.add(b1);
           
           
           b2.setFont(new Font("monospaced",Font.BOLD,20));
           ImageIcon icon29 = new ImageIcon("icons/icon14.jpg");
           Image image30 = icon29.getImage().getScaledInstance(25, 25,Image.SCALE_DEFAULT);
           b2.setIcon(new ImageIcon(image30));
           b2.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_B, ActionEvent.CTRL_MASK));
           b2.setBackground(Color.WHITE);
           attendance_detail.add(b2);
           
           b1.addActionListener(this);
           b2.addActionListener(this);
    ///////examination  
           JMenu exam = new JMenu("EXAMINATION");
           JMenuItem c1 = new JMenuItem("Examination Details");
           JMenuItem c2 = new JMenuItem("Enter Marks");
           exam.setForeground(Color.BLACK);
           exam.setFont(new Font("TimesRoman",Font.BOLD,16));


           
           c1.setFont(new Font("monospaced",Font.BOLD,20));
           ImageIcon icon30 = new ImageIcon("icons/icon16.png");
           Image image31 = icon30.getImage().getScaledInstance(25, 25,Image.SCALE_DEFAULT);
           c1.setIcon(new ImageIcon(image31));
           
           c1.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_P, ActionEvent.CTRL_MASK));
           c1.setBackground(Color.WHITE);
           exam.add(c1);
           
           c2.setFont(new Font("monospaced",Font.BOLD,20));
           ImageIcon icon32 = new ImageIcon("icons/icon17.png");
           Image image33 = icon32.getImage().getScaledInstance(25, 25,Image.SCALE_DEFAULT);
           c2.setIcon(new ImageIcon(image33));
           c2.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_B, ActionEvent.CTRL_MASK));
           c2.setBackground(Color.WHITE);
           exam.add(c2);

           c1.addActionListener(this);
           c2.addActionListener(this);
       //////report    
           JMenu report = new JMenu("UPDATE DETAILS");
           JMenuItem r1 = new JMenuItem("Update Students");
           JMenuItem r2 = new JMenuItem("Update Teachers");
           report.setForeground(Color.BLACK);
           report.setFont(new Font("TimesRoman",Font.BOLD,16));


           
           r1.setFont(new Font("monospaced",Font.BOLD,20));
           ImageIcon icon7 = new ImageIcon("icons/icon5.png");
           Image image7 = icon7.getImage().getScaledInstance(25, 25,Image.SCALE_DEFAULT);
           r1.setIcon(new ImageIcon(image7));
           r1.setMnemonic('E');
           r1.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_L, ActionEvent.CTRL_MASK));
           r1.setBackground(Color.WHITE);
           r1.addActionListener(this);
           report.add(r1);
           
           r2.setFont(new Font("monospaced",Font.BOLD,20));
           ImageIcon iconn = new ImageIcon("icons/icon6.png");
           Image imagee = iconn.getImage().getScaledInstance(25, 25,Image.SCALE_DEFAULT);
           r2.setIcon(new ImageIcon(imagee));
           r2.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_J, ActionEvent.CTRL_MASK));
           r2.setBackground(Color.WHITE);
           r2.addActionListener(this);
           report.add(r2);
           
   /////feeeee
           
           JMenu fee = new JMenu("FEE DETAILS");
           JMenuItem s1 = new JMenuItem("Fee Structure");
           JMenuItem s2 = new JMenuItem("Student Fee Form");
           fee.setForeground(Color.BLACK);
           fee.setFont(new Font("TimesRoman",Font.BOLD,16));


           s1.setFont(new Font("monospaced",Font.BOLD,20));
           ImageIcon icon14 = new ImageIcon("icons/icon7.png");
           Image image15 = icon14.getImage().getScaledInstance(20, 20,Image.SCALE_DEFAULT);
           s1.setIcon(new ImageIcon(image15));
           s1.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_R, ActionEvent.CTRL_MASK));
           s1.setBackground(Color.WHITE);
           s1.addActionListener(this);
           fee.add(s1);
           
           s2.setFont(new Font("monospaced",Font.BOLD,20));
           ImageIcon icon16 = new ImageIcon("icons/icon8.png");
           Image image17 = icon16.getImage().getScaledInstance(20, 20,Image.SCALE_DEFAULT);
           s2.setIcon(new ImageIcon(image17));
           s2.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_R, ActionEvent.CTRL_MASK));
           s2.setBackground(Color.WHITE);
           s2.addActionListener(this);
           fee.add(s2);
    /////       
           mb.add(master);
           mb.add(details);
           mb.add(attendance);
           mb.add(attendance_detail);
           mb.add(exam);
           mb.add(report);
           mb.add(fee);
           mb.add(utility);
           mb.add(about);
           mb.add(exit);
           
           setJMenuBar(mb);    
           setFont(new Font("Senserif",Font.BOLD,16));
           setLayout(new FlowLayout());
           setVisible(false);
	}
	
	 public void actionPerformed(ActionEvent ae){
	        String msg = ae.getActionCommand();
	        if(msg.equals("New Student Admission")){
	            new AddStudent().f.setVisible(true);
	            
	        }else if(msg.equals("New Faculty")){
	            new AddTeacher().f.setVisible(true);
	            
	        }else if(msg.equals("Student Details")){
	            new StudentDetails().setVisible(true);
	            
	        }else if(msg.equals("Teacher Details")){
	            new TeacherDetails().setVisible(true);
	           
	        }
	        else if(msg.equals("Update Students")){
	            new UpdateStudent().f.setVisible(true);
	           
	        }
	        else if(msg.equals("Update Teachers")){
	            new UpdateTeacher().f.setVisible(true);
	           
	        }
	        else if(msg.equals("Fee Structure")){
	            new FeeStructure().setVisible(true);
	           
	        }
	        else if(msg.equals("Student Fee Form")){
	            new StudentFeeForm().setVisible(true);
	           
	        }
	        else if(msg.equals("Notepad")){
	        	//RunTime class 
	            try{
	                Runtime.getRuntime().exec("notepad.exe");
	            }catch(Exception e){ }
	        }else if(msg.equals("Calculator")){
	            try{
	                Runtime.getRuntime().exec("calc.exe");
	            }catch(Exception e){ }
	        }else if(msg.equals("Web Browser")){
	            
	            try{
	                Runtime.getRuntime().exec("C:\\Program Files (x86)\\Google\\Chrome\\Application\\chrome.exe");
	            }catch(Exception e){ }
	        }else if(msg.equals("Exit")){
	            System.exit(0);
	        }else if(msg.equals("About Us")){
	            new AboutUs().setVisible(true);
	        }else if(msg.equals("Student Attendance")){
	            new StudentAttendance().setVisible(true);
	        }else if(msg.equals("Teacher Attendance")){
	            new TeacherAttendance().setVisible(true);
	        }else if(msg.equals("Student Attendance Detail")){
	            new StudentAttendanceDetail().setVisible(true);
	        }else if(msg.equals("Teacher Attendance Detail")){
	            new TeacherAttendanceDetail().setVisible(true);
	        }else if(msg.equals("Examination Details")){
	            new ExaminationDetails().setVisible(true);
	        }else if(msg.equals("Enter Marks")){
	            new EnterMarks().setVisible(true);
	        }
	        
	    }
	    
	public static void main(String[] args){
        new Project().setVisible(true);
    }
}
