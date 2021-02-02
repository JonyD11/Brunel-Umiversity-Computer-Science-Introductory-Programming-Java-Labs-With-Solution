import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JPopupMenu;
import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.SwingConstants;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import java.awt.Color;

public class Scientific_Calculator {

	JFrame frmScientificCalculator;
	private JTextField txtDisplay;
	private JTextField jtxtConverts;
	double firstnum;
	double secondnum;
	double result;
	String Text;
	String str;
	String str1;
	String operations;
	String answer;
	double memory = 0;
	
	double[] i = new double[5];
	
	double Nigerian_Naira = 535.96;
	double US_Dollar = 1.52;
	double Kenyan_Shilling = 156.21;
	double Brazilian_Real = 5.86;
	double Canadian_Dollar = 2.03;
	double Indian_Rupee = 100.68;
	double Philippine_Peso = 71.74;
	double Indonesian_Rupiah = 20746.75;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Scientific_Calculator window = new Scientific_Calculator();
					window.frmScientificCalculator.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Scientific_Calculator() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		frmScientificCalculator = new JFrame();
		frmScientificCalculator.setTitle("Scientific Calculator");
		frmScientificCalculator.setBounds(100, 100, 1327, 672);
		frmScientificCalculator.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JMenuBar menuBar = new JMenuBar();
		frmScientificCalculator.setJMenuBar(menuBar);
		
		JMenu mnFile = new JMenu("File");
		menuBar.add(mnFile);
		
