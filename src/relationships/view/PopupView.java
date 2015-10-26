package relationships.view;

import javax.swing.JOptionPane;

public class PopupView
{
	public void displayContents(String text)
	{
		JOptionPane.showMessageDialog(null,text);
	}
	
	public String getResults(String text)
	{
		String results = JOptionPane.showInputDialog(null, text);
		return results;
	}
}
