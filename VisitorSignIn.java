import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.util.Date;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JSeparator;
import javax.swing.JTable;
import javax.swing.JTextField;

public class VisitorSignIn {

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
	private JTextField lastNameField;
	private JTextField firstNameField;
	private JTextField povField;
	private JTextField cityVehicleField;
	private JTextField driversLiscenceField;
	private JTextField badgeDateField;
	private JTextField signInField;
	private JTextField signOutField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {

		EventQueue.invokeLater(new Runnable() {
			@Override
			public void run() {
				try {
					VisitorSignIn window = new VisitorSignIn();
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
	public VisitorSignIn() {
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
		JLabel lblWatershedSigninSheet = new JLabel(this.getClass().getSimpleName());
		lblWatershedSigninSheet.setBounds(211, 6, 229, 16);
		lblWatershedSigninSheet.setFont(new Font("Apple Color Emoji", Font.BOLD, 17));
		frame.getContentPane().add(lblWatershedSigninSheet);
		employeeDefault.setFirstName("Abdulsalam");
		employeeDefault.setLastName("Ajayi");
		employeeDefault.setShiftTime("Night Shift");

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

		JLabel lblLastName = new JLabel("Last Name");
		lblLastName.setBounds(10, 211, 79, 31);
		frame.getContentPane().add(lblLastName);
		lastNameField = new JTextField();
		lastNameField.setBounds(101, 203, 229, 46);
		frame.getContentPane().add(lastNameField);
		lastNameField.setColumns(10);

		JLabel lblFirstName = new JLabel("First Name");
		lblFirstName.setBounds(387, 211, 107, 31);
		frame.getContentPane().add(lblFirstName);
		firstNameField = new JTextField();
		firstNameField.setColumns(10);
		firstNameField.setBounds(493, 203, 229, 46);
		frame.getContentPane().add(firstNameField);

		JLabel lblPovLiscence = new JLabel("POV Liscence");
		lblPovLiscence.setBounds(10, 285, 83, 31);
		frame.getContentPane().add(lblPovLiscence);
		povField = new JTextField();
		povField.setColumns(10);
		povField.setBounds(101, 277, 229, 46);
		frame.getContentPane().add(povField);

		JLabel lblCityVehicle = new JLabel("City vehicle #");
		lblCityVehicle.setBounds(389, 285, 107, 31);
		frame.getContentPane().add(lblCityVehicle);
		cityVehicleField = new JTextField();
		cityVehicleField.setColumns(10);
		cityVehicleField.setBounds(493, 277, 229, 46);
		frame.getContentPane().add(cityVehicleField);

		JLabel lblDriversLiscence = new JLabel("Drivers Liscence #");
		lblDriversLiscence.setBounds(10, 359, 115, 31);
		frame.getContentPane().add(lblDriversLiscence);
		driversLiscenceField = new JTextField();
		driversLiscenceField.setColumns(10);
		driversLiscenceField.setBounds(137, 351, 193, 46);
		frame.getContentPane().add(driversLiscenceField);

		JLabel lblBadgeExpirationDate = new JLabel("Badge Expiration Date");
		lblBadgeExpirationDate.setBounds(387, 359, 150, 31);
		frame.getContentPane().add(lblBadgeExpirationDate);

		badgeDateField = new JTextField();
		badgeDateField.setColumns(10);
		badgeDateField.setBounds(592, 351, 130, 46);
		frame.getContentPane().add(badgeDateField);

		JButton btnLog = new JButton("LOG NOW");
		btnLog.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

				generateReport();
				System.out.println("SUBMITED");
			}
		});
		btnLog.setFont(new Font("Lucida Grande", Font.PLAIN, 25));
		btnLog.setForeground(new Color(0, 0, 0));
		btnLog.setBounds(243, 896, 316, 64);
		frame.getContentPane().add(btnLog);
		signInField = new JTextField();
		signInField.setColumns(10);
		signInField.setBounds(137, 409, 193, 46);
		frame.getContentPane().add(signInField);

		signOutField = new JTextField();
		signOutField.setColumns(10);
		signOutField.setBounds(137, 483, 193, 46);
		frame.getContentPane().add(signOutField);
		JButton btnSignin = new JButton("SIGN-IN");
		btnSignin.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				btnSignin.setOpaque(true);

				String addTime = "" + new Date();
				signOutField.setText("");
				signInField.setText(addTime);
				signInField.setFont(new Font("Lucida Grande", Font.PLAIN, 10));

				btnSignin.setForeground(new Color(70, 130, 180));
				btnSignin.setFont(new Font("Lucida Grande", Font.PLAIN, 15));

				btnSignin.setBackground(new Color(70, 130, 180));
				btnSignin.setOpaque(true);
			}
		});
		btnSignin.setForeground(Color.BLACK);
		btnSignin.setBackground(new Color(65, 105, 225));
		btnSignin.setFont(new Font("Lucida Grande", Font.PLAIN, 10));
		btnSignin.setBounds(10, 408, 107, 52);
		frame.getContentPane().add(btnSignin);

		JButton btnSignout = new JButton("SIGN-OUT");
		btnSignout.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

				String addTime = "" + new Date();
				signInField.setText("");
				signOutField.setText(addTime);
				signOutField.setFont(new Font("Lucida Grande", Font.PLAIN, 10));
				btnSignout.setForeground(Color.RED);
				btnSignout.setFont(new Font("Lucida Grande", Font.PLAIN, 15));

