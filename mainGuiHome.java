import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;
import javax.swing.border.MatteBorder;

public class mainGuiHome {
	Employee employeeDefault = new Employee();

	private JFrame frame;
	private static JTable table;
	private JTextField txtHowellMill;
	private JTextField textField;
	private JTextField txtst;
	private JTextField txtAjayiAbdulsalam;
	private JTextField txtAa;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {

		EventQueue.invokeLater(new Runnable() {
			@Override
			public void run() {
				try {
					mainGuiHome window = new mainGuiHome();
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
	public mainGuiHome() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.WHITE);
		frame.setBounds(100, 100, 690, 914);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JLabel lblWatershedSigninSheet = new JLabel("Daily Activity Report");
		lblWatershedSigninSheet.setBounds(211, 6, 229, 16);
		lblWatershedSigninSheet.setFont(new Font("Apple Color Emoji", Font.BOLD, 17));
		frame.getContentPane().add(lblWatershedSigninSheet);
		employeeDefault.setFirstName("Abdulsalam");
		employeeDefault.setLastName("Ajayi");
		employeeDefault.setShiftTime("Night Shift");

		String[][] data = { { "0600",
				"Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum." },
				{ "0615",
						"Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum." },
				{ "0630",
						"Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum." },
				{ "0635",
						"Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum." },
				{ "0700",
						"Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum." },
				{ "0730",
						"Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum." }, };

		String[] columnNames = { "Time", "Chronological Comment" };

		table = new JTable(data, columnNames);
		table.setSurrendersFocusOnKeystroke(true);
		table.setBounds(2, 18, 510, 96);
		table.setBorder(new MatteBorder(1, 1, 1, 1, Color.blue));

		JScrollPane scrollPane = new JScrollPane(table);
		scrollPane.setBounds(186, 159, 482, 704);
		scrollPane.setToolTipText("Testing");
		scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		frame.getContentPane().add(scrollPane);

		JPanel panel = new JPanel();
		panel.setBounds(10, 159, 164, 704);
		frame.getContentPane().add(panel);

		JLabel lblRadioCharger = new JLabel("1. Radio & Charger");
		panel.add(lblRadioCharger);

		JRadioButton rdbtnYes1 = new JRadioButton("Yes");
		panel.add(rdbtnYes1);

		JRadioButton rdbtnNo1 = new JRadioButton("No");
		panel.add(rdbtnNo1);

		JLabel lblCellPhoneReceive = new JLabel("2. Cell Phone Received");
		panel.add(lblCellPhoneReceive);

		JRadioButton rdbtnYes2 = new JRadioButton("Yes");
		panel.add(rdbtnYes2);

		JRadioButton rdbtnNo2 = new JRadioButton("No");
		panel.add(rdbtnNo2);

		JLabel lblUpdatedInstructions = new JLabel("3. Updated Instructions");
		panel.add(lblUpdatedInstructions);

		JRadioButton rdbtnYes3 = new JRadioButton("Yes");
		panel.add(rdbtnYes3);

		JRadioButton rdbtnNo3 = new JRadioButton("No");
		panel.add(rdbtnNo3);
		JLabel lblSecurityBranches = new JLabel("4. Security Branches");
		panel.add(lblSecurityBranches);

		JRadioButton rdbtnYes4 = new JRadioButton("Yes");
		panel.add(rdbtnYes4);

		JRadioButton rdbtnNo4 = new JRadioButton("No");
		panel.add(rdbtnNo4);

		JLabel lblSafetyHazard = new JLabel("5. Safety Hazard");
		panel.add(lblSafetyHazard);

		JRadioButton rdbtnYes5 = new JRadioButton("Yes");
		panel.add(rdbtnYes5);

		JRadioButton rdbtnNo5 = new JRadioButton("No");
		panel.add(rdbtnNo5);
		JLabel lblSuspiciousActivity = new JLabel("6. Suspicious Activity");
		panel.add(lblSuspiciousActivity);

		JRadioButton rdbtnYes6 = new JRadioButton("Yes");
		panel.add(rdbtnYes6);

		JRadioButton rdbtnNo6 = new JRadioButton("No");
		panel.add(rdbtnNo6);
		JLabel lblPolicyViolation = new JLabel("7. Policy Violation");
		panel.add(lblPolicyViolation);

		JRadioButton rdbtnYes7 = new JRadioButton("Yes");
		panel.add(rdbtnYes7);

		JRadioButton rdbtnNo7 = new JRadioButton("No");
		panel.add(rdbtnNo7);
		JLabel lblInjuriesIllnesss = new JLabel("8. Injuries/ Illnesss");
		panel.add(lblInjuriesIllnesss);

		JRadioButton rdbtnYes8 = new JRadioButton("Yes");
		panel.add(rdbtnYes8);

		JRadioButton rdbtnNo8 = new JRadioButton("No");
		panel.add(rdbtnNo8);

		JLabel lblIncidentReports = new JLabel("9. Incident Reports");
		panel.add(lblIncidentReports);

		JRadioButton rdbtnYes9 = new JRadioButton("Yes");
		panel.add(rdbtnYes9);

		JRadioButton rdbtnNo9 = new JRadioButton("No");
		panel.add(rdbtnNo9);

		JLabel lblOtherEquip = new JLabel("10. Other Equip.");
		panel.add(lblOtherEquip);

		JTextArea txtrHelloWorld = new JTextArea();
		txtrHelloWorld.setText("N/A");
		txtrHelloWorld.setTabSize(10);
		panel.add(txtrHelloWorld);

		JLabel lblSite = new JLabel("Site:");
		lblSite.setBounds(10, 39, 32, 16);
		frame.getContentPane().add(lblSite);

		txtHowellMill = new JTextField();
		txtHowellMill.setEditable(false);
		txtHowellMill.setText("Howell Mill");
		txtHowellMill.setBounds(159, 34, 130, 26);
		frame.getContentPane().add(txtHowellMill);
		txtHowellMill.setColumns(10);

		JLabel lblDate = new JLabel("Date:");
		lblDate.setBounds(375, 34, 38, 16);
		frame.getContentPane().add(lblDate);

		textField = new JTextField();
		textField.setEditable(false);
		textField.setText("3/8/2017");
		textField.setBounds(416, 28, 77, 26);
		frame.getContentPane().add(textField);
		textField.setColumns(10);

		JLabel lblShift = new JLabel("Shift:");
		lblShift.setBounds(522, 34, 38, 16);
		frame.getContentPane().add(lblShift);

		txtst = new JTextField();
		txtst.setEditable(false);
		txtst.setText("1st");
		txtst.setBounds(565, 28, 59, 26);
		frame.getContentPane().add(txtst);
		txtst.setColumns(10);

		JLabel lblEmployeeOnDuty = new JLabel("Employee On Duty:");
		lblEmployeeOnDuty.setBounds(10, 84, 130, 16);
		frame.getContentPane().add(lblEmployeeOnDuty);

		txtAjayiAbdulsalam = new JTextField();
		txtAjayiAbdulsalam.setEditable(false);
		txtAjayiAbdulsalam.setText("Ajayi Abdulsalam");
		txtAjayiAbdulsalam.setBounds(159, 72, 130, 26);
		frame.getContentPane().add(txtAjayiAbdulsalam);
		txtAjayiAbdulsalam.setColumns(10);

		txtAa = new JTextField();
		txtAa.setEditable(false);
		txtAa.setText("AA");
		txtAa.setBounds(455, 79, 38, 26);
		frame.getContentPane().add(txtAa);
		txtAa.setColumns(10);

		JLabel lblSignatureOrInitials = new JLabel("Signature");
		lblSignatureOrInitials.setBounds(375, 84, 77, 16);
		frame.getContentPane().add(lblSignatureOrInitials);

		JLabel lblStartTime = new JLabel("Start Time:");
		lblStartTime.setBounds(375, 131, 74, 16);
		frame.getContentPane().add(lblStartTime);

		textField_1 = new JTextField();
		textField_1.setEditable(false);
		textField_1.setBounds(455, 126, 32, 26);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);

		JLabel lblEndTime = new JLabel("End TIme:");
		lblEndTime.setBounds(499, 131, 74, 16);
		frame.getContentPane().add(lblEndTime);

		textField_2 = new JTextField();
		textField_2.setEditable(false);
		textField_2.setColumns(10);
		textField_2.setBounds(565, 126, 32, 26);
		frame.getContentPane().add(textField_2);

	}
}
