package com.college.store.view;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Desktop.Action;
import java.awt.event.ActionListener;
import java.util.HashSet;
import java.util.Set;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.JTextField;
import javax.swing.SpinnerDateModel;
import javax.swing.SpinnerNumberModel;
import javax.swing.SwingConstants;

import org.springframework.stereotype.Component;

import lombok.Getter;

@Component
@Getter
public class AddView extends JFrame {
    private JLabel nameLabel;
    private JLabel authorLabel;
    private JLabel yearLabel;
    private JLabel pagesLabel;
    private JLabel rateLabel;
    private JLabel genresLabel;
    private JTextField nameTextField;
    private JTextField authorTextField;
    private JTextField pagesTextField;
    private JSpinner yearSpinner;
    private JSpinner rateSpinner;
    private JComboBox<String> genresComboBox;
    private JPanel genresPanel;
    private JButton addButton;

    private Set<String> genreNames;

    public AddView() {
        setSize(new Dimension(230, 630));
        setLayout(null);
        setResizable(false);
        setLocationRelativeTo(null);
        addControllers();
    }

    private void addControllers() {
        this.nameLabel = new JLabel("Name");
        this.nameLabel.setBounds(10, 10, 70, 17);
        this.nameLabel.setFont(new Font("Fira Sans", Font.PLAIN, 13));
        this.nameLabel.setHorizontalAlignment(SwingConstants.LEFT);
        add(this.nameLabel);

        this.authorLabel = new JLabel("author");
        this.authorLabel.setBounds(10, 75, 70, 17);
        this.authorLabel.setFont(new Font("Fira sans", Font.PLAIN, 13));
        this.authorLabel.setHorizontalAlignment(SwingConstants.LEFT);
        add(this.authorLabel);

        this.yearLabel = new JLabel("Year");
        this.yearLabel.setBounds(10, 145, 70, 17);
        this.yearLabel.setFont(new Font("Fira Sans", Font.PLAIN, 13));
        this.yearLabel.setHorizontalAlignment(SwingConstants.LEFT);
        add(this.yearLabel);

        this.pagesLabel = new JLabel("Pages");
        this.pagesLabel.setBounds(10, 215, 70, 17);
        this.pagesLabel.setFont(new Font("Fira Sans", Font.PLAIN, 13));
        this.pagesLabel.setHorizontalAlignment(SwingConstants.LEFT);
        add(this.pagesLabel);

        this.rateLabel = new JLabel("Rate");
        this.rateLabel.setBounds(10, 285, 70, 17);
        this.rateLabel.setFont(new Font("Fira Sans", Font.PLAIN, 13));
        this.rateLabel.setHorizontalAlignment(SwingConstants.LEFT);
        add(this.rateLabel);

        this.genresLabel = new JLabel("Genres");
        this.genresLabel.setBounds(10, 360, 70, 17);
        this.genresLabel.setFont(new Font("Fira Sans", Font.PLAIN, 13));
        this.genresLabel.setHorizontalAlignment(SwingConstants.LEFT);
        add(this.genresLabel);

        this.nameTextField = new JTextField();
        this.nameTextField.setBounds(10, 40, 200, 23);
        this.nameTextField.setFont(new Font("Fira Sans", Font.PLAIN, 13));
        this.nameTextField.setHorizontalAlignment(SwingConstants.LEFT);
        add(this.nameTextField);

        this.authorTextField = new JTextField();
        this.authorTextField.setBounds(10, 105, 200, 23);
        this.authorTextField.setFont(new Font("Fira Sans", Font.PLAIN, 13));
        this.authorTextField.setHorizontalAlignment(SwingConstants.LEFT);
        add(this.authorTextField);

        this.pagesTextField = new JTextField();
        this.pagesTextField.setBounds(10, 245, 200, 23);
        this.pagesTextField.setFont(new Font("Fira Sans", Font.PLAIN, 13));
        this.pagesTextField.setHorizontalAlignment(SwingConstants.LEFT);
        add(this.pagesTextField);

        this.yearSpinner = new JSpinner(new SpinnerDateModel());
        JSpinner.DateEditor dateEditor = new JSpinner.DateEditor(yearSpinner, "yyyy");
        this.yearSpinner.setEditor(dateEditor);
        this.yearSpinner.setBounds(10, 175, 200, 23);
        this.yearSpinner.setFont(new Font("Fira Sans", Font.PLAIN, 13));
        add(this.yearSpinner);

        SpinnerNumberModel numberModel = new SpinnerNumberModel(1, 1, 10, 1);
        this.rateSpinner = new JSpinner(numberModel);
        this.rateSpinner.setBounds(10, 315, 200, 23);
        this.rateSpinner.setFont(new Font("Fira Sans", Font.PLAIN, 13));
        add(this.rateSpinner);

        this.genresComboBox = new JComboBox<>();
        this.genresComboBox.setBounds(10, 390, 200, 23);
        this.genresComboBox.setFont(new Font("Fira Sans", Font.PLAIN, 13));
        add(this.genresComboBox);

        this.genresPanel = new JPanel();
        this.genresPanel.setLayout(new FlowLayout());
        this.genresPanel.setBounds(10, 425, 200, 120);
        add(this.genresPanel);

        this.addButton = new JButton("Add");
        this.addButton.setBounds(60, 555, 105, 30);
        this.addButton.setFont(new Font("Fira Sans", Font.PLAIN, 13));
        this.addButton.setHorizontalAlignment(SwingConstants.CENTER);
        add(this.addButton);

        genreNames = new HashSet<>();
    }

    public void addButtonListener(ActionListener actionListener) {
        this.addButton.addActionListener(actionListener);
    }

    public void addGenresComboBoxListener(ActionListener actionListener) {
        this.genresComboBox.addActionListener(actionListener);
    }
}
