import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;

public class VisitorSignIn extends JFrame {

	private JPanel contentPane;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			@Override
			public void run() {
				try {
					VisitorSignIn frame = new VisitorSignIn();
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
	public VisitorSignIn() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 877, 771);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);

		JButton btnThorpelogo = new JButton("");
		btnThorpelogo.setBounds(5, 11, 66, 48);
		btnThorpelogo.setIcon(new ImageIcon("/Users/aj/Desktop/icon.png"));

		JLabel lblCityOfAtlanta = new JLabel("City of Atlanta–– Departement of Watershed Management");
		lblCityOfAtlanta.setBounds(142, 11, 373, 16);

		JLabel lblEmployeeSigninSheet = new JLabel("EMPLOYEE Sign-In Sheet");
		lblEmployeeSigninSheet.setBounds(244, 39, 153, 16);

		JButton button = new JButton("");
		button.setBounds(516, 11, 266, 100);
		button.setIcon(new ImageIcon("/Users/aj/Desktop/PNG image 2 copy.png"));
		contentPane.setLayout(null);

		table = new JTable();
		table.setBounds(5, 5, 10, 10);
		contentPane.add(table);
		contentPane.add(btnThorpelogo);
		contentPane.add(lblCityOfAtlanta);
		contentPane.add(lblEmployeeSigninSheet);
		contentPane.add(button);

		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(null, "JPanel title", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel.setBounds(367, 109, 327, 286);
		contentPane.add(panel);
		panel.setLayout(null);

		JSeparator separator = new JSeparator();
		separator.setBounds(177, 392, 327, 35);
		contentPane.add(separator);

		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBorder(new TitledBorder(null, "JPanel title", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_1.setBounds(177, 407, 327, 286);
		contentPane.add(panel_1);

		JDesktopPane desktopPane = new JDesktopPane();
		desktopPane.setBounds(105, 174, 250, 350);
		contentPane.add(desktopPane);

	}
}
