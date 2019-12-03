package carracing;



import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class levelSelect {
	public static JFrame frame2 ;
	public JButton easy ;
	public JButton medium ;
	public JButton hard ;
	
    public ImageIcon easy1 ;
    public ImageIcon medium1 ;
    public ImageIcon hard1 ;
    public ImageIcon background ;
    
    public JLabel easy1Position ;
    public JLabel medium1Position ;
    public JLabel hard1Position ;
    public JLabel backgroundPosition ;


	
	public levelSelect()
	{
		frame2 = new JFrame ("Select Level");
		
		easy1 = new ImageIcon("easy.png");
    	easy1Position = new JLabel(easy1);
    	
    	medium1 = new ImageIcon("Medium.png");
    	medium1Position = new JLabel(medium1);

    	hard1 = new ImageIcon("hard.png");
    	hard1Position = new JLabel(hard1);
    	
    	background = new ImageIcon("levelpage.png");
    	backgroundPosition = new JLabel(background);
		
		easy = new JButton (easy1);
		medium = new JButton(medium1);
		hard = new JButton(hard1);
		
		
		easy.setBounds(192,100,200,100);
		easy1Position.setBounds(192,100,200,100);
		
		medium.setBounds(192,305,200,100);
		medium1Position.setBounds(192,305,200,100);

		hard.setBounds(192,515,200,100);
		hard1Position.setBounds(192,515,200,100);
		
		backgroundPosition.setBounds(0,0,70,140);
		
		
		frame2.add(easy);
		frame2.add(medium);
		frame2.add(hard);
		
		frame2.add(easy1Position);
		frame2.add(medium1Position);
		frame2.add(hard1Position);
		frame2.add(backgroundPosition);
		
		
		easy.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e) 
			{
                new easyLevel();
           
                frame2.setVisible(false);
             }	
		});
		
		medium.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e) 
			{
                new mediumLevel();
                frame2.setVisible(false);

			}	
		});
		
		hard.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e) 
			{
                new hardLevel();
               
                frame2.setVisible(false);

			}	
		});
		
		frame2.setSize(600,750);
        frame2.setVisible(true);
        frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame2.setLayout(null);
        frame2.setLocationRelativeTo(null);
		
	}

}
