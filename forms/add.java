import java.awt.*;
import javax.swing.*;
/*
 * Created by JFormDesigner on Sat Nov 16 11:47:50 EET 2024
 */



/**
 * @author ihor
 */
public class add {
	public add() {
		initComponents();
	}

	private void initComponents() {
		// JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
		// Generated using JFormDesigner Evaluation license - Mike
		Add = new JPanel();
		nameLabel = new JLabel();
		nameTextField = new JTextField();
		authorLabel = new JLabel();
		authorTextField = new JTextField();
		yearLabel = new JLabel();
		yearSpinner = new JSpinner();
		pagesLabel = new JLabel();
		textField3 = new JTextField();
		rateLabel = new JLabel();
		rateSpinner = new JSpinner();
		genresLabel = new JLabel();
		genresComboBox = new JComboBox<>();
		addButton = new JButton();
		genresPanel = new JPanel();

		//======== Add ========
		{
			Add.setBorder(new javax.swing.border.CompoundBorder(new javax.swing.border.TitledBorder(new javax.swing.border.
			EmptyBorder(0,0,0,0), "JF\u006frmD\u0065sig\u006eer \u0045val\u0075ati\u006fn",javax.swing.border.TitledBorder.CENTER,javax.swing
			.border.TitledBorder.BOTTOM,new java.awt.Font("Dia\u006cog",java.awt.Font.BOLD,12),
			java.awt.Color.red),Add. getBorder()));Add. addPropertyChangeListener(new java.beans.PropertyChangeListener()
			{@Override public void propertyChange(java.beans.PropertyChangeEvent e){if("\u0062ord\u0065r".equals(e.getPropertyName()))
			throw new RuntimeException();}});
			Add.setLayout(null);

			//---- nameLabel ----
			nameLabel.setText("Name");
			nameLabel.setFont(new Font("Fira Sans", Font.PLAIN, 13));
			Add.add(nameLabel);
			nameLabel.setBounds(10, 10, 70, nameLabel.getPreferredSize().height);

			//---- nameTextField ----
			nameTextField.setFont(new Font("Fira Sans", Font.PLAIN, 13));
			Add.add(nameTextField);
			nameTextField.setBounds(10, 40, 200, nameTextField.getPreferredSize().height);

			//---- authorLabel ----
			authorLabel.setText("Author");
			authorLabel.setFont(new Font("Fira Sans", Font.PLAIN, 13));
			Add.add(authorLabel);
			authorLabel.setBounds(10, 75, 70, 17);

			//---- authorTextField ----
			authorTextField.setFont(new Font("Fira Sans", Font.PLAIN, 13));
			Add.add(authorTextField);
			authorTextField.setBounds(10, 105, 200, 23);

			//---- yearLabel ----
			yearLabel.setText("Year");
			yearLabel.setFont(new Font("Fira Sans", Font.PLAIN, 13));
			Add.add(yearLabel);
			yearLabel.setBounds(10, 145, 70, 17);

			//---- yearSpinner ----
			yearSpinner.setFont(new Font("Fira Sans", Font.PLAIN, 13));
			Add.add(yearSpinner);
			yearSpinner.setBounds(10, 175, 200, yearSpinner.getPreferredSize().height);

			//---- pagesLabel ----
			pagesLabel.setText("Pages");
			pagesLabel.setFont(new Font("Fira Sans", Font.PLAIN, 13));
			Add.add(pagesLabel);
			pagesLabel.setBounds(10, 215, 70, 17);

			//---- textField3 ----
			textField3.setFont(new Font("Fira Sans", Font.PLAIN, 13));
			Add.add(textField3);
			textField3.setBounds(10, 245, 200, 23);

			//---- rateLabel ----
			rateLabel.setText("Rate");
			rateLabel.setFont(new Font("Fira Sans", Font.PLAIN, 13));
			Add.add(rateLabel);
			rateLabel.setBounds(10, 285, 70, 17);

			//---- rateSpinner ----
			rateSpinner.setFont(new Font("Fira Sans", Font.PLAIN, 13));
			Add.add(rateSpinner);
			rateSpinner.setBounds(10, 315, 200, 23);

			//---- genresLabel ----
			genresLabel.setText("Genres");
			genresLabel.setFont(new Font("Fira Sans", Font.PLAIN, 13));
			Add.add(genresLabel);
			genresLabel.setBounds(10, 360, 70, 17);

			//---- genresComboBox ----
			genresComboBox.setFont(new Font("Fira Sans", Font.PLAIN, 13));
			Add.add(genresComboBox);
			genresComboBox.setBounds(10, 390, 200, genresComboBox.getPreferredSize().height);

			//---- addButton ----
			addButton.setText("Add");
			addButton.setFont(new Font("Fira Sans", Font.PLAIN, 16));
			Add.add(addButton);
			addButton.setBounds(60, 555, 105, 30);

			//======== genresPanel ========
			{
				genresPanel.setFont(new Font("Fira Sans", Font.PLAIN, 13));
				genresPanel.setLayout(new FlowLayout());
			}
			Add.add(genresPanel);
			genresPanel.setBounds(10, 425, 200, 120);

			Add.setPreferredSize(new Dimension(230, 600));
		}
		// JFormDesigner - End of component initialization  //GEN-END:initComponents  @formatter:on
	}

	// JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables  @formatter:off
	// Generated using JFormDesigner Evaluation license - Mike
	private JPanel Add;
	private JLabel nameLabel;
	private JTextField nameTextField;
	private JLabel authorLabel;
	private JTextField authorTextField;
	private JLabel yearLabel;
	private JSpinner yearSpinner;
	private JLabel pagesLabel;
	private JTextField textField3;
	private JLabel rateLabel;
	private JSpinner rateSpinner;
	private JLabel genresLabel;
	private JComboBox<String> genresComboBox;
	private JButton addButton;
	private JPanel genresPanel;
	// JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on
}
