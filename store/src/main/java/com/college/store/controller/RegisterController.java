package com.college.store.controller;

import javax.swing.JOptionPane;

import org.springframework.stereotype.Controller;

import com.college.store.service.UserService;
import com.college.store.view.RegisterView;

import lombok.AllArgsConstructor;

@Controller
@AllArgsConstructor
public class RegisterController {

    private final RegisterView registerView;
    private final UserService userService;
    //private final LoginController loginController;

    public void prepareAndOpenFrame() {
        this.registerView.addRegisterListener(e -> {
            try {
                String username = registerView.getUsernameTextField().getText();
                String email = registerView.getEmailTextField().getText();
                String password = new String(registerView.getPasswordField().getPassword());

                if (userService.userExists(username)) {
                    throw new RuntimeException("User with given username already exists!");
                }

                if (userService.emailUsed(email)) {
                    throw new RuntimeException("Given email is already used!");
                }
                
                userService.addUser(username, email, password);
                JOptionPane.showMessageDialog(null, "Account have been successfully created!");
            } catch (RuntimeException re) {
                JOptionPane.showMessageDialog(null, re.getMessage());
            }
        });

        this.registerView.addLoginListener(e -> {
            try {
                registerView.setVisible(false);
                //loginController.prepareAndOpenFrame();
            } catch (RuntimeException re) {
                // TODO: handle exception
            }
        });

        registerView.setVisible(true);
    }
}
