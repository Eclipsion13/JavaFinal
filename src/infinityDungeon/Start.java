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
		st.setSize(250, 250);
		st.setVisible(true);

		
		// Book
	}
	@Override
	public void actionPerformed(ActionEvent event) {
		Object source = event.getSource();
		if(source == Start) {
			
		}
		else
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
	}

}
