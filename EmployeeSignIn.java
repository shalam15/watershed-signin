import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Toolkit;
import java.util.Date;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class EmployeeSignIn {
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
					EmployeeSignIn window = new EmployeeSignIn();
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
	public EmployeeSignIn() {
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

		JButton button = new JButton("SAVE ALL ENTRY");

		button.setForeground(Color.RED);
		button.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		button.setBounds(243, 997, 188, 46);
		frame.getContentPane().add(button);

		JButton btnPrintPage = new JButton("PRINT PAGE");

		btnPrintPage.setForeground(Color.BLUE);
		btnPrintPage.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		btnPrintPage.setBounds(436, 997, 188, 46);
		frame.getContentPane().add(btnPrintPage);

	}

	protected static void generateReport() {
		// TODO Auto-generated method stub
		System.out.println("REPORT GENRATED on " + new Date());
	}
}
