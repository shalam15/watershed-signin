import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class MainHomePage extends JFrame {

	private JPanel contentPane;
	private JTextField txtHowellMill;
	private JTextField txtAjayiAbdulsalam;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			@Override
			public void run() {
				try {
					MainHomePage frame = new MainHomePage();
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
	public MainHomePage() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("/Users/aj/Desktop/PNG image 3.png"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 725, 579);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(15, 5, 15, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JButton btnNewButton = new JButton("Daily Activity Report");
		btnNewButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					mainGuiHome window = new mainGuiHome();
					window.frame.setVisible(true);
				} catch (Exception error) {
					error.printStackTrace();
				}
			}
		});
		btnNewButton.setIcon(new ImageIcon("/Users/aj/Desktop/download-1.png"));
		btnNewButton.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		btnNewButton.setBounds(41, 179, 224, 97);
		contentPane.add(btnNewButton);

		JButton btnEmployeeSignIn = new JButton("Employee Sign In");
		btnEmployeeSignIn.setIcon(new ImageIcon("/Users/aj/Desktop/icon.png"));
		btnEmployeeSignIn.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		btnEmployeeSignIn.setBounds(277, 179, 224, 97);
		contentPane.add(btnEmployeeSignIn);

		JButton btnContractorSignIn = new JButton("Contractor Sign In");
		btnContractorSignIn.setIcon(new ImageIcon("/Users/aj/Desktop/download-3.png"));
		btnContractorSignIn.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		btnContractorSignIn.setBounds(41, 302, 224, 97);
		contentPane.add(btnContractorSignIn);

		JButton btnVisitorSignIn = new JButton("Visitor Sign In");
		btnVisitorSignIn.setIcon(new ImageIcon("/Users/aj/Desktop/download-2.png"));
		btnVisitorSignIn.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		btnVisitorSignIn.setBounds(277, 302, 224, 97);
		contentPane.add(btnVisitorSignIn);

		JButton btnSignInSheet = new JButton("Sign In Sheet");
		btnSignInSheet.setIcon(new ImageIcon("/Users/aj/Desktop/download-4.png"));
		btnSignInSheet.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		btnSignInSheet.setBounds(41, 419, 224, 97);
		contentPane.add(btnSignInSheet);

		JButton btnAccidentReport = new JButton("Accident Report");
		btnAccidentReport.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		btnAccidentReport.setIcon(new ImageIcon("/Users/aj/Desktop/download-1.jpg"));
		btnAccidentReport.setBounds(277, 419, 224, 97);
		contentPane.add(btnAccidentReport);

		JButton btnNewButton_1 = new JButton("Pass Down Log");
		btnNewButton_1.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		btnNewButton_1.setIcon(new ImageIcon("/Users/aj/Desktop/download.jpg"));
		btnNewButton_1.setBounds(513, 181, 179, 218);
		contentPane.add(btnNewButton_1);

		JButton btnNewButton_2 = new JButton("Call Log");
		btnNewButton_2.setIcon(new ImageIcon("/Users/aj/Desktop/download.png"));
		btnNewButton_2.setBounds(513, 419, 117, 97);
		contentPane.add(btnNewButton_2);

		JLabel lblSiteName = new JLabel("Site Name:");
		lblSiteName.setBounds(41, 140, 78, 16);
		contentPane.add(lblSiteName);

		txtHowellMill = new JTextField();
		txtHowellMill.setText("Howell Mill");
		txtHowellMill.setBounds(122, 135, 143, 26);
		contentPane.add(txtHowellMill);
		txtHowellMill.setColumns(10);

		JLabel lblEmployeeOnDuty = new JLabel("Employee On Duty:");
		lblEmployeeOnDuty.setBounds(324, 140, 132, 16);
		contentPane.add(lblEmployeeOnDuty);

		txtAjayiAbdulsalam = new JTextField();
		txtAjayiAbdulsalam.setText("Ajayi Abdulsalam");
		txtAjayiAbdulsalam.setBounds(447, 135, 130, 26);
		contentPane.add(txtAjayiAbdulsalam);
		txtAjayiAbdulsalam.setColumns(10);

		JButton btnNewButton_3 = new JButton("HomePage");
		btnNewButton_3.setIcon(new ImageIcon("/Users/aj/Desktop/PNG image 2.png"));
		btnNewButton_3.setBounds(110, 6, 511, 124);
		contentPane.add(btnNewButton_3);

		JButton button = new JButton("911");
		button.setForeground(Color.RED);
		button.setBounds(637, 419, 55, 97);
		contentPane.add(button);

	}
}
