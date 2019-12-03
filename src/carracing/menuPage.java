package carracing;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class menuPage {
	 public static JFrame frame;
	    public JButton play;
	    public JButton help;
	    public JButton exit;
	    
	    public ImageIcon play1 ;
	    public ImageIcon help1 ;
	    public ImageIcon exit1 ;
	    public ImageIcon frontPage ;
	    
	    public JLabel play1Position ;
	    public JLabel help1Position ;
	    public JLabel exit1Position ;
	    public JLabel frontPagePosition ;
	    
	    
	    public menuPage()
	    {
	    	frame = new JFrame ("MENU PAGE");
	    	
	    	play1 = new ImageIcon("play.png");
	    	play1Position = new JLabel(play1);
	    	
	    	help1 = new ImageIcon("help-button.png");
	    	help1Position = new JLabel(help1);
	    	
	    	frontPage = new ImageIcon("frontPage.png");
	    	frontPagePosition = new JLabel(frontPage);
	    	
	    	exit1 = new ImageIcon("exit.png");
	    	exit1Position = new JLabel(exit1);
	    	
	    	play = new JButton(play1);
			help = new JButton(help1);
			exit = new JButton(exit1);
			
			
			
	    	
			play.setBounds(190,305,200,100);
			play1Position.setBounds(0,0,0,0);
			help.setBounds(190,410,200,100);
			help1Position.setBounds(0,0,0,0);
			exit.setBounds(190,515,200,100);
			exit1Position.setBounds(0,0,0,0);
			frontPagePosition.setBounds(0,0,70,140);
			
			frame.add(play);
			frame.add(help);
			frame.add(exit);
			frame.add(play1Position);
			frame.add(help1Position);
			frame.add(exit1Position);
			frame.add(frontPagePosition);
			//play1Position.setVisible(true);	
			play.addActionListener(new ActionListener()
			{
				public void actionPerformed(ActionEvent e) 
				{
	                new levelSelect();
	                
	                frame.setVisible(false);
				}	
			});
			
			help.addActionListener(new ActionListener()
			{
				public void actionPerformed(ActionEvent e)
				{
					new helpPage();
					
					frame.setVisible(false);
				}
			});
			
			exit.addActionListener(new ActionListener()
			{
				public void actionPerformed(ActionEvent e)
				{
					System.exit(1);
				}
			});
			 
				frame.setSize(600,750);
				frame.setVisible(true);
		        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		        frame.setLayout(null);
		        frame.setLocationRelativeTo(null);
		       
	    }
}