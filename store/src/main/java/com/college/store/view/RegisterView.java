package com.college.store.view;

import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import org.springframework.stereotype.Component;

import lombok.Getter;

@Component
@Getter
public class RegisterView extends JFrame{
    private JLabel usernameLabel;
    private JLabel emailLabel;
    private JLabel passwordLabel;
    private JLabel loginLabel;
    private JTextField usernameTextField;
    private JTextField emailTextField;
    private JPasswordField passwordField;
    private JButton registerButton;
    private JButton loginButton;

    public RegisterView() {
        setSize(new Dimension(300, 330));
        setLayout(null);
        setLocationRelativeTo(null);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        addControllers();
    }

    private void addControllers() {
        this.usernameLabel = new JLabel("Username:");
        this.usernameLabel.setBounds(10, 10, 105, 17);
        this.usernameLabel.setFont(new Font("Fira Sans", Font.PLAIN, 13));
        this.usernameLabel.setHorizontalAlignment(SwingConstants.LEFT);
        add(this.usernameLabel);

        this.usernameTextField = new JTextField();
        this.usernameTextField.setBounds(10, 40, 270, 23);
        this.usernameTextField.setFont(new Font("Fira Sans", Font.PLAIN, 13));
        this.usernameTextField.setHorizontalAlignment(SwingConstants.LEFT);
        add(this.usernameTextField);

        this.emailLabel = new JLabel("Email: ");
        this.emailLabel.setBounds(10, 75, 105, 17);
        this.emailLabel.setFont(new Font("Fira Sans", Font.PLAIN, 13));
        this.emailLabel.setHorizontalAlignment(SwingConstants.LEFT);
        add(this.emailLabel);

        this.emailTextField = new JTextField();
        this.emailTextField.setBounds(10, 105, 270, 23);
        this.emailTextField.setFont(new Font("Fira Sans", Font.PLAIN, 13));
        this.emailTextField.setHorizontalAlignment(SwingConstants.LEFT);
        add(this.emailTextField);

        this.passwordLabel = new JLabel("Password:");
        this.passwordLabel.setBounds(10, 140, 105, 17);
        this.passwordLabel.setFont(new Font("Fira Sans", Font.PLAIN, 13));
        this.passwordLabel.setHorizontalAlignment(SwingConstants.LEFT);
        add(this.passwordLabel);

        this.passwordField = new JPasswordField();
        this.passwordField.setBounds(10, 175, 270, 23);
        this.passwordField.setFont(new Font("Fira Sans", Font.PLAIN, 13));
        this.passwordField.setHorizontalAlignment(SwingConstants.LEFT);
        add(this.passwordField);

        this.registerButton = new JButton("Register");
        this.registerButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        this.registerButton.setBounds(110, 225, 80, 23);
        this.registerButton.setFont(new Font("Fira Sans", Font.PLAIN, 13));
        this.registerButton.setHorizontalAlignment(SwingConstants.CENTER);
        add(this.registerButton);

        this.loginLabel = new JLabel("Already have an account?");
        this.loginLabel.setBounds(10, 265, 170, 17);
        this.loginLabel.setFont(new Font("Fira Sans", Font.PLAIN, 13));
        this.loginLabel.setHorizontalAlignment(SwingConstants.LEADING);
        add(this.loginLabel);

        this.loginButton = new JButton("Login");
        this.loginButton.setBounds(220, 262, 72, 23);
        this.loginButton.setFont(new Font("Fira Sans", Font.PLAIN, 13));
        this.loginButton.setHorizontalAlignment(SwingConstants.CENTER);
        add(this.loginButton);
    }

    public void addRegisterListener(ActionListener registerListener) {
        this.registerButton.addActionListener(registerListener);
    }

    public void addLoginListener(ActionListener loginListener) {
        this.loginButton.addActionListener(loginListener);
    }
}
