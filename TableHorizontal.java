import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class TableHorizontal extends JFrame {
	public TableHorizontal() {
		final JTable table = new JTable(10, 5) {
			@Override
			public boolean getScrollableTracksViewportWidth() {
				return getPreferredSize().width < getParent().getWidth();
			}
		};
		table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		final JScrollPane scrollPane = new JScrollPane(table);
		getContentPane().add(scrollPane);
	}

	public static void main(String[] args) {
		TableHorizontal frame = new TableHorizontal();
		frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
		frame.pack();
		frame.setSize(400, 300);
		frame.setVisible(true);
	}
}