		JMenuItem mntmStandard = new JMenuItem("Standard");
		mntmStandard.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				frmScientificCalculator.setTitle("Scientific Calculator");
				frmScientificCalculator.setBounds(100, 100, 350, 672);
				txtDisplay.setBounds(12,57,244,47);
				textField.setBounds(268, 74, 52, 34);
			}
		});
		mnFile.add(mntmStandard);
		
		JMenuItem mntmScientific = new JMenuItem("Scientific");
		mntmScientific.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				frmScientificCalculator.setTitle("Scientific Calculator");
				frmScientificCalculator.setBounds(100, 100, 789, 672);
				txtDisplay.setBounds(12,57,618,47);
				textField.setBounds(657, 70, 73, 34);
			}
		});
		mnFile.add(mntmScientific);
		
		JMenuItem mntmUnitConversion = new JMenuItem("Unit Conversion");
		mntmUnitConversion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				frmScientificCalculator.setTitle("Scientific Calculator");
				frmScientificCalculator.setBounds(100, 100, 1343, 672);
				txtDisplay.setBounds(12,57,244,47);
				textField.setBounds(268, 74, 52, 34);
			}
		});
		mnFile.add(mntmUnitConversion);
		
		JMenuItem mntmExit = new JMenuItem("Exit");
		mntmExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				System.exit(0);
			}
		});
		mnFile.add(mntmExit);
		frmScientificCalculator.getContentPane().setLayout(null);
		
		txtDisplay = new JTextField();
		txtDisplay.setHorizontalAlignment(SwingConstants.RIGHT);
		txtDisplay.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtDisplay.setBounds(12,57,244,47);
		frmScientificCalculator.getContentPane().add(txtDisplay);
		txtDisplay.setColumns(10);
		
		JButton btnNewButton = new JButton("\uF0E7");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String backspace = null;
				
				if (txtDisplay.getText().length() > 0){
					StringBuilder strB = new StringBuilder(txtDisplay.getText());
					strB.deleteCharAt(txtDisplay.getText().length() - 1);
					backspace = strB.toString();
					txtDisplay.setText(backspace);
				}
			}
		});
		btnNewButton.setBounds(12, 140, 52, 47);
		frmScientificCalculator.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_2 = new JButton("C");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				result = 0;
				memory = 0;
				txtDisplay .setText(" ");	
			}
		});
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnNewButton_2.setBounds(140, 486, 52, 47);
		frmScientificCalculator.getContentPane().add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("\u00B1");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double ops = Double.parseDouble(String.valueOf(txtDisplay.getText()));
				ops = ops * (-1);
				txtDisplay.setText(String.valueOf(ops));
			}
		});
		btnNewButton_3.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnNewButton_3.setBounds(204, 140, 52, 47);
		frmScientificCalculator.getContentPane().add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("\u221A ");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				double ops = Double.parseDouble(String.valueOf(txtDisplay.getText()));
				ops = Math.sqrt(ops);
				txtDisplay.setText(String.valueOf(ops));
			}
		});
		btnNewButton_4.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnNewButton_4.setBounds(268, 140, 52, 47);
		frmScientificCalculator.getContentPane().add(btnNewButton_4);
		
		JButton btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				String iNum = txtDisplay.getText() + btn7.getText();
				txtDisplay.setText(iNum);
			}
		});
		btn7.setFont(new Font("Tahoma", Font.BOLD, 13));
		btn7.setBounds(12, 220, 52, 47);
		frmScientificCalculator.getContentPane().add(btn7);
		
		JButton btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			
				String iNum = txtDisplay.getText() + btn8.getText();
				txtDisplay.setText(iNum);
			}
		});
		btn8.setFont(new Font("Tahoma", Font.BOLD, 13));
		btn8.setBounds(76, 220, 52, 47);
		frmScientificCalculator.getContentPane().add(btn8);
		
		JButton btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String iNum = txtDisplay.getText() + btn9.getText();
				txtDisplay.setText(iNum);
			}
		});
		btn9.setFont(new Font("Tahoma", Font.BOLD, 13));
		btn9.setBounds(140, 220, 52, 47);
		frmScientificCalculator.getContentPane().add(btn9);
		
		JButton btnNewButton_8 = new JButton("/");
		btnNewButton_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				firstnum = Double.parseDouble(txtDisplay.getText());
				txtDisplay.setText("");
				operations = "/";
			}
		});
		btnNewButton_8.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnNewButton_8.setBounds(204, 220, 52, 47);
		frmScientificCalculator.getContentPane().add(btnNewButton_8);
		
		JButton btnNewButton_9 = new JButton("%");
		btnNewButton_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				double ops = Double.parseDouble(String.valueOf(txtDisplay.getText()));
				ops = (ops / 100);
				txtDisplay.setText(String.valueOf(ops));
			}
		});
		btnNewButton_9.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnNewButton_9.setBounds(268, 220, 52, 47);
		frmScientificCalculator.getContentPane().add(btnNewButton_9);
		
		JButton btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String iNum = txtDisplay.getText() + btn4.getText();
				txtDisplay.setText(iNum);
			}
		});
		btn4.setFont(new Font("Tahoma", Font.BOLD, 13));
		btn4.setBounds(12, 309, 52, 47);
		frmScientificCalculator.getContentPane().add(btn4);
		
		JButton btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String iNum = txtDisplay.getText() + btn5.getText();
				txtDisplay.setText(iNum);
			}
		});
		btn5.setFont(new Font("Tahoma", Font.BOLD, 13));
		btn5.setBounds(76, 309, 52, 47);
		frmScientificCalculator.getContentPane().add(btn5);
		
		JButton btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String iNum = txtDisplay.getText() + btn6.getText();
				txtDisplay.setText(iNum);
			}
		});
		btn6.setFont(new Font("Tahoma", Font.BOLD, 13));
		btn6.setBounds(140, 309, 52, 47);
		frmScientificCalculator.getContentPane().add(btn6);
		
		JButton btnNewButton_13 = new JButton("*");
		btnNewButton_13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				firstnum = Double.parseDouble(txtDisplay.getText());
				txtDisplay.setText("");
				operations = "*";
			}
		});
		btnNewButton_13.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnNewButton_13.setBounds(204, 309, 52, 47);
		frmScientificCalculator.getContentPane().add(btnNewButton_13);
		
		JButton btn0 = new JButton("0");
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String iNum = txtDisplay.getText() + btn0.getText();
				txtDisplay.setText(iNum);
			}
		});
		btn0.setFont(new Font("Tahoma", Font.BOLD, 13));
		btn0.setBounds(12, 486, 116, 47);
		frmScientificCalculator.getContentPane().add(btn0);
		
		JButton btnNewButton_16 = new JButton("+");
		btnNewButton_16.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				firstnum = Double.parseDouble(txtDisplay.getText());
				txtDisplay.setText("");
				operations = "+";
			}
		});
		btnNewButton_16.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnNewButton_16.setBounds(204, 486, 52, 47);
		frmScientificCalculator.getContentPane().add(btnNewButton_16);
		
		JButton btnNewButton_17 = new JButton("=");
		btnNewButton_17.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String answer;
				secondnum = Double.parseDouble(txtDisplay.getText());
				if (operations == "+")
				{
					result = firstnum + secondnum;
					answer = String.format("%.2f", result);
					txtDisplay.setText(answer);
				}
				
				else if (operations == "-")
				{
					result = firstnum - secondnum;
					answer = String.format("%.2f", result);
					txtDisplay.setText(answer);
				}
				
				else if (operations == "*")
				{
					result = firstnum * secondnum;
					answer = String.format("%.2f", result);
					txtDisplay.setText(answer);
				}
				
				else if (operations == "/")
				{
					result = firstnum / secondnum;
					answer = String.format("%.2f", result);
					txtDisplay.setText(answer);
				}
				
				
			}
		});
		btnNewButton_17.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnNewButton_17.setBounds(268, 402, 52, 131);
		frmScientificCalculator.getContentPane().add(btnNewButton_17);
		
		JButton btnNewButton_18 = new JButton("Log");
		btnNewButton_18.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double ops = Double.parseDouble(String.valueOf(txtDisplay.getText()));
				ops = Math.log(ops);
				txtDisplay.setText(String.valueOf(ops));
			}
		});
		btnNewButton_18.setBounds(368, 140, 68, 47);
		frmScientificCalculator.getContentPane().add(btnNewButton_18);
		
		JButton btnNewButton_19 = new JButton("Sin");
		btnNewButton_19.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double ops = Double.parseDouble(String.valueOf(txtDisplay.getText()));
				ops = Math.sin(ops);
				txtDisplay.setText(String.valueOf(ops));
			}
		});
		btnNewButton_19.setBounds(470, 140, 68, 47);
		frmScientificCalculator.getContentPane().add(btnNewButton_19);
		
		JButton btnNewButton_20 = new JButton("\uD835\uDF0B");
		btnNewButton_20.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double ops;
				ops = (3.1415926535897932384626433832795);
				txtDisplay.setText(String.valueOf(ops));
			}
		});
		btnNewButton_20.setBounds(368, 223, 68, 47);
		frmScientificCalculator.getContentPane().add(btnNewButton_20);
		
		JButton btnNewButton_21 = new JButton("Cos");
		btnNewButton_21.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double ops = Double.parseDouble(String.valueOf(txtDisplay.getText()));
				ops = Math.cos(ops);
				txtDisplay.setText(String.valueOf(ops));
			}
		});
		btnNewButton_21.setBounds(470, 223, 68, 47);
		frmScientificCalculator.getContentPane().add(btnNewButton_21);
		
		JButton btnNewButton_22 = new JButton("x^y");
		btnNewButton_22.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double ops = Double.parseDouble(String.valueOf(txtDisplay.getText()));
				ops = Math.pow(ops, ops);
				txtDisplay.setText(String.valueOf(ops));
			}
		});
		btnNewButton_22.setBounds(368, 309, 68, 47);
		frmScientificCalculator.getContentPane().add(btnNewButton_22);
		
		JButton btnNewButton_23 = new JButton("Tan");
		btnNewButton_23.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double ops = Double.parseDouble(String.valueOf(txtDisplay.getText()));
				ops = Math.tan(ops);
				txtDisplay.setText(String.valueOf(ops));
			}
		});
		btnNewButton_23.setBounds(470, 309, 68, 47);
		frmScientificCalculator.getContentPane().add(btnNewButton_23);
		
		JButton btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String iNum = txtDisplay.getText() + btn1.getText();
				txtDisplay.setText(iNum);
			}
		});
		btn1.setFont(new Font("Tahoma", Font.BOLD, 13));
		btn1.setBounds(12, 402, 52, 47);
		frmScientificCalculator.getContentPane().add(btn1);
		
		JButton btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String iNum = txtDisplay.getText() + btn2.getText();
				txtDisplay.setText(iNum);
			}
		});
		btn2.setFont(new Font("Tahoma", Font.BOLD, 13));
		btn2.setBounds(76, 402, 52, 47);
		frmScientificCalculator.getContentPane().add(btn2);
		
		JButton btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String iNum = txtDisplay.getText() + btn3.getText();
				txtDisplay.setText(iNum);
			}
		});
		btn3.setFont(new Font("Tahoma", Font.BOLD, 13));
		btn3.setBounds(140, 402, 52, 47);
		frmScientificCalculator.getContentPane().add(btn3);
		
		JButton btnNewButton_27 = new JButton("-");
		btnNewButton_27.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				firstnum = Double.parseDouble(txtDisplay.getText());
				txtDisplay.setText("");
				operations = "-";
			}
		});
		btnNewButton_27.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnNewButton_27.setBounds(204, 402, 52, 47);
		frmScientificCalculator.getContentPane().add(btnNewButton_27);
		
		JButton btnNewButton_28 = new JButton("1/x");
		btnNewButton_28.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double ops = Double.parseDouble(String.valueOf(txtDisplay.getText()));
				ops = (1 / ops);
				txtDisplay.setText(String.valueOf(ops));
			}
		});
		btnNewButton_28.setBounds(268, 309, 52, 47);
		frmScientificCalculator.getContentPane().add(btnNewButton_28);
		
		JButton btnNewButton_29 = new JButton("x^2");
		btnNewButton_29.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double ops = Double.parseDouble(String.valueOf(txtDisplay.getText()));
				ops = (ops * ops);
				txtDisplay.setText(String.valueOf(ops));
			}
		});
		btnNewButton_29.setBounds(368, 402, 68, 47);
		frmScientificCalculator.getContentPane().add(btnNewButton_29);
		
		JButton btnNewButton_30 = new JButton("Cbr");
		btnNewButton_30.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double ops = Double.parseDouble(String.valueOf(txtDisplay.getText()));
				ops = Math.cbrt(ops);
				txtDisplay.setText(String.valueOf(ops));
			}
		});
		btnNewButton_30.setBounds(470, 402, 68, 47);
		frmScientificCalculator.getContentPane().add(btnNewButton_30);
		
		JButton btnNewButton_31 = new JButton("x^3");
		btnNewButton_31.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				double ops = Double.parseDouble(String.valueOf(txtDisplay.getText()));
				ops = (ops * ops * ops);
				txtDisplay.setText(String.valueOf(ops));
			}
		});
		btnNewButton_31.setBounds(368, 486, 68, 47);
		frmScientificCalculator.getContentPane().add(btnNewButton_31);
		
		JButton btnNewButton_32 = new JButton("Bin");
		btnNewButton_32.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int a = Integer.parseInt(txtDisplay.getText()); //Binary
					txtDisplay.setText(Integer.toString(a,2));
			}
		});
		btnNewButton_32.setBounds(470, 486, 68, 47);
		frmScientificCalculator.getContentPane().add(btnNewButton_32);
		
		JButton btnNewButton_33 = new JButton("Sinh");
		btnNewButton_33.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double ops = Double.parseDouble(String.valueOf(txtDisplay.getText()));
				ops = Math.sinh(ops);
				txtDisplay.setText(String.valueOf(ops));
			}
		});
		btnNewButton_33.setBounds(562, 140, 68, 47);
		frmScientificCalculator.getContentPane().add(btnNewButton_33);
		
		JButton btnNewButton_34 = new JButton("Cosh");
		btnNewButton_34.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double ops = Double.parseDouble(String.valueOf(txtDisplay.getText()));
				ops = Math.cosh(ops);
				txtDisplay.setText(String.valueOf(ops));
			}
		});
		btnNewButton_34.setBounds(562, 223, 68, 47);
		frmScientificCalculator.getContentPane().add(btnNewButton_34);
		
		JButton btnNewButton_35 = new JButton("Tanh");
		btnNewButton_35.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double ops = Double.parseDouble(String.valueOf(txtDisplay.getText()));
				ops = Math.tanh(ops);
				txtDisplay.setText(String.valueOf(ops));
			}
		});
		btnNewButton_35.setBounds(562, 309, 68, 47);
		frmScientificCalculator.getContentPane().add(btnNewButton_35);
		
		JButton btnNewButton_36 = new JButton("Rund");
		btnNewButton_36.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double ops = Double.parseDouble(String.valueOf(txtDisplay.getText()));
				ops = Math.round(ops);
				txtDisplay.setText(String.valueOf(ops));
			}
		});
		btnNewButton_36.setBounds(562, 401, 68, 48);
		frmScientificCalculator.getContentPane().add(btnNewButton_36);
		
		JButton btnNewButton_37 = new JButton("Hex");
		btnNewButton_37.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int a = Integer.parseInt(txtDisplay.getText()); //Binary
				txtDisplay.setText(Integer.toString(a,16));
			}
		});
		btnNewButton_37.setBounds(562, 486, 68, 47);
		frmScientificCalculator.getContentPane().add(btnNewButton_37);
		
		JButton btnNewButton_38 = new JButton("Mod");
		btnNewButton_38.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				firstnum = Double.parseDouble(txtDisplay.getText());
				txtDisplay.setText("");
				operations = "Mod";
			}
		});
		btnNewButton_38.setBounds(657, 139, 73, 48);
		frmScientificCalculator.getContentPane().add(btnNewButton_38);
		
		JButton btnNewButton_39 = new JButton("Inx");
		btnNewButton_39.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double ops = Double.parseDouble(String.valueOf(txtDisplay.getText()));
				ops = Math.log10(ops);
				txtDisplay.setText(String.valueOf(ops));
			}
		});
		btnNewButton_39.setBounds(657, 223, 73, 47);
		frmScientificCalculator.getContentPane().add(btnNewButton_39);
		
		JButton btnNewButton_40 = new JButton("Exp");
		btnNewButton_40.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				firstnum = Double.parseDouble(txtDisplay.getText());
				txtDisplay.setText("");
				operations = "Exp";
			}
		});
		btnNewButton_40.setBounds(657, 308, 73, 48);
		frmScientificCalculator.getContentPane().add(btnNewButton_40);
		
		JButton btnNewButton_41 = new JButton("2*\u03C0");
		btnNewButton_41.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double ops;
				ops = (3.1415926535897932384626433832795) * 2;
				txtDisplay.setText(String.valueOf(ops));
			}
		});
		btnNewButton_41.setBounds(657, 401, 73, 48);
		frmScientificCalculator.getContentPane().add(btnNewButton_41);
		
		JButton btnNewButton_42 = new JButton("Octal");
		btnNewButton_42.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int a = Integer.parseInt(txtDisplay.getText()); //Binary
				txtDisplay.setText(Integer.toString(a,8));
			}
		});
		btnNewButton_42.setBounds(657, 486, 73, 47);
		frmScientificCalculator.getContentPane().add(btnNewButton_42);
		
		JButton btnNewButton_5 = new JButton("MS");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//For multiple memory saving
				/*JFileChooser ms = new JFileChooser();
				ms.showSaveDialog(ms);
				File save = ms.getSelectedFile();
				try{
						FileWriter msw = new FileWriter(save);
						
						Text = txtDisplay.getText();
						msw.write(Text);
						msw.close();
				}
				catch(IOException e1){
					System.out.println(e1);
				}*/
				
				BufferedWriter writer = null;
				try{
					writer = new BufferedWriter(new FileWriter("D:\\calculator.txt"));
					Text = txtDisplay.getText();
					writer.write(Text);
				}
				catch(IOException e1)
				{
					System.out.println(e1);
				}
				finally{
					if(writer != null)
					{
						try{
							writer.close();
						}
						catch(IOException e1){
							System.out.println(e1);
						}
					}
				}
				/*memory=Double.parseDouble(txtDisplay.getText());
	            str=String.valueOf("MS");
	            System.out.println(memory);
	            textField.setText(str);*/
			}
		});
		btnNewButton_5.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnNewButton_5.setBounds(76, 140, 52, 47);
		frmScientificCalculator.getContentPane().add(btnNewButton_5);
		
		JButton btnNewButton_6 = new JButton("MR");
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				/*JFileChooser chooser = new JFileChooser();
				chooser.showOpenDialog(null);
				File save1 = chooser.getSelectedFile();
				String calculator = save1.getAbsolutePath();*/
				
				try{
					FileReader reader = new FileReader("D:\\calculator.txt");
					BufferedReader br = new BufferedReader(reader);
					txtDisplay.read(br, null);
					br.close();
					txtDisplay.requestFocus();
				}
				catch(Exception e1){
					JOptionPane.showMessageDialog(null, e1);
				}
				textField.setText("MR");
			}
		});
		btnNewButton_6.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnNewButton_6.setBounds(140, 140, 52, 47);
		frmScientificCalculator.getContentPane().add(btnNewButton_6);
		
		JLabel lblCurrencyConverter = new JLabel("Currency Converter");
		lblCurrencyConverter.setForeground(new Color(165, 42, 42));
		lblCurrencyConverter.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblCurrencyConverter.setBounds(896, 90, 315, 97);
		frmScientificCalculator.getContentPane().add(lblCurrencyConverter);
		
		JComboBox jcmbCurrencys = new JComboBox();
		jcmbCurrencys.setFont(new Font("Tahoma", Font.PLAIN, 24));
		jcmbCurrencys.setModel(new DefaultComboBoxModel(new String[] {"Choose One...", "USA", "Nigeria", "Kenyan", "Canada", "Brazil", "Indonesia", "Philippine", "India"}));
		jcmbCurrencys.setBounds(950, 213, 180, 57);
		frmScientificCalculator.getContentPane().add(jcmbCurrencys);
		
		JLabel jlblConverts = new JLabel("");
		jlblConverts.setFont(new Font("Tahoma", Font.BOLD, 22));
		jlblConverts.setHorizontalAlignment(SwingConstants.CENTER);
		jlblConverts.setBounds(965, 384, 142, 68);
		frmScientificCalculator.getContentPane().add(jlblConverts);
		
		jtxtConverts = new JTextField();
		jtxtConverts.setFont(new Font("Tahoma", Font.PLAIN, 22));
		jtxtConverts.setHorizontalAlignment(SwingConstants.CENTER);
		jtxtConverts.setBounds(950, 300, 180, 57);
		frmScientificCalculator.getContentPane().add(jtxtConverts);
		jtxtConverts.setColumns(10);
		
		JButton btnConvert = new JButton("Convert");
		btnConvert.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double British_Pound = Double.parseDouble(jtxtConverts.getText());	
				if (jcmbCurrencys.getSelectedItem().equals("Nigeria"))
				{
					String cConvert1 = String.format("N %.2f", British_Pound * Nigerian_Naira);
					jlblConverts.setText(cConvert1);
				}
				
				if (jcmbCurrencys.getSelectedItem().equals("Nigeria"))
				{
					String cConvert1 = String.format("N %.2f", British_Pound * Nigerian_Naira);
					jlblConverts.setText(cConvert1);
				}
				
				if (jcmbCurrencys.getSelectedItem().equals("USA"))
				{
					String cConvert1 = String.format("N %.2f", British_Pound * US_Dollar);
					jlblConverts.setText(cConvert1);
				}
				
				if (jcmbCurrencys.getSelectedItem().equals("Kenyan"))
				{
					String cConvert1 = String.format("N %.2f", British_Pound * Kenyan_Shilling);
					jlblConverts.setText(cConvert1);
				}
				
				if (jcmbCurrencys.getSelectedItem().equals("Canada"))
				{
					String cConvert1 = String.format("N %.2f", British_Pound * Canadian_Dollar);
					jlblConverts.setText(cConvert1);
				}
				
				if (jcmbCurrencys.getSelectedItem().equals("Brazil"))
				{
					String cConvert1 = String.format("N %.2f", British_Pound * Brazilian_Real);
					jlblConverts.setText(cConvert1);
				}
				
				if (jcmbCurrencys.getSelectedItem().equals("India"))
				{
					String cConvert1 = String.format("N %.2f", British_Pound * Indian_Rupee);
					jlblConverts.setText(cConvert1);
				}
				
				if (jcmbCurrencys.getSelectedItem().equals("Philippine"))
				{
					String cConvert1 = String.format("N %.2f", British_Pound * Philippine_Peso);
					jlblConverts.setText(cConvert1);
				}
				
				if (jcmbCurrencys.getSelectedItem().equals("Indonsia"))
				{
					String cConvert1 = String.format("N %.2f", British_Pound * Indonesian_Rupiah);
					jlblConverts.setText(cConvert1);
				}
			}
		});
		btnConvert.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnConvert.setBounds(811, 474, 116, 68);
		frmScientificCalculator.getContentPane().add(btnConvert);
		
		JButton btnClear = new JButton("Clear");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				jtxtConverts.setText(null);
				jlblConverts.setText(null);
				jcmbCurrencys.setSelectedItem("Choose One...");
			}
		});
		btnClear.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnClear.setBounds(1166, 474, 115, 68);
		frmScientificCalculator.getContentPane().add(btnClear);
		
		textField = new JTextField();
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		textField.setBounds(268, 66, 52, 34);
		frmScientificCalculator.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("E:\\Wallpapers\\82012.jpg"));
		lblNewLabel.setBounds(0, 0, 1322, 607);
		frmScientificCalculator.getContentPane().add(lblNewLabel);
	}

	private static void addPopup(Component component, final JPopupMenu popup) {
		component.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			public void mouseReleased(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			private void showMenu(MouseEvent e) {
				popup.show(e.getComponent(), e.getX(), e.getY());
			}
		});
	}
}
