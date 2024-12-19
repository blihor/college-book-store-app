package com.college.store.controller;

import javax.swing.JOptionPane;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Controller;

import com.college.store.service.UserService;
import com.college.store.view.LoginView;

import lombok.AllArgsConstructor;


@Controller
@AllArgsConstructor
public class LoginController {

    private final LoginView loginView;
    private final UserService userService;
    private final RegisterController registerController;
    private final HomeController homeController;

    public void prepareAndOpenFrame() {
        this.loginView.addLoginListener(e -> {
            try {
                String username = loginView.getUsernameTextField().getText();
                String password = new String(loginView.getPasswordField().getPassword());

                if(this.userService.validateUser(username, password)) {
                    loginView.setVisible(false);
                    homeController.setUsrId(userService.findByUsername(username).getId());
                    homeController.prepareAndOpenFrame();
                } else {
                    throw new RuntimeException("Password isn't correct!");
                }
            } catch (RuntimeException re) {
                JOptionPane.showMessageDialog(null, re.getMessage());
            }
        });

        this.loginView.addRegisterListener(e -> {
            try {
                loginView.setVisible(false);
                registerController.prepareAndOpenFrame();
            } catch (RuntimeException re) {
                // TODO: handle exception
            }
        });

        loginView.setVisible(true);
    }
}
