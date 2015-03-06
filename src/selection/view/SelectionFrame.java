package selection.view;

public class SelectionFrame extends JFrame
{
	
	private SelectionPanel appPanel;
	private JLabel titleLabel;
	
	public SelectionFrame(SelectonAppController baseController)
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