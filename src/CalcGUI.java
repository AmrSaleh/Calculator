import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class CalcGUI  extends JFrame {

	//private JLabel answer;
	private JTextField operation,answer;
	private JButton add,subtract,multiply,divide;
	private JButton evaluate;
	
	
	
	public CalcGUI() {
		super("Amr Calculator");
		setLayout(new FlowLayout());
		
		operation=new JTextField("",20);
		operation.setToolTipText("enter your binary operation here, No spaces");
		//operation.setSize(20, 5);
		
		answer=new JTextField("0",20);
		answer.setEditable(false);
		answer.setToolTipText("answer to your operation");
		
		evaluate=new JButton();
		
		evaluate.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				answer.setText("hohohoahoahhaoa");
			}
		});
		
		
		
		add(operation);
		add(answer);
		add(evaluate);
		
	}
}




//String test = JOptionPane.showInputDialog("enter first name");
//String test2 = JOptionPane.showInputDialog("enter Second name");
//
//int num = Integer.parseInt(test);
//int num2 = Integer.parseInt(test2);
//int sum = num + num2;
//
//JOptionPane.showMessageDialog(null, "answer " + sum, "title", JOptionPane.PLAIN_MESSAGE);