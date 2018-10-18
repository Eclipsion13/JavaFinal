package infinityDungeon;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class RoomLayout extends JFrame implements ActionListener
{
	
	
	JLabel label = new JLabel ("Thing ");
	Font bigFont = new Font("Arial", Font.BOLD, 30);
	private JButton Left = new JButton("Left Door");
	private JButton Right = new JButton("Right Door");
	private JButton Exit = new JButton("Exit");
	private JButton Chest = new JButton("Open Chest");
	private Container con = getContentPane();
	
	public RoomLayout()
	{
	
	setLayout(new BorderLayout());
	add(label);
	con.add(Left, BorderLayout.WEST);
	con.add(Right, BorderLayout.EAST);
	con.add(Exit, BorderLayout.SOUTH);
	con.add(Chest, BorderLayout.NORTH);
	Left.addActionListener(this);
	Right.addActionListener(this);
	Exit.addActionListener(this);
	Chest.addActionListener(this);
	
	
	setSize(400, 350);
	
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public static void dispRoom() 
	{
		
		
		RoomLayout rm = new RoomLayout();
		rm.setLocationRelativeTo(null);
		rm.setVisible(true);
		

		
		
	}
	public void actionPerformed(ActionEvent event) {
		Object source = event.getSource();
		
		if(source == Left || source == Right ) 
		{
			
		
		}
		else if(source == Chest) 
		{
			
		}
		
		else
			System.exit(0);
		
	}
	

}
