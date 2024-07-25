package sub3;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CalcApp extends JFrame {
	
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CalcApp frame = new CalcApp();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	String check="";
	double total=0;
	String type=""; 
	public void checkType(String type) {
		
		this.type = type;
		if(total==0) {
			total = Double.parseDouble(textField.getText());
			return;
		}
		 switch (type) {
		 	case "+": total += Double.parseDouble(check); break;
		 	case "-": total -= Double.parseDouble(check); break;
		 	case "*": total *= Double.parseDouble(check); break;
		 	case "/": total /= Double.parseDouble(check); break;
		 }
	}
	/**
	 * Create the frame.
	 */
	public CalcApp() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 315, 414);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.setEditable(false);
		textField.setFont(new Font("맑은 고딕", Font.PLAIN, 24));
		textField.setText("0");
		textField.setHorizontalAlignment(SwingConstants.RIGHT);
		textField.setBounds(12, 10, 274, 68);
		contentPane.add(textField);
		textField.setColumns(10);
		
		
		JButton btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				check += "7";
				textField.setText(check);
			}
		});
		btn7.setBounds(12, 88, 60, 60);
		contentPane.add(btn7);
		
		JButton btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				check += "8";
				textField.setText(check);
			}
		});
		btn8.setBounds(84, 88, 60, 60);
		contentPane.add(btn8);
		
		JButton btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				check += "9";
				textField.setText(check);
			}
		});
		btn9.setBounds(156, 88, 60, 60);
		contentPane.add(btn9);
		
		JButton btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				check += "4";
				textField.setText(check);
			}
		});
		btn4.setBounds(12, 158, 60, 60);
		contentPane.add(btn4);
		
		JButton btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				check += "5";
				textField.setText(check);
			}
		});
		btn5.setBounds(84, 158, 60, 60);
		contentPane.add(btn5);
		
		JButton btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				check += "6";
				textField.setText(check);
			}
		});
		btn6.setBounds(156, 158, 60, 60);
		contentPane.add(btn6);
		
		JButton btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				check += "1";
				textField.setText(check);
			}
		});
		btn1.setBounds(12, 228, 60, 60);
		contentPane.add(btn1);
		
		JButton btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				check += "2";
				textField.setText(check);
			}
		});
		btn2.setBounds(84, 228, 60, 60);
		contentPane.add(btn2);
		
		JButton btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				check += "3";
				textField.setText(check);
			}
		});
		btn3.setBounds(156, 228, 60, 60);
		contentPane.add(btn3);
		
		JButton btnna = new JButton("/");
		btnna.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				checkType("/");
				if(total !=0.0) {
					textField.setText(Double.toString(total));
				}else {
					textField.setText(check);
				}
				check="";
			}
		});
		btnna.setBounds(226, 88, 60, 60);
		contentPane.add(btnna);
		
		JButton btngop = new JButton("X");
		btngop.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				checkType("*");
				if(total !=0.0) {
					textField.setText(Double.toString(total));
				}else {
					textField.setText(check);
				}
				check="";
			}
		});
		btngop.setBounds(226, 158, 60, 60);
		contentPane.add(btngop);
		
		JButton btnm = new JButton("-");
		btnm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				checkType("-");
				if(total !=0.0) {
					textField.setText(Double.toString(total));
				}else {
					textField.setText(check);
				}
				check="";
			}
		});
		btnm.setBounds(226, 228, 60, 60);
		contentPane.add(btnm);
		
		JButton btnclear = new JButton("C");
		btnclear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				check = "";
				total = 0;
				type="";
				
				textField.setText(Double.toString(total));
			}
		});
		btnclear.setBounds(12, 298, 60, 60);
		contentPane.add(btnclear);
		
		JButton btn0 = new JButton("0");
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				check += "0";
				textField.setText(check);
				
			}
		});
		btn0.setBounds(84, 298, 60, 60);
		contentPane.add(btn0);
		
		JButton btndap = new JButton("=");
		btndap.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				checkType(type);
				if(Double.isInfinite(total)) {
					textField.setText("0으로 나눌 수 없습니다");
				}else {
					textField.setText(Double.toString(total));	
				}
				type="";
				check="";
				total=0;
			}
		});
		btndap.setBounds(156, 298, 60, 60);
		contentPane.add(btndap);
		
		JButton btnhap = new JButton("+");
		btnhap.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				checkType("+");
				if(total !=0.0) {
					textField.setText(Double.toString(total));
				}else {
					textField.setText(check);
				}
				check="";
			}
		});
		btnhap.setBounds(226, 298, 60, 60);
		contentPane.add(btnhap);
	}
	
}
