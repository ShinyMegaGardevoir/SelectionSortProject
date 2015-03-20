package selection.view;

import javax.swing.JFrame;
import javax.swing.JLabel;

import selection.controller.SelectionAppController;

public class SelectionFrame extends JFrame
{
	
	private SelectionPanel appPanel;
	private JLabel titleLabel;
	
	public SelectionFrame(SelectionAppController baseController)
	{
		appPanel = new SelectionPanel(baseController);
		setupFrame();
	}
	
	private void setupFrame()
	{
		
		this.setSize(500, 500);
		this.setResizable(true);
		this.setContentPane(appPanel);
		this.setVisible(true);
	}
}