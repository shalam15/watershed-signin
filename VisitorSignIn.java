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
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;

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
		lblLastName.setBounds(10, 211, 130, 31);
		frame.getContentPane().add(lblLastName);
		textField_3 = new JTextField();
		textField_3.setBounds(101, 203, 229, 46);
		frame.getContentPane().add(textField_3);
		textField_3.setColumns(10);

		JLabel lblFirstName = new JLabel("First Name");
		lblFirstName.setBounds(387, 211, 107, 31);
		frame.getContentPane().add(lblFirstName);
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(493, 203, 229, 46);
		frame.getContentPane().add(textField_4);

		JLabel lblPovLiscence = new JLabel("POV Liscence");
		lblPovLiscence.setBounds(10, 285, 83, 31);
		frame.getContentPane().add(lblPovLiscence);
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(101, 277, 229, 46);
		frame.getContentPane().add(textField_5);

		JLabel lblCityVehicle = new JLabel("City vehicle #");
		lblCityVehicle.setBounds(389, 285, 107, 31);
		frame.getContentPane().add(lblCityVehicle);
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(493, 277, 229, 46);
		frame.getContentPane().add(textField_6);

		JLabel lblDriversLiscence = new JLabel("Drivers Liscence #");
		lblDriversLiscence.setBounds(10, 359, 115, 31);
		frame.getContentPane().add(lblDriversLiscence);
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(137, 351, 193, 46);
		frame.getContentPane().add(textField_7);

		JLabel lblBadgeExpirationDate = new JLabel("Badge Expiration Date");
		lblBadgeExpirationDate.setBounds(387, 359, 150, 31);
		frame.getContentPane().add(lblBadgeExpirationDate);

		textField_8 = new JTextField();
		textField_8.setColumns(10);
		textField_8.setBounds(592, 351, 130, 46);
		frame.getContentPane().add(textField_8);

		JButton btnLog = new JButton("LOG NOW");
		btnLog.setFont(new Font("Lucida Grande", Font.PLAIN, 25));
		btnLog.setForeground(new Color(0, 0, 0));
		btnLog.setBounds(243, 850, 316, 88);
		frame.getContentPane().add(btnLog);

		JButton btnSignin = new JButton("SIGN-IN");
		btnSignin.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				btnSignin.setOpaque(true);
				btnSignin.setText("");
				String addTime = "Sign in" + " " + "at" + " " + new Date();
				btnSignin.setText(addTime);
				btnSignin.setForeground(new Color(70, 130, 180));
				btnSignin.setFont(new Font("Lucida Grande", Font.PLAIN, 15));

				btnSignin.setBackground(new Color(70, 130, 180));
				btnSignin.setOpaque(true);
			}
		});
		btnSignin.setForeground(Color.BLACK);
		btnSignin.setBackground(new Color(65, 105, 225));
		btnSignin.setFont(new Font("Lucida Grande", Font.PLAIN, 10));
		btnSignin.setBounds(67, 446, 316, 88);
		frame.getContentPane().add(btnSignin);

		JButton btnSignout = new JButton("SIGN-OUT");
		btnSignout.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				btnSignout.setText("");
				String addTime = "Sign out" + " " + "at" + " " + new Date();
				btnSignout.setText(addTime);
				btnSignout.setForeground(Color.RED);
				btnSignout.setFont(new Font("Lucida Grande", Font.PLAIN, 15));

				btnSignout.setBackground(new Color(70, 130, 180));
				btnSignout.setOpaque(true);
			}
		});

		btnSignout.setForeground(Color.BLACK);
		btnSignout.setFont(new Font("Lucida Grande", Font.PLAIN, 10));
		btnSignout.setBounds(395, 446, 316, 88);
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

		String[][] data = { { "George Rhymes jr.", "QAK9185", "32144", "NIL", "02/28/2019" },
				{ "APD", "NIL", "32144", "NIL", "NIL" }, { "APD", "NIL", "32144", "NIL", "NIL" },
				{ "APD", "NIL", "32144", "NIL", "NIL" },
				{ "George Rhymes jr.", "QAK9185", "32144", "NIL", "02/28/2019" },
				{ "George Rhymes jr.", "QAK9185", "32144", "NIL", "02/28/2019" },
				{ "APD", "NIL", "32144", "NIL", "NIL" },
				{ "George Rhymes jr.", "QAK9185", "32144", "NIL", "02/28/2019" },
				{ "APD", "NIL", "32144", "NIL", "NIL" }, { "APD", "NIL", "32144", "NIL", "NIL" },
				{ "George Rhymes jr.", "QAK9185", "32144", "NIL", "02/28/2019" },
				{ "George Rhymes jr.", "QAK9185", "32144", "NIL", "02/28/2019" },
				{ "APD", "NIL", "32144", "NIL", "NIL" },
				{ "George Rhymes jr.", "QAK9185", "32144", "NIL", "02/28/2019" },
				{ "APD", "NIL", "32144", "NIL", "NIL" },
				{ "George Rhymes jr.", "QAK9185", "32144", "NIL", "02/28/2019" },
				{ "APD", "NIL", "32144", "NIL", "NIL" }, { "APD", "NIL", "32144", "NIL", "NIL" },
				{ "George Rhymes jr.", "QAK9185", "32144", "NIL", "02/28/2019" } };

		// Column Names
		String[] columnNames = { lblLastName.getText().replace(" Name", "") + ", " + lblFirstName.getText(),
				lblPovLiscence.getText(), lblCityVehicle.getText(), lblDriversLiscence.getText(),
				lblBadgeExpirationDate.getText() };
		JTable table = new JTable(data, columnNames);
		table.setBounds(30, 40, 200, 300);
		table.getSelectionModel().addSelectionInterval(3, 7);
		// table.getSelectionModel().addSelectionInterval(5, 5);
		table.changeSelection(1, 1, true, false);
		JScrollPane scrollPane = new JScrollPane(table);
		scrollPane.setBounds(0, 567, 764, 245);
		frame.getContentPane().add(scrollPane);
		scrollPane.setVisible(true);

	}

	protected static void generateReport() {
		// TODO Auto-generated method stub
		System.out.println("REPORT GENRATED on " + new Date());
	}
}
