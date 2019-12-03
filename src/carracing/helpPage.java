package carracing;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;


public class helpPage {
	public static JFrame frame3 ;
	
	public JButton back ;
	
	public ImageIcon help ;
	public ImageIcon back1 ;
	 
	public JLabel helpPosition ;
	public JLabel back1Position ;
	
	public helpPage(){
    	frame3 = new JFrame ("HELP PAGE");
    	
    	help = new ImageIcon("help.png");
    	helpPosition = new JLabel(help);
    	
    	back1 = new ImageIcon("back1.png");
    	back = new JButton (back1) ;
    	
    	back1Position = new JLabel(back1);
    	
    	
		helpPosition.setBounds(100,30,400,200);
		back.setBounds(190,300,200,100);
		back1Position.setBounds(190, 250, 200, 100);
		
		frame3.add(helpPosition);
		frame3.add(back);
		frame3.add(back1Position);
		
		back.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e) 
			{
                new menuPage();
                frame3.setVisible(false);
			}	
		});
		
		frame3.setSize(600,750);
        frame3.setVisible(true);
        frame3.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame3.setLayout(null);
        frame3.setLocationRelativeTo(null);




	}
	 

}
