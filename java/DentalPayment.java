package ceshi;
/**
 * @todo САїЖ
 */
import java.awt.*;
import java.awt.event.*;
import java.text.*;

import javax.swing.*;
public class DentalPayment extends JFrame 
{
	//
	private JLabel detalpaymentformJLabel;
	
	//
	private JLabel patientNameJLabel;
	private JTextField patientNameJTextField;
	
	//
	private JLabel cleaningJLabel;
	private JCheckBox cleaningJCheckbox;
	
	//
	private JLabel cavityFillingJLabel;
	private JCheckBox cavityFillingJCheckbox;
	
	//
	private JLabel xRayJLabel;
	private JCheckBox xRayJCheckbox;
	
	//
	private JLabel totalJLabel;
	private JTextField totalJTextField;
	
	//
	private JButton calculateJButton;
	
	//
	public DentalPayment()
	{
		this.createUserInterface();
	}
	
	//
	private void createUserInterface()
	{
		//
		Container contentPane = getContentPane();
				
		//
		contentPane.setLayout(null);
		
		//detalpaymentformjlabel
		detalpaymentformJLabel = new JLabel();
		detalpaymentformJLabel.setBounds(19,19,235,28);
		detalpaymentformJLabel.setText("detal payment form");
		detalpaymentformJLabel.setFont(new Font("Default",Font.PLAIN,22));
		detalpaymentformJLabel.setHorizontalAlignment(JLabel.CENTER);
		contentPane.add(detalpaymentformJLabel);
		
		//patientjlabel
		patientNameJLabel = new JLabel();
		patientNameJLabel.setBounds(19, 65, 91, 21);
		patientNameJLabel.setText("Patient Name");
		contentPane.add(patientNameJLabel);
		
		//patientJTextField
		patientNameJTextField = new JTextField();
		patientNameJTextField.setBounds(132,65,117,21);
		contentPane.add(patientNameJTextField);
		
		//cleaningjcheckbox
		cleaningJCheckbox = new JCheckBox();
		cleaningJCheckbox.setBounds(16, 112, 122, 24);
		cleaningJCheckbox.setText("cleaning");
		contentPane.add(cleaningJCheckbox);
		
		//cleaningPriceJLabel
		cleaningJLabel = new JLabel();
		cleaningJLabel.setBounds(211, 112, 38, 24);
		cleaningJLabel.setText("$35");
		cleaningJLabel.setHorizontalAlignment(JLabel.CENTER);
		contentPane.add(cleaningJLabel);
		
		//cavityFillingJCheckbox
		cavityFillingJCheckbox = new JCheckBox();
		cavityFillingJCheckbox.setBounds(16,159,122,24);
		cavityFillingJCheckbox.setText("cavity Filling");
		contentPane.add(cavityFillingJCheckbox);
		
		//cavityFillingPriceJLabel
		cavityFillingJLabel = new JLabel();
		cavityFillingJLabel.setBounds(211, 159, 38, 24);
		cavityFillingJLabel.setText("$150");
		cavityFillingJLabel.setHorizontalAlignment(JLabel.CENTER);
		contentPane.add(cavityFillingJLabel);
		
		//xrayjcheckbox
		xRayJCheckbox = new JCheckBox();
		xRayJCheckbox.setBounds(16, 206,122,24);
		xRayJCheckbox.setText("x-ray");
		contentPane.add(xRayJCheckbox);
		
		//xrayjlabel
		xRayJLabel = new JLabel();
		xRayJLabel.setBounds(211,206,38,24);
		xRayJLabel.setText("$85");
		xRayJLabel.setHorizontalAlignment(JLabel.CENTER);
		contentPane.add(xRayJLabel);
		
		//totaljlabel
		totalJLabel = new JLabel();
		totalJLabel.setBounds(144,256,41,21);
		totalJLabel.setText("Total");
		contentPane.add(totalJLabel);
		
		//totaljtextfield
		totalJTextField = new JTextField();
		totalJTextField.setBounds(192,256,56,21);
		totalJTextField.setEditable(false);
		totalJTextField.setHorizontalAlignment(JTextField.CENTER);
		contentPane.add(totalJTextField);
		
		//calculatejbutton
		calculateJButton = new JButton();
		calculateJButton.setBounds(155,296,94,24);
		calculateJButton.setText("Calculate");
		contentPane.add(calculateJButton);
		calculateJButton.addActionListener(
			new ActionListener() {
			
				@Override
				public void actionPerformed(ActionEvent arg0) {
					// TODO Auto-generated method stub
					calculateJButtonActionPerformed(arg0);
				}
		});
		setTitle("Detal Payment");
		setSize(272,364);
		setVisible(true);		
	}
	private void calculateJButtonActionPerformed(ActionEvent event)
	{
		String patient = patientNameJTextField.getText();
		if((patient.equals("")) || (!cleaningJCheckbox.isSelected() && !cavityFillingJCheckbox.isSelected() && !xRayJCheckbox.isSelected()))
		{
			JOptionPane.showMessageDialog(null, "please enter a name and check at least one item","missing information",JOptionPane.ERROR_MESSAGE);
		}
		else
		{
			double total = 0.0;
			if(cleaningJCheckbox.isSelected())
			{
				total += 35;				
			}
			if(cavityFillingJCheckbox.isSelected())
			{
				total += 150;
			}
			if(xRayJCheckbox.isSelected())
			{
				total += 85;
			}
			DecimalFormat dollars = new DecimalFormat("$0.00");
			
			totalJTextField.setText(dollars.format(total));
		}
		
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DentalPayment application = new DentalPayment();
		application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
