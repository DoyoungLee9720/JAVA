package sub2;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JCheckBox;
import javax.swing.JTable;

public class ComponentTest extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtUid;
	private JTextField txtName;
	private JTextField txtHp;
	private JTextField hap1;
	private JTextField hap2;
	private JTextField hap3;
	private JTextField m1;
	private JTextField m2;
	private JTextField m3;
	private JTextField gop1;
	private JTextField gop2;
	private JTextField gop3;
	private JTextField na1;
	private JTextField na2;
	private JTextField na3;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ComponentTest frame = new ComponentTest();
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
	public ComponentTest() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 464, 662);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("컴포넌트 실습");
		lblNewLabel.setBounds(12, 10, 97, 15);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("버튼 실습");
		lblNewLabel_1.setBounds(12, 35, 57, 15);
		contentPane.add(lblNewLabel_1);
		
		JButton btn1 = new JButton("확인1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("확인1 버튼 클릭...");
				
			}
		});
		btn1.setBounds(12, 60, 97, 23);
		contentPane.add(btn1);
		
		JButton btn2 = new JButton("확인2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "버튼2 클릭...");
			}
		});
		btn2.setBounds(121, 60, 97, 23);
		contentPane.add(btn2);
		
		JButton btn3 = new JButton("확인3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int answer = JOptionPane.showConfirmDialog(null, "버튼3 클릭...","확인대화상자",JOptionPane.YES_NO_OPTION);
				if(answer ==0) {
					System.out.println("YES");
				}else {
					System.out.println("NO");
				}
			}
		});
		btn3.setBounds(230, 60, 97, 23);
		contentPane.add(btn3);
		
		JLabel lblNewLabel_1_1 = new JLabel("텍스트 필드 실습");
		lblNewLabel_1_1.setBounds(12, 93, 97, 15);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_2 = new JLabel("아이디");
		lblNewLabel_2.setBounds(12, 118, 57, 15);
		contentPane.add(lblNewLabel_2);
		
		txtUid = new JTextField();
		txtUid.setBounds(81, 115, 116, 21);
		contentPane.add(txtUid);
		txtUid.setColumns(10);
		
		JLabel lbResultUid = new JLabel("결과:");
		lbResultUid.setBounds(318, 118, 104, 15);
		contentPane.add(lbResultUid);
		JButton btnUid = new JButton("확인");
		btnUid.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String uid = txtUid.getText();
				lbResultUid.setText("결과 : " + uid);
			}
		});
		btnUid.setBounds(209, 114, 97, 23);
		contentPane.add(btnUid);
		
		
		
		JLabel lblNewLabel_2_1 = new JLabel("이름");
		lblNewLabel_2_1.setBounds(12, 147, 57, 15);
		contentPane.add(lblNewLabel_2_1);
		
		txtName = new JTextField();
		txtName.setColumns(10);
		txtName.setBounds(81, 144, 116, 21);
		contentPane.add(txtName);
		
		JLabel lbResultName = new JLabel("결과:");
		lbResultName.setBounds(318, 147, 104, 15);
		contentPane.add(lbResultName);
		
		JButton btnName = new JButton("확인");
		btnName.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String txtname = txtName.getText();
				lbResultName.setText("결과 : " + txtname);
			}
		});
		btnName.setBounds(209, 143, 97, 23);
		contentPane.add(btnName);
		
		
		
		JLabel lblNewLabel_2_2 = new JLabel("휴대폰");
		lblNewLabel_2_2.setBounds(12, 176, 57, 15);
		contentPane.add(lblNewLabel_2_2);
		
		txtHp = new JTextField();
		txtHp.setColumns(10);
		txtHp.setBounds(81, 173, 116, 21);
		contentPane.add(txtHp);
		
		JLabel lbResultHp = new JLabel("결과:");
		lbResultHp.setBounds(318, 176, 104, 15);
		contentPane.add(lbResultHp);
		
		JButton btnHp = new JButton("확인");
		btnHp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lbResultHp.setText("결과 : "+ txtHp.getText());
			}
		});
		btnHp.setBounds(209, 172, 97, 23);
		contentPane.add(btnHp);
		
		JLabel lblNewLabel_1_2 = new JLabel("덤셈");
		lblNewLabel_1_2.setBounds(12, 215, 57, 15);
		contentPane.add(lblNewLabel_1_2);
		
		hap1 = new JTextField();
		hap1.setHorizontalAlignment(SwingConstants.CENTER);
		hap1.setBounds(81, 212, 57, 21);
		contentPane.add(hap1);
		hap1.setColumns(10);
		
		hap2 = new JTextField();
		hap2.setHorizontalAlignment(SwingConstants.CENTER);
		hap2.setColumns(10);
		hap2.setBounds(179, 212, 57, 21);
		contentPane.add(hap2);
		
		JLabel lblNewLabel_1_2_1 = new JLabel("+");
		lblNewLabel_1_2_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_2_1.setBounds(137, 215, 40, 15);
		contentPane.add(lblNewLabel_1_2_1);
		
		JLabel lblNewLabel_1_2_1_1 = new JLabel("=");
		lblNewLabel_1_2_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_2_1_1.setBounds(241, 215, 40, 15);
		contentPane.add(lblNewLabel_1_2_1_1);
		
		hap3 = new JTextField();
		hap3.setHorizontalAlignment(SwingConstants.CENTER);
		hap3.setColumns(10);
		hap3.setBounds(279, 212, 57, 21);
		contentPane.add(hap3);
		
		JButton btnNewButton = new JButton("확인");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int hap = Integer.parseInt(hap1.getText()) + Integer.parseInt(hap2.getText());
				hap3.setText(Integer.toString(hap));
				
			}
		});
		btnNewButton.setBounds(353, 211, 69, 23);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel_1_2_2 = new JLabel("뺄셈");
		lblNewLabel_1_2_2.setBounds(12, 244, 57, 15);
		contentPane.add(lblNewLabel_1_2_2);
		
		m1 = new JTextField();
		m1.setHorizontalAlignment(SwingConstants.CENTER);
		m1.setColumns(10);
		m1.setBounds(81, 241, 57, 21);
		contentPane.add(m1);
		
		JLabel lblNewLabel_1_2_1_2 = new JLabel("-");
		lblNewLabel_1_2_1_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_2_1_2.setBounds(137, 244, 40, 15);
		contentPane.add(lblNewLabel_1_2_1_2);
		
		m2 = new JTextField();
		m2.setHorizontalAlignment(SwingConstants.CENTER);
		m2.setColumns(10);
		m2.setBounds(179, 241, 57, 21);
		contentPane.add(m2);
		
		JLabel lblNewLabel_1_2_1_1_1 = new JLabel("=");
		lblNewLabel_1_2_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_2_1_1_1.setBounds(241, 244, 40, 15);
		contentPane.add(lblNewLabel_1_2_1_1_1);
		
		m3 = new JTextField();
		m3.setHorizontalAlignment(SwingConstants.CENTER);
		m3.setColumns(10);
		m3.setBounds(279, 241, 57, 21);
		contentPane.add(m3);
		
		JButton btnNewButton_1 = new JButton("확인");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int m = Integer.parseInt(m1.getText()) - Integer.parseInt(m2.getText());
				m3.setText(Integer.toString(m));
			}
		});
		btnNewButton_1.setBounds(353, 240, 69, 23);
		contentPane.add(btnNewButton_1);
		
		JLabel lblNewLabel_1_2_2_1 = new JLabel("곱셈");
		lblNewLabel_1_2_2_1.setBounds(12, 273, 57, 15);
		contentPane.add(lblNewLabel_1_2_2_1);
		
		gop1 = new JTextField();
		gop1.setHorizontalAlignment(SwingConstants.CENTER);
		gop1.setColumns(10);
		gop1.setBounds(81, 270, 57, 21);
		contentPane.add(gop1);
		
		JLabel lblNewLabel_1_2_1_2_1 = new JLabel("x");
		lblNewLabel_1_2_1_2_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_2_1_2_1.setBounds(137, 273, 40, 15);
		contentPane.add(lblNewLabel_1_2_1_2_1);
		
		gop2 = new JTextField();
		gop2.setHorizontalAlignment(SwingConstants.CENTER);
		gop2.setColumns(10);
		gop2.setBounds(179, 270, 57, 21);
		contentPane.add(gop2);
		
		JLabel lblNewLabel_1_2_1_1_1_1 = new JLabel("=");
		lblNewLabel_1_2_1_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_2_1_1_1_1.setBounds(241, 273, 40, 15);
		contentPane.add(lblNewLabel_1_2_1_1_1_1);
		
		gop3 = new JTextField();
		gop3.setHorizontalAlignment(SwingConstants.CENTER);
		gop3.setColumns(10);
		gop3.setBounds(279, 270, 57, 21);
		contentPane.add(gop3);
		
		JButton btnNewButton_1_1 = new JButton("확인");
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int gop = Integer.parseInt(gop1.getText()) * Integer.parseInt(gop2.getText());
				gop3.setText(Integer.toString(gop));
			}
		});
		btnNewButton_1_1.setBounds(353, 269, 69, 23);
		contentPane.add(btnNewButton_1_1);
		
		JLabel lblNewLabel_1_2_2_1_1 = new JLabel("나눗셈");
		lblNewLabel_1_2_2_1_1.setBounds(12, 302, 57, 15);
		contentPane.add(lblNewLabel_1_2_2_1_1);
		
		na1 = new JTextField();
		na1.setHorizontalAlignment(SwingConstants.CENTER);
		na1.setColumns(10);
		na1.setBounds(81, 299, 57, 21);
		contentPane.add(na1);
		
		JLabel lblNewLabel_1_2_1_2_1_1 = new JLabel("/");
		lblNewLabel_1_2_1_2_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_2_1_2_1_1.setBounds(137, 302, 40, 15);
		contentPane.add(lblNewLabel_1_2_1_2_1_1);
		
		na2 = new JTextField();
		na2.setHorizontalAlignment(SwingConstants.CENTER);
		na2.setColumns(10);
		na2.setBounds(179, 299, 57, 21);
		contentPane.add(na2);
		
		JLabel lblNewLabel_1_2_1_1_1_1_1 = new JLabel("=");
		lblNewLabel_1_2_1_1_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_2_1_1_1_1_1.setBounds(241, 302, 40, 15);
		contentPane.add(lblNewLabel_1_2_1_1_1_1_1);
		
		na3 = new JTextField();
		na3.setHorizontalAlignment(SwingConstants.CENTER);
		na3.setColumns(10);
		na3.setBounds(279, 299, 57, 21);
		contentPane.add(na3);
		
		JButton btnNewButton_1_1_1 = new JButton("확인");
		btnNewButton_1_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double na = Double.parseDouble(na1.getText()) / Double.parseDouble(na2.getText());
				String result = String.format("%.3f", na);
				na3.setText(result);
			}
		});
		btnNewButton_1_1_1.setBounds(353, 298, 69, 23);
		contentPane.add(btnNewButton_1_1_1);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("체크박스 실습");
		lblNewLabel_1_1_1.setBounds(12, 338, 97, 15);
		contentPane.add(lblNewLabel_1_1_1);
		
		JCheckBox chk1 = new JCheckBox("서울");
		chk1.setBounds(12, 359, 57, 23);
		contentPane.add(chk1);
		
		JCheckBox chk2 = new JCheckBox("대전");
		chk2.setBounds(73, 359, 57, 23);
		contentPane.add(chk2);
		
		JCheckBox chk3 = new JCheckBox("대구");
		chk3.setBounds(137, 359, 57, 23);
		contentPane.add(chk3);
		
		JCheckBox chk4 = new JCheckBox("부산");
		chk4.setBounds(198, 359, 57, 23);
		contentPane.add(chk4);
		
		JCheckBox chk5 = new JCheckBox("광주");
		chk5.setBounds(259, 359, 57, 23);
		contentPane.add(chk5);
		
		JLabel chkResult = new JLabel("결과 :");
		chkResult.setBounds(12, 388, 410, 15);
		contentPane.add(chkResult);
		
		JButton chkButton = new JButton("확인");
		chkButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				List<String> cities = new ArrayList<>();
				if(chk1.isSelected()) {
					cities.add(chk1.getText());
				}
				if(chk2.isSelected()) {
					cities.add(chk2.getText());
				}
				if(chk3.isSelected()) {
					cities.add(chk3.getText());
				}
				if(chk4.isSelected()) {
					cities.add(chk4.getText());
				}
				if(chk5.isSelected()) {
					cities.add(chk5.getText());
				}
				chkResult.setText("결과 : " + cities);
			}
		});
		chkButton.setBounds(318, 359, 76, 23);
		contentPane.add(chkButton);
		
		JLabel lblNewLabel_12 = new JLabel("테이블 실습");
		lblNewLabel_12.setBounds(12, 423, 97, 15);
		contentPane.add(lblNewLabel_12);
		
		table = new JTable();
		table.setBounds(12, 448, 410, 99);
		contentPane.add(table);
		
		//테이블 설정
		String[] columnNames = {"아이디","이름","나이","휴대폰"};
		DefaultTableModel model = new DefaultTableModel(columnNames,0);
		model.setRowCount(0);
		table.setModel(model);
				
		JButton btnTable = new JButton("출력");
		btnTable.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				List<Person> persons = new ArrayList<>();
				persons.add(new Person("a101","김유신",23,"010-1234-1001"));
				persons.add(new Person("a102","김춘추",21,"010-1234-1002"));
				persons.add(new Person("a103","장보고",33,"010-1234-1003"));
				persons.add(new Person("a104","강감찬",43,"010-1234-1004"));
				persons.add(new Person("a105","이순신",53,"010-1234-1005"));
				
				for(Person person : persons) {
					Object[] rowData = {person.getId(),person.getName(),person.getAge(),person.getHp()};
					model.addRow(rowData);
				}
			}
		});
		btnTable.setBounds(12, 557, 97, 23);
		contentPane.add(btnTable);
		
		
		
	}
}
