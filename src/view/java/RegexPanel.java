package view.java;

import controller.java.*;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.*;

public class RegexPanel extends JPanel
{
	private JTextField firstNameField;
	private JTextField lastNameField;
	private JTextField phoneField;
	private JTextField emailField;
	private JLabel firstNameLabel;
	private JLabel lastNameLabel;
	private JLabel phoneLabel;
	private JLabel emailLabel;
	private JButton submitButton;
	private SpringLayout baseLayout;
	private RegexController baseController;
	
	public RegexPanel(RegexController baseController)
	{
		this.baseController = baseController;
		this.baseLayout = new SpringLayout();
		this.firstNameField = new JTextField(5);
		this.lastNameField = new JTextField(5);
		this.phoneField = new JTextField(5);
		this.emailField = new JTextField(5);
		this.firstNameLabel = new JLabel("First Name:");
		this.lastNameLabel = new JLabel("Last Name:");
		this.phoneLabel = new JLabel("Phone Number:");
		this.emailLabel = new JLabel("Email:");
		this.submitButton = new JButton("Submit");
		
		
		setupPanel();
		setupLayout();
		setupListeners();
	}
	
	private void setupPanel()
	{
		this.setLayout(baseLayout);
		this.setMinimumSize(new Dimension(700,300));
		this.setBackground(Color.DARK_GRAY);
		this.add(firstNameField);
		this.add(lastNameField);
		this.add(phoneField);
		this.add(emailField);
		this.add(firstNameLabel);
		this.add(lastNameLabel);
		this.add(phoneLabel);
		this.add(emailLabel);
		this.add(submitButton);
	}
	
	private void setupLayout()
	{
		baseLayout.putConstraint(SpringLayout.EAST, firstNameField, -159, SpringLayout.EAST, this);
		baseLayout.putConstraint(SpringLayout.EAST, lastNameField, 0, SpringLayout.EAST, firstNameField);
		baseLayout.putConstraint(SpringLayout.WEST, phoneField, 0, SpringLayout.WEST, firstNameField);
		baseLayout.putConstraint(SpringLayout.EAST, phoneField, -159, SpringLayout.EAST, this);
		baseLayout.putConstraint(SpringLayout.WEST, emailField, 0, SpringLayout.WEST, firstNameField);
		baseLayout.putConstraint(SpringLayout.EAST, emailField, -159, SpringLayout.EAST, this);
		baseLayout.putConstraint(SpringLayout.NORTH, firstNameField, -5, SpringLayout.NORTH, firstNameLabel);
		baseLayout.putConstraint(SpringLayout.WEST, firstNameField, 47, SpringLayout.EAST, firstNameLabel);
		baseLayout.putConstraint(SpringLayout.NORTH, firstNameLabel, 35, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.WEST, firstNameLabel, 22, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.NORTH, lastNameField, -5, SpringLayout.NORTH, lastNameLabel);
		baseLayout.putConstraint(SpringLayout.WEST, lastNameField, 49, SpringLayout.EAST, lastNameLabel);
		baseLayout.putConstraint(SpringLayout.NORTH, lastNameLabel, 38, SpringLayout.SOUTH, firstNameLabel);
		baseLayout.putConstraint(SpringLayout.WEST, lastNameLabel, 0, SpringLayout.WEST, firstNameLabel);
		baseLayout.putConstraint(SpringLayout.NORTH, phoneField, -5, SpringLayout.NORTH, phoneLabel);
		baseLayout.putConstraint(SpringLayout.NORTH, phoneLabel, 31, SpringLayout.SOUTH, lastNameLabel);
		baseLayout.putConstraint(SpringLayout.WEST, phoneLabel, 0, SpringLayout.WEST, firstNameLabel);
		baseLayout.putConstraint(SpringLayout.NORTH, emailField, -5, SpringLayout.NORTH, emailLabel);
		baseLayout.putConstraint(SpringLayout.NORTH, emailLabel, 32, SpringLayout.SOUTH, phoneLabel);
		baseLayout.putConstraint(SpringLayout.WEST, emailLabel, 0, SpringLayout.WEST, firstNameLabel);
		baseLayout.putConstraint(SpringLayout.NORTH, submitButton, 105, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.EAST, submitButton, -30, SpringLayout.EAST, this);
	}
	
	private void setupListeners()
	{
		
	}
}
