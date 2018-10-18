package infinityDungeon;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class Start extends JFrame implements ActionListener
{
private JButton Start = new JButton("Start");
private JButton Exit = new JButton("Exit");
public Start() 
{
	setLayout(new BorderLayout());
	add(Start, BorderLayout.WEST);
	add(Exit, BorderLayout.EAST);
	Start.addActionListener(this);
	Exit.addActionListener(this);
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}
	public static void dispStart() 
	{
		Start st = new Start();
		st.setSize(350, 250);
		st.setLocationRelativeTo(null);
		st.setVisible(true);
		

		
		// Book
	}
	@Override
	public void actionPerformed(ActionEvent event) {
		Object source = event.getSource();
		if(source == Start) {
			
			RoomLayout rm = new RoomLayout();
			rm.setLocationRelativeTo(null);
			rm.setVisible(true);
			this.dispose();
		}
		else
			System.exit(0);
		
		
	}

}
