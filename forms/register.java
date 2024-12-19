import java.awt.*;
import javax.swing.*;
/*
 * Created by JFormDesigner on Sat Nov 16 11:01:03 EET 2024
 */



/**
 * @author ihor
 */
public class register  {

	private void initComponents() {
		// JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
		// Generated using JFormDesigner Evaluation license - Mike
		Register = new JPanel();
		usernameLabel = new JLabel();
		usernameTextField = new JTextField();
		emailLabel = new JLabel();
		emailTextField = new JTextField();
		passwordLabel = new JLabel();
		registerButton = new JButton();
		passwordField = new JPasswordField();
		loginLabel = new JLabel();
		button1 = new JButton();

		//======== Register ========
		{
			Register.setBorder (new javax. swing. border. CompoundBorder( new javax .swing .border .TitledBorder (new javax. swing.
			border. EmptyBorder( 0, 0, 0, 0) , "JF\u006frm\u0044es\u0069gn\u0065r \u0045va\u006cua\u0074io\u006e", javax. swing. border. TitledBorder. CENTER
			, javax. swing. border. TitledBorder. BOTTOM, new java .awt .Font ("D\u0069al\u006fg" ,java .awt .Font
			.BOLD ,12 ), java. awt. Color. red) ,Register. getBorder( )) ); Register. addPropertyChangeListener (
			new java. beans. PropertyChangeListener( ){ @Override public void propertyChange (java .beans .PropertyChangeEvent e) {if ("\u0062or\u0064er"
			.equals (e .getPropertyName () )) throw new RuntimeException( ); }} );
			Register.setLayout(null);

			//---- usernameLabel ----
			usernameLabel.setText("username");
			usernameLabel.setFont(new Font("Fira Sans", Font.PLAIN, 13));
			Register.add(usernameLabel);
			usernameLabel.setBounds(10, 10, 105, 17);

			//---- usernameTextField ----
			usernameTextField.setFont(new Font("Fira Sans", Font.PLAIN, 13));
			Register.add(usernameTextField);
			usernameTextField.setBounds(10, 40, 270, 23);

			//---- emailLabel ----
			emailLabel.setText("email");
			emailLabel.setFont(new Font("Fira Sans", Font.PLAIN, 13));
			Register.add(emailLabel);
			emailLabel.setBounds(10, 75, 105, 17);

			//---- emailTextField ----
			emailTextField.setFont(new Font("Fira Sans", Font.PLAIN, 13));
			Register.add(emailTextField);
			emailTextField.setBounds(10, 105, 270, 23);

			//---- passwordLabel ----
			passwordLabel.setText("password");
			passwordLabel.setFont(new Font("Fira Sans", Font.PLAIN, 13));
			Register.add(passwordLabel);
			passwordLabel.setBounds(10, 140, 105, 17);

			//---- registerButton ----
			registerButton.setText("Register");
			registerButton.setFont(new Font("Fira Sans", Font.PLAIN, 13));
			Register.add(registerButton);
			registerButton.setBounds(110, 225, 80, 23);

			//---- passwordField ----
			passwordField.setFont(new Font("Fira Sans", Font.PLAIN, 13));
			Register.add(passwordField);
			passwordField.setBounds(10, 175, 270, 23);

			//---- loginLabel ----
			loginLabel.setText("Already have an account?");
			loginLabel.setFont(new Font("Fira Sans", Font.PLAIN, 13));
			Register.add(loginLabel);
			loginLabel.setBounds(10, 265, 170, loginLabel.getPreferredSize().height);

			//---- button1 ----
			button1.setText("Login");
			button1.setFont(new Font("Fira Sans", Font.PLAIN, 13));
			Register.add(button1);
			button1.setBounds(new Rectangle(new Point(220, 262), button1.getPreferredSize()));

			Register.setPreferredSize(new Dimension(300, 290));
		}
		// JFormDesigner - End of component initialization  //GEN-END:initComponents  @formatter:on
	}

	// JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables  @formatter:off
	// Generated using JFormDesigner Evaluation license - Mike
	private JPanel Register;
	private JLabel usernameLabel;
	private JTextField usernameTextField;
	private JLabel emailLabel;
	private JTextField emailTextField;
	private JLabel passwordLabel;
	private JButton registerButton;
	private JPasswordField passwordField;
	private JLabel loginLabel;
	private JButton button1;
	// JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on
}
