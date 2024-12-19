package com.college.store.view;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.event.DocumentListener;

import org.springframework.stereotype.Component;

import lombok.Getter;

@Component
@Getter
public class HomeView extends JFrame {
    private JLabel searchLabel;
    private JComboBox<String> searchComboBox;
    private JTextField searchTextField;
    private JButton filterButton;
    private JButton addButton;
    private JButton deleteButton;
    private JButton clearFilterButton;
    private JTable table;
    private JScrollPane tableScrollPane;

    public HomeView() {
        setSize(new Dimension(1000, 605));
        setLayout(null);
        setLocationRelativeTo(null);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        addControllers();
    }

    private void addControllers() {
        this.searchLabel = new JLabel("Search By");
        this.searchLabel.setBounds(10, 10, 65, 27);
        this.searchLabel.setFont(new Font("Fira Sans", Font.BOLD, 13));
        this.searchLabel.setHorizontalAlignment(SwingConstants.CENTER);
        add(this.searchLabel);

        this.searchComboBox = new JComboBox<>();
        this.searchComboBox.setBounds(80, 10, 85, 23);
        this.searchComboBox.setFont(new Font("Fira Sans", Font.BOLD, 13));
        this.searchComboBox.addItem("Name");
        this.searchComboBox.addItem("Author");
        this.searchComboBox.setSelectedIndex(0);
        add(this.searchComboBox);

        this.searchTextField = new JTextField();
        this.searchTextField.setBounds(10, 40, 155, 23);
        this.searchTextField.setFont(new Font("Fira Sans", Font.BOLD, 13));
        this.searchTextField.setHorizontalAlignment(SwingConstants.LEFT);
        add(this.searchTextField);

        this.filterButton = new JButton("Filter");
        this.filterButton.setBounds(350, 40, 72, 23);
        this.filterButton.setFont(new Font("Fira Sans", Font.BOLD, 13));
        this.filterButton.setHorizontalAlignment(SwingConstants.CENTER);
        add(this.filterButton);

        this.clearFilterButton = new JButton("Clear filters");
        this.clearFilterButton.setBounds(435, 40, 72, 23);
        this.clearFilterButton.setFont(new Font("Fira Sans", Font.BOLD, 13));
        this.clearFilterButton.setHorizontalAlignment(SwingConstants.CENTER);
        add(this.clearFilterButton);

        this.addButton = new JButton("Add");
        this.addButton.setBounds(180, 40, 72, 23);
        this.addButton.setFont(new Font("Fira Sans", Font.BOLD, 13));
        this.addButton.setHorizontalAlignment(SwingConstants.CENTER);
        add(this.addButton);

        this.deleteButton = new JButton("Delete");
        this.deleteButton.setBounds(265, 40, 72, 23);
        this.deleteButton.setFont(new Font("Fira Sans", Font.BOLD, 13));
        this.deleteButton.setHorizontalAlignment(SwingConstants.CENTER);
        add(this.deleteButton);


        this.table = new JTable();
        this.table.setFont(new Font("Fira Sans", Font.BOLD, 13));

        this.tableScrollPane = new JScrollPane(table);
        this.tableScrollPane.setBounds(0, 75, 1000, 530);
        add(this.tableScrollPane);
    }

    public void addSearchTextFieldListener(DocumentListener documentListener) {
        this.searchTextField.getDocument().addDocumentListener(documentListener);
    }

    public void addButtonListener(ActionListener actionListener) {
        this.addButton.addActionListener(actionListener);
    }

    public void addDeleteButtonListener(ActionListener actionListener) {
        this.deleteButton.addActionListener(actionListener);
    }

    public void addFilterButtonListener(ActionListener actionListener) {
        this.filterButton.addActionListener(actionListener);
    }

    public void addClearFiltersButtonListener(ActionListener actionListener) {
        this.clearFilterButton.addActionListener(actionListener);
    }
}
