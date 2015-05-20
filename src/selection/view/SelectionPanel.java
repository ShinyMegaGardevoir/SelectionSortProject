package selection.view;

import java.awt.Component;

import javax.swing.JPanel;
import javax.swing.SpringLayout;

import selection.controller.SelectionAppController;

import javax.swing.JTextArea;

public class SelectionPanel extends JPanel
{
	private SpringLayout baseLayout;
	private SelectionAppController baseController;
	private JTextArea textArea;
	
	public SelectionPanel(SelectionAppController baseController)
	{
		baseLayout = new SpringLayout();
		textArea = new JTextArea(10,20);
		baseLayout.putConstraint(SpringLayout.NORTH, textArea, 57, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.EAST, textArea, -142, SpringLayout.EAST, this);
		
		setupPanel();
		setupLayout();
		setupListeners();
	}
	
	private void setupPanel()
	{
		this.setLayout(baseLayout);
		this.add(textArea);
	}
	
	private void setupLayout()
	{
		
	}
	
	private void setupListeners()
	{
		
	}

}