				btnSignout.setBackground(new Color(70, 130, 180));
				btnSignout.setOpaque(true);
			}
		});

		btnSignout.setForeground(Color.BLACK);
		btnSignout.setFont(new Font("Lucida Grande", Font.PLAIN, 10));
		btnSignout.setBounds(10, 482, 107, 52);
		frame.getContentPane().add(btnSignout);

		// all buttonFocus Lost listener
		btnSignin.addFocusListener(new FocusAdapter() {

			@Override
			public void focusLost(FocusEvent e) {
				btnSignin.setForeground(Color.BLACK);
				btnSignin.setBackground(Color.WHITE);
				btnSignin.setText("SIGN-IN");
			}
		});

		// all buttonFocus Lost listener
		btnSignout.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				btnSignout.setForeground(Color.BLACK);
				btnSignout.setBackground(Color.WHITE);
				btnSignout.setText("SIGN-OUT");

			}
		});

		String[][] data = { { "George Rhymes jr.", "Octavia", "QAK9185", "32144", "NIL", "02/28/2019" },
				{ "APD", "NIL", "NIL", "32144", "NIL", "NIL" }, { "APD", "NIL", "NIL", "32144", "NIL", "NIL" },
				{ "George Rhymes jr.", "NIL", "QAK9185", "32144", "NIL", "02/28/2019" },
				{ "George Rhymes jr.", "NIL", "QAK9185", "32144", "NIL", "02/28/2019" },
				{ "APD", "NIL", "NIL", "32144", "NIL", "NIL" },
				{ "George Rhymes jr.", "NIL", "QAK9185", "32144", "NIL", "02/28/2019" },
				{ "APD", "NIL", "NIL", "32144", "NIL", "NIL" },
				{ "George Rhymes jr.", "NIL", "QAK9185", "32144", "NIL", "02/28/2019" },
				{ "George Rhymes jr.", "NIL", "QAK9185", "32144", "NIL", "02/28/2019" },
				{ "APD", "NIL", "NIL", "32144", "NIL", "NIL" },
				{ "George Rhymes jr.", "NIL", "QAK9185", "32144", "NIL", "02/28/2019" },
				{ "APD", "NIL", "NIL", "32144", "NIL", "NIL" },
				{ "George Rhymes jr.", "NIL", "QAK9185", "32144", "NIL", "02/28/2019" },
				{ "APD", "NIL", "NIL", "32144", "NIL", "NIL" },
				{ "George Rhymes jr.", "NIL", "QAK9185", "32144", "NIL", "02/28/2019" } };

		// Column Names
		String[] columnNames = { lblLastName.getText(), lblFirstName.getText(), lblPovLiscence.getText(),
				lblCityVehicle.getText(), lblDriversLiscence.getText(), lblBadgeExpirationDate.getText() };
		JTable table = new JTable(data, columnNames);
		table.setBounds(30, 40, 200, 300);
		table.getSelectionModel().addSelectionInterval(3, 7);
		// table.getSelectionModel().addSelectionInterval(5, 5);
		table.changeSelection(1, 1, true, false);
		JScrollPane scrollPane = new JScrollPane(table);
		scrollPane.setBounds(0, 567, 764, 245);
		frame.getContentPane().add(scrollPane);

		JButton btnClearAll = new JButton("CLEAR ALL");
		btnClearAll.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				signOutField.setText("");
				lastNameField.setText("");
				firstNameField.setText("");
				povField.setText("");
				cityVehicleField.setText("");
				driversLiscenceField.setText("");
				badgeDateField.setText("");
				signInField.setText("");
			}
		});
		btnClearAll.setBounds(387, 474, 335, 55);
		frame.getContentPane().add(btnClearAll);

		JSeparator separator = new JSeparator();
		separator.setBounds(10, 170, 754, 12);
		frame.getContentPane().add(separator);

		JButton btnFillSelectedRow = new JButton("FILL SELECTED ROW");
		btnFillSelectedRow.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				int row = table.getSelectedRow();
				String lName = table.getModel().getValueAt(row, 0).toString();
				String fName = table.getModel().getValueAt(row, 1).toString();
				String POV = table.getModel().getValueAt(row, 2).toString();
				String cityVehicle = table.getModel().getValueAt(row, 3).toString();
				String driversLiscence = table.getModel().getValueAt(row, 4).toString();
				String badgeExpiration = table.getModel().getValueAt(row, 5).toString();

				lastNameField.setText(lName);
				firstNameField.setText(fName);
				povField.setText(POV);
				cityVehicleField.setText(cityVehicle);
				driversLiscenceField.setText(driversLiscence);
				badgeDateField.setText(badgeExpiration);

			}
		});
		btnFillSelectedRow.setForeground(Color.RED);
		btnFillSelectedRow.setFont(new Font("Lucida Grande", Font.PLAIN, 25));
		btnFillSelectedRow.setBounds(243, 820, 316, 64);
		frame.getContentPane().add(btnFillSelectedRow);

		scrollPane.setVisible(true);

	}

	protected static void generateReport() {
		// TODO Auto-generated method stub
		System.out.println("REPORT GENRATED on " + new Date());
	}
}
