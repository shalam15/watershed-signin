import java.awt.Color;
import java.awt.Component;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.print.PrinterException;
import java.text.MessageFormat;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextPane;
import javax.swing.ScrollPaneConstants;
import javax.swing.border.MatteBorder;

public class mainGuiHome {
	Employee employeeDefault = new Employee("Abdulsalam", "Ajayi");

	private JFrame frame;
	private static JTable table;

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
		frame.setBounds(100, 100, 595, 842);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JLabel lblWatershedSigninSheet = new JLabel("Daily Activity Report");
		lblWatershedSigninSheet.setFont(new Font("Apple Color Emoji", Font.BOLD, 17));
		lblWatershedSigninSheet.setBounds(211, 6, 229, 16);
		frame.getContentPane().add(lblWatershedSigninSheet);

		JTextPane textPane = new JTextPane();
		textPane.setText(employeeDefault.getFirstName() + " " + employeeDefault.getLastName());
		textPane.setForeground(Color.BLACK);
		textPane.setBounds(58, 51, 145, 16);
		frame.getContentPane().add(textPane);

		JLabel lblName = new JLabel("Name:");
		lblName.setBounds(19, 51, 41, 16);
		frame.getContentPane().add(lblName);

		JTextPane textPane_1 = new JTextPane();
		employeeDefault.setShiftTime("Night Shift");
		textPane_1.setText(employeeDefault.getShiftTime());
		textPane_1.setForeground(Color.BLACK);
		textPane_1.setBounds(250, 51, 145, 16);
		frame.getContentPane().add(textPane_1);
		JLabel lblShift = new JLabel("Shift:");
		lblShift.setBounds(211, 51, 41, 16);
		frame.getContentPane().add(lblShift);

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
		table.setBorder(new MatteBorder(1, 1, 1, 1, Color.RED));
		table.setBounds(59, 309, 313, -163);
		frame.getContentPane().add(table);

		JScrollPane scrollPane = new JScrollPane(table);
		scrollPane.setToolTipText("Testing");
		scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		scrollPane.setBounds(121, 110, 468, 704);
		frame.getContentPane().add(scrollPane);

		JScrollPane scrollPane_1 = new JScrollPane((Component) null);
		scrollPane_1.setToolTipText("Testing");
		scrollPane_1.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		scrollPane_1.setBounds(10, 108, 100, 706);
		frame.getContentPane().add(scrollPane_1);
		try {
			table.print();
		} catch (PrinterException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		MessageFormat header = new MessageFormat("Page {0,number,integer}");
		try {
			table.print(JTable.PrintMode.FIT_WIDTH, header, null);
		} catch (java.awt.print.PrinterException e) {
			System.err.format("Cannot print %s%n", e.getMessage());
		}

	}
}
