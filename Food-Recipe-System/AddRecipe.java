package view;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class AddRecipe extends JPanel {
	private JTextField txt_title;
	private JComboBox cb_category;
	private JTextField txt_ingrdients;
	private JTextField txt_recipe;

	/**
	 * Create the panel.
	 */
	public AddRecipe() {
		setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Title");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblNewLabel.setBounds(45, 32, 84, 18);
		add(lblNewLabel);
		
		txt_title = new JTextField();
		txt_title.setBounds(156, 32, 334, 19);
		add(txt_title);
		txt_title.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Category");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblNewLabel_1.setBounds(45, 70, 84, 24);
		add(lblNewLabel_1);
		
		JComboBox cb_category = new JComboBox();
		cb_category.setFont(new Font("Tahoma", Font.PLAIN, 16));
		cb_category.setModel(new DefaultComboBoxModel(new String[] {"SouthIndian", "NorthIndian"}));
		cb_category.setBounds(156, 72, 334, 21);
		add(cb_category);
		
		JLabel lblNewLabel_2 = new JLabel("Ingerdients");
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblNewLabel_2.setBounds(45, 116, 107, 24);
		add(lblNewLabel_2);
		
		txt_ingrdients = new JTextField();
		txt_ingrdients.setBounds(156, 116, 334, 81);
		add(txt_ingrdients);
		txt_ingrdients.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Recipe");
		lblNewLabel_3.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblNewLabel_3.setBounds(45, 214, 84, 18);
		add(lblNewLabel_3);
		
		txt_recipe = new JTextField();
		txt_recipe.setBounds(156, 207, 334, 90);
		add(txt_recipe);
		txt_recipe.setColumns(10);
		
		JButton btnback = new JButton("Back");
		btnback.setFont(new Font("Times New Roman", Font.BOLD, 20));
		btnback.setBounds(431, 307, 118, 21);
		add(btnback);
			
		}

}

