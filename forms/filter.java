import java.awt.*;
import javax.swing.*;
/*
 * Created by JFormDesigner on Sat Nov 16 11:51:29 EET 2024
 */



/**
 * @author ihor
 */
public class filter  {

	private void initComponents() {
		// JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
		// Generated using JFormDesigner Evaluation license - Mike
		Filter = new JPanel();
		yearLabel = new JLabel();
		yearSpinner = new JSpinner();
		pagesLabel = new JLabel();
		textField3 = new JTextField();
		rateLabel = new JLabel();
		rateSpinner = new JSpinner();
		genresLabel = new JLabel();
		genresComboBox = new JComboBox<>();
		radioButton1 = new JRadioButton();
		addButton = new JButton();
		genresPanel = new JPanel();

		//======== Filter ========
		{
			Filter.setBorder(new javax.swing.border.CompoundBorder(new javax.swing.border.TitledBorder(new javax.swing.border.EmptyBorder(
			0,0,0,0), "JFor\u006dDesi\u0067ner \u0045valu\u0061tion",javax.swing.border.TitledBorder.CENTER,javax.swing.border.TitledBorder
			.BOTTOM,new java.awt.Font("Dia\u006cog",java.awt.Font.BOLD,12),java.awt.Color.
			red),Filter. getBorder()));Filter. addPropertyChangeListener(new java.beans.PropertyChangeListener(){@Override public void propertyChange(java.
			beans.PropertyChangeEvent e){if("bord\u0065r".equals(e.getPropertyName()))throw new RuntimeException();}});
			Filter.setLayout(null);

			//---- yearLabel ----
			yearLabel.setText("Year");
			yearLabel.setFont(new Font("Fira Sans", Font.PLAIN, 13));
			Filter.add(yearLabel);
			yearLabel.setBounds(10, 10, 70, 17);

			//---- yearSpinner ----
			yearSpinner.setFont(new Font("Fira Sans", Font.PLAIN, 13));
			Filter.add(yearSpinner);
			yearSpinner.setBounds(10, 40, 200, 23);

			//---- pagesLabel ----
			pagesLabel.setText("Pages");
			pagesLabel.setFont(new Font("Fira Sans", Font.PLAIN, 13));
			Filter.add(pagesLabel);
			pagesLabel.setBounds(10, 80, 70, 17);

			//---- textField3 ----
			textField3.setFont(new Font("Fira Sans", Font.PLAIN, 13));
			Filter.add(textField3);
			textField3.setBounds(10, 110, 200, 23);

			//---- rateLabel ----
			rateLabel.setText("Rate");
			rateLabel.setFont(new Font("Fira Sans", Font.PLAIN, 13));
			Filter.add(rateLabel);
			rateLabel.setBounds(10, 150, 70, 17);

			//---- rateSpinner ----
			rateSpinner.setFont(new Font("Fira Sans", Font.PLAIN, 13));
			Filter.add(rateSpinner);
			rateSpinner.setBounds(10, 180, 200, 23);

			//---- genresLabel ----
			genresLabel.setText("Genres");
			genresLabel.setFont(new Font("Fira Sans", Font.PLAIN, 13));
			Filter.add(genresLabel);
			genresLabel.setBounds(10, 225, 70, 17);

			//---- genresComboBox ----
			genresComboBox.setFont(new Font("Fira Sans", Font.PLAIN, 13));
			Filter.add(genresComboBox);
			genresComboBox.setBounds(10, 255, 200, 23);

			//---- radioButton1 ----
			radioButton1.setText("AND");
			radioButton1.setHorizontalAlignment(SwingConstants.TRAILING);
			radioButton1.setFont(new Font("Fira Sans", Font.PLAIN, 13));
			Filter.add(radioButton1);
			radioButton1.setBounds(115, 230, 95, 21);

			//---- addButton ----
			addButton.setText("Filter");
			addButton.setFont(new Font("Fira Sans", Font.PLAIN, 16));
			Filter.add(addButton);
			addButton.setBounds(60, 420, 105, 30);

			//======== genresPanel ========
			{
				genresPanel.setFont(new Font("Fira Sans", Font.PLAIN, 13));
				genresPanel.setLayout(new FlowLayout());
			}
			Filter.add(genresPanel);
			genresPanel.setBounds(10, 290, 200, 120);

			Filter.setPreferredSize(new Dimension(225, 460));
		}
		// JFormDesigner - End of component initialization  //GEN-END:initComponents  @formatter:on
	}

	// JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables  @formatter:off
	// Generated using JFormDesigner Evaluation license - Mike
	private JPanel Filter;
	private JLabel yearLabel;
	private JSpinner yearSpinner;
	private JLabel pagesLabel;
	private JTextField textField3;
	private JLabel rateLabel;
	private JSpinner rateSpinner;
	private JLabel genresLabel;
	private JComboBox<String> genresComboBox;
	private JRadioButton radioButton1;
	private JButton addButton;
	private JPanel genresPanel;
	// JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on
}
