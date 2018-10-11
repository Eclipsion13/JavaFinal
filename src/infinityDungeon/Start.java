package infinityDungeon;
import javax.swing.*;
import java.awt.*;
public class Start extends JFrame
{
private JButton Start = new JButton("Start");
private JButton Exit = new JButton("Exit");
public Start() 
{
	setLayout(new BorderLayout());
	add(Start, BorderLayout.WEST);
	add(Exit, BorderLayout.EAST);
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}
	public static void dispStart() 
	{
		Start st = new Start();
		st.setSize(250, 250);
		st.setVisible(true);

		
		
		
	}

}
