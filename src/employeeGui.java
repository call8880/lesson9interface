import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import java.awt.Color;
import javax.swing.border.BevelBorder;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.TitledBorder;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.border.LineBorder;
import javax.swing.AbstractAction;
import java.awt.event.ActionEvent;
import javax.swing.Action;
import java.awt.event.ActionListener;


public class employeeGui extends JFrame {

	private JPanel contentPane;
	private JTextField txtname;
	private JTextField txtrate;
	private JTextField txthrs;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JTable tblemployee;
	private JTextField textField;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					employeeGui frame = new employeeGui();
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
	public employeeGui() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 300, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblRate = new JLabel("Rate");
		lblRate.setBounds(10, 57, 46, 14);
		contentPane.add(lblRate);
		
		JLabel lblHours = new JLabel("Hours");
		lblHours.setBounds(10, 94, 46, 14);
		contentPane.add(lblHours);
		
		JLabel lblName = new JLabel("Name");
		lblName.setBounds(10, 21, 46, 14);
		contentPane.add(lblName);
		
		txtname = new JTextField();
		txtname.setBounds(66, 18, 208, 20);
		contentPane.add(txtname);
		txtname.setColumns(10);
		
		txtrate = new JTextField();
		txtrate.setBounds(66, 54, 208, 20);
		contentPane.add(txtrate);
		txtrate.setColumns(10);
		
		txthrs = new JTextField();
		txthrs.setBounds(66, 91, 208, 20);
		contentPane.add(txthrs);
		txthrs.setColumns(10);
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null), "Employee Type", TitledBorder.RIGHT, TitledBorder.TOP, null, null));
		panel.setBackground(Color.LIGHT_GRAY);
		panel.setBounds(10, 144, 264, 57);
		contentPane.add(panel);
		
		JRadioButton rdbtnFullTime = new JRadioButton("Full Time");
		buttonGroup.add(rdbtnFullTime);
		rdbtnFullTime.setFont(new Font("Tahoma", Font.PLAIN, 14));
		rdbtnFullTime.setBackground(Color.LIGHT_GRAY);
		panel.add(rdbtnFullTime);
		
		JRadioButton rdbtnPartTime = new JRadioButton("Part Time");
		rdbtnPartTime.setFont(new Font("Tahoma", Font.PLAIN, 14));
		rdbtnPartTime.setBackground(Color.LIGHT_GRAY);
		buttonGroup.add(rdbtnPartTime);
		panel.add(rdbtnPartTime);
		
		JButton btnAdd = new JButton("Add");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String choice = buttonGroup.getSelection().getActionCommand();
				//put choice in table
				tblemployee.setValueAt(choice, 0, 1);
				tblemployee.setValueAt("You Chose", 0, 0);
					
			}
		});
		btnAdd.setBounds(44, 216, 89, 23);
		contentPane.add(btnAdd);
		
		JButton btnQuit = new JButton("Quit");
		btnQuit.setBounds(143, 216, 89, 23);
		contentPane.add(btnQuit);
		
		tblemployee = new JTable();
		tblemployee.setBorder(new LineBorder(new Color(0, 0, 0)));
		tblemployee.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
			},
			new String[] {
				"Pay", "Name"
			}
		) {
			boolean[] columnEditables = new boolean[] {
				false, false
			};
			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		});
		tblemployee.setBounds(10, 250, 264, 160);
		contentPane.add(tblemployee);
		
		JLabel lblTotalPay = new JLabel("Total Pay");
		lblTotalPay.setBounds(10, 436, 46, 14);
		contentPane.add(lblTotalPay);
		
		textField = new JTextField();
		textField.setEditable(false);
		textField.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textField.setForeground(Color.WHITE);
		textField.setText("$0.00");
		textField.setBackground(Color.BLACK);
		textField.setBounds(80, 433, 194, 20);
		contentPane.add(textField);
		textField.setColumns(10);
	}
}
