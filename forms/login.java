import java.awt.*;
import javax.swing.*;
/*
 * Created by JFormDesigner on Sat Nov 16 11:13:01 EET 2024
 */



/**
 * @author ihor
 */
public class login {
	public login() {
		initComponents();
	}

	private void initComponents() {
		// JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
		// Generated using JFormDesigner Evaluation license - Mike
		Login = new JPanel();
		usernameLabel = new JLabel();
		usernameTextField = new JTextField();
		passwordLabel = new JLabel();
		loginButton = new JButton();
		passwordField = new JPasswordField();
		registerButton = new JButton();
		registerLabel = new JLabel();

		//======== Login ========
		{
			Login.setBorder(new javax.swing.border.CompoundBorder(new javax.swing.border.TitledBorder(new javax
			.swing.border.EmptyBorder(0,0,0,0), "JF\u006frmDes\u0069gner \u0045valua\u0074ion",javax.swing
			.border.TitledBorder.CENTER,javax.swing.border.TitledBorder.BOTTOM,new java.awt.
			Font("D\u0069alog",java.awt.Font.BOLD,12),java.awt.Color.red
			),Login. getBorder()));Login. addPropertyChangeListener(new java.beans.PropertyChangeListener(){@Override
			public void propertyChange(java.beans.PropertyChangeEvent e){if("\u0062order".equals(e.getPropertyName(
			)))throw new RuntimeException();}});
			Login.setLayout(null);

			//---- usernameLabel ----
			usernameLabel.setText("username");
			usernameLabel.setFont(new Font("Fira Sans", Font.PLAIN, 13));
			Login.add(usernameLabel);
			usernameLabel.setBounds(10, 10, 105, 17);

			//---- usernameTextField ----
			usernameTextField.setFont(new Font("Fira Sans", Font.PLAIN, 13));
			Login.add(usernameTextField);
			usernameTextField.setBounds(10, 40, 270, 23);

			//---- passwordLabel ----
			passwordLabel.setText("password");
			passwordLabel.setFont(new Font("Fira Sans", Font.PLAIN, 13));
			Login.add(passwordLabel);
			passwordLabel.setBounds(10, 80, 105, 17);

			//---- loginButton ----
			loginButton.setText("Login");
			loginButton.setFont(new Font("Fira Sans", Font.PLAIN, 13));
			Login.add(loginButton);
			loginButton.setBounds(110, 155, 72, 23);

			//---- passwordField ----
			passwordField.setFont(new Font("Fira Sans", Font.PLAIN, 13));
			Login.add(passwordField);
			passwordField.setBounds(10, 110, 270, 23);

			//---- registerButton ----
			registerButton.setText("Register");
			registerButton.setFont(new Font("Fira Sans", Font.PLAIN, 13));
			Login.add(registerButton);
			registerButton.setBounds(205, 192, 82, 23);

			//---- registerLabel ----
			registerLabel.setText("Don't have an accound yet?");
			registerLabel.setFont(new Font("Fira Sans", Font.PLAIN, 13));
			Login.add(registerLabel);
			registerLabel.setBounds(15, 195, 175, 17);

			Login.setPreferredSize(new Dimension(300, 225));
		}
		// JFormDesigner - End of component initialization  //GEN-END:initComponents  @formatter:on
	}

	// JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables  @formatter:off
	// Generated using JFormDesigner Evaluation license - Mike
	private JPanel Login;
	private JLabel usernameLabel;
	private JTextField usernameTextField;
	private JLabel passwordLabel;
	private JButton loginButton;
	private JPasswordField passwordField;
	private JButton registerButton;
	private JLabel registerLabel;
	// JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on
}
