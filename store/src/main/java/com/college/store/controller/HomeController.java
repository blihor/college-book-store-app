package com.college.store.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

import org.springframework.stereotype.Controller;

import com.college.store.model.Book;
import com.college.store.model.BookDTO;
import com.college.store.model.BookTableModel;
import com.college.store.service.BookService;
import com.college.store.service.UserService;
import com.college.store.view.HomeView;

import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Controller
@RequiredArgsConstructor
public class HomeController {
    private final HomeView homeView;

    private final UserService userService;
    private final BookService bookService;

    private final AddController addController;
    private final FilterController filterController;

    @Setter
    Integer usrId;

    public void prepareAndOpenFrame() {
        addSearchTextFieldListener();
        addButtonListener();
        addDeleteButtonListener();
        addFilterButtonListener();
        populateTable();
        homeView.setVisible(true);
    }

    private void addSearchTextFieldListener() {
        this.homeView.addSearchTextFieldListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                handleTextChange();
            } 

            @Override
            public void removeUpdate(DocumentEvent e) {
                handleTextChange();
            } 

            @Override
            public void changedUpdate(DocumentEvent e) {
                handleTextChange();
            } 

            private void handleTextChange() {
                String text = homeView.getSearchTextField().getText().toLowerCase();

                for (int row = 0; row < homeView.getTable().getRowCount(); ++row) {
                    String cellValue;

                    if (homeView.getSearchComboBox().getSelectedItem() == "Name") {
                        cellValue = homeView.getTable().getValueAt(row, 0).toString().toLowerCase();
                    } else {
                        cellValue = homeView.getTable().getValueAt(row, 1).toString().toLowerCase();
                    }

                    if (cellValue.contains(text)) {
                        homeView.getTable().setRowSelectionInterval(row, row);
                        break;
                    }
                }
            }
        });
    }

    private void addButtonListener() {
        homeView.addButtonListener(e -> {
            addController.setUsrId(usrId);
            addController.prepareAndOpenFrame(this);
        });
    }

    private void addDeleteButtonListener() {
        homeView.addDeleteButtonListener(e -> {
            Integer selectedRow = homeView.getTable().getSelectedRow();
            BookDTO book = ((BookTableModel) homeView.getTable().getModel()).getBookAt(selectedRow);
            
            userService.deleteBook(usrId, book.getId());
            populateTable();
        });
    }

    private void addFilterButtonListener() {
        homeView.addFilterButtonListener(e -> {
            filterController.prepareAndOpenFrame(this);
        });
    }

    private void addClearFiltersButtonListener() {
        homeView.addClearFiltersButtonListener(e -> {
            populateTable();
        });
    }

    public void populateTable() {
        List<Book> books = userService.findAllBooks(usrId);
        List<BookDTO> bookDTOs = new ArrayList<>();

        books.forEach(book -> {
            Set<String> genres = bookService.findAllGenres(book.getId())
                                            .stream()
                                            .map(genre -> genre.getName())
                                            .collect(Collectors.toSet());

            String genresString = String.join(", ", genres);

            BookDTO bookDTO = BookDTO.builder()
                                    .id(book.getId())
                                    .name(book.getName())
                                    .author(book.getAuthor())
                                    .year(book.getYear())
                                    .pages(book.getPages())
                                    .rate(book.getRate())
                                    .genres(genresString)
                                    .build();

            bookDTOs.add(bookDTO);
        });

        BookTableModel bookTableModel = new BookTableModel(bookDTOs);

        homeView.getTable().setModel(bookTableModel);
    }

    public void filterTable(BookTableModel model) {
        homeView.getTable().setModel(model);
    }

    public BookTableModel getTableModel() {
        return (BookTableModel) homeView.getTable().getModel();
    }

    public void setTableModel(BookTableModel model) {
        homeView.getTable().setModel(model);
    }
}
