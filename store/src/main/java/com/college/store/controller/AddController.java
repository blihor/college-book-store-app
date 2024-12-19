package com.college.store.controller;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;
import java.util.Set;

import javax.swing.JLabel;
import javax.swing.JPanel;

import org.springframework.stereotype.Controller;

import com.college.store.model.Genre;
import com.college.store.service.GenreService;
import com.college.store.service.UserService;
import com.college.store.view.AddView;

import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Controller
@RequiredArgsConstructor
public class AddController {
    
    private final AddView addView;

    private final UserService userService;
    private final GenreService genreService;

    @Setter
    Integer usrId;

    public void prepareAndOpenFrame(HomeController homeController) {
        populateGenresComboBox();
        addButtonListener(homeController);
        addGenresComboBoxListener();
        addView.setVisible(true);

    }

    public void populateGenresComboBox() {
        Set<Genre> genres = genreService.findAllGenres();
        
        genres.forEach(genre -> {
            addView.getGenresComboBox().addItem(genre.getName());
        });
    }

    public void addButtonListener(HomeController homeController) {
        this.addView.addButtonListener(e -> {
            String name = addView.getNameTextField().getText();
            String author = addView.getAuthorTextField().getText();

            Calendar calendar = Calendar.getInstance();
            calendar.setTime((Date) addView.getYearSpinner().getValue());
            Integer year = calendar.get(Calendar.YEAR);

            Integer pages = Integer.valueOf(addView.getPagesTextField().getText());
            Integer rate = (Integer) addView.getRateSpinner().getValue();
            Set<String> genreNames = addView.getGenreNames();

            userService.addBook(usrId, name, author, year, pages, rate, genreNames);

            homeController.populateTable();
            clearFields();
        });
    }

    private void addGenresComboBoxListener() {
        this.addView.addGenresComboBoxListener(e -> {
            String selectedGenreName = addView.getGenresComboBox().getSelectedItem().toString();

            if (!addView.getGenreNames().contains(selectedGenreName)) {

                JLabel genre = new JLabel(selectedGenreName);
                genre.setFont(new Font("Fira Sans", Font.PLAIN, 13));
                genre.setBackground(Color.LIGHT_GRAY);
                genre.addMouseListener(new MouseAdapter() {
                    public void mouseClicked(MouseEvent e) {
                        JPanel parent = (JPanel) genre.getParent();
                        
                        parent.remove(genre);
                        parent.revalidate();
                        parent.repaint();
                    }
                });

                addView.getGenreNames().add(selectedGenreName);
                addView.getGenresPanel().add(genre);
                addView.revalidate();
                addView.repaint();
            }
        });
    }

    private void clearFields() {
        addView.getNameTextField().setText("");
        addView.getAuthorTextField().setText("");
        addView.getYearSpinner().setValue(LocalDate.now());
        addView.getPagesTextField().setText("");
        addView.getRateSpinner().setValue(1);
        addView.getGenresPanel().removeAll();
        addView.getGenreNames().clear();
    }
}