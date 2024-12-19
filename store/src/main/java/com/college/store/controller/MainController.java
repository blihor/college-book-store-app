package com.college.store.controller;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

import java.awt.CardLayout;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.college.store.service.UserService;
import com.college.store.view.AddView;
import com.college.store.view.FilterView;
import com.college.store.view.HomeView;
import com.college.store.view.LoginView;
import com.college.store.view.RegisterView;

import lombok.AllArgsConstructor;

@Controller
@AllArgsConstructor
public class MainController {
    
    //private final JFrame appFrame;
    //private final CardLayout cardLayout;
    //private final JPanel cardPanel;

    /* 
    private final LoginView loginView;
    private final RegisterView registerView;
    private final HomeView homeView;
    private final AddView addView;
    private final FilterView filterView;
    */

    private final LoginController loginController;
    private final RegisterController registerController;
    //private final HomeController homeController;
    //private final AddController addController;
    //private final FilterController filterController;

    private void initialize() {
        /* 
        this.appFrame.setTitle("Library");
        this.appFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.appFrame.setSize(null);
        */

        /* 
        cardPanel.setLayout(cardLayout);

        // Add views to card panel
        cardPanel.add(loginView, "Login");
        cardPanel.add(registerView, "Register");
        cardPanel.add(homeView, "Home");
        cardPanel.add(addView, "Add");
        cardPanel.add(filterView, "Filter");

        // Start with LoginView
        cardLayout.show(cardPanel, "Login");

        // Add card panel to JFrame
        appFrame.getContentPane().add(cardPanel);
        */

        // Set JFrame visible
        //appFrame.setVisible(true);
    }

    public void showLoginView() {
        loginController.prepareAndOpenFrame();
    }

    public void showRegisterView() {
        registerController.prepareAndOpenFrame();
    }
    /* 
    public void switchToPanel(String panelName) {
        this.cardLayout.show(cardPanel, panelName);
    }
        */
}
