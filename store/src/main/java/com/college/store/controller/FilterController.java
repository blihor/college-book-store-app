package com.college.store.controller;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Calendar;
import java.util.Date;
import java.util.Set;
import java.util.stream.Collectors;

import javax.swing.JLabel;
import javax.swing.JPanel;

import org.springframework.stereotype.Controller;

import com.college.store.model.BookDTO;
import com.college.store.model.BookTableModel;
import com.college.store.model.Genre;
import com.college.store.service.GenreService;
import com.college.store.service.filter.BookFilter;
import com.college.store.view.FilterView;

import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor
public class FilterController {
    
    private final FilterView filterView;

    private final GenreService genreService;

    private final BookFilter bookFilter;

    public void prepareAndOpenFrame(HomeController homeController) {
        populateGenresComboBox();
        addFilterButtonController(homeController);
        addGenresComboBoxListener();
        filterView.setVisible(true);
    }

    public void populateGenresComboBox() {
        Set<Genre> genres = genreService.findAllGenres();
        
        genres.forEach(genre -> {
            filterView.getGenresComboBox().addItem(genre.getName());
        });
    }

    private void addFilterButtonController(HomeController homeController) {
        filterView.addFilterButtonListener(e -> {
            Calendar calendar = Calendar.getInstance();
            calendar.setTime((Date) filterView.getYearSpinner().getValue());

            Integer pages;
            String pagesString = filterView.getPagesTextField().getText();
            
            if (pagesString.isEmpty()) {
                pages = null;
            } else {
                pages = Integer.valueOf(pagesString);
            }

            bookFilter.setYear(calendar.get(Calendar.YEAR));
            bookFilter.setPages(Integer.valueOf(filterView.getPagesTextField().getText()));
            bookFilter.setRate((Integer) filterView.getRateSpinner().getValue());
            bookFilter.setGenresSwitch(filterView.getGenresRadioButton().isEnabled());
            bookFilter.setGenreNames(filterView.getGenreNames());

            Set<BookDTO> books = ((BookTableModel) homeController.getTableModel()).getBooks()
                                                                .stream().collect(Collectors.toSet());
            
            books = bookFilter.filter(books);

            homeController.setTableModel(new BookTableModel(books.stream().collect(Collectors.toList())));
        });
    }

    private void addGenresComboBoxListener() {
        this.filterView.addGenresComboBoxListener(e -> {
            String selectedGenreName = filterView.getGenresComboBox().getSelectedItem().toString();

            if (!filterView.getGenreNames().contains(selectedGenreName)) {

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

                filterView.getGenreNames().add(selectedGenreName);
                filterView.getGenresPanel().add(genre);
                filterView.revalidate();
                filterView.repaint();
            }
        });
    }
}
