package hipster.view;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import hipster.controller.hipsterController;

public class HipsterFrame extends JFrame
{
	private hipsterController baseController;
	private HipsterPanel basePanel;
	
	public HipsterFrame(hipsterController baseController)
	{
		this.baseController = baseController;
		basePanel = new HipsterPanel(baseController);
		setupFrame();
	}
	
	public String getResponse(String prompt)
	{
		String response = JOptionPane.showInputDialog(this, prompt);
		return response;
	}
	
	
	
	private void setupFrame()
	{
		this.setContentPane(basePanel);
		this.setResizable(false);
		this.setSize(800,800);
		this.setVisible(true);
		
	}
	
	
	
	public hipsterController getBaseController()
	{
		return baseController;
	}

}
