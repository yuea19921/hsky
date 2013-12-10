package ceshi;
import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

import org.omg.CORBA.portable.ApplicationException;

public class inventory extends JFrame {
	//JLable and JTextField for cartons per shipment
	private JLabel cartonsJLabel;
	private JTextField cartonsJTextField;
	
	private JLabel itemsJLabel;
	private JTextField itemsJTextField;
	
	private JLabel totalJLabel;
	private JTextField totalResultJTextField;
	
	private JButton calculateButton;
	
	public inventory(){
		createUserInterface();
	}
	
	public void createUserInterface(){
		Container contentPane = getContentPane();
		contentPane.setLayout(null);
		
		cartonsJLabel = new JLabel();
		cartonsJLabel.setText("Cartons per shipment");
		cartonsJLabel.setBounds(16,16,130,21);
		contentPane.add(cartonsJLabel);
		
		cartonsJTextField = new JTextField();
		cartonsJTextField.setText("0");
		cartonsJTextField.setBounds(148,16,40,21);
		cartonsJTextField.setHorizontalAlignment(JTextField.RIGHT);
		contentPane.add(cartonsJTextField);
		cartonsJTextField.addKeyListener(
				new KeyAdapter() 
				{
					public void keyPressed(KeyEvent event)
					{
						cartonsJTextFieldKeyPressed(event);
					}
				}
		);
		
		itemsJLabel = new JLabel();
		itemsJLabel.setText("items per carton");
		itemsJLabel.setBounds(16,48,104,21);
		contentPane.add(itemsJLabel);
		
		itemsJTextField = new JTextField();
		itemsJTextField.setText("0");
		itemsJTextField.setBounds(148,48,40,21);
		itemsJTextField.setHorizontalAlignment(JTextField.RIGHT);
		contentPane.add(itemsJTextField);
		
		itemsJTextField.addKeyListener(
				new KeyAdapter() 
				{
					public void keyPressed(KeyEvent event)
					{
						itemsJTextFieldKeyPressed(event);
					}
				
				}
		);
		
		totalJLabel = new JLabel();
		totalJLabel.setText("total");
		totalJLabel.setBounds(204,16,40,21);
		contentPane.add(totalJLabel);
		
		totalResultJTextField = new JTextField();
		totalResultJTextField.setBounds(244,16,86,21);
		totalResultJTextField.setHorizontalAlignment(JTextField.RIGHT);
		totalResultJTextField.setEditable(false);
		contentPane.add(totalResultJTextField);
		
		calculateButton = new JButton();
		calculateButton.setText("calculate total");
		calculateButton.setBounds(204,48,126,24);
		contentPane.add(calculateButton);
		calculateButton.addActionListener(
				new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent event) {
						// TODO Auto-generated method stub
						calculateJButtonActionPerformed(event);
					}
				}
		);
		
		setTitle("inventory");
		setSize(354,112);
		setVisible(true);
	}
	
	private void calculateJButtonActionPerformed(ActionEvent event)
	{
		int cartons;
		int items;
		int result;
		
		cartons = Integer.parseInt(cartonsJTextField.getText());
		items = Integer.parseInt(itemsJTextField.getText());
		
		result = cartons * items;
		
		totalResultJTextField.setText(String.valueOf(result));		
		
	}
	
	private void cartonsJTextFieldKeyPressed(KeyEvent event)
	{
		totalResultJTextField.setText("");
	}
	private void itemsJTextFieldKeyPressed(KeyEvent event)
	{
		totalResultJTextField.setText("");
	}
	public static void main(String[] args)
	{
		inventory appliction = new inventory();
		appliction.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
