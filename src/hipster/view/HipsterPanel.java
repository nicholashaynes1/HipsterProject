package hipster.view;

import javax.swing.*;

import hipster.controller.hipsterController;
import hipster.view.HipsterFrame;

import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class HipsterPanel extends JPanel
{
	private SpringLayout baseLayout;
	private hipsterController baseController;
	private JComboBox<String> phraseComboBox;


public HipsterPanel(hipsterController baseController)
{
	
}






private void setupComboBox()
{
	String [] phrases = baseController.getFirstHipster().getHipsterPhrases();
	DefaultComboBoxModel phraseModel = new DefaultComboBoxModel(phrases);
	phraseComboBox.setModel(phraseModel);
}

private void setupPanel()
{
	this.setLayout(baseLayout);
	
	this.setBackground(Color.YELLOW);
	

}


private void setupLayout()
{
	
}
	

private void setupListeners()
{
	phraseComboBox.addActionListener(new ActionListener()
	{
		public void actionPerformed(ActionEvent selection)
		{
			int red = (int) (Math.random() * 256);
			int green = (int) (Math.random() * 256);
			int blue = (int) (Math.random() * 256);
			setBackground(new Color(red, green, blue));
			String updatedTitle = phraseComboBox.getSelectedItem().toString();
			baseController.getBaseFrame().setTitle(updatedTitle);
		}
	});
}

}	
	
	
	


