import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

public class DAREntry {
	public String supervisorCheckin = "no checkin yet";
	public static String timing[] = { "0000", "0100", "0200", "0300", "0400", "0500", "0600", "0700", "0800", "0900",
			"1000", "1100", "1200", "1300", "1400", "1500", "1600", "1700", "1800", "1900", "2000", "2100", "2200",
			"2300", "2400" };
	public static String[][] data = { { "0600",
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

	public static String[] columnNames = { "Time", "Chronological Comment" };
	Employee employeeDefault = new Employee();

	JFrame frame;
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
					DAREntry window = new DAREntry();
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
	public DAREntry() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.WHITE);
		frame.setBounds(100, 100, 764, 1087);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setResizable(true);
		frame.setIconImage(Toolkit.getDefaultToolkit().getImage("/Users/aj/Desktop/PNG image 3.png"));
		frame.setResizable(false);
		Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
		frame.setLocation(dim.width / 2 - frame.getSize().width / 2, dim.height / 2 - frame.getSize().height / 2);
		JLabel lblWatershedSigninSheet = new JLabel("Daily Activity Report");
		lblWatershedSigninSheet.setBounds(211, 6, 229, 16);
		lblWatershedSigninSheet.setFont(new Font("Apple Color Emoji", Font.BOLD, 17));
		frame.getContentPane().add(lblWatershedSigninSheet);
		employeeDefault.setFirstName("Abdulsalam");
		employeeDefault.setLastName("Ajayi");
		employeeDefault.setShiftTime("Night Shift");

		JPanel panel = new JPanel();
		panel.setBounds(10, 159, 164, 477);
		frame.getContentPane().add(panel);
		JLabel lblRadioCharger = new JLabel("1. Radio & Charger");
		panel.add(lblRadioCharger);

		JRadioButton rdbtnYes1 = new JRadioButton("Yes");
		panel.add(rdbtnYes1);

		JRadioButton rdbtnNo1 = new JRadioButton("No");
		panel.add(rdbtnNo1);

		ButtonGroup group = new ButtonGroup();
		group.add(rdbtnYes1);
		group.add(rdbtnNo1);

		JLabel lblCellPhoneReceive = new JLabel("2. Cell Phone Received");
		panel.add(lblCellPhoneReceive);

		JRadioButton rdbtnYes2 = new JRadioButton("Yes");
		panel.add(rdbtnYes2);

		JRadioButton rdbtnNo2 = new JRadioButton("No");
		panel.add(rdbtnNo2);

		ButtonGroup group2 = new ButtonGroup();
		group2.add(rdbtnYes2);
		group2.add(rdbtnNo2);

		JLabel lblUpdatedInstructions = new JLabel("3. Updated Instructions");
		panel.add(lblUpdatedInstructions);

		JRadioButton rdbtnYes3 = new JRadioButton("Yes");
		panel.add(rdbtnYes3);

		JRadioButton rdbtnNo3 = new JRadioButton("No");
		panel.add(rdbtnNo3);

		ButtonGroup group3 = new ButtonGroup();
		group3.add(rdbtnYes3);
		group3.add(rdbtnNo3);

		JLabel lblSecurityBranches = new JLabel("4. Security Branches");
		panel.add(lblSecurityBranches);

		JRadioButton rdbtnYes4 = new JRadioButton("Yes");
		panel.add(rdbtnYes4);

		JRadioButton rdbtnNo4 = new JRadioButton("No");
		panel.add(rdbtnNo4);

		ButtonGroup group4 = new ButtonGroup();
		group4.add(rdbtnYes4);
		group4.add(rdbtnNo4);

		JLabel lblSafetyHazard = new JLabel("5. Safety Hazard");
		panel.add(lblSafetyHazard);

		JRadioButton rdbtnYes5 = new JRadioButton("Yes");
		panel.add(rdbtnYes5);

		JRadioButton rdbtnNo5 = new JRadioButton("No");
		panel.add(rdbtnNo5);

		ButtonGroup group5 = new ButtonGroup();
		group5.add(rdbtnYes5);
		group5.add(rdbtnNo5);
		JLabel lblSuspiciousActivity = new JLabel("6. Suspicious Activity");
		panel.add(lblSuspiciousActivity);

		JRadioButton rdbtnYes6 = new JRadioButton("Yes");
		panel.add(rdbtnYes6);

		JRadioButton rdbtnNo6 = new JRadioButton("No");
		panel.add(rdbtnNo6);

		ButtonGroup group6 = new ButtonGroup();
		group6.add(rdbtnYes6);
		group6.add(rdbtnNo6);
		JLabel lblPolicyViolation = new JLabel("7. Policy Violation");
		panel.add(lblPolicyViolation);

		JRadioButton rdbtnYes7 = new JRadioButton("Yes");
		panel.add(rdbtnYes7);

		JRadioButton rdbtnNo7 = new JRadioButton("No");
		panel.add(rdbtnNo7);

		ButtonGroup group7 = new ButtonGroup();
		group7.add(rdbtnYes7);
		group7.add(rdbtnNo7);
		JLabel lblInjuriesIllnesss = new JLabel("8. Injuries/ Illnesss");
		panel.add(lblInjuriesIllnesss);

		JRadioButton rdbtnYes8 = new JRadioButton("Yes");
		panel.add(rdbtnYes8);

		JRadioButton rdbtnNo8 = new JRadioButton("No");
		panel.add(rdbtnNo8);

		ButtonGroup group8 = new ButtonGroup();
		group8.add(rdbtnYes8);
		group8.add(rdbtnNo8);

		JLabel lblIncidentReports = new JLabel("9. Incident Reports");
		panel.add(lblIncidentReports);

		JRadioButton rdbtnYes9 = new JRadioButton("Yes");
		panel.add(rdbtnYes9);

		JRadioButton rdbtnNo9 = new JRadioButton("No");
		panel.add(rdbtnNo9);
		ButtonGroup group9 = new ButtonGroup();
		group9.add(rdbtnYes9);
		group9.add(rdbtnNo9);

		JLabel lblOtherEquip = new JLabel("10. Other Equip.");
		panel.add(lblOtherEquip);

		JTextArea txtrHelloWorld = new JTextArea();
		txtrHelloWorld.setText("N/A");
		txtrHelloWorld.setTabSize(10);
		panel.add(txtrHelloWorld);

		JPanel panel_13 = new JPanel();
		panel.add(panel_13);
		panel_13.setLayout(new GridLayout(0, 1, 0, 0));

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
		lblStartTime.setBounds(378, 131, 74, 16);
		frame.getContentPane().add(lblStartTime);

		textField_1 = new JTextField();
		textField_1.setEditable(false);
		textField_1.setText(timing[0]);
		textField_1.setBounds(455, 126, 44, 26);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);

