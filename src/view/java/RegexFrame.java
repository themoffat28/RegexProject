package view.java;

import controller.java.*;
import view.java.*;
import java.awt.Dimension;
import javax.swing.JFrame;

public class RegexFrame extends JFrame
{
	private RegexController baseController;
	private RegexPanel appPanel;
	
	public RegexFrame(RegexController baseController)
	{
		this.baseController = baseController;
		appPanel = new RegexPanel(baseController);
		setupFrame();
	}
	
	private void setupFrame()
	{
		this.setContentPane(appPanel);
		this.setTitle("Information Collection Tool");
		this.setSize(new Dimension(500, 300));
		this.setVisible(true);
	}
	
	public RegexController getBaseController()
	{
		return baseController;
	}
}
