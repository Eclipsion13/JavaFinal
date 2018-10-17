package infinityDungeon;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class RoomLayout extends JFrame implements ActionListener
{
	
	
	private JButton Encounter = new JButton("Thing");
	private JButton Left = new JButton("Left Door");
	private JButton Right = new JButton("Right Door");
	private JButton Exit = new JButton("Exit");
	private JButton Chest = new JButton("Open Chest");
	private Container con = getContentPane();
	
	public RoomLayout()
	{
	
	setLayout(new BorderLayout());
	con.add(Encounter, BorderLayout.CENTER);
	con.add(Left, BorderLayout.WEST);
	con.add(Right, BorderLayout.EAST);
	con.add(Exit, BorderLayout.SOUTH);
	con.add(Chest, BorderLayout.NORTH);
	Left.addActionListener(this);
	Right.addActionListener(this);
	Exit.addActionListener(this);
	Chest.addActionListener(this);
	
	
	setSize(800, 450);
	
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public static void dispRoom() 
	{
		RoomLayout rm = new RoomLayout();
		rm.setVisible(true);

		
		
	}
	public void actionPerformed(ActionEvent event) {
		Object source = event.getSource();
		
		if(source == Left || source == Right ) 
		{
			RoomSetup.setup();
		
		}
		else if(source == Chest) 
		{
			
		}
		
		else
			System.exit(0);
		
	}
	

}
