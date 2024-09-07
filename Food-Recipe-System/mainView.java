package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JSplitPane;
import javax.swing.JTabbedPane;

public class mainView extends JFrame {

	private JPanel contentPane;

	
	/**
	 * Create the frame.
	 */
	public mainView() {
		setTitle("RecipeBook");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 711, 465);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(324, 10, 5, 5);
		contentPane.add(tabbedPane);
		
		JTabbedPane tabbedPane_4 = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane_4.setBounds(41, 27, 5, 5);
		contentPane.add(tabbedPane_4);
		
		JTabbedPane tabbedPane_5 = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane_5.setBounds(10, 25, 628, 355);
		contentPane.add(tabbedPane_5);
		
		JPanel panel = new AddRecipe();
		tabbedPane_5.addTab("AddRecipe", null, panel, null);
	}
}
