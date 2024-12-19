package com.college.store.view;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.util.HashSet;
import java.util.Set;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JSpinner;
import javax.swing.JTextField;
import javax.swing.SpinnerDateModel;
import javax.swing.SpinnerNumberModel;
import javax.swing.SwingConstants;

import org.springframework.stereotype.Component;

import lombok.Getter;

@Component
@Getter
public class FilterView extends JFrame {
    private JLabel yearLabel;
    private JLabel pagesLabel;
    private JLabel rateLabel;
    private JLabel genresLabel;
    private JSpinner yearSpinner;
    private JSpinner rateSpinner;
    private JTextField pagesTextField;
    private JComboBox<String> genresComboBox;
    private JRadioButton genresRadioButton;
    private JPanel genresPanel;
    private JButton filterButton;
    
    Set<String> genreNames;

    public FilterView() {
        setSize(new Dimension(225, 490));
        setLayout(null);
        setLocationRelativeTo(null);
        setResizable(false);
        addControllers();
    }

    private void addControllers() {
        this.yearLabel = new JLabel("Year");
        this.yearLabel.setBounds(10, 10, 70, 17);
        this.yearLabel.setFont(new Font("Fira Sans", Font.PLAIN, 16));
        this.yearLabel.setHorizontalAlignment(SwingConstants.LEFT);
        add(this.yearLabel);

        this.pagesLabel = new JLabel("Pages");
        this.pagesLabel.setBounds(10, 80, 70, 17);
        this.pagesLabel.setFont(new Font("Fira Sans", Font.PLAIN, 16));
        this.pagesLabel.setHorizontalAlignment(SwingConstants.LEFT);
        add(this.pagesLabel);

        this.rateLabel = new JLabel("Rate");
        this.rateLabel.setBounds(10, 150, 70, 17);
        this.rateLabel.setFont(new Font("Fira Sans", Font.PLAIN, 16));
        this.rateLabel.setHorizontalAlignment(SwingConstants.LEFT);
        add(this.rateLabel);

        this.genresLabel = new JLabel("Genres");
        this.genresLabel.setBounds(10, 225, 70, 17);
        this.genresLabel.setFont(new Font("Fira Sans", Font.PLAIN, 16));
        this.genresLabel.setHorizontalAlignment(SwingConstants.LEFT);
        add(this.genresLabel);

        this.yearSpinner = new JSpinner(new SpinnerDateModel());
        JSpinner.DateEditor dateEditor = new JSpinner.DateEditor(yearSpinner, "yyyy");
        this.yearSpinner.setEditor(dateEditor);
        this.yearSpinner.setBounds(10, 40, 200, 23);
        this.yearSpinner.setFont(new Font("Fira Sans", Font.PLAIN, 16));
        add(this.yearSpinner);

        this.pagesTextField = new JTextField();
        this.pagesTextField.setBounds(10, 110, 200, 23);
        this.pagesTextField.setFont(new Font("Fira Sans", Font.PLAIN, 16));
        add(this.pagesTextField);

        SpinnerNumberModel numberModel = new SpinnerNumberModel(1, 1, 10, 1);
        this.rateSpinner = new JSpinner(numberModel);
        this.rateSpinner.setBounds(10, 180, 200, 23);
        this.rateSpinner.setFont(new Font("Fira Sans", Font.PLAIN, 16));
        add(this.rateSpinner);

        this.genresComboBox = new JComboBox<>();
        this.genresComboBox.setBounds(10, 255, 200, 23);
        this.genresComboBox.setFont(new Font("Fira Sans", Font.PLAIN, 16));
        add(this.genresComboBox);

        this.genresRadioButton = new JRadioButton("AND");
        this.genresRadioButton.setHorizontalAlignment(SwingConstants.TRAILING);
        this.genresRadioButton.setFont(new Font("Fira Sans", Font.PLAIN, 13));
        this.genresRadioButton.setBounds(115, 230, 95, 21);
        add(this.genresRadioButton);

        this.genresPanel = new JPanel();
        this.genresPanel.setLayout(new FlowLayout());
        this.genresPanel.setBounds(10, 290, 200, 120);
        add(this.genresPanel);

        this.filterButton = new JButton("Filter");
        this.filterButton.setFont(new Font("Fira Sans", Font.PLAIN, 16));
        this.filterButton.setBounds(60, 420, 105, 30);
        add(this.filterButton);

        this.genreNames = new HashSet<>();
    }

    public void addFilterButtonListener(ActionListener actionListener) {
        this.filterButton.addActionListener(actionListener);
    }

    public void addGenresComboBoxListener(ActionListener actionListener) {
        this.genresComboBox.addActionListener(actionListener);
    }
}
