package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Font;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.JRadioButton;
import javax.swing.JCheckBox;
import javax.swing.SwingConstants;
import javax.swing.*;
public class CalculateTwoNumber extends JFrame {

	private JPanel contentPane;
	private JTextField txtNumber1;
	private JTextField txtNumber2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CalculateTwoNumber frame = new CalculateTwoNumber();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public CalculateTwoNumber() {
		setTitle("CalculateTwoNumber");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 539, 482);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNumber1 = new JLabel("Enter Number 1");
		lblNumber1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNumber1.setBounds(29, 25, 147, 29);
		contentPane.add(lblNumber1);
		
		txtNumber1 = new JTextField();
		txtNumber1.setBounds(231, 25, 147, 29);
		contentPane.add(txtNumber1);
		txtNumber1.setColumns(10);
		
		JLabel lblNumber2 = new JLabel("Enter Number 2");
		lblNumber2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNumber2.setBounds(29, 75, 147, 29);
		contentPane.add(lblNumber2);
		
		txtNumber2 = new JTextField();
		txtNumber2.setBounds(231, 77, 147, 29);
		contentPane.add(txtNumber2);
		txtNumber2.setColumns(10);
		
		JLabel lblResult = new JLabel("Result");
		lblResult.setHorizontalAlignment(SwingConstants.CENTER);
		lblResult.setBounds(316, 331, 109, 35);
		lblResult.setFont(new Font("Tahoma", Font.BOLD, 16));
		contentPane.add(lblResult);
		
		JLabel lblOperator = new JLabel("Operator");
		lblOperator.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblOperator.setBounds(29, 121, 147, 29);
		contentPane.add(lblOperator);
		
		JComboBox chOperator = new JComboBox();
		chOperator.setFont(new Font("Castellar", Font.PLAIN, 17));
		chOperator.setBounds(231, 124, 147, 29);
		chOperator.addItem("+");
		chOperator.addItem("-");
		chOperator.addItem("*");
		chOperator.addItem("/");
		contentPane.add(chOperator);
		
		JLabel lblDigit = new JLabel("How to show digit");
		lblDigit.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblDigit.setBounds(29, 170, 147, 29);
		contentPane.add(lblDigit);
		
		JRadioButton oneDigit = new JRadioButton("1 Digit");
		oneDigit.setFont(new Font("Tahoma", Font.PLAIN, 13));
		oneDigit.setBounds(231, 175, 109, 23);
		contentPane.add(oneDigit);
		
		JRadioButton twoDigit = new JRadioButton("2 Digit");
		twoDigit.setFont(new Font("Tahoma", Font.PLAIN, 13));
		twoDigit.setBounds(231, 212, 109, 23);
		contentPane.add(twoDigit);
		
		ButtonGroup group = new ButtonGroup();
		group.add(oneDigit);
		group.add(twoDigit);
		
		JLabel lblOption = new JLabel("Option to show");
		lblOption.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblOption.setBounds(29, 259, 147, 23);
		contentPane.add(lblOption);
		
		JCheckBox chkDialogbox = new JCheckBox("Show Result at DialogBox");
		chkDialogbox.setFont(new Font("Tahoma", Font.PLAIN, 13));
		chkDialogbox.setBounds(231, 259, 243, 29);
		contentPane.add(chkDialogbox);
		
		JButton btnOk = new JButton("OK");
		btnOk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double num1,num2,sum=0;
				String operator;
				if(e.getSource()==btnOk) {
					num1 = Double.parseDouble(txtNumber1.getText());
					num2 = Double.parseDouble(txtNumber2.getText());
					operator = (String)chOperator.getSelectedItem();
					if(operator.equals("+"))
						sum = num1+num2;
					if(operator.equals("-"))
						sum = num1-num2;
					if(operator.equals("*"))
						sum = num1*num2;
					if(operator.equals("/"))
						sum = num1/num2;
					
					DecimalFormat frmNumber = null;
					if(oneDigit.isSelected()) {
						frmNumber = new DecimalFormat("#,###.0");
					}
					else if(twoDigit.isSelected()) {
						frmNumber = new DecimalFormat("#,###.00");
					}
					
					lblResult.setText(frmNumber.format(sum));
					
					if(chkDialogbox.isSelected()) {
						JOptionPane.showMessageDialog(null,"Result is : "+frmNumber.format(sum));
					}
				}
			}
		});
		btnOk.setBounds(247, 403, 101, 29);
		contentPane.add(btnOk);
		
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnExit.setBounds(378, 403, 101, 29);
		contentPane.add(btnExit);
		
		
		
		
	}
}
