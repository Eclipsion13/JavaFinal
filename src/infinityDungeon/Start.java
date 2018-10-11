package infinityDungeon;
import javax.swing.*;
import java.awt.*;
public class Start extends JFrame
{
private JButton left = new JButton("Left");
public Start() 
{
	setLayout(new BorderLayout());
	add(left, BorderLayout.WEST);
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}
	public static void dispStart() 
	{
		Start st = new Start();
		st.setSize(250, 250);
		st.setVisible(true);

		
		
		
	}

}
