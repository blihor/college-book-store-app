package com.college.store.service.filter;

import java.util.HashSet;
import java.util.Set;

import org.springframework.stereotype.Service;

import com.college.store.model.BookDTO;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Service
@NoArgsConstructor
@Getter @Setter
public class BookFilter {
    
    private Integer year;
    private Integer pages;
    private Integer rate;
    private Boolean genresSwitch;
    private Set<String> genreNames;

    public Set<BookDTO> filter(Set<BookDTO> bookDTOs) {
        Set<BookDTO> filteredBookDTOs = filterYear(bookDTOs);
        filteredBookDTOs = filterPages(filteredBookDTOs);
        filteredBookDTOs = filterRate(filteredBookDTOs);
        filteredBookDTOs = filterGenres(filteredBookDTOs);

        return filteredBookDTOs;
    }

    private Set<BookDTO> filterYear(Set<BookDTO> bookDTOs) {
        Set<BookDTO> filteredBookDTOs = new HashSet<>(bookDTOs);

        if (this.year != null) {
            filteredBookDTOs.removeIf(bookDTO -> !bookDTO.getYear().equals(this.year));
        }

        return filteredBookDTOs;
    }

    private Set<BookDTO> filterPages(Set<BookDTO> bookDTOs) {
        Set<BookDTO> filteredBookDTOs = new HashSet<>(bookDTOs);

        if (this.pages != null) {
            filteredBookDTOs.removeIf(bookDTO -> !bookDTO.getPages().equals(this.pages));
        }

        return filteredBookDTOs;
    }

    private Set<BookDTO> filterRate(Set<BookDTO> bookDTOs) {
        Set<BookDTO> filteredBookDTOs = new HashSet<>(bookDTOs);

        if (this.rate != null) {
            filteredBookDTOs.removeIf(bookDTO -> !bookDTO.getRate().equals(this.rate));
        }

        return filteredBookDTOs;
    }

    private Set<BookDTO> filterGenres(Set<BookDTO> bookDTOs) {
        Set<BookDTO> filteredBookDTOs = new HashSet<>(bookDTOs);

        if (this.genreNames != null) {
            if (this.genresSwitch) { // AND 
                for (String genreName : genreNames) {
                    filteredBookDTOs.removeIf(bookDTO -> !bookDTO.getGenres().contains(genreName));
                }
            } else { // OR
                for (BookDTO bookDTO : filteredBookDTOs) {
                    boolean isValid = false;
                    
                    for (String genreName: genreNames) {
                        if (bookDTO.getGenres().contains(genreName)) {
                            isValid = true;
                            break;
                        }
                    }

                    if (!isValid) {
                        filteredBookDTOs.remove(bookDTO);
                    }
                }
            }
        }

        return filteredBookDTOs;
    }
}
