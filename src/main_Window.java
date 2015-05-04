import java.awt.Button;
import java.awt.EventQueue;
import java.awt.Frame;

import javax.swing.JFrame;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Insets;

public class main_Window {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private Operation[] history;
	private int counter;
	private int recall;
	private int forward;
	private boolean recalling, acPressed, operationCompleted;

	/**
	 * Launch the application.
	 */
	public static void main() {

		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					main_Window window = new main_Window();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public main_Window() {

		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {

		frame = new JFrame();
		frame.setBounds(100, 100, 273, 231);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		frame.setTitle("Amr Calc");

		history = new Operation[6];
		counter = 0;
		recall = 0;
		forward = 0;
		recalling = false;
		acPressed = false;
		operationCompleted = false;

		textField = new JTextField();
		textField.setColumns(10);
		textField.setToolTipText("enter your binary operation here, No spaces");

		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setEditable(false);
		textField_1.setToolTipText("answer to your operation");
		
		theHandler handler =new theHandler();
		textField.addActionListener(handler);
		
		
		
		JButton btnNewButton = new JButton("1");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (operationCompleted) {
					textField.setText("1");
					operationCompleted=false;
				} else {
					textField.setText(textField.getText() + "1");
				}
				
				
			}
		});

		

		JButton button = new JButton("2");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (operationCompleted) {
					textField.setText("2");
					operationCompleted=false;
				} else {
				textField.setText(textField.getText() + "2");
				}
			}
		});

		JButton button_1 = new JButton("3");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (operationCompleted) {
					textField.setText("3");
					operationCompleted=false;
				} else {
				textField.setText(textField.getText() + "3");
				}
			}
		});

		JButton button_2 = new JButton("+");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (operationCompleted) {
					textField.setText("+");
					operationCompleted=false;
				} else {
				textField.setText(textField.getText() + "+");
				}
			}
		});

		JButton button_3 = new JButton("4");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (operationCompleted) {
					textField.setText("4");
					operationCompleted=false;
				} else {
				textField.setText(textField.getText() + "4");
				}
			}
		});

		JButton button_4 = new JButton("5");
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (operationCompleted) {
					textField.setText("5");
					operationCompleted=false;
				} else {
				textField.setText(textField.getText() + "5");
				}
			}
		});

		JButton button_5 = new JButton("6");
		button_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (operationCompleted) {
					textField.setText("6");
					operationCompleted=false;
				} else {
				textField.setText(textField.getText() + "6");
				}
			}
		});

		JButton button_6 = new JButton("-");
		button_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (operationCompleted) {
					textField.setText("-");
					operationCompleted=false;
				} else {
				textField.setText(textField.getText() + "-");
				}
			}
		});

		JButton button_7 = new JButton("7");
		button_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (operationCompleted) {
					textField.setText("7");
					operationCompleted=false;
				} else {
				textField.setText(textField.getText() + "7");
				}
			}
		});

		JButton button_8 = new JButton("8");
		button_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (operationCompleted) {
					textField.setText("8");
					operationCompleted=false;
				} else {
				textField.setText(textField.getText() + "8");
				}
			}
		});

		JButton button_9 = new JButton("9");
		button_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (operationCompleted) {
					textField.setText("9");
					operationCompleted=false;
				} else {
				textField.setText(textField.getText() + "9");
				}
			}
		});

		JButton button_10 = new JButton("0");
		button_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (operationCompleted) {
					textField.setText("0");
					operationCompleted=false;
				} else {
				textField.setText(textField.getText() + "0");
				}
			}
		});

		JButton button_11 = new JButton(".");
		button_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (operationCompleted) {
					textField.setText(".");
					operationCompleted=false;
				} else {
				textField.setText(textField.getText() + ".");
				}
			}
		});

		JButton btnDel = new JButton("DEL");
		btnDel.setMargin(new Insets(2, 10, 2, 10));
		btnDel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (textField.getText().length() > 0)
					textField.setText(textField.getText().substring(0, textField.getText().length() - 1));
			}
		});
		btnDel.setFont(new Font("Tahoma", Font.PLAIN, 9));

		JButton button_13 = new JButton("*");
		button_13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "*");
			}
		});

		JButton button_14 = new JButton("/");
		button_14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "/");
			}
		});

		JButton button_15 = new JButton("PREV");
		button_15.setFont(new Font("Tahoma", Font.PLAIN, 10));
		button_15.setMargin(new Insets(2, 5, 2, 5));
		button_15.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// (counter-2+6)%6
				if (acPressed) {
					recall = (counter - 1 + 6) % 6;
				} else {
					if (recalling) {

						if (recall == counter) {
							return;
						}
						recall = (recall - 1 + 6) % 6;
					} else {
						recall = (counter - 2 + 6) % 6;
					}
				}
				if (history[recall] != null) {
					textField.setText(history[recall].getExp());
					textField_1.setText(history[recall].evaluate() + "");

					forward = recall;
					recalling = true;
					acPressed = false;
				} else {
					if (recalling)
						recall++;
				}

			}
		});

		JButton button_16 = new JButton("NEXT");
		button_16.setFont(new Font("Tahoma", Font.PLAIN, 10));
		button_16.setMargin(new Insets(2, 5, 2, 5));
		button_16.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// ///
				if (recalling) {

					if (forward == (counter - 1 + 6) % 6) {
						return;
					}
					forward = (forward + 1) % 6;
				} else {
					return;
				}
				if (history[forward] != null) {
					textField.setText(history[forward].getExp());
					textField_1.setText(history[forward].evaluate() + "");
				}

				recall = (forward);
				acPressed = false;
			}
		});

		JButton button_17 = new JButton("=");
		button_17.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calcByLine(textField.getText());
			}
		});

		JButton button_12 = new JButton("AC");
		button_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("");
				textField_1.setText("");
				acPressed = true;
			}
		});
		button_12.setMargin(new Insets(2, 10, 2, 10));
		GroupLayout groupLayout = new GroupLayout(frame.getContentPane());
		groupLayout.setHorizontalGroup(groupLayout.createParallelGroup(Alignment.LEADING).addGroup(groupLayout.createSequentialGroup().addContainerGap().addGroup(groupLayout.createParallelGroup(Alignment.LEADING).addGroup(groupLayout.createSequentialGroup().addGroup(groupLayout.createParallelGroup(Alignment.LEADING).addGroup(groupLayout.createSequentialGroup().addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE).addPreferredGap(ComponentPlacement.RELATED).addComponent(button, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE)).addGroup(groupLayout.createSequentialGroup().addComponent(button_3, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE).addPreferredGap(ComponentPlacement.RELATED).addComponent(button_4, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE)).addGroup(groupLayout.createSequentialGroup().addComponent(button_7, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE).addPreferredGap(ComponentPlacement.RELATED).addComponent(button_8, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE)).addGroup(groupLayout.createSequentialGroup().addComponent(button_11, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE).addPreferredGap(ComponentPlacement.RELATED).addComponent(button_10, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE))).addPreferredGap(ComponentPlacement.RELATED).addGroup(groupLayout.createParallelGroup(Alignment.LEADING).addGroup(groupLayout.createSequentialGroup().addComponent(button_5, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE).addPreferredGap(ComponentPlacement.RELATED).addComponent(button_6, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE).addPreferredGap(ComponentPlacement.RELATED).addComponent(button_15, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE)).addGroup(groupLayout.createSequentialGroup().addGroup(groupLayout.createParallelGroup(Alignment.LEADING, false).addComponent(btnDel, 0, 0, Short.MAX_VALUE).addComponent(button_9, GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)).addPreferredGap(ComponentPlacement.RELATED).addGroup(groupLayout.createParallelGroup(Alignment.LEADING).addGroup(groupLayout.createSequentialGroup().addComponent(button_13, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE).addPreferredGap(ComponentPlacement.RELATED).addComponent(button_16, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE)).addGroup(groupLayout.createSequentialGroup().addComponent(button_14, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE).addPreferredGap(ComponentPlacement.RELATED).addComponent(button_17, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE)))).addGroup(groupLayout.createSequentialGroup().addComponent(button_1, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE).addPreferredGap(ComponentPlacement.RELATED).addComponent(button_2, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE).addPreferredGap(ComponentPlacement.RELATED).addComponent(button_12, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE)))).addComponent(textField, 244, 244, 244).addComponent(textField_1, 244, 244, 244)).addContainerGap(13, Short.MAX_VALUE)));
		groupLayout.setVerticalGroup(groupLayout.createParallelGroup(Alignment.LEADING).addGroup(groupLayout.createSequentialGroup().addContainerGap().addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE).addPreferredGap(ComponentPlacement.RELATED).addComponent(textField_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE).addPreferredGap(ComponentPlacement.UNRELATED).addGroup(groupLayout.createParallelGroup(Alignment.BASELINE).addComponent(btnNewButton).addComponent(button).addComponent(button_1).addComponent(button_2).addComponent(button_12)).addPreferredGap(ComponentPlacement.RELATED).addGroup(groupLayout.createParallelGroup(Alignment.BASELINE).addComponent(button_3).addComponent(button_4).addComponent(button_5).addComponent(button_6).addComponent(button_15)).addPreferredGap(ComponentPlacement.RELATED).addGroup(groupLayout.createParallelGroup(Alignment.BASELINE).addComponent(button_7).addComponent(button_8).addComponent(button_9).addComponent(button_13).addComponent(button_16)).addPreferredGap(ComponentPlacement.RELATED).addGroup(groupLayout.createParallelGroup(Alignment.TRAILING).addComponent(button_17, GroupLayout.DEFAULT_SIZE, 23, Short.MAX_VALUE).addComponent(btnDel, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE).addGroup(Alignment.LEADING, groupLayout.createParallelGroup(Alignment.LEADING, false).addComponent(button_11, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE).addComponent(button_10, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE).addComponent(button_14, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))).addGap(25)));
		frame.getContentPane().setLayout(groupLayout);
	}

	public void calcByLine(String expression) {

		if (checkSpaces(expression)) {
			try {

				Operation myOperation = new Operation(expression);

				textField_1.setText(myOperation.evaluate() + "");

				history[counter] = myOperation;
				counter = (counter + 1) % 6;
				recalling = false;
				acPressed = false;
				operationCompleted = true;

			} catch (Exception e) {
				textField_1.setText("Wrong expression");
				//e.printStackTrace();
			}
		}

	}

	public boolean checkSpaces(String expression) {
		for (int i = 0; i < expression.length(); i++) {
			if (expression.charAt(i) == ' ') {
				textField_1.setText("No spaces allowed");
				return false;
			}

			if (!(expression.charAt(i) >= '0' && expression.charAt(i) <= '9')) {

			} else {
				if (expression.charAt(i) == '/' || expression.charAt(i) == '*' || expression.charAt(i) == '-' || expression.charAt(i) == '+') {
					textField_1.setText("Wrong expression");
					return false;
				}
			}
		}
		return true;
	
	}
	
	private class theHandler implements ActionListener {
		
		
		@Override
		public void actionPerformed(ActionEvent event) {
			
			
			calcByLine(textField.getText());
		}
	}

	
}