		JLabel lblEndTime = new JLabel("End TIme:");
		lblEndTime.setBounds(522, 131, 74, 16);
		frame.getContentPane().add(lblEndTime);

		textField_2 = new JTextField();
		textField_2.setEditable(false);
		textField_2.setText(timing[11]);
		textField_2.setColumns(10);
		textField_2.setBounds(580, 126, 44, 26);
		frame.getContentPane().add(textField_2);

		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new TitledBorder(null, timing[0], TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_1.setBounds(186, 159, 502, 58);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);

		JTextArea txtrOremIpsumIs = new JTextArea();
		txtrOremIpsumIs.setBounds(56, 18, 440, 34);
		panel_1.add(txtrOremIpsumIs);
		txtrOremIpsumIs.setLineWrap(true);
		txtrOremIpsumIs.setBackground(Color.WHITE);
		txtrOremIpsumIs.setColumns(1);

		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new TitledBorder(null, timing[1], TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_2.setLayout(null);
		panel_2.setBounds(186, 229, 502, 58);
		frame.getContentPane().add(panel_2);

		JTextArea textArea = new JTextArea();
		textArea.setLineWrap(true);
		textArea.setColumns(1);
		textArea.setBackground(Color.WHITE);
		textArea.setBounds(56, 18, 440, 34);
		panel_2.add(textArea);

		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new TitledBorder(null, timing[2], TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_3.setLayout(null);
		panel_3.setBounds(186, 299, 502, 58);
		frame.getContentPane().add(panel_3);

		JTextArea textArea_1 = new JTextArea();
		textArea_1.setLineWrap(true);
		textArea_1.setColumns(1);
		textArea_1.setBackground(Color.WHITE);
		textArea_1.setBounds(56, 18, 440, 34);
		panel_3.add(textArea_1);

		JPanel panel_4 = new JPanel();
		panel_4.setBorder(new TitledBorder(null, timing[3], TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_4.setLayout(null);
		panel_4.setBounds(186, 369, 502, 58);
		frame.getContentPane().add(panel_4);

		JTextArea textArea_2 = new JTextArea();
		textArea_2.setLineWrap(true);
		textArea_2.setColumns(1);
		textArea_2.setBackground(Color.WHITE);
		textArea_2.setBounds(56, 18, 440, 34);
		panel_4.add(textArea_2);

		JPanel panel_5 = new JPanel();
		panel_5.setBorder(new TitledBorder(null, timing[4], TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_5.setLayout(null);
		panel_5.setBounds(186, 439, 502, 58);
		frame.getContentPane().add(panel_5);

		JTextArea textArea_3 = new JTextArea();
		textArea_3.setLineWrap(true);
		textArea_3.setColumns(1);
		textArea_3.setBackground(Color.WHITE);
		textArea_3.setBounds(56, 18, 440, 34);
		panel_5.add(textArea_3);

		JPanel panel_6 = new JPanel();
		panel_6.setBorder(new TitledBorder(null, timing[5], TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_6.setLayout(null);
		panel_6.setBounds(186, 509, 502, 58);
		frame.getContentPane().add(panel_6);

		JTextArea textArea_4 = new JTextArea();
		textArea_4.setLineWrap(true);
		textArea_4.setColumns(1);
		textArea_4.setBackground(Color.WHITE);
		textArea_4.setBounds(56, 18, 440, 34);
		panel_6.add(textArea_4);

		JPanel panel_7 = new JPanel();
		panel_7.setBorder(new TitledBorder(null, timing[6], TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_7.setLayout(null);
		panel_7.setBounds(186, 579, 502, 58);
		frame.getContentPane().add(panel_7);

		JTextArea textArea_5 = new JTextArea();
		textArea_5.setLineWrap(true);
		textArea_5.setColumns(1);
		textArea_5.setBackground(Color.WHITE);
		textArea_5.setBounds(56, 18, 440, 34);
		panel_7.add(textArea_5);

		JPanel panel_8 = new JPanel();
		panel_8.setBorder(new TitledBorder(null, timing[7], TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_8.setLayout(null);
		panel_8.setBounds(186, 649, 502, 58);
		frame.getContentPane().add(panel_8);

		JTextArea textArea_6 = new JTextArea();
		textArea_6.setLineWrap(true);
		textArea_6.setColumns(1);
		textArea_6.setBackground(Color.WHITE);
		textArea_6.setBounds(56, 18, 440, 34);
		panel_8.add(textArea_6);

		JPanel panel_9 = new JPanel();
		panel_9.setBorder(new TitledBorder(null, timing[8], TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_9.setLayout(null);
		panel_9.setBounds(186, 719, 502, 58);
		frame.getContentPane().add(panel_9);

		JTextArea textArea_7 = new JTextArea();
		textArea_7.setLineWrap(true);
		textArea_7.setColumns(1);
		textArea_7.setBackground(Color.WHITE);
		textArea_7.setBounds(56, 18, 440, 34);
		panel_9.add(textArea_7);

		JPanel panel_10 = new JPanel();
		panel_10.setBorder(new TitledBorder(null, timing[9], TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_10.setLayout(null);
		panel_10.setBounds(186, 789, 502, 58);
		frame.getContentPane().add(panel_10);

		JTextArea textArea_8 = new JTextArea();
		textArea_8.setLineWrap(true);
		textArea_8.setColumns(1);
		textArea_8.setBackground(Color.WHITE);
		textArea_8.setBounds(56, 18, 440, 34);
		panel_10.add(textArea_8);

		JPanel panel_11 = new JPanel();
		panel_11.setBorder(new TitledBorder(null, timing[10], TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_11.setLayout(null);
		panel_11.setBounds(186, 859, 502, 58);
		frame.getContentPane().add(panel_11);

		JTextArea textArea_9 = new JTextArea();
		textArea_9.setLineWrap(true);
		textArea_9.setColumns(1);
		textArea_9.setBackground(Color.WHITE);
		textArea_9.setBounds(56, 18, 440, 34);
		textArea_9.setEditable(true);
		panel_11.add(textArea_9);

		JPanel panel_12 = new JPanel();
		panel_12.setBorder(new TitledBorder(null, timing[11], TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_12.setLayout(null);
		panel_12.setBounds(186, 927, 502, 58);
		frame.getContentPane().add(panel_12);

		JTextArea textArea_10 = new JTextArea();
		textArea_10.setLineWrap(true);
		textArea_10.setColumns(1);
		textArea_10.setBackground(Color.WHITE);
		textArea_10.setBounds(56, 18, 440, 34);
		panel_12.add(textArea_10);

		JButton button = new JButton("SAVE ALL ENTRY");
		button.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (textArea_9.getText().equals("")) {
					System.out.println("Empty");
				} else {
					System.out.println(textArea_9.getText());
					textArea_9.setEditable(false);
					rdbtnYes1.setEnabled(false);
				}
			}
		});
		button.setForeground(Color.RED);
		button.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		button.setBounds(243, 997, 188, 46);
		frame.getContentPane().add(button);

		JButton btnPrintPage = new JButton("PRINT PAGE");
		btnPrintPage.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (textArea_9.getText().equals("")) {
					JOptionPane.showMessageDialog(frame, "Some Field Are empty");
					System.out.println("Some Field Are empty");

				} else {
					DAREntry.generateReport();

				}

			}
		});
		btnPrintPage.setForeground(Color.BLUE);
		btnPrintPage.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		btnPrintPage.setBounds(436, 997, 188, 46);
		frame.getContentPane().add(btnPrintPage);

		JPanel panel_14 = new JPanel();
		panel_14.setLayout(null);
		panel_14.setBorder(new TitledBorder(null, "1", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_14.setBounds(10, 719, 164, 58);
		frame.getContentPane().add(panel_14);

		JTextArea textArea_11 = new JTextArea();
		textArea_11.setLineWrap(true);
		textArea_11.setColumns(1);
		textArea_11.setBackground(Color.WHITE);
		textArea_11.setBounds(56, 18, 91, 34);
		panel_14.add(textArea_11);

		JPanel panel_15 = new JPanel();
		panel_15.setLayout(null);
		panel_15.setBorder(new TitledBorder(null, "2", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_15.setBounds(10, 789, 164, 58);
		frame.getContentPane().add(panel_15);

		JTextArea textArea_12 = new JTextArea();
		textArea_12.setLineWrap(true);
		textArea_12.setColumns(1);
		textArea_12.setBackground(Color.WHITE);
		textArea_12.setBounds(56, 18, 91, 34);
		panel_15.add(textArea_12);

		JPanel panel_16 = new JPanel();
		panel_16.setLayout(null);
		panel_16.setBorder(new TitledBorder(null, "3", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_16.setBounds(10, 859, 164, 58);
		frame.getContentPane().add(panel_16);

		JTextArea textArea_13 = new JTextArea();
		textArea_13.setLineWrap(true);
		textArea_13.setColumns(1);
		textArea_13.setBackground(Color.WHITE);
		textArea_13.setBounds(56, 18, 91, 34);
		panel_16.add(textArea_13);

		JPanel panel_17 = new JPanel();
		panel_17.setLayout(null);
		panel_17.setBorder(new TitledBorder(null, "4", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_17.setBounds(10, 927, 164, 58);
		frame.getContentPane().add(panel_17);

		JTextArea textArea_14 = new JTextArea();
		textArea_14.setLineWrap(true);
		textArea_14.setColumns(1);
		textArea_14.setBackground(Color.WHITE);
		textArea_14.setBounds(56, 18, 91, 34);
		panel_17.add(textArea_14);

		JLabel label = new JLabel("SUPERVISOR CHECK-IN");
		label.setBounds(15, 657, 144, 16);
		frame.getContentPane().add(label);

		JButton button_1 = new JButton("IN");
		button_1.setBounds(10, 678, 75, 29);
		frame.getContentPane().add(button_1);

		JButton button_2 = new JButton("OUT");
		button_2.setBounds(90, 678, 75, 29);
		frame.getContentPane().add(button_2);

	}

	protected static void generateReport() {
		// TODO Auto-generated method stub
		System.out.println("REPORT GENRATED on " + new Date());
	}
}
