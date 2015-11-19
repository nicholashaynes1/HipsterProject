package hipster.view;

import javax.swing.*;

import hipster.controller.HipsterController;
import hipster.model.Book;

import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Button;

public class HipsterPanel extends JPanel
{
	private SpringLayout baseLayout;
	private HipsterController baseController;
	private JComboBox<String> phraseComboBox;
	private JLabel bookPageCountLabel;
	private JLabel bookAuthorLabel;
	private JLabel bookSubjectLabel;
	private JLabel bookTitleLabel;
	private JLabel bookPriceLabel;
	private JButton changeBookButton;
	private int maxClicks;
	private int startClick;
	
	
	
	

	public HipsterPanel(HipsterController baseController)
	{
		this.baseController = baseController;
		baseLayout = new SpringLayout();
		bookPageCountLabel = new JLabel("The page count");
		bookAuthorLabel = new JLabel("The author");
		bookPriceLabel = new JLabel("The price");
		bookSubjectLabel = new JLabel("The subject");
		bookTitleLabel = new JLabel("The title");
		changeBookButton = new JButton("Change books");
		phraseComboBox = new JComboBox<String>();
		maxClicks = baseController.getFirstHipster().getHipsterBooks().length;
		
		
		setupComboBox();
		setupPanel();
		setupLayout();
		setupListeners();

	}

	private void setupComboBox()
	{
		String[] phrases = baseController.getFirstHipster().getHipsterPhrases();
		DefaultComboBoxModel phraseModel = new DefaultComboBoxModel(phrases);
		phraseComboBox.setModel(phraseModel);
	}

	private void setupPanel()
	{
		this.setLayout(baseLayout);
		this.setBackground(Color.YELLOW);
		this.add(phraseComboBox);

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
			
		changeBookButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{
				Book [] tempBooks = baseController.getFirstHipster().getHipsterBooks();
				if(startClick < maxClicks)
				{
					bookSubjectLabel.setText("Book subject: " + tempBooks[startClick].getSubject());
					bookAuthorLabel.setText("Book author: " + tempBooks[startClick].getSubject());
					bookTitleLabel.setText("Book title: " + tempBooks[startClick].getSubject());
					bookPageCountLabel.setText("Book pages: " + tempBooks[startClick].getSubject());
					bookPriceLabel.setText("Book price " + tempBooks[startClick].getSubject());
				}
				else
				{
					startClick = 0;
					bookSubjectLabel.setText("Book subject: ");
					bookAuthorLabel.setText("Book author" );
					bookTitleLabel.setText("Book title: " );
					bookPageCountLabel.setText("Book pages: " );
					bookPriceLabel.setText("Book price " );
				
				
				
				
				}
			}
		});
	
	
	
	
	
	
	
	}
	
	
	
	

}
