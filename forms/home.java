import java.awt.*;
import javax.swing.*;
/*
 * Created by JFormDesigner on Sat Nov 16 11:23:06 EET 2024
 */



/**
 * @author ihor
 */
public class home {
	public home() {
		initComponents();
	}

	private void initComponents() {
		// JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
		// Generated using JFormDesigner Evaluation license - Mike
		Home = new JPanel();
		scrollPane1 = new JScrollPane();
		table = new JTable();
		searchLable = new JLabel();
		searchComboBox = new JComboBox<>();
		addButton = new JButton();
		deleteButton = new JButton();
		filterButton = new JButton();
		textField1 = new JTextField();

		//======== Home ========
		{
			Home.setBorder ( new javax . swing. border .CompoundBorder ( new javax . swing. border .TitledBorder ( new javax
			. swing. border .EmptyBorder ( 0, 0 ,0 , 0) ,  "JF\u006frmDesi\u0067ner Ev\u0061luatio\u006e" , javax. swing
			.border . TitledBorder. CENTER ,javax . swing. border .TitledBorder . BOTTOM, new java. awt .
			Font ( "Dialo\u0067", java .awt . Font. BOLD ,12 ) ,java . awt. Color .red
			) ,Home. getBorder () ) ); Home. addPropertyChangeListener( new java. beans .PropertyChangeListener ( ){ @Override
			public void propertyChange (java . beans. PropertyChangeEvent e) { if( "borde\u0072" .equals ( e. getPropertyName (
			) ) )throw new RuntimeException( ) ;} } );
			Home.setLayout(null);

			//======== scrollPane1 ========
			{

				//---- table ----
				table.setFont(new Font("Fira Sans", Font.PLAIN, 13));
				scrollPane1.setViewportView(table);
			}
			Home.add(scrollPane1);
			scrollPane1.setBounds(0, 75, 1000, 530);

			//---- searchLable ----
			searchLable.setText("Search By");
			searchLable.setFont(new Font("Fira Sans", Font.PLAIN, 13));
			Home.add(searchLable);
			searchLable.setBounds(10, 10, 65, 20);

			//---- searchComboBox ----
			searchComboBox.setFont(new Font("Fira Sans", Font.PLAIN, 13));
			Home.add(searchComboBox);
			searchComboBox.setBounds(80, 10, 85, searchComboBox.getPreferredSize().height);

			//---- addButton ----
			addButton.setText("Add");
			addButton.setFont(new Font("Fira Sans", Font.PLAIN, 13));
			Home.add(addButton);
			addButton.setBounds(new Rectangle(new Point(180, 40), addButton.getPreferredSize()));

			//---- deleteButton ----
			deleteButton.setText("Delete");
			deleteButton.setFont(new Font("Fira Sans", Font.PLAIN, 13));
			Home.add(deleteButton);
			deleteButton.setBounds(new Rectangle(new Point(265, 40), deleteButton.getPreferredSize()));

			//---- filterButton ----
			filterButton.setText("Filter");
			filterButton.setFont(new Font("Fira Sans", Font.PLAIN, 13));
			Home.add(filterButton);
			filterButton.setBounds(new Rectangle(new Point(350, 40), filterButton.getPreferredSize()));
			Home.add(textField1);
			textField1.setBounds(10, 40, 155, 23);

			{
				// compute preferred size
				Dimension preferredSize = new Dimension();
				for(int i = 0; i < Home.getComponentCount(); i++) {
					Rectangle bounds = Home.getComponent(i).getBounds();
					preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
					preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
				}
				Insets insets = Home.getInsets();
				preferredSize.width += insets.right;
				preferredSize.height += insets.bottom;
				Home.setMinimumSize(preferredSize);
				Home.setPreferredSize(preferredSize);
			}
		}
		// JFormDesigner - End of component initialization  //GEN-END:initComponents  @formatter:on
	}

	// JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables  @formatter:off
	// Generated using JFormDesigner Evaluation license - Mike
	private JPanel Home;
	private JScrollPane scrollPane1;
	private JTable table;
	private JLabel searchLable;
	private JComboBox<String> searchComboBox;
	private JButton addButton;
	private JButton deleteButton;
	private JButton filterButton;
	private JTextField textField1;
	// JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on
}
