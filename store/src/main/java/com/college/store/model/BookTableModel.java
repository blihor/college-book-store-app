package com.college.store.model;

import java.util.List;

import javax.swing.table.AbstractTableModel;

import lombok.Getter;
import lombok.Setter;

public class BookTableModel extends AbstractTableModel {

    @Getter @Setter
    private List<BookDTO> books;
    private String[] columnNames = {"Name", "Author", "Year", "Pages", "Rate", "Genres"};

    public BookTableModel(List<BookDTO> books) {
        this.books = books;
    }

    @Override
    public int getRowCount() {
        return books.size();
    }

    @Override
    public int getColumnCount() {
        return columnNames.length;
    }

    @Override
    public String getColumnName(int column) {
        return columnNames[column];
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        BookDTO bookDTO = books.get(rowIndex);

        switch (columnIndex) {
            case 0:
                return bookDTO.getName();
            case 1:
                return bookDTO.getAuthor();
            case 2:
                return bookDTO.getYear();
            case 3:
                return bookDTO.getPages();
            case 4:
                return bookDTO.getRate();
            case 5:
                return bookDTO.getGenres();
        
            default:
                return null;
        }
    }

    public BookDTO getBookAt(int rowIndex) {
        return books.get(rowIndex);
    }
}
