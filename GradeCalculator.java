import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Color;
import java.awt.Window.Type;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class GradeCalculator {

	private JFrame frmGradeCalculater;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JLabel lblGrade;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JLabel lblPercentagejustNumber;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTextField textField_12;
	private JTextField textField_13;
	private JTextField textField_14;
	private JLabel lblCategoryName;
	private JLabel TextAnsw;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GradeCalculator window = new GradeCalculator();
					window.frmGradeCalculater.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public GradeCalculator() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmGradeCalculater = new JFrame();
		frmGradeCalculater.getContentPane().setFont(new Font("Chalkboard", Font.PLAIN, 20));
		frmGradeCalculater.setTitle("Grade Calculater");
		frmGradeCalculater.getContentPane().setBackground(new Color(204, 255, 255));
		frmGradeCalculater.setBounds(100, 100, 709, 573);
		frmGradeCalculater.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmGradeCalculater.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(482, 238, 130, 26);
		frmGradeCalculater.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(482, 316, 130, 26);
		frmGradeCalculater.getContentPane().add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(482, 395, 130, 26);
		frmGradeCalculater.getContentPane().add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(282, 98, 130, 26);
		frmGradeCalculater.getContentPane().add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(482, 162, 130, 26);
		frmGradeCalculater.getContentPane().add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(482, 98, 130, 26);
		frmGradeCalculater.getContentPane().add(textField_5);
		
		JButton btnCalculate = new JButton("Calculate!");
		btnCalculate.setFont(new Font("Chalkboard", Font.PLAIN, 30));
		btnCalculate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double  answ=0;
				
		try{
				ArrayList<Double> grades= new ArrayList<Double>();
				ArrayList<Double> percent= new ArrayList<Double>();
				
				if(!textField_5.getText().trim().isEmpty())
				grades.add( Double.parseDouble(textField_5.getText()));
				
				if(!textField_4.getText().trim().isEmpty())
				grades.add( Double.parseDouble(textField_4.getText()));
				
				if(!textField.getText().trim().isEmpty())
				grades.add( Double.parseDouble(textField.getText()));
				
				if(!textField_1.getText().trim().isEmpty())
				grades.add( Double.parseDouble(textField_1.getText()));
				
				if(!textField_2.getText().trim().isEmpty())
				grades.add( Double.parseDouble(textField_2.getText()));
				
				
				
				
				if(!textField_3.getText().trim().isEmpty()&&!textField_5.getText().trim().isEmpty())
				percent.add( Double.parseDouble(textField_3.getText()));
				
				if(!textField_6.getText().trim().isEmpty()&&!textField_4.getText().trim().isEmpty())
				percent.add( Double.parseDouble(textField_6.getText()));
				
				if(!textField_7.getText().trim().isEmpty()&&!textField.getText().trim().isEmpty())
				percent.add( Double.parseDouble(textField_7.getText()));
				
				if(!textField_8.getText().trim().isEmpty()&&!textField_1.getText().trim().isEmpty())
				percent.add( Double.parseDouble(textField_8.getText()));
				
				if(!textField_9.getText().trim().isEmpty()&&!textField_2.getText().trim().isEmpty())
				percent.add( Double.parseDouble(textField_9.getText())
						);

				
				int total=0;
				for (double b: percent){
					total+=b;
				}
				
				if (total==0) ;
				
				for (int a=0; a<grades.size(); a++){
					
						answ+= grades.get(a)*percent.get(a)/total;
				}
			int answ1= (int)(Math.round(answ));
				
					TextAnsw.setText(""+answ1+"%");
			}
			catch(Exception e1){
				JOptionPane.showMessageDialog(null, "Enter a valid number");
			}
			
				
			}
		});
		btnCalculate.setBounds(155, 466, 157, 41);
		frmGradeCalculater.getContentPane().add(btnCalculate);
		
		lblGrade = new JLabel("Grade");
		lblGrade.setFont(new Font("Chalkboard", Font.PLAIN, 20));
		lblGrade.setBounds(518, 35, 88, 51);
		frmGradeCalculater.getContentPane().add(lblGrade);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(282, 162, 130, 26);
		frmGradeCalculater.getContentPane().add(textField_6);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(282, 238, 130, 26);
		frmGradeCalculater.getContentPane().add(textField_7);
		
		textField_8 = new JTextField();
		textField_8.setColumns(10);
		textField_8.setBounds(282, 316, 130, 26);
		frmGradeCalculater.getContentPane().add(textField_8);
		
		textField_9 = new JTextField();
		textField_9.setColumns(10);
		textField_9.setBounds(282, 395, 130, 26);
		frmGradeCalculater.getContentPane().add(textField_9);
		
		lblPercentagejustNumber = new JLabel("Percentage Weight");
		lblPercentagejustNumber.setFont(new Font("Chalkboard", Font.PLAIN, 20));
		lblPercentagejustNumber.setBounds(262, 40, 222, 41);
		frmGradeCalculater.getContentPane().add(lblPercentagejustNumber);
		
		textField_10 = new JTextField();
		textField_10.setColumns(10);
		textField_10.setBounds(71, 98, 130, 26);
		frmGradeCalculater.getContentPane().add(textField_10);
		
		textField_11 = new JTextField();
		textField_11.setColumns(10);
		textField_11.setBounds(71, 162, 130, 26);
		frmGradeCalculater.getContentPane().add(textField_11);
		
		textField_12 = new JTextField();
		textField_12.setColumns(10);
		textField_12.setBounds(71, 238, 130, 26);
		frmGradeCalculater.getContentPane().add(textField_12);
		
		textField_13 = new JTextField();
		textField_13.setColumns(10);
		textField_13.setBounds(71, 316, 130, 26);
		frmGradeCalculater.getContentPane().add(textField_13);
		
		textField_14 = new JTextField();
		textField_14.setColumns(10);
		textField_14.setBounds(71, 395, 130, 26);
		frmGradeCalculater.getContentPane().add(textField_14);
		
		lblCategoryName = new JLabel("Category Name");
		lblCategoryName.setFont(new Font("Chalkboard", Font.PLAIN, 20));
		lblCategoryName.setBounds(71, 41, 173, 39);
		frmGradeCalculater.getContentPane().add(lblCategoryName);
		
		TextAnsw = new JLabel("");
		TextAnsw.setFont(new Font("Chalkboard", Font.PLAIN, 18));
		TextAnsw.setBounds(412, 456, 188, 51);
		frmGradeCalculater.getContentPane().add(TextAnsw);
	}
}
