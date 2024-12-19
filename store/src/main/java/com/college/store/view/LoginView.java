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
public class LoginView extends JFrame{
    private JLabel usernameLabel;
    private JLabel passwordLabel;
    private JLabel registerLabel;
    private JTextField usernameTextField;
    private JPasswordField passwordField;
    private JButton loginButton;
    private JButton registerButton;

    public LoginView() {
        setSize(new Dimension(300, 260));
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

        this.passwordLabel = new JLabel("Password:");
        this.passwordLabel.setBounds(10, 80, 105, 17);
        this.passwordLabel.setFont(new Font("Fira Sans", Font.PLAIN, 13));
        this.passwordLabel.setHorizontalAlignment(SwingConstants.LEFT);
        add(this.passwordLabel);

        this.passwordField = new JPasswordField();
        this.passwordField.setBounds(10, 110, 270, 23);
        this.passwordField.setFont(new Font("Fira Sans", Font.PLAIN, 13));
        this.passwordField.setHorizontalAlignment(SwingConstants.LEFT);
        add(this.passwordField);

        this.loginButton = new JButton("Login");
        this.loginButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        this.loginButton.setBounds(110, 155, 72, 23);
        this.loginButton.setFont(new Font("Fira Sans", Font.PLAIN, 13));
        this.loginButton.setHorizontalAlignment(SwingConstants.CENTER);
        add(this.loginButton);

        this.registerButton = new JButton("Register");
        this.registerButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        this.registerButton.setFont(new Font("Fira Sans", Font.PLAIN, 13));
        this.registerButton.setBounds(205, 192, 82, 23);
        this.registerButton.setHorizontalAlignment(SwingConstants.CENTER);
        add(this.registerButton);

        this.registerLabel = new JLabel("Don't have an accound yet?");
        registerLabel.setFont(new Font("Fira Sans", Font.PLAIN, 13));
        registerLabel.setBounds(15, 195, 175, 17);
        add(registerLabel);

    }

    public void addLoginListener(ActionListener loginListener) {
        this.loginButton.addActionListener(loginListener);
    }

    public void addRegisterListener(ActionListener registerListener) {
        this.registerButton.addActionListener(registerListener);
    }
}
