package carracing;



import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.Timer;

public class easyLevel implements ActionListener, KeyListener {
	JFrame f;
	Graphics g;
	
	
	int width = 70;
	int height = 140;
	
	int ax = 600;
	int ay = 750;
	
	int myCarx = 250;
	int myCary = 600 ;
	
	int obs1x = 200;
	int obs1y = -120;
	
	int obs2x = 380;
	int obs2y = -240;
	
	int obs3x = 275;
	int obs3y = -300;
	
	int obs4x = 130;
	int obs4y = -30;

	int bx = 0 ;
	int by = 0 ;
	
	int cx = 0 ;
	int cy = -700 ;
	
	ImageIcon Car;
	ImageIcon image1; 
	ImageIcon image2;
	ImageIcon image3;
	ImageIcon image4;
	ImageIcon image5; 
	ImageIcon image6;
	ImageIcon background;
	ImageIcon background2;
	
	JLabel CarPosition;
	JLabel car1Position;
	JLabel car2Position;
	JLabel car3Position;
	JLabel car4Position;
	JLabel backgroundPosition;
	JLabel background2Position;

	
	int score = 0;
	String title = "CAR RACING";
	
	Timer t ;
	int accident = 0;
	
	public easyLevel()
	{
		image1 = new ImageIcon("car1.png");
		image2 = new ImageIcon("car-red1.png");
		image3 = new ImageIcon("car3.png");
		image4 = new ImageIcon("car2.png");
		Car = new ImageIcon("car.png");
		background = new ImageIcon("road.png");
		background2 = new ImageIcon("road1.png");
		
		CarPosition = new JLabel(Car);
		car1Position = new JLabel(image1);
		car2Position = new JLabel(image2);
		car3Position = new JLabel(image3);
		car4Position = new JLabel(image4);
		backgroundPosition = new JLabel(background);
		background2Position = new JLabel(background2);
		
		
		CarPosition.setBounds(myCarx, myCary, width, height);
		car1Position.setBounds(obs1x, obs1y, width, height);
		car2Position.setBounds(obs2x, obs2y, width, height);
		car3Position.setBounds(obs3x, obs3y, width, height);
		car4Position.setBounds(obs4x,obs4y,width,height);
		backgroundPosition.setBounds(bx,by,width,height);
		background2Position.setBounds(cx,cy, width,height);
		
		
		CarPosition.setVisible(true);
		car1Position.setVisible(true);
		car2Position.setVisible(true);
		car3Position.setVisible(true);
		car4Position.setVisible(true);
		backgroundPosition.setVisible(true);
		background2Position.setVisible(true);
		
		f = new JFrame(title);
		f.setSize(ax, ay);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
		f.add(CarPosition);
		f.add(car2Position);
		f.add(car1Position);
		f.add(car3Position);
		f.add(car4Position);
		f.add(backgroundPosition);
		f.add(background2Position);
		
		f.setResizable(false);
		f.setLayout(new FlowLayout());
		f.addKeyListener(this);
		f.setLocationRelativeTo(null);
		
		g = f.getGraphics();
		t = new Timer(30,this);
		t.start();
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		f.setTitle(title + " Your Score: " + score);
		
		CarPosition.setBounds(myCarx, myCary, width, height);
		car1Position.setBounds(obs1x, obs1y, width, height);
		car2Position.setBounds(obs2x, obs2y, width, height);
		car3Position.setBounds(obs3x, obs3y, width, height);
		car4Position.setBounds(obs4x, obs4y, width, height);
		backgroundPosition.setBounds(0,by,600,700);
		background2Position.setBounds(cx,cy,600,700);
	
		obs1y += 5;
		if(obs1y >= 700)
		{
			obs1y = -700;
			score +=59 ;
		}
		
		obs2y += 10;
		if(obs2y >= 700)
		{
			obs2y = -700;
			score +=59 ;
		}
		
		obs3y += 6;
		if(obs3y >= 700)
		{
			obs3y = -700;
			score +=59 ;
		}
		
		obs4y+=8 ;
		if(obs4y >= 700)
		{
			obs4y=-700 ;
			score +=59 ;
		}
		
		
		by+=10; 
		if(by>=700)
		{
			by = -700 ;
			score +=59 ;
		}
		
		cy+=10;
		if(cy>=700)
		{
			cy = -700 ;
			score +=59;
		}
		
		
		
		if(((myCary >= obs1y) && (myCary<=obs1y+110)  || (myCary+140 >= obs1y) && (myCary +70 <= obs1y+140 ))&&(((obs1x>=myCarx) && (obs1x <= myCarx  +55 )) || ((obs1x+55>=myCarx)&&(obs1x+70<=myCarx+100))))
		{
			accident = 1 ;
		}
		
		if(((myCary >= obs2y) && (myCary<=obs2y+110)  || (myCary+140 >= obs2y) && (myCary +70 <= obs2y+140 ))&&(((obs2x>=myCarx) && (obs2x <= myCarx  +55 )) || ((obs2x+55>=myCarx)&&(obs2x+70<=myCarx+100))))
		{
			accident = 1 ;
		}
		
		if(((myCary >= obs3y) && (myCary<=obs3y+110)  || (myCary+140 >= obs3y) && (myCary +70 <= obs3y+140 ))&&(((obs3x>=myCarx) && (obs3x <= myCarx  +55 )) || ((obs3x+55>=myCarx)&&(obs3x+70<=myCarx+100))))
		{
			accident = 1 ;
		}
		
		if(((myCary >= obs4y) && (myCary<=obs4y+110)  || (myCary+140 >= obs4y) && (myCary +70 <= obs4y+140 ))&&(((obs4x>=myCarx) && (obs4x <= myCarx  +55 )) || ((obs4x+55>=myCarx)&&(obs4x+70<=myCarx+100))))
		{
			accident = 1 ;
		}
		if (accident == 1){
			accident = 0;
			new gameOverSound();
			ImageIcon icon = new ImageIcon("test3.gif");
			JOptionPane.showMessageDialog(
                    null,
                    "Game Over ! Your Score :"+score,
                    "Game Over", JOptionPane.INFORMATION_MESSAGE,
                    icon);
			
			new menuPage();
			
			f.setVisible(false);
			t.stop();
			   
		}
	}
	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		if (e.getKeyCode() == KeyEvent.VK_LEFT) {
			if (myCarx - 100 >= 0)
				myCarx = myCarx - 10;
		}
		if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
			if ( myCarx + 175 <= ax )
				myCarx = myCarx + 10;
		}
		if (e.getKeyCode() == KeyEvent.VK_UP) {
			if (myCary - 50 > 0)
			{
				myCary = myCary - 50;
			}
		}
		if (e.getKeyCode() == KeyEvent.VK_DOWN) {
			if ( myCary + height + 50 < ay)
				myCary = myCary + 50;
			else
				myCary = ay - height - 50;
		}
		
	}

	@Override
	public void keyReleased(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}

}